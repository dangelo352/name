package tutorial14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javafx.stage.Stage;  
import java.io.File;  
import java.io.IOException;  
import java.io.FileInputStream; 
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import java.io.FileInputStream; 
import java.io.*; 
import java.io.FileNotFoundException; 
import javafx.application.Application; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.scene.image.*; 
import javafx.stage.Stage;  
import javafx.scene.layout.StackPane; 

import javafx.scene.paint.ImagePattern;

import java.io.FileNotFoundException; 


public class Main extends Application {

    private HashMap<KeyCode, Boolean> keys = new HashMap<KeyCode, Boolean>();

    private ArrayList<Node> platforms = new ArrayList<Node>();
    private ArrayList<Node> coins = new ArrayList<Node>();

    private Pane appRoot = new Pane();
    private Pane gameRoot = new Pane();
    private Pane uiRoot = new Pane();

    private Node player;
    private Point2D playerVelocity = new Point2D(0, 0);
    private boolean canJump = true;

    private int levelWidth;

    private boolean dialogEvent = false, running = true;
    
    public int Current_Level = 0;
    
    private void initContent() {
      gameRoot.getChildren().clear();
      gameRoot.setLayoutX(0);
      appRoot.getChildren().clear();
      platforms.clear();
      coins.clear();
      
        //Rectangle bg = new Rectangle(1280, 720);  
        
        levelWidth = LevelData.level_dat[Current_Level][0].length() * 60;
        
         
        for (int i = 0; i < LevelData.level_dat[Current_Level].length; i++) {
            String line = LevelData.level_dat[Current_Level][i];
            for (int j = 0; j < line.length(); j++) {
                if(line.charAt(j) == '0'){}
                if(line.charAt(j) == '1')// this is my shit solution where i fix after sleep (a temp solution so pepole can use api to make gam)
                {
                Node platform = createEntity(j*60, i*60, 60, 60, "tutorial14/texture/gras.gif" );
                platforms.add(platform);        
                }
                
                for(int k=0; k<Tileset.Tiles.length; k++) {
                
                  if( line.charAt(j) == Tileset.Tiles[k].tile_char && line.charAt(j) != ' ' && line.charAt(j) != '0' && line.charAt(j) != '2' ){ //here we need an exeption for every not hard block this can be solved by 
                
                  Node platform = createEntity(j*60, i*60, 60, 60, Tileset.Tiles[k].path ); //litrlaly make platform with strong from tileset ckass
                  platforms.add(platform);   
                  }
                }
                
                if(line.charAt(j) == '2') 
                {
                Node coin = createEntity(j*60, i*60, 60, 60, "tutorial14/texture/koin.png" );
                coins.add(coin);
                }
                    
                    
                
            }
        }

        player = createEntity(LevelData.player_start_pos[Current_Level][0], LevelData.player_start_pos[Current_Level][1], 40, 40, "tutorial14/texture/bad.png");

        player.translateXProperty().addListener((obs, old, newValue) -> {
            int offset = newValue.intValue();

            if (offset > 640 && offset < levelWidth - 640) {
                gameRoot.setLayoutX(-(offset - 640));
            }
        });

        appRoot.getChildren().addAll( gameRoot, uiRoot);// bg,
    }

    private void update() {
        if (isPressed(KeyCode.W) && player.getTranslateY() >= 5) {
            jumpPlayer();
        }
        if (isPressed(KeyCode.SPACE) && player.getTranslateY() >= 5) {
            jumpPlayer();

        }

        if (isPressed(KeyCode.A) && player.getTranslateX() >= 5) {
            movePlayerX(-5);
        }

        if (isPressed(KeyCode.D) && player.getTranslateX() + 40 <= levelWidth - 5) {
            movePlayerX(5);
        }

        if (playerVelocity.getY() < 10) {
            playerVelocity = playerVelocity.add(0, 1);
        }

        movePlayerY((int)playerVelocity.getY());

        for (Node coin : coins) {
            if (player.getBoundsInParent().intersects(coin.getBoundsInParent())) {
                coin.getProperties().put("alive", false);
                dialogEvent = true;
                running = false;
            }
        }

        for (Iterator<Node> it = coins.iterator(); it.hasNext(); ) {
            Node coin = it.next();
            if (!(Boolean)coin.getProperties().get("alive")) {
                it.remove();
                gameRoot.getChildren().remove(coin);
            }
        }
    }

    private void movePlayerX(int value) {
        boolean movingRight = value > 0;

        for (int i = 0; i < Math.abs(value); i++) {
            for (Node platform : platforms) {
                if (player.getBoundsInParent().intersects(platform.getBoundsInParent())) {
                    if (movingRight) {
                        if (player.getTranslateX() + 40 == platform.getTranslateX()) {
                            return;
                        }
                    }
                    else {
                        if (player.getTranslateX() == platform.getTranslateX() + 60) {
                            return;
                        }
                    }
                }
            }
            player.setTranslateX(player.getTranslateX() + (movingRight ? 1 : -1));
        }
    }

    private void movePlayerY(int value) {
        boolean movingDown = value > 0;

        for (int i = 0; i < Math.abs(value); i++) {
            for (Node platform : platforms) {
                if (player.getBoundsInParent().intersects(platform.getBoundsInParent())) {
                    if (movingDown) {
                        if (player.getTranslateY() + 40 == platform.getTranslateY()) {
                            player.setTranslateY(player.getTranslateY() - 1);
                            canJump = true;
                            return;
                        }
                    }
                    else {
                        if (player.getTranslateY() == platform.getTranslateY() + 60) {
                            return;
                        }
                    }
                }
            }
            player.setTranslateY(player.getTranslateY() + (movingDown ? 1 : -1));
        }
    }

    private void jumpPlayer() {
        if (canJump) {
            playerVelocity = playerVelocity.add(0, -30);
            canJump = false;
        }
    }

    private Node createEntity(int x, int y, int w, int h, String texture) {
        Rectangle entity = new Rectangle(w, h);
        entity.setTranslateX(x);
        entity.setTranslateY(y);
        entity.getProperties().put("alive", true);
        
        try{
        Image image = new Image(new FileInputStream(texture));
        entity.setFill(new ImagePattern(image));  
        }catch(FileNotFoundException e){}
        gameRoot.getChildren().add(entity);
        return entity;
    }

    private boolean isPressed(KeyCode key) {
        return keys.getOrDefault(key, false);
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        initContent();  
        
        StackPane stackPane = new StackPane();
        String backgroundTemp = LevelData.background_img[Current_Level];
        try{
        Image image = new Image(new FileInputStream(backgroundTemp));
        
        Rectangle shape = new Rectangle();
        shape.setHeight(720);
        shape.setWidth(1280);
        shape.setFill(new ImagePattern(image));
        
        stackPane.getChildren().add(shape);
        }catch(FileNotFoundException e){}
        

        stackPane.getChildren().add(appRoot);

        
        Scene scene = new Scene(stackPane);
        scene.setOnKeyPressed(event -> keys.put(event.getCode(), true));
        scene.setOnKeyReleased(event -> keys.put(event.getCode(), false));
        primaryStage.setTitle("Tutorial");
        primaryStage.setScene(scene);
        primaryStage.show();

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                if (running) {
                    update();
                }

                if (dialogEvent) {
                    dialogEvent = false;
                    Current_Level +=1;
                    initContent();
                    running = true;
                    }
            }
        };
        timer.start();
    }

    public static void main(String[] args){
        launch(args);
    }
}
