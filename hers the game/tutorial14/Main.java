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
    
    //these control physics objects sise
    public int stage_tall = 61;
    public int stage_wide = 61;
    
    //this controlls player sise
    public int player_tall = 60;
    public int player_wide = 40;
    
    
    private void initContent() {
      gameRoot.getChildren().clear();
      gameRoot.setLayoutX(0);
      appRoot.getChildren().clear();
      platforms.clear();
      coins.clear();
      
        levelWidth = LevelData.level_dat[Current_Level][0].length() * stage_wide;
         
        for (int i = 0; i < LevelData.level_dat[Current_Level].length; i++) {
            String line = LevelData.level_dat[Current_Level][i];
            for (int j = 0; j < line.length(); j++) {  
                
                for(int k=0; k<Tileset.ColTiles.length; k++) {
                  if(line.charAt(j) == Tileset.ColTiles[k].tile_char ){ 
                  Node platform = createEntity(j*stage_wide, i*stage_tall, stage_wide, stage_tall, Tileset.ColTiles[k].path );
                  platforms.add(platform);   
                  }
                }
                
                for(int k=0; k<Tileset.NoColTiles.length; k++) {
                  if( line.charAt(j) == Tileset.NoColTiles[k].tile_char && line.charAt(j)!=' '&&line.charAt(j)!='0' ){ //here we need an exeption for every not hard block this can be solved by
                  Node platform = createEntity(j*stage_wide, i*stage_tall, stage_wide, stage_tall, Tileset.NoColTiles[k].path ); //litrlaly make platform with strong from tileset ckass
                  }
                }
                
                for(int k=0; k<Tileset.SpecialTile.length; k++) {
                  if( line.charAt(j) == Tileset.SpecialTile[k].tile_char ){ //here we need an exeption for every not hard block this can be solved by 
                
                  Node coin = createEntity(j*stage_wide, i*stage_tall, stage_wide, stage_tall, Tileset.SpecialTile[k].path ); //litrlaly make platform with strong from tileset ckass
                  coins.add(coin);   
                  }
                }
                
                
                for(int k=0; k<Tileset.EnemyTile.length; k++) {
                  if( line.charAt(j) == Tileset.EnemyTile[k].tile_char ){ //here we need an exeption for every not hard block this can be solved by 
                
                  Node coin = createEntity(j*stage_wide, i*stage_tall, stage_wide, stage_tall, Tileset.EnemyTile[k].path ); //litrlaly make platform with strong from tileset ckass
                  coins.add(coin);   
                  }
                }
                
            }
        }

        player = createEntity(LevelData.player_start_pos[Current_Level][0], LevelData.player_start_pos[Current_Level][1], player_wide, player_tall, "tutorial14/texture/Assassin.GIF");

        player.translateXProperty().addListener((obs, old, newValue) -> {
            int offset = newValue.intValue();

            if (offset > 640 && offset < levelWidth - 640) {
                gameRoot.setLayoutX(-(offset - 640));
            }
        });

        appRoot.getChildren().addAll( uiRoot , gameRoot);// bg,
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

        if (isPressed(KeyCode.D) && player.getTranslateX() + player_wide <= levelWidth - 5) {
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
                        if (player.getTranslateX() + player_wide == platform.getTranslateX()) {
                            return;
                        }
                    }
                    else {
                        if (player.getTranslateX() == platform.getTranslateX() + stage_wide) {
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
                        if (player.getTranslateY() + player_tall == platform.getTranslateY()) {
                            player.setTranslateY(player.getTranslateY() - 1);
                            canJump = true;
                            return;
                        }
                    }
                    else {
                        if (player.getTranslateY() == platform.getTranslateY() + stage_tall) {
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
