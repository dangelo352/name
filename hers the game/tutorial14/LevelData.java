package tutorial14;


public class LevelData {
    
    public static int player_start_pos[][] ={
      {0,600}, //level 1 start position (x,y)
      {0,600}  //level 2 start etc.
    };
    
    public static String background_img[] ={
      "tutorial14/texture/lvl1_background.PNG", //level 1 background img file path goes here (should look like: "tutorial14/texture/filename.extention") 
      ""  //level 2 background etc.
    };
    
    
    
    public static final String[][] level_dat = new String[][] 
    {
        {
         //level 1
         "                                 ",
         "                                 ",
         "                                 ",
         "                                 ",
         "                                 ",
         "                                 ",
         "           111    11  11  1  1   ",
         "   111                  1        ",
         "        ###             1        ",
         "             111    2   1        ",
         "     111           111  111      ",
         "11111111111111   11111  111111   ",
         "              111     11         "
        },
        {
        //level 2
         "                                 ",
         "                                 ",
         "                                 ",
         "                                 ",
         "                                 ",
         "                                 ",
         "           111    11  11         ",
         "                                 ",
         " 1      ###                      ",
         "      2      111                 ",
         "     111           111  111      ",
         "11111111111111   11111  111111111",
         "              111     11         "        
        }
   };
   
}
