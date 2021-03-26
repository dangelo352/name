package tutorial14;

import javafx.scene.image.*;
import java.io.File;  


public class Tileset {
    public static Tile Tiles[] = 
    {
    // remember not to use ' ' or '0' as the map chars because they mean air blocks.
    //make new tile ( name , Char you want to use in the level data , path to texture) , <-- add comma to all but last one
    new Tile("air",'0',""                           ),      //no change or add texture this is no texture
    new Tile("air",' ',""                           ),      // this is more no texture
    new Tile("levelend" ,'2',"tutorial14/texture/koin.png"),    //or dis this do wird shit if u use the #2 cus thats the tile id i use to move between levls
    new Tile("grass02" ,'#',"tutorial14/texture/good.png"),     //<--here and down u can change
    new Tile("grass",'1',"tutorial14/texture/gras.gif")       

    
    };
    
    
}