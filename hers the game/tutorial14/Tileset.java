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
    new Tile("grass",'X',"tutorial14/texture/forest/BlueJiggleGrass.GIF"),
    new Tile("BlueDirt", 'Y', "tutorial14/texture/forest/BlueDirt.PNG"),
    new Tile("CornerBlueGrass", 'P', "tutorial14/texture/forest/CornerBlueGrass.GIF"),
    new Tile("CornerBlueGrassBL", 'Q', "tutorial14/texture/forest/CornerBlueGrassBL.GIF"),
    new Tile("CornerBlueGrassBR", 'R', "tutorial14/texture/forest/CornerBlueGrassBR.GIF"),
    new Tile("CornerBlueGrassTL", 'S', "tutorial14/texture/forest/CornerBlueGrassTL.GIF"),
    new Tile("CastleDirt", 'A', "tutorial14/texture/castle/CastleDirt.PNG"),
    new Tile("CastleFloor", 'C', "tutorial14/texture/castle/CastleFloor.PNG"),
    new Tile("CastleFloorL", 'B', "tutorial14/texture/castle/CastleFloorL.PNG"),
    new Tile("CastleFloorR", 'D', "tutorial14/texture/castle/CastleFloorR.PNG"),
    new Tile("WoodDirt", 'E', "tutorial14/texture/shop/WoodDirt.PNG"),
    new Tile("WoodTile", 'F', "tutorial14/texture/shop/WoodTile.PNG"),
    new Tile("Hill4Sides", 'G', "tutorial14/texture/hills/Hill4Sides.GIF"),
    new Tile("HillBottomGrass", 'N', "tutorial14/texture/hills/HillBottomGrass.GIF"),
    new Tile("HillDirt", 'I', "tutorial14/texture/hills/HillDirt.PNG"),
    new Tile("HillGrass", 'J', "tutorial14/texture/hills/HillGrass.GIF"),
    new Tile("HillTopGrass", 'K', "tutorial14/texture/hills/HillTopGrass.GIF"),
    new Tile("HillLeftCorner", 'L', "tutorial14/texture/hills/HillLeftCorner.GIF"),
    new Tile("HillLeftGrass", 'O', "tutorial14/texture/hills/HillLeftGrass.GIF"),
    new Tile("HillRightCorner", 'T', "tutorial14/texture/hills/HillRightCorner.GIF"),
    new Tile("HillRightGrass", 'U', "tutorial14/texture/hills/HillRightGrass.GIF")
              
    };
    public static Tile NoColTiles[] = 
    {
    new Tile("air",'0',"" ),      // no change or add texture this is no texture
    new Tile("air",' ',"" ),      // this is more no texture
    new Tile("grass",'H',"tutorial14/texture/forest/BlueTopGrass.GIF")  
    };
    public static Tile SpecialTile[] = 
    {
    new Tile("levelend" ,'2',"tutorial14/texture/koin.gif")
    };
    public static Tile EnemyTile[] = 
    {
     new Tile("Spikes" ,'M',"tutorial14/texture/MiddleSpikes.png")
    };
}