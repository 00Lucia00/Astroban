
//lånad klass från niklas med kart funktioner
import java.util.ArrayList;
    public class Map {

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

        String[][] tempMap;

        public Map()
        {

        }

        // This function places all my moveable objects on my static map,
        // then prints it.
        public void PrintMap(ArrayList<GameObject> objects)
        {
            tempMap = map.clone();
            for(GameObject obj : objects)
            {
                tempMap[obj.getX()][obj.getY()] = obj.getMapMarker();
            }

            PrintMap(tempMap);
        }

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

        // Returns what kind of tile it is via an x and y value.
        public String ReturnTile(int x, int y)
        {
            if (x < 0 || y < 0 || x > map[y].length || y > map.length)
            {
                return "";
            }
            return map[y][x];
        }

        String[][] karta1() {
            characters ca = new characters();
            //array map  1
            String[][] a = {
                            new String[]{"｡", "˚", ca.bcube, ca.bcube, ca.bcube, ca.bcube, ca.bcube, "｡"},
                            new String[]{ca.bcube, ca.bcube, ca.bcube, " ", " ", " ", ca.bcube, "˚"},
                            new String[]{ca.bcube, ca.star, ca.cat, ca.ccir, " ", " ", ca.bcube, "｡"},
                            new String[]{ca.bcube, ca.bcube, ca.bcube, " ", ca.gcir, ca.star, ca.bcube, "˚"},
                            new String[]{ca.bcube, ca.star, ca.bcube, ca.bcube, ca.wcir, " ", ca.bcube, "｡"},
                            new String[]{ca.bcube, " ", ca.bcube, " ", ca.star, " ", ca.bcube, ca.bcube},
                            new String[]{ca.bcube, ca.ccir, " ", ca.gcir, ca.wcir, ca.ccir, ca.star, ca.bcube},
                            new String[]{ca.bcube, ca.rat, " ", " ", ca.star, " ", " ", ca.bcube},
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

