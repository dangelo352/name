package tutorial14;

public class LevelData {
    
    public static int player_start_pos[][] ={
      {400,500}, //level 1 start position (x,y)
      {0,500},  //level 2 start etc.
      {0,500}, //3
      {150,220},//4
      {0,320}, //5
      {400,200}, //level 6 start position (x,y)
      {0,320},  //level 7 start etc.
      {0,320}, //8
      {0,320}, //9
      {0,320} //10
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
         //level 4
       
         "                                                                  ",
         "                                                             ",
         "                                                             ",
         "                                                             ",
         "X                                 YY                         ",
         "X  XXX                       YY        YY                   2",   
         "X  Y              Y  YYYYYY                YYYY          YYYY",
         "X  YMMMMMMMMMMMMMMY  Y    Y                Y   Y        Y    ",
         "X  YYYYYYYYYYYYYYYY  Y    Y                Y    Y      Y     ",
         "X                    Y    Y                Y     Y    Y      ",
         "X                    Y    YMMMMMMMMMMMMMMMMY      YYYY       ",
         "XXXXXXXXXXXXXXXXXXXXXXXXXXXXYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY ",

         "                     "
        },
        {
         //level 5
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
         "       C                                              ",
         "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC ",

         "     "
        },
        {
        //level 6
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
         "        C                                              ",
         "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC ",      
        },
        {
        //level 7 (Hills Level: A)
         "                                                     Y     Y",
         "                     HHH                                   Y",
         "                     SXP                         HHHHH     Y",
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
        //level 8 (Hills Level: A)
         "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC",
         "                          Y     Y ",
         "                          Y     Y ",
         "                          Y     Y ",
         "       Y    Y    Y    YY  Y    2Y ",
         "                      YY     YYYY  ",   
         "     Y                  Y       Y  ",
         "                         YYY    Y  ",
         "YYYYM  YYYM  YYYM  YYY    YYY   Y   ",
         "   YM  Y YM  Y YM  Y YY         Y  ",
         "   YM  Y YM  Y YM  Y YY         Y ",
         "YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY ",

         "Y                                " 
        //1   5    10   15   20   25   30   35   40   45   50   55   60       
        },
        {
        //level 9 (Hills Level: A)
         "CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC",
         "                                                    ",
         "                                                    ",
         "                                                     ",
         "                                                     ",
         "                                           2           ",   
         "X               C   C                    CCCCC         ",
         "X          C                                          ",
         "X     C                              C                ",
         "XCCC                      C  C   C C                  ",
         "X                                                     ",
         "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM ",


         "Y                                " 
        //1   5    10   15   20   25   30   35   40   45   50   55   60       
        },
        {
        //level 10 (Hills Level: A)
  		"                YYYYYYYYY                    ",
         "                       Y        YYYYYYYYY    ",
         "                       Y        Y       Y    ",
         "                      MYYYYYYYYYY      2Y      ",
         "                   Y   Y      YYY   YYYYY     ",
         "                  XY   Y      YMY   Y      ",
         "                XXYX   Y  Y         Y      ",
         "               XYYYYM  Y  Y         Y      ",   
         "               YYYYY      YYYYYYYYYYYYY     ",   
         "              YYYYYY      Y                 ",   
         "    X        YYYYYY M    Y                 ",
         "YYYYYYYYYYYYYYYYYYYYYYYYYYYYY               ",
 
        //1   5    10   15   20   25   30   35   40   45   50   55   60       
        }


   };
   
}
