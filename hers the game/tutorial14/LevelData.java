package tutorial14;

public class LevelData {
    
    public static int player_start_pos[][] ={
      {0,320},
      {0,320},
      {150,220},//4
      {0,320}, //5
      {0,320},  //level 7 start etc.
      {0,320}, //8
      {0,320}, //9
      {0,320}, //10
      {100,320} //11
    };
    
    public static String background_img[] ={
      "tutorial14/texture/TitleSequence.PNG",
      "tutorial14/texture/forest/lvl1_background.PNG", //level 1 background img file path goes here (should look like: "tutorial14/texture/filename.extention") 
      "tutorial14/texture/forest/lvl1_background.PNG", //2
      "tutorial14/texture/forest/lvl1_background.PNG", //3
      "tutorial14/texture/hills/HillsBackground.PNG", //4
      "tutorial14/texture/hills/HillsBackground.PNG", //5
      "tutorial14/texture/hills/HillsBackground.PNG", //6
      "tutorial14/texture/mountin/MountainBackground.PNG", //7
      "tutorial14/texture/mountin/MountainBackground.PNG", //8
      "tutorial14/texture/mountin/MountainBackground.PNG", //9
      "tutorial14/texture/cave/CaveBackground.PNG", //10
      "tutorial14/texture/cave/CaveBackground.PNG", //11
      "tutorial14/texture/cave/CaveBackground.PNG", //12
      "tutorial14/texture/castle/CastleWalls.PNG", //13
      "tutorial14/texture/castle/CastleWalls.PNG", //14
      "tutorial14/texture/castle/CastleWalls.PNG", //15
    };
    
    
    
    public static final String[][] level_dat = new String[][] 
    {
    {
        //level 0
      
       "                     ",
       "                     ",
       "                     ",
       "                     ",
       "                     ",
       "                     ",
       "                     ",   
       "                     ",
       "                     ",
       "                     ",
       "                     ",
       "                    2",
       "XXXXXXXXXXXXXXXXXXXXX"
      },
      {
        //level 1 Forest: A
      
        ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;",
        "33333333333333333333333333333",
        "                            2",
        "                        }~~~{",
        "                             ",
        "              4      4       ",   
        "           4                 ",
        "        4         4          ",
        "     S                       ",
        "    Si                       ",
        "   SiY   o   o   o   o   o   ",
        "XXXiYYXXXXXXXXXXXXXXXXXXXXXXX",
        "                     "
       },
       {
         //level 2 Forest: B
       
         ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;",
         "3333333333333333333333333333333333333333333333333333333333333",
         "                                                             ",
         "                                                             ",
         "                                                             ",
         "X      oo                         YY                         ",
         "X  XXX                       YY        YY                   2",   
         "X  Y              Y  YYYYYY                YYYY          YYYY",
         "X  YMMMMMMMMMMMMMMY  Y    Y                Y   Y        Y    ",
         "X  YYYYYYYYYYYYYYYY  Y    Y                Y    Y      Y     ",
         "X                    Y    Y                Y     Y    Y      ",
         "X     o   o    o     Y    YMMMMMMMMMMMMMMMMY      YYYY       ",
         "XXXXXXXXXXXXXXXXXXXXXXXXXXXXYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY ",
         "                     "
        },
        {
         //level 3 Castle: B
         "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC",
         "                              C         CCCCCCCCCCCCCCCC   ",
         "                              C         C              C  ",
         "               MCM     CCC        CCCC                2C   ",
         "                M     CC C                 CCCCCCCCCCCCC   ",
         "                       C CCCCCC            C              ",   
         "                       C      C            C              ",
         "          CCCCCCCCCCCCCC      C            C               ",
         "         C                    C    CCCCCCCC               ",
         "        C                     CMMCC                     ",
         "   2    C                                              ",
         "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC ",

         "     "
        },
        {
        //level 4 Hills: A
         "                                                     Y     Y",
         "                     HHH                                   Y",
         "     2                SXP                         HHHHH     Y",
         "   HHHHHHHHHHHH        Y                         SXXXP     Y",
         "   SXXXXXXXXXXPX     HHYHHMHHHHH   HHHHHH   HHHHHYYYYY     Y",
         "   YYYYYYYYYYY       SXYXXXXXXXP   SXXXXP   SXXXXYYYYY    2Y",
         "HHHYYYYYYYYYYY         YYYYYYYYY   YYYYYY   YYYYYYYYYYHHHHHY",
         "XXXYYYYYYYYYYY       HHYYYYYYYYY   YYYYYY   YYYYYYYYYYXXXXXY",
         "YYYYYYYYYYYYYY       SXYYYYYYYYY   YYYYYY   YYYYYYYYYYYYYYYY",
         "YYYYYYYYYYYYYY         YYYYYYYYY   YYYYYY   YYYYYYYYYYYYYYYY",
         "YYYYYYYYYYYYYYHHHHHHHHHYYYYYYYYYMMMYYYYYYMMMYYYYYYYYYYYYYYYY",
         "YYYYYYYYYYYYYYXXXXXXXXXYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY",
         "Y                                " 
        //1   5    10   15   20   25   30   35   40   45   50   55   60       
        },
        {
        //level 5 Forest: C
         "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC",
         "                          Y     Y ",
         "                          Y     Y ",
         "                          Y     Y ",
         "       Y    Y    Y    YY  Y    2Y ",
         "                      YY     YYYY  ",   
         "     Y                  Y       Y  ",
         "   2                      YYY    Y  ",
         "YYYYM  YYYM  YYYM  YYY    YYY   Y   ",
         "   YM  Y YM  Y YM  Y YY         Y  ",
         "   YM  Y YM  Y YM  Y YY         Y ",
         "YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY ",

         "Y                                " 
        //1   5    10   15   20   25   30   35   40   45   50   55   60       
        },
        {
        //level 6 Castle: A
         "C))))))))))))))))))))))))))))))))))))))))))))))))))))",
         "D                                                    ",
         "D                                                    ",
         "D                                                     ",
         "D                                                     ",
         "D                                          2           ",   
         "D               6   6                    deeef         ",
         "D          6                                          ",
         "D     6                              6                ",
         "Aeef                      6  6   6 6                  ",
         "D                                                     ",
         "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM ",


         "Y                                " 
        //1   5    10   15   20   25   30   35   40   45   50   55   60       
        },
        {
        //level 7 Mountains: A
         "                ((((((((((                    ",
         "                       @        Y(((((((Y    ",
         "                       @        #       @    ",
         "                      [#((((((YY#      2@      ",
         "                   ^   #      @(#   Y>>>Y     ",
         "                  ^$   #       m    @      ",
         "                ^*Y$   #  @         @      ",
         "               ^YYY$]  #  @         @      ",   
         "               @YYY$      @>>>>>>>>>(>?     ",   
         "              ^YYYY$      @                 ",   
         "              @YYYY$ M    @                 ",
         "****************************               ",
        //1   5    10   15   20   25   30   35   40   45   50   55   60       
        },
        {
        //level 8 Caves: A
        "555555555555555555555555555555555555555",
         "      55555555555  9               F7 ",
         "    FF           F 9                7 ",
         "    9             79  ab!           7 ",
         "    9             79    9FM     M   7 ",
         "    9  8VV!  8!   79    9Fbbbbbbbc  7 ",
         "    9  7  9  79   F5bc  9F          7 ",
         "F55F   7  9  79         9           7 ",
         "9     8   9  79         9  abbbbbbbb7 ",
         "9     7   9  79      8VV9           7 ",
         "9    8    9MM79    MM7FF9          27 ",
         "VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV",
        },
        {
         //level 9 Caves: B
         "555555555555555555555555555555555555555555555555  ",
         "    9                               7        7      ",
         "    9                               7M       7     ",
         "    9  abbbbbbc  abc  abbbbbbbbbb!  7   ab!  7     ",
         "    9      V                     9  7     9  7       ",
         "    9      V                     9  7bc   9  7     ",
         "    Vbbc            M            9        9  7  ",
         "V55V           8bbbbbbbbbbMbbc   9        9  7         ",
         "9          abbbV    m   m    m   Mbbbbbbbb9  7    ",
         "9    8!                                      7        ",
         "9    79                                2     7     ",
         "VVVVVVVVVVVVVVVVVVMVVVVMVVVMVVVVVVVVVVVVVVVVVVVVVV",

        }
   };
   
}
   