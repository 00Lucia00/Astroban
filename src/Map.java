
//lånad klass från niklas med kart funktioner
import java.util.ArrayList;
public class Map {
characters ca = new characters();

/*
        String[][] map =
                {
                        new String[] { ".", ".", ".", ".", ".", ".", ".", ".", ".", "." },
                        new String[] { ".", ".", ".", ".", ".", ".", ".", ".", ".", "." },
                        new String[] { ".", ".", ".", ".", ".", ".", ".", ".", ".", "." },
                        new String[] { ".", ".", ".", ".", ".", ".", ".", ".", ".", "." },
                        new String[] { ".", ".", ".", ".", ".", ".", ".", ".", ".", "." },
                        new String[] { ".", ".", ".", ".", ".", ".", ".", ".", ".", "." },
                        new String[] { ".", ".", ".", ".", ".", ".", ".", ".", ".", "." },
                        new String[] { ".", ".", ".", ".", ".", ".", ".", ".", ".", "." },
                        new String[] { ".", ".", ".", ".", ".", ".", ".", ".", ".", "." },
                        new String[] { ".", ".", ".", ".", ".", ".", ".", ".", ".", "." }
                };
*/
       String[][] map = {
        new String[]{"｡", "˚", ca.bcube, ca.bcube, ca.bcube, ca.bcube, ca.bcube, "｡"},
        new String[]{ca.bcube, ca.bcube, ca.bcube, " ", " ", " ", ca.bcube, "˚"},
        new String[]{ca.bcube, ca.star, " ", ca.ccir, " ", " ", ca.bcube, "｡"},
        new String[]{ca.bcube, ca.bcube, ca.bcube, " ", ca.gcir, ca.star, ca.bcube, "˚"},
        new String[]{ca.bcube, ca.star, ca.bcube, ca.bcube, ca.wcir, " ", ca.bcube, "｡"},
        new String[]{ca.bcube, " ", ca.bcube, " ", ca.star, " ", ca.bcube, ca.bcube},
        new String[]{ca.bcube, ca.ccir, " ", ca.gcir, ca.wcir, ca.ccir, ca.star, ca.bcube},
        new String[]{ca.bcube, " ", " ", " ", ca.star, " ", " ", ca.bcube},
        new String[]{ca.bcube, ca.bcube, ca.bcube, ca.bcube, ca.bcube, ca.bcube, ca.bcube, ca.bcube}

       };

        String[][] tempMap;

        public Map() {

        }

        // This function places all my moveable objects on my static map,
        // then prints it.
        public void PrintMap(ArrayList<characters> objects)
        {
            tempMap = map.clone();
            for (int i = 0; i < map.length; i++) {

                tempMap[i] = map[i].clone();

            }
            for(characters ca : objects)
            {
                tempMap[ca.getY()][ca.getX()] = ca.getMapMarker();

            }

            PrintMap(tempMap);
        }
       /* public void PrintMap(ArrayList<characters> objects)
        {
            map = karta1().clone();
            for(characters obj : objects)
            {
                map[obj.getY()][obj.getX()] = obj.getMapMarker();
            }

            PrintMap(map);
        }*/
        // This function prints a map that is given to it.
        public void PrintMap(String[][] mapToPrint)
        {
            for (int y = 0; y < mapToPrint.length; y++)
            {
                for (int x = 0; x < mapToPrint[y].length; x++)
                {
                    System.out.print(mapToPrint[y][x] + " ");
                }
                System.out.println();
            }
        }

        // Returns what kind of tile it is via an x and y value. - modified
        public String ReturnTile(int x, int y)
        {
            if (x < 0 || y < 0 || x > 9 || y > 9) // modified so that it will return "" for all sides of the
            {
                return "";
            }
            return map[y][x];
        }

 /*       // Returns what kind of tile it is via an x and y value.
        public String ReturnTile(int x, int y)
        {
            if (x < 0 || y < 0 || x > map[y].length || y > map.length)
            {
                return "";
            }
            return map[y][x];
        }
*/

        String[][] karta1() {
            characters ca = new characters();
            //array map  1
            String[][] a = {
                            new String[]{"｡", "˚", ca.bcube, ca.bcube, ca.bcube, ca.bcube, ca.bcube, "｡"},
                            new String[]{ca.bcube, ca.bcube, ca.bcube, " ", " ", " ", ca.bcube, "˚"},
                            new String[]{ca.bcube, ca.star, " ", ca.ccir, " ", " ", ca.bcube, "｡"},
                            new String[]{ca.bcube, ca.bcube, ca.bcube, " ", ca.gcir, ca.star, ca.bcube, "˚"},
                            new String[]{ca.bcube, ca.star, ca.bcube, ca.bcube, ca.wcir, " ", ca.bcube, "｡"},
                            new String[]{ca.bcube, " ", ca.bcube, " ", ca.star, " ", ca.bcube, ca.bcube},
                            new String[]{ca.bcube, ca.ccir, " ", ca.gcir, ca.wcir, ca.ccir, ca.star, ca.bcube},
                            new String[]{ca.bcube, " ", " ", " ", ca.star, " ", " ", ca.bcube},
                            new String[]{ca.bcube, ca.bcube, ca.bcube, ca.bcube, ca.bcube, ca.bcube, ca.bcube, ca.bcube}

            };
            return a;
        }
       String[][] karta2(){
           characters ca = new characters();
           //array map 2
           String[][] b = {
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
           return b;
       }
    }

