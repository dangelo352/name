package tutorial14;


public class LevelData {
    
    public static int player_start_pos[][] ={
      {400,500}, //level 1 start position (x,y)
      {0,500},  //level 2 start etc.
      {0,500},
      {0,320}
    };
     public static int s_start_pos[][] ={
      {400,500}, //level 1 start position (x,y)
      {0,500},  //level 2 start etc.
      {0,500}
    };

    
    public static String background_img[] ={
      "tutorial14/texture/forest/lvl1_background.PNG", //level 1 background img file path goes here (should look like: "tutorial14/texture/filename.extention") 
      ""  //level 2 background etc.
    };
    
    
    
    public static final String[][] level_dat = new String[][] 
    {
        {
         //level 1
         "                     ",
         "                     ",
         "                     ",
         "                     ",
         "                     ",
         "                     ",
         "                     ",
         "                     ",
         "                     ",
         "     HHH             ",
         "HHHHHXXXHHHH  HHH HH2",
         "XXXXXXXXXXXXXXXXXXXXX",
         "                     "
        },
        {
         //level 2
         "                                 ",
         "                                 ",
         "                                 ",
         "                                 ",
         "                                 ",
         "                                 ",
         "           111    11  11  1  1   ",
         "   111                  1        ",
         "        ###             1        ",
         "     HHH     111    2   1        ",
         "HHHHHXXX           111  111      ",
         "XXXXX###111111  M11111  111111   ",
         "              111     11         "
        },
        {
        //level 3
         "                                 ",
         "                                 ",
         "                                 ",
         "                                 ",
         "                                 ",
         "                                 ",
         "           111    11  11         ",
         "                                 ",
         " 1      ###                      ",
         "     2M      111                 ",
         "     111           111  111      ",
         "11111111111111   11111  111111111",
         "              111     11         "        
        },
        {
        //level 4 (Hills Level: A)
         "                                                     Y     Y",
         "                     HHH                                   Y",
         "                     SXP                         HHHHH     Y",
         "   HHHHHHHHHHHH        Y                         SXXXP     Y",
         "   SXXXXXXXXXXP      HHYHHMHHHHH   HHHHHH   HHHHHYYYYY     Y",
         "   YYYYYYYYYYY       SXYXXXXXXXP   SXXXXP   SXXXXYYYYY    2Y",
         "HHHYYYYYYYYYYY         YYYYYYYYY   YYYYYY   YYYYYYYYYYHHHHHY",
         "XXXYYYYYYYYYYY       HHYYYYYYYYY   YYYYYY   YYYYYYYYYYXXXXXY",
         "YYYYYYYYYYYYYY       SXYYYYYYYYY   YYYYYY   YYYYYYYYYYYYYYYY",
         "YYYYYYYYYYYYYY         YYYYYYYYY   YYYYYY   YYYYYYYYYYYYYYYY",
         "YYYYYYYYYYYYYYHHHHHHHHHYYYYYYYYYMMMYYYYYYMMMYYYYYYYYYYYYYYYY",
         "YYYYYYYYYYYYYYXXXXXXXXXYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY",
         "Y                                " 
        //1   5    10   15   20   25   30   35   40   45   50   55   60       
        }
   };
   
}
