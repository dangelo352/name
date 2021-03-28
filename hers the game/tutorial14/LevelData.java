package tutorial14;

public class LevelData {
    
    public static int player_start_pos[][] ={
      {0,320},//1
      {0,320},//2
      {150,220},//3
      {0,320}, //4
      {0,320},  //level 5 start etc.
      {100,320}, //6
      {100,320}, //7
      {0,320}, //8
      {100,500}, //9
      {100,500},//10
      {100,500},//11
      {100,500},//12
      {100,200}//13
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
       //9
      "tutorial14/texture/cave/CaveBackground.PNG", //10
      "tutorial14/texture/cave/CaveBackground.PNG", //11
      //12
      "tutorial14/texture/castle/CastleWalls.PNG", //13
      "tutorial14/texture/castle/CastleWalls.PNG", //14
      //15
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
        "        H  4      H          ",
        "     H  4         4          ",
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
         "                                  Ho                         ",
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
        //level 3 Forest: C
         ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;",
         "33333333333333333333333333W333331 ",
         "                          W     1 ",
         "       H    H    H    Ho  W     1 ",
         "       4    4    4    SP  W  HH21 ",
         "     H                QRH    }~~Y  ",   
         "     4                  4HHH    1  ",
         "HHHH   HHH   HHH   HHH   }XPH   1  ",
         "XXXPl  SXPl  SXPl  SXPH   QY{   1   ",
         "YYYWl  1YWl  1YWl  1YjP         1  ",
         "YYYWlHH1YWlHH1YWlHH1YYWHHHHHHHHH1 ",
         "YYYjXXXiYjXXXiYjXXXiYYjXXXXXXXXXX ",

         "Y                                " 
        //1   5    10   15   20   25   30   35   40   45   50   55   60       
        },

        {
        //level 4 Hills: A
         "                                                     I     I",
         "                     KKK                                   I",
         "                     LJT                         KKKKK     I",
         "   KKKKKKKKKKKK        I                         LJJJT     I",
         "   LJJJJJJJJJJJT     KoIKKMKKKKK   KKoKKK   KKKKKIIIII     I",
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
        {//5
        
        "                                 JJJJJ       ",
        "                                     I    K2K",
        "        o     K                  K   I    LJJ",
        "    KK  G     I/,                J  kIl  KIII",
        "   rLT    K   I              K   I   I   LIII",
        "   LII    G   I      KMKK    G   I   I   IIII",
        "   III        I/,    LJJTK       I   Il  IIII",   
        "   III        I      IIInT       I   I   IIII",
        "  LIII        I      IIIII       Il  I   IIII",
        "  IIII        I      IIIII       I       IIII",
        "KKIIII  r  o  I   o  IIIII[MMMMM]IKKKKoKKIIII",
        "JJIIInJJJJJJJJnJJJJJJIIIInJJJJJJJIJJJJJJJIIII",
        "XXXXXXXXXXXXXXXXXXXXX"
        },
       {
        //level 06 Hills: C
      
       "                  kI    KK             ",
       "              T   kIKK  LTK            ",
       "              I   kI/,  InTK           ",
       "  KKKKK   KKKKIl  kI    IInTK          ",
       "  LJJJT   LJJJIl  kIKK  IIInTK         ",
       "  IIIII   IIIIIl  kI/,  IIIInTK        ",
       "KKIIIII   IIIIIl  kI    IIIIInTK       ",   
       "JJIIIII       Il  kIKK  IIIIIInTK      ",
       "IIIIIII       Il  kI/,  IIIIIIInTK     ",
       "IIIIIII   I   Il        IIIIIIIInTK    ",
       "IIIIIII o I[M]IlKKKKKKKKIIIIIIIIInTK2KK",
       "IIIIIInJJJrIIInJJJJJJJJJrIIIIIIIIInJJJJ",
       "XXXXXXXXXXXXXXXXXXXXX"
      },
                {
        //level 7 Mountains: B
      
        "         **********************&",
        "       **n$   $        $       @",
        "              $     o  $ 2o    @",
        "              $l   *&  $o**o   @",
        "   &     n*&  $    m@  $****   @",
        "   g&    @$#  $**   @  $       @",
        "   @#l k@h$#  $l    @  $       @",   
        "#  @#l k@$$#  $     @  $    <>>@",
        "# @g#l k@$$#  $***  @  $**  mmm@",
        "# @$#l k@$$#        @          @",
        "# @$#[M]@$$#        @        o @",
        "g*h$g***h$$g********h**********h",
        "XXXXXXXXXXXXXXXXXXXXX"
        },
        {
        //level  Mountains: A
        //level 8 (montin Level: A)
      "                <>>>>>>>>>$$$$$$$$$$$$$$$$$$$",
         "                       $$$$$$$$$$>>>>>>>$$    ",
         "                       #$$$$$$$$#       @$   ",
         "                      k#>>>>>>$$#      2@$     ",
         "                   ^   #      @>#   $>>>$$    ",
         "                  ^$   #       m    @$$$$$",
         "                ^*$$   #  @         @$$$$$ ",
         "               ^$$$$l  #  @         @$$$$$ ",   
         "               @$$$$      @>>>>>>>>>>$$$$$",   
         "              ^$$$$$      @$$$$$$$$$$$$$$$  ",   
         "              @$$$$$ M    @$$$$$$$$$$$$$$$  ",
         "***************************$$$$$$$$$$$$$$$ ",
        //1   5    10   15   20   25   30   35   40   45   50   55   60       
        },
      
        {
        //level 9 Caves: A
        "555555555555555555555555555555555555555",
         "uuuuuu55555555555uu9               67 ",
         "uuuu66           6u9                7 ",
         "uuuu9             79  ab!           7 ",
         "uuuu9             79    9FM   o M   7 ",
         "uuuu9  8VV!  8!   79    9Fbbbbbbbc  7 ",
         "uuuu9  7uu9  79   F5bc  9F          7 ",
         "6556   7uu9  79         9           7 ",
         "9     8uuu9  79         9  abbbbbbbb7 ",
         "9     7uuu9  79      8VV9           7 ",
         "9    8uuuu9MM79    oM7FF9          27 ",
         "VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV",
        },
                {
         //level 10 Caves: B
         "555555555555555555555555555555555555555555555555  ",
         "uuuu9                               7        7      ",
         "uuuu9     o       o                 7l       7     ",
         "uuuu9  abbbbbbc  abc  abbbbbbbbbb!  7   ab!  7     ",
         "uuuu9      V                     9  7     9  7       ",
         "uuuu9o     V                     9  7bc   9  7     ",
         "uuuuVbbc         o  M    o       9        9  7  ",
         "V55V           8bbbbbbbbbbMbbc   9    o   9  7         ",
         "9          abbbV    m   m    m   Mbbbbbbbb9  7    ",
         "9    8!                                      7        ",
         "9    79              o                 2     7     ",
         "VVVVVVVVVVVVVVVVVVMVVVVMVVVMVVVVVVVVVVVVVVVVVVVVVV",

        },
       
                {
         //level 11 Castle: B
         "))))))))))))))))))))))))))))))))))))))))))))))))))))))))))",
         "                              B         )))))))))))))))AAAA",
         "                              B         B              BAAA",
         "               k-l    o=C+        deef        o       2BAAA",
         "                m     dAAD                 =CCCCCCCCCCCAAAAA",
         "                       BACCCCC+            BAAAAAAAAAAAAAAAA",   
         "               o       BAAAAAAD            BAAAAAAAAAAAAAAA",
         "          =CCCCCCCCCCCCCAAAAAAD       o  o  BAAAAAAAAAAAAAAA",
         "         =AAAAAAAAAAAAAAAAAAAAD   o=CCCCCCCAAAAAAAAAAAAAAAA",
         "        =AAAAAAAAAAAAAAAAAAAAACMMCCAAAAAAAAAAAAAAAAAAAAAAAA",
         "       =AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA",
         "CCCCCCCAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA ",

         "     "
        },
       
        {
        //level 12 Castle: A
         "C))))))))))))))))))))))))))))))))))))))))))))))))))))",
         "D                                                    ",
         "D                                                    ",
         "D                                                     ",
         "D                                                     ",
         "D               o   r                    or2ro         ",   
         "D          r    -   -                    deeef         ",
         "D      o   -                           r               ",
         "D      -                     r     r   -                ",
         "Aeef                      -  -   - -                  ",
         "D                                                     ",
         "MMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMM ",


         "Y                                " 
        //1   5    10   15   20   25   30   35   40   45   50   55   60       
        }

   };
   
}
   