package tutorial14;

public class LevelData {
    
    public static int player_start_pos[][] ={
      {0,600},
      {0,500},
      {150,220},//4
      {0,10}, //5
      {0,10},  //level 7 start etc.
      {0,10}, //Hill B
      {60,480}, //8
      {70,480}, //9
      {80,480}, //10
      {100,320}, //11
      {100,320}, //12
      {100,320}, //13
      {100,320}, //14
      {100,320} //5
    };
    
    public static String background_img[] ={
      "tutorial14/texture/TitleSequence.PNG",
      "tutorial14/texture/forest/lvl1_background.PNG", //level 1 background img file path goes here (should look like: "tutorial14/texture/filename.extention") 
      "tutorial14/texture/forest/lvl1_background.PNG", //2
      "tutorial14/texture/forest/lvl1_background.PNG", //3
      "tutorial14/texture/hills/HillsBackground.PNG", //4
      "tutorial14/texture/hills/HillsBackground.PNG", //5
      "tutorial14/texture/hills/HillsBackground.PNG", //5
      "tutorial14/texture/cave/CaveBackground.PNG", //10
      "tutorial14/texture/cave/CaveBackground.PNG", //11
      "tutorial14/texture/castle/CastleWalls.PNG", //13
      "tutorial14/texture/castle/CastleWalls.PNG", //13
      "tutorial14/texture/CastleWalls.PNG" //15
      
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
        "                        HHHH2",
        "                        }~~~{",
        "              H      H       ",
        "           H  4      4       ",   
        "         H 4      H          ",
        "     H   4        4          ",
        "    HS                       ",
        "   HSi                       ",
        "HHHSiY   o   o   o   o   o   ",
        "XXXiYYXXXXXXXXXXXXXXXXXXXXXXX",
        "                     "
       },
       {
         //level 2 Forest: B
       
         ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;",
         "3333333333333333333333333333333333333333333333333333333333333",
         "                                                             ",
         "                                                             ",
         "                                  HH                         ",
         "P  HHH                       HH   }{   HH                    ",
         "W  SX{            H  HHHHHH  }{        }{  HHHH          HHH2",   
         "W  1              P  SXXXXP                SXXPH        HSXXX",
         "W  1MMMMMMMMMMMMMMW  1YYYYW                1YYjPH      HSiYYY",
         "W  1YYYYYYYYYYYYYYW  1YYYYW                1YYYjPH    HSiYYYY",
         "W                    1YYYYW                1YYYYjPHHoHSiYYYYY",
         "WHHHHHHoHHoHHoHHHHHHH1YYYYWMMMMMMMMMMMMMMMM1YYYYYYYYYYYYYYYYY",
         "jXXXXXXXXXXXXXXXXXXXXXXXXXXXYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYY",
         "                     "
        },
        {
        //level 5 Forest: C
         ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;",
         "33333333333333333333333333W333331 ",
         "                          W     1 ",
         "       H    H    H    HH  W     1 ",
         "       4    4    4    SP  W  HH21 ",
         "     H                QRH    }~~Y  ",   
         "     4                   4HHH   1  ",
         "HHHH   HHH   HHH   HHH   }XPH   1  ",
         "XXXPl  SXPl  SXPl  SXPH   QY{   1   ",
         "YYYWl  1YWl  1YWl  1YjP         1  ",
         "YYYWlHH1YWlHH1YWlHH1YYWHHHHHHHHH1 ",
         "YYYjXXXiYjXXXiYjXXXiYYjXXXXXXXXXX ",
         "                                 " 
        //1   5    10   15   20   25   30   35   40   45   50   55   60       
        },
        {
        //level 4 Hills: A
         "                                                     I     I",
         "                      KKK                                  I",
         "                      LJT                        KKKKK     I",
         "   KKKKKKKKKKKK        I                         LJJJT     I",
         "   LJJJJJJJJJJJT     KoIKKMKKKKK   KKKKKK   KKKKKIIIII     I",
         "   IIIIIIIIIII       LJIJJJJJJJT   LJJJJT   LJJJJIIIII     I",
         "KKKIIIIIIIIIII         IIIIIIIII   IIIIII   IIIIIIIIIIKKKK2I",
         "JJJIIIIIIIIIII       KKIIIIIIIII   IIIIII   IIIIIIIIIIJJJJJI",
         "IIIIIIIIIIIIII       LJIIIIIIIII   IIIIII   IIIIIIIIIIIIIIII",
         "IIIIIIIIIIIIII         IIIIIIIII   IIIIII   IIIIIIIIIIIIIIII",
         "IIIIIIIIIIIIIIKKKKKKKKKIIIIIIIIIMMMIIIIIIMMMIIIIIIIIIIIIIIII",
         "IIIIIIIIIIIIIIJJJJJJJJJIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII",
         "Y                                " 
        //1   5    10   15   20   25   30   35   40   45   50   55   60       
        },
        {
        //level 5 Hills: B
      
       "                                 JJJJJ       ",
       "                                     I    K2K",
       "        K     K                  K   I    LJJ",
       "    KK  G     U/,                J  kIl  KOII",
       "   KLT    K   U              K   I   I   LrII",
       "   LrU    G   U      KMKK    G   I   I   OIII",
       "   OIU        U/,    LJJTK       I   Il  OIII",   
       "  KOIU        U      OIInT       I   I   OIII",
       "  LrIU        U      OIIIU       Il  I   OIII",
       "  OIIU        U      OIIIU       I       OIII",
       "KKOIIU        U   o  OIIIU[MMMMM]IKKKKoKKOIII",
       "JJrIInJJJJJJJJnJJJJJJrIIInJJJJJJJIJJJJJJJrIII",
       "XXXXXXXXXXXXXXXXXXXXX"
      },
        {
        //level 7 Mountains: A
        //level 7 (montin Level: A)
      "                >>>>>>>>>>$$$$$$$$$$$$$$$$$$$",
         "                       $$$$$$$$$$>>>>>>>$$    ",
         "                       #$$$$$$$$#       @$   ",
         "                       #>>>>>>$$#      2@$     ",
         "                   ^  k#      @>#   $>>>$$    ",
         "                  ^$   #       m    @$$$$$",
         "                ^*$$   #  @         @$$$$$ ",
         "               ^$$$$   #  @         @$$$$$ ",   
         "               @$$$$l     @>>>>>>>>>>$$$$$",   
         "              ^$$$$$      @$$$$$$$$$$$$$$$  ",   
         "              @$$$$$ M    @$$$$$$$$$$$$$$$  ",
         "***************************$$$$$$$$$$$$$$$ ",
        //1   5    10   15   20   25   30   35   40   45   50   55   60       
        },
        {
        //level 8 Caves: A
        "555555555555555555555555555555555555555",
         "uuuuuu55555555555uu9               67 ",
         "uuuu66           6u9                7 ",
         "uuuu9             79  ab!           7 ",
         "uuuu9             79    9FM     M   7 ",
         "uuuu9  8VV!  8!   79    9Fbbbbbbbc  7 ",
         "uuuu9  7uu9  79   F5bc  9F          7 ",
         "6556   7uu9  79         9           7 ",
         "9     8uuu9  79         9  abbbbbbbb7 ",
         "9     7uuu9  79      8VV9           7 ",
         "9    8uuuu9MM79    MM7FF9          27 ",
         "VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV",
        },
        {
         //level 9 Caves: B
         "555555555555555555555555555555555555555555555555  ",
         "uuuu9                               7        7      ",
         "uuuu9                               7l       7     ",
         "uuuu9  abbbbbbc  abc  abbbbbbbbbb!  7   ab!  7     ",
         "uuuu9      V                     9  7     9  7       ",
         "uuuu9      V                     9  7bc   9  7     ",
         "uuuuVbbc            M            9        9  7  ",
         "V55V           8bbbbbbbbbbMbbc   9        9  7         ",
         "9          abbbV    m   m    m   Mbbbbbbbb9  7    ",
         "9    8!                                      7        ",
         "9    79                                2     7     ",
         "VVVVVVVVVVVVVVVVVVMVVVVMVVVMVVVVVVVVVVVVVVVVVVVVVV",

        },
        {
        //level 6 Castle: A
         "C))))))))))))))))))))))))))))))))))))))))))))))))))))",
         "D                                                    ",
         "D                                                    ",
         "D                                                     ",
         "D                                                     ",
         "D                                          2           ",   
         "D               -   -                    deeef         ",
         "D          -                                          ",
         "D      -                              -                ",
         "Aeef                      -  -   - -                  ",
         "D                                                     ",
         "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM ",


         "Y                                " 
        //1   5    10   15   20   25   30   35   40   45   50   55   60       
        },
        {
         //level 3 Castle: B
         "))))))))))))))))))))))))))))))))))))))))))))))))))))))))))",
         "                              B         )))))))))))))))AAAA",
         "                              B         B              BAAA",
         "               k-l     =C+        deef       o  o  o  2BAAA",
         "                m     dAAD                 =CCCCCCCCCCCAAAAA",
         "                       BACCCCC+            BAAAAAAAAAAAAAAAA",   
         "              o   o  o BAAAAAAD            BAAAAAAAAAAAAAAA",
         "          =CCCCCCCCCCCCCAAAAAAD      o o  oBAAAAAAAAAAAAAAA",
         "         =AAAAAAAAAAAAAAAAAAAAD    =CCCCCCCAAAAAAAAAAAAAAAA",
         "        =AAAAAAAAAAAAAAAAAAAAACMMCCAAAAAAAAAAAAAAAAAAAAAAAA",
         "       =AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA",
         "CCCCCCCAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ",

         "     "
        },
   };
   
}
   