package tutorial14;

import javafx.scene.image.*;
import java.io.File;  


public class Tileset {
    public static Tile ColTiles[] = 
    {
    // remember not to use ' ' or '0' as the map chars because they mean air blocks.
    //make new tile ( name , Char you want to use in the level data , path to texture) , <-- add comma to all but last one
    new Tile("grass02" ,'#',"tutorial14/texture/good.png"),     //<--here and down u can change
    new Tile("grass",'1',"tutorial14/texture/gras.gif"),
    new Tile("grass",'X',"tutorial14/texture/forest/BlueJiggleGrass.GIF")
              
    };
    public static Tile NoColTiles[] = 
    {
    new Tile("air",'0',"" ),      // no change or add texture this is no texture
    new Tile("air",' ',"" ),      // this is more no texture
    new Tile("grass",'H',"tutorial14/texture/forest/BlueTopGrass.GIF")  
    };
    public static Tile SpecialTile[] = 
    {
    new Tile("levelend" ,'2',"tutorial14/texture/koin.png")
    };
    public static Tile EnemyTile[] = 
    {
     new Tile("megaDeath03" ,'M',"tutorial14/texture/spikes.png")
    };
}