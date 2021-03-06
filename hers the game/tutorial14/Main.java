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

    private ArrayList<Rectangle> platforms = new ArrayList<Rectangle>();
    private ArrayList<Rectangle> coins = new ArrayList<Rectangle>();
    private ArrayList<Rectangle> enemys = new ArrayList<Rectangle>();
    private ArrayList<Rectangle> spikes = new ArrayList<Rectangle>();
    private ArrayList<Rectangle> daggas = new ArrayList<Rectangle>();
    private ArrayList<Integer> daggas_facing = new ArrayList<Integer>();
    
    private Pane appRoot = new Pane();
    private Pane gameRoot = new Pane();
    private Pane uiRoot = new Pane();
    
    private Rectangle player;
    private Rectangle dagga;
    private Point2D playerVelocity = new Point2D(0, 0);
    private Point2D sVelocity = new Point2D(0, 0);
    private boolean canJump = true;

    private int levelWidth;

    private boolean dialogEvent = false, running = true;
 
    //game vars
    public int Current_Level = 0;
    public int projectile_speed = 8;
    
    //these control physics objects size
    public int stage_tall = 60;
    public int stage_wide = 60;
    
    //this controlls player size
    public int player_tall = 80;
    public int player_wide = 55;
    public int s_tall = 80;
    public int s_wide = 59;

    
    //player animation toggles
    public Boolean Is_idle = true;
    public int is_running_direction = 0;//no = 0 left = 1 right = 2 
      
    public StackPane stackPane = new StackPane();
      
    public Rectangle Disp_Background = new Rectangle();

      
    public Boolean shoot_toggle = false;  
    public Boolean jump_toggle = false;
    public Boolean keep_player = false;
      
    private void initContent() {
      gameRoot.getChildren().clear();
      gameRoot.setLayoutX(0);
      appRoot.getChildren().clear();
      platforms.clear();
      coins.clear();
      enemys.clear();
      spikes.clear();
      
      
      levelWidth = LevelData.level_dat[Current_Level][0].length() * stage_wide;
        
        for (int i = 0; i < LevelData.level_dat[Current_Level].length; i++) {
            String line = LevelData.level_dat[Current_Level][i];
            for (int j = 0; j < line.length(); j++) {  
                
                for(int k=0; k<Tileset.ColTiles.length; k++) {
                  if(line.charAt(j) == Tileset.ColTiles[k].tile_char ){ 
                  Rectangle platform = createEntity(j*stage_wide, i*stage_tall, stage_wide, stage_tall, Tileset.ColTiles[k].path );
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
                
                  Rectangle coin = createEntity(j*stage_wide, i*stage_tall, stage_wide, stage_tall, Tileset.SpecialTile[k].path ); //litrlaly make platform with strong from tileset ckass
                  coins.add(coin);   
                  }
                }
                
                for(int k=0; k<Tileset.Spikes.length; k++) {
                  if( line.charAt(j) == Tileset.Spikes[k].tile_char ){ //here we need an exeption for every not hard block this can be solved by 
                  
                  Rectangle Spike = createEntity(j*stage_wide, i*stage_tall, stage_wide, stage_tall, Tileset.Spikes[k].path ); 
                  spikes.add(Spike); 
                  
                  }
                }
                
                for(int k=0; k<Tileset.EnemyTile.length; k++) {
                  if( line.charAt(j) == Tileset.EnemyTile[k].tile_char ){ //here we need an exeption for every not hard block this can be solved by 
                  
                  Rectangle enemy = createEntity(j*stage_wide, i*stage_tall, stage_wide, stage_tall, Tileset.EnemyTile[k].path ); 
                  enemys.add(enemy); 
                  
                  }
                }
            }
        }

        player = createEntity(LevelData.player_start_pos[Current_Level][0], LevelData.player_start_pos[Current_Level][1], player_wide, player_tall, "tutorial14/texture/player/Assassin.GIF");

        player.translateXProperty().addListener((obs, old, newValue) -> {
            int offset = newValue.intValue();

            if (offset > 640 && offset < levelWidth - 640) {
                gameRoot.setLayoutX(-(offset - 640));
            }
        });
        
        appRoot.getChildren().addAll( uiRoot , gameRoot);
        
        
        stackPane.getChildren().clear();
        Disp_Background.setHeight(720);
        Disp_Background.setWidth(1280);
        String backgroundTemp = LevelData.background_img[Current_Level];
        try{
        Image image = new Image(new FileInputStream(backgroundTemp));
        Disp_Background.setFill(new ImagePattern(image));
        }catch(FileNotFoundException e){}
        stackPane.getChildren().add(Disp_Background);
        stackPane.getChildren().add(appRoot);

        
    }
    private void shoot() {
           
           if(!Is_idle){
           try{
           Image image = new Image(new FileInputStream("tutorial14/texture/player/red.png"));
           player.setFill( new ImagePattern(image));  
           }catch(FileNotFoundException e){} }
           
           if(is_running_direction==1){
           dagga = createEntity((int)player.getTranslateX()-player_wide/2,(int)player.getTranslateY()+player_tall/2, 50, 20, "tutorial14/texture/DaggerLeft.PNG");
           }else{
           dagga = createEntity((int)player.getTranslateX()+player_wide/2,(int)player.getTranslateY()+player_tall/2, 50, 20, "tutorial14/texture/DaggerRight.PNG");
           }
           daggas.add(dagga);
           int dagger_direction = 2;
           if (is_running_direction !=0){
           dagger_direction = is_running_direction; 
           }
           
           daggas_facing.add(dagger_direction);
           
           
    } 
    
    private void update() {
        Boolean keyA = isPressed(KeyCode.A);
        Boolean keyD = isPressed(KeyCode.D);
        Boolean keyW = isPressed(KeyCode.W);
        Boolean keyS = isPressed(KeyCode.S);
        if((!keyA&&!keyD&&!keyS&&!keyW)||(keyA&&keyD))
        {
           if(!Is_idle){
           try{
           Image image = new Image(new FileInputStream("tutorial14/texture/player/Assassin.GIF"));
           player.setFill( new ImagePattern(image));  
           }catch(FileNotFoundException e){} }
           Is_idle = true;
           is_running_direction=0;
        }
         
        if (keyA && !keyD &&player.getTranslateX() >= 5) {
            moveBoxX(-5,player);
            if(1!=is_running_direction){
               try{
               Image image = new Image(new FileInputStream("tutorial14/texture/player/PlayerRunLeft.GIF"));
               player.setFill( new ImagePattern(image));  
               }catch(FileNotFoundException e){}
            }
            Is_idle = false;
            is_running_direction = 1;
        }

        if (isPressed(KeyCode.W) && player.getTranslateY() >= 5) {
           jumpPlayer();
        }
        if (isPressed(KeyCode.SPACE)){
           if(!shoot_toggle){
              shoot(); shoot_toggle = true;
           }
        }else{shoot_toggle = false;}

        if (keyD&&!keyA&& player.getTranslateX() + player_wide <= levelWidth - 5) {
            moveBoxX(5,player);
            
            if(is_running_direction != 2){
               try{
               Image image = new Image(new FileInputStream("tutorial14/texture/player/PlayerRunRight.GIF"));
               player.setFill( new ImagePattern(image));  
               }catch(FileNotFoundException e){}
            }
            Is_idle = false;
            is_running_direction = 2;
        }

        if (playerVelocity.getY() < 10) {
            playerVelocity = playerVelocity.add(0, 1);
        }
        
       
        moveBoxY((int)playerVelocity.getY(),player);
        
         
        
        
        for (Node coin : coins) {
            if (player.getBoundsInParent().intersects(coin.getBoundsInParent())) {
                coin.getProperties().put("alive", false);
                dialogEvent = true;
                running = false;
            }
        }
        
        
        for (Iterator<Rectangle> it = coins.iterator(); it.hasNext(); ) {
            Node coin = it.next();
            if (!(Boolean)coin.getProperties().get("alive")) {
                it.remove();
                
                gameRoot.getChildren().remove(coin);
            }
            
        }
        for (Node spike : spikes) {
            if (player.getBoundsInParent().intersects(spike.getBoundsInParent())) {
                spike.getProperties().put("alive", false);
                Current_Level = 0;
                initContent();                
            }
        }
        
        for (Node spike : enemys) {
            if (player.getBoundsInParent().intersects(spike.getBoundsInParent())) {
                spike.getProperties().put("alive", false);
                Current_Level = 0;
                initContent();                
            }
        }
         
        for(int i=0; i<daggas.size(); i++) {
                     
           for (Rectangle enemy : enemys) { // doe enemy killing block
              if (daggas.get(i).getBoundsInParent().intersects(enemy.getBoundsInParent())) {
               
                   try{//asdf
                   Image image = new Image(new FileInputStream("tutorial14/texture/null.png"));
                   enemy.setFill(new ImagePattern(image));  
                   }catch(FileNotFoundException e){}
                   enemys.remove(enemy);
               }
            }
            boolean col = false; //do dagger collisions block
            int shmove = 0;
            for (Rectangle platform : platforms) {
              if (!daggas.get(i).getBoundsInParent().intersects(platform.getBoundsInParent())){
                
                if (daggas_facing.get(i) == 2){
                shmove=projectile_speed;
                }else{shmove=-projectile_speed;}
          
              }else{col = true;}
            }
            if(!col){daggas.get(i).setTranslateX(daggas.get(i).getTranslateX() + shmove);
            }else{
             if (daggas.get(i).getBoundsInParent().intersects(player.getBoundsInParent())) {
             canJump = true;}
            }
         }
     }
    
     private void moveBoxX(int value, Rectangle moveable) {
        boolean movingRight = value > 0;
        boolean col = false;
        for (int i = 0; i < Math.abs(value); i++) {
            for (Node platform : platforms) {
                if (moveable.getBoundsInParent().intersects(platform.getBoundsInParent())) {
                    if (movingRight) {
                        if (moveable.getTranslateX() + player_wide == platform.getTranslateX()) {
                            moveable.setTranslateX(moveable.getTranslateX() + (!movingRight ? 1 : -1));
                            return;
                        }
                    }
                    else {
                        if (moveable.getTranslateX() == platform.getTranslateX() + stage_wide) {
                            moveable.setTranslateX(moveable.getTranslateX() + (!movingRight ? 1 : -1));
                            return;
                        }
                    }
                }
            }
            moveable.setTranslateX(moveable.getTranslateX() + (movingRight ? 1 : -1));
        }
    }

    private void moveBoxY(int value, Rectangle moveable) {
        boolean movingDown = value > 0;
        try {
            Thread.sleep(5);
        for (int i = 0; i < Math.abs(value); i++) {
            for (Node platform : platforms) {
                if (moveable.getBoundsInParent().intersects(platform.getBoundsInParent())) {
                    if (movingDown) {
                        if (moveable.getTranslateY() + player_tall == platform.getTranslateY()) {
                            moveable.setTranslateY(player.getTranslateY() - 1);
                            canJump = true;
                            return;
                        }
                    }
                    else {
                        if (moveable.getTranslateY() == platform.getTranslateY() + stage_tall) {
                            moveable.setTranslateY(player.getTranslateY() + 1);
                            return;
                        }
                    }
                }
            }
            moveable.setTranslateY(player.getTranslateY() + (movingDown ? 1 : -1));
        }
    }
        catch(Exception e){
        return ;
        }
    }

    private void jumpPlayer() {
    try {
        Thread.sleep(5);
        if (canJump) {
            playerVelocity = playerVelocity.add(0, -30);
            canJump = false;
            }

            }catch(Exception e){
        return ;
        }
     }


    private Rectangle createEntity(int x, int y, int w, int h, String texture) {
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
        
        stackPane.getChildren().clear();
        Disp_Background.setHeight(720);
        Disp_Background.setWidth(1280);
        String backgroundTemp = LevelData.background_img[Current_Level];
        try{
        Image image = new Image(new FileInputStream(backgroundTemp));
        Disp_Background.setFill(new ImagePattern(image));
        }catch(FileNotFoundException e){}
        stackPane.getChildren().add(Disp_Background);
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
