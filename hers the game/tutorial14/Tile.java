package tutorial14;

import javafx.scene.Node;
import javafx.scene.paint.ImagePattern;
import javafx.scene.image.*;
import java.io.File;  
import java.io.FileNotFoundException; 
import java.io.FileInputStream; 

public class Tile {
    public String name;
    public char tile_char;
    public ImagePattern Tile_texture;
    public Node n; 
    
    public Tile(String nam, char c,String img){
    name = nam;
    tile_char = c;
    
     try{
        Image image = new Image(new FileInputStream(img));
        Tile_texture = new ImagePattern(image);  
        }catch(FileNotFoundException e){}


    }
}