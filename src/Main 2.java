
//main klass där allt händer :)
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //color
        characters ca = new characters();
        ca.rat = color.ANSI_RED + "ᕐᐷ" + color.ANSI_RESET;
        ca.cat = color.ANSI_PURPLE + "ᗢ" + color.ANSI_RESET;
        ca.blcube = color.ANSI_BLACK + "▄" + color.ANSI_RESET;
        ca.bcube = color.ANSI_BLUE + "▄" + color.ANSI_RESET;
        ca.ccir = color.ANSI_CYAN + "●" + color.ANSI_RESET;
        ca.gcir = color.ANSI_GREEN + "●" + color.ANSI_RESET;
        ca.wcir = color.ANSI_WHITE + "●" + color.ANSI_RESET;
        ca.ccube = color.ANSI_CYAN + "●" + color.ANSI_RESET;
        ca.pcube = color.ANSI_PURPLE + "▄" + color.ANSI_RESET;
        ca.wcube = color.ANSI_WHITE + "▄" + color.ANSI_RESET;
        ca.rcube = color.ANSI_RED + "●" + color.ANSI_RESET;
        ca.star = color.ANSI_YELLOW + "★" + color.ANSI_RESET;
        ca.heart = color.ANSI_RED + "♥"  + color.ANSI_RESET;

        //array map  1
        String[][] a =
                {
                        new String[] { "｡", "˚", ca.bcube, ca.bcube, ca.bcube, ca.bcube, ca.bcube, "｡" },
                        new String[] { ca.bcube, ca.bcube, ca.bcube, " ", " ", " ", ca.bcube, "˚" },
                        new String[] { ca.bcube, ca.star, ca.cat, ca.ccir, " ", " ", ca.bcube, "｡" },
                        new String[] { ca.bcube, ca.bcube, ca.bcube, " ", ca.gcir, ca.star, ca.bcube, "˚" },
                        new String[] { ca.bcube, ca.star, ca.bcube, ca.bcube, ca.wcir, " ", ca.bcube, "｡" },
                        new String[] { ca.bcube, " ", ca.bcube, " ", ca.star, " ", ca.bcube, ca.bcube },
                        new String[] { ca.bcube, ca.ccir, " ", ca.gcir, ca.wcir, ca.ccir, ca.star, ca.bcube },
                        new String[] { ca.bcube, ca.rat, " ", " ", ca.star, " ", " ", ca.bcube },
                        new String[] { ca.bcube, ca.bcube, ca.bcube, ca.bcube, ca.bcube, ca.bcube, ca.bcube, ca.bcube }



                };

        //array map 2
        String[][] b =
                {
                        new String[] { "｡", "˚", "｡", "˚", ca.bcube, ca.bcube, ca.bcube, ca.bcube, ca.bcube, "｡", "˚", "｡", "˚", "｡", "˚", "｡", "˚", "｡", "˚", "｡", "˚", "｡" },
                        new String[] { "｡", "˚", "｡", "˚", ca.bcube, " ", " ", " ", ca.bcube, "｡", "˚", "｡", "˚", "｡", "˚", "｡", "˚", "｡", "˚", "｡", "˚", "｡" },
                        new String[] { "｡", "˚", "｡", "˚", ca.bcube, ca.gcir, " ", " ", ca.bcube, "｡", "˚", "｡", "˚", "｡", "˚", "｡", "˚", "｡", "˚", "｡", "˚", "｡" },
                        new String[] { "｡", "˚", ca.bcube, ca.bcube, ca.bcube, " ", " ", ca.ccir, ca.bcube, ca.bcube, ca.bcube, "｡", "˚", "｡", "˚", "｡", "˚", "｡", "˚", "｡", "˚", "｡" },
                        new String[] { "｡", "˚", ca.bcube, " ", " ", ca.wcir, " ", " ", ca.gcir, " ", ca.bcube, "｡", "˚", "｡", "˚", "｡", "˚", "｡", "˚", "｡", "˚", "｡" },
                        new String[] { ca.bcube, ca.bcube, ca.bcube, " ", ca.bcube, " ", ca.bcube, ca.bcube, ca.bcube, " ", ca.bcube, "｡", "˚", "｡", "˚", "｡", ca.bcube, ca.bcube, ca.bcube, ca.bcube, ca.bcube, ca.bcube },
                        new String[] { ca.bcube, " ", " ", " ", ca.bcube, " ", ca.bcube, ca.bcube, ca.bcube, " ", ca.bcube, ca.bcube, ca.bcube, ca.bcube, ca.bcube, ca.bcube, ca.bcube, " ", " ", ca.star, ca.star, ca.bcube },
                        new String[] { ca.bcube, " ", ca.ccir, " ", " ", ca.wcir, " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", ca.star, ca.star, ca.bcube },
                        new String[] { ca.bcube, ca.bcube, ca.bcube, ca.bcube, ca.bcube, " ", ca.bcube, ca.bcube, ca.bcube, ca.bcube, " ", ca.bcube, ca.cat, ca.bcube, ca.bcube, ca.bcube, ca.bcube, " ", " ", ca.star, ca.star, ca.bcube },
                        new String[] { "｡", "˚", "｡", "˚", ca.bcube, " ", " ", ca.rat, " ", " ", " ", ca.bcube, ca.bcube, ca.bcube, "｡", "˚", ca.bcube, ca.bcube, ca.bcube, ca.bcube, ca.bcube, ca.bcube },
                        new String[] { "｡", "˚", "｡", "˚", ca.bcube, " ", " ", " ", " ", " ", " ", ca.bcube,"｡", "˚", "｡", "˚", "｡", "˚", "｡", "˚", "｡", "˚" },
                        new String[] { "｡", "˚", "｡", "˚", ca.bcube, ca.bcube, ca.bcube, ca.bcube, ca.bcube, ca.bcube, ca.bcube, ca.bcube, "｡", "˚", "｡", "˚", "｡", "˚", "｡", "˚", "｡", "˚" },
                };

        //print
        List<String> lives = Arrays.asList(ca.heart, ca.heart, ca.heart, ca.heart, ca.heart, ca.heart, ca.heart, ca.heart, ca.heart);
        Map map = new Map();  map.PrintMap(b);
        System.out.println("LIVES LEFT:");
        System.out.println(lives);


    }

}