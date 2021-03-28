package tutorial14;

import javafx.scene.image.*;
import java.io.File;  


public class Tileset {
    public static Tile ColTiles[] = 
    {
    // remember not to use ' ' or '0' as the map chars because they mean air blocks.
    //make new tile ( name , Char you want to use in the level data , path to texture) , <-- add comma to all but last one
    //<--here and down u can change
    new Tile("grass",'X',"tutorial14/texture/forest/BlueJiggleGrass.GIF"),
    new Tile("BlueDirt", 'Y', "tutorial14/texture/forest/BlueDirt.PNG"),
    new Tile("CornerBlueGrass", 'P', "tutorial14/texture/forest/CornerBlueGrass.GIF"),
    new Tile("CornerBlueGrassBL", 'Q', "tutorial14/texture/forest/CornerBlueGrassBL.GIF"),
    new Tile("CornerBlueGrassBR", 'R', "tutorial14/texture/forest/CornerBlueGrassBR.GIF"),
    new Tile("CornerBlueGrassTL", 'S', "tutorial14/texture/forest/CornerBlueGrassTL.GIF"),
    new Tile("RigtGrass", 'W', "tutorial14/texture/forest/RightGrass.GIF"),
    new Tile("LeftGrass", '1', "tutorial14/texture/forest/LeftGrass.GIF"),
    new Tile("ForestCeiling", ';', "tutorial14/texture/forest/ForestCeiling.GIF"),
    new Tile("FloatingForestBlock", '4', "tutorial14/texture/forest/FloatingForestBlock.GIF"),
    new Tile("RTripleGrass", '{', "tutorial14/texture/forest/RTripleGrass.GIF"),
    new Tile("LTripleGrass", '}', "tutorial14/texture/forest/LTripleGrass.GIF"),
    new Tile("MidRipleGrass", '~', "tutorial14/texture/forest/MidRipleGrass.GIF"),
    new Tile("ForestInvTileL", 'i', "tutorial14/texture/forest/LeftInverseCorner.GIF"),
    new Tile("ForestInvTileR", 'j', "tutorial14/texture/forest/RightInverseCorner.GIF"),
    new Tile("CastleDirt", 'A', "tutorial14/texture/castle/CastleDirt.PNG"),
    new Tile("CastleFloor", 'C', "tutorial14/texture/castle/CastleFloor.PNG"),
    new Tile("CastleFloorL", 'B', "tutorial14/texture/castle/CastleFloorL.PNG"),
    new Tile("CastleFloorR", 'D', "tutorial14/texture/castle/CastleFloorR.PNG"),
    new Tile("CastleCeiling", ')', "tutorial14/texture/castle/CastleCeiling.PNG"),
    new Tile("CastleFloat", '-', "tutorial14/texture/castle/CastleFloat.PNG"),
    new Tile("CastleCornerL", '=', "tutorial14/texture/castle/LeftCorner.PNG"),
    new Tile("CastleCornerR", '+', "tutorial14/texture/castle/RightCorner.PNG"),
    new Tile("TripleLeftCastle", 'd', "tutorial14/texture/castle/TripleLeftCastle.PNG"),
    new Tile("TripleMidCastle", 'e', "tutorial14/texture/castle/TripleMidCastle.PNG"),
    new Tile("TripleRightCastle", 'f', "tutorial14/texture/castle/TripleRightCastle.PNG"),
    new Tile("WoodDirt", 'E', "tutorial14/texture/shop/WoodDirt.PNG"),
    new Tile("WoodTile", 'F', "tutorial14/texture/shop/WoodTile.PNG"),
    new Tile("Hill4Sides", 'G', "tutorial14/texture/hills/Hill4Sides.GIF"),
    new Tile("HillBottomGrass", 'N', "tutorial14/texture/hills/HillBottomGrass.GIF"),
    new Tile("HillDirt", 'I', "tutorial14/texture/hills/HillDirt.PNG"),
    new Tile("HillGrass", 'J', "tutorial14/texture/hills/HillGrass.GIF"),
    new Tile("HillLeftCorner", 'L', "tutorial14/texture/hills/HillLeftCorner.GIF"),
    new Tile("HillLeftGrass", 'O', "tutorial14/texture/hills/HillLeftGrass.GIF"),
    new Tile("HillRightCorner", 'T', "tutorial14/texture/hills/HillRightCorner.GIF"),
    new Tile("HillRightGrass", 'U', "tutorial14/texture/hills/HillRightGrass.GIF"),
    new Tile("LeftTripleHill", ':', "tutorial14/texture/hills/LeftTripleHill.GIF"),
    new Tile("RightTripleHill", ',', "tutorial14/texture/hills/RightTripleHill.GIF"),
    new Tile("TripleMidHill", '/', "tutorial14/texture/hills/TripleMidHill.GIF"),
    new Tile("RightInverseHill", 'n', "tutorial14/texture/hills/RightInverseHill.GIF"),
    new Tile("LeftInverseHill", 'r', "tutorial14/texture/hills/LeftInverseHill.GIF"),
    new Tile("CaveCeiling", '5', "tutorial14/texture/cave/CaveCeiling.PNG"),
    new Tile("CaveFloat", '6', "tutorial14/texture/cave/CaveFloat.PNG"),
    new Tile("CaveTile", 'V', "tutorial14/texture/cave/CaveTile.PNG"),
    new Tile("CaveDirt", 'u', "tutorial14/texture/cave/CaveDirt.PNG"),
    new Tile("LeftCave", '7', "tutorial14/texture/cave/LeftCave.PNG"),
    new Tile("LeftCorner", '8', "tutorial14/texture/cave/LeftCorner.PNG"),
    new Tile("RightCave", '9', "tutorial14/texture/cave/RightCave.PNG"),
    new Tile("RightCorner", '!', "tutorial14/texture/cave/RightCorner.PNG"),
    new Tile("TripleLeftCave", 'a', "tutorial14/texture/cave/TripleLeftCave.PNG"),
    new Tile("TripleMidCave", 'b', "tutorial14/texture/cave/TripleMidCave.PNG"),
    new Tile("TripleRightCave", 'c', "tutorial14/texture/cave/TripleRightCave.PNG"),
    new Tile("LeftInvCornerCave", 'p', "tutorial14/texture/cave/LeftInvCornerCave.PNG"),
    new Tile("RightInvCornerCave", 'q', "tutorial14/texture/cave/RightInvCornerCave.PNG"),
    new Tile("LeftSnow", '@', "tutorial14/texture/mountain/LeftSnow.PNG"),
    new Tile("RightSnow", '#', "tutorial14/texture/mountain/RightSnow.PNG"),
    new Tile("SnowDirt", '$', "tutorial14/texture/mountain/SnowDirt.PNG"),
    new Tile("SnowFloat", '%', "tutorial14/texture/mountain/SnowFloat"),
    new Tile("SnowLeftCorner", '^', "tutorial14/texture/mountain/SnowLeftCorner.PNG"),
    new Tile("SnowRightCorner", '&', "tutorial14/texture/mountain/SnowRightCorner.PNG"),
    new Tile("SnowTile", '*', "tutorial14/texture/mountain/SnowTile.PNG"),
    new Tile("SnowTop", '(', "tutorial14/texture/mountain/SnowTop.PNG"),
    new Tile("TripleLeftMnt", '<', "tutorial14/texture/mountain/TripleLeftMnt.PNG"),
    new Tile("TripleMidMnt", '>', "tutorial14/texture/mountain/TripleMidMnt.PNG"),
    new Tile("TripleRightMnt", '?', "tutorial14/texture/mountain/TripleRightMnt.PNG"),
    new Tile("InvCornerMntL", 'g', "tutorial14/texture/mountain/InvCornerMntL.PNG"),
    new Tile("InvCornerMntR", 'h', "tutorial14/texture/mountain/InvCornerMntR.PNG")
    
              
    };
    public static Tile NoColTiles[] = 
    {
    new Tile("air",'0',"" ),      // no change or add texture this is no texture
    new Tile("air",' ',"" ),      // this is more no texture
    new Tile("grass",'H',"tutorial14/texture/forest/BlueTopGrass.GIF"),
    new Tile("HillTopGrass", 'K', "tutorial14/texture/hills/HillTopGrass.GIF"),
    new Tile("CeilingBottom", '3', "tutorial14/texture/forest/CeilingBottom.GIF")  
    };
    public static Tile SpecialTile[] = 
    {
    new Tile("levelend" ,'2',"tutorial14/texture/koin.gif")
    };
    
    public static Tile EnemyTile[] = 
    {
    new Tile("LeftGWalk" ,'o',"tutorial14/texture/enemies/LeftGWalk.GIF"),
    new Tile("BlueMageLeft", 'y', "tutorial14/texture/enemies/BlueMageLeft.GIF"),
    new Tile("BlueMageRight", 'z', "tutorial14/texture/enemies/BlueMageRight.GIF"),

    };
    
    public static Tile Spikes[] = 
    {
     new Tile("Spikes" ,'M',"tutorial14/texture/MiddleSpikes.png"),
     new Tile("SpikesL", '[', "tutorial14/texture/LeftSpikes.PNG"),
     new Tile("SpikesR", ']', "tutorial14/texture/RightSpikes.PNG"),
     new Tile("WallSpikeL", 'k', "tutorial14/texture/LeftWallSpike.PNG"),
     new Tile("WallSpikeR", 'l', "tutorial14/texture/RightWallSpike.PNG"),
     new Tile("CeilingSpikes", 'm', "tutorial14/texture/CeilingSpikes.PNG")
          
    };
}