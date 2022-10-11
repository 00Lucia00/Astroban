import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Game {
    Scanner scan = new Scanner(System.in);
    characters ca = new characters();

    void gameOperator(){
        int nrInput;
        do{
            System.out.println();
            System.out.println("....Welcome to Astroban....");
            System.out.println(".......maka a choice.......");
            System.out.println("1.Play.....................");
            System.out.println("2.High-Score...............");
            System.out.println("3.Rules....................");
            System.out.println("4.Quit.....................");

            nrInput = scan.nextInt();
            scan.nextLine(); // stoppar programmet från att hoppa vidare, måste skrivas direkt efter (nextInt)

            switch (nrInput){
                case 1:
                    System.out.println("Incoming transmission on CATCOM…");//gör funktion av detta
                    System.out.println("Astrocat do you copy?...Astrocat, are you flying solo or do you have a co-pilot");
                    System.out.println("press [S] for solo or [C] for co-pilot");
                    String input = scan.nextLine();
                    if(input.equals("S") || input.equals("s")){
                        System.out.println("Astrocat is flying solo today\n");
                        //sätt in spel funktion här
                    }
                    else if (input.equals("C") || input.equals("c")){
                        System.out.println("Astrocat has a co-pilot\n");
                        // och här, fast för två spelare
                    }
                    System.out.println("what level do you want to play\n" +
                            "Level [1] " + "Level [2]");
                    input = scan.nextLine();
                    if (input.equals("1")){
                        boolean goBack = true;
                        while(goBack) {
                            //print
                            List<String> lives = Arrays.asList(ca.heart, ca.heart, ca.heart, ca.heart, ca.heart, ca.heart, ca.heart, ca.heart, ca.heart);
                            Map map = new Map();
                            map.PrintMap(map.karta1());
                            System.out.println("LIVES LEFT:");
                            System.out.println(lives);
                            System.out.println("Enter move here: ");
                            input = scan.nextLine();
                            if (input.equals("b") || input.equals("B")) {
                                goBack = false;
                            }
                        }
                    }
                    if(input.equals("2")){
                        boolean goBack = true;
                        while(goBack) {
                            //print
                            List<String> lives = Arrays.asList(ca.heart, ca.heart, ca.heart, ca.heart, ca.heart, ca.heart, ca.heart, ca.heart, ca.heart);
                            Map map = new Map();
                            map.PrintMap(map.karta2());
                            System.out.println("LIVES LEFT:");
                            System.out.println(lives);
                            System.out.println("Enter move here: ");
                            input = scan.nextLine();
                            if (input.equals("b") || input.equals("B")) {
                                goBack = false;
                            }
                        }
                    }
                    break;
                case 2:
                    boolean goBack = true;
                    while(goBack) {
                        System.out.println("........High-Score......."); // gör en funktion som skriver ut och sparar info
                        System.out.println("..........Top 5..........");
                        System.out.println("1.Ligia..................");
                        System.out.println("2.Jennie.................");
                        System.out.println("3.Sanne..................");
                        System.out.println("4.Helia..................");
                        System.out.println("5.Lucia..................");
                        System.out.println("press R to return to menu");
                        String input2 = scan.nextLine();
                        if (input2.equals("R") || input2.equals("r")) {
                            goBack = false;
                        }
                    }
                    break;
                case 3:
                    System.out.println("..................................Rules.........................................");
                    System.out.println("Welcome, Astrocat!\n" +
                            "Your mission is to prevent the villain Darth Mouse from taking a bite of the moon.\n" +
                            "You need to push satellites around the moon, trying to get them to the right position.\n" +
                            "The satellites need to get into position too form a shield to protect the moon.\n" +
                            "The mission is played in a contained part of the galaxy which is marked by walls\n" +
                            "where the following rules apply:\n" +
                            "•\tYou can only move left, right, up and down, not diagonally\n" +
                            "•\tYou can only move the satellites by pushing them in front of you. Not by pulling them.\n" +
                            "•\tSatellites can only move in straight lines, up or down.\n" +
                            "•\tYou can only move a  at a time.\n" +
                            "•\tYou cannot push the planets trough walls or other planets.\n" +
                            "•\tYou cannot move through a wall.\n" +
                            "•\tThe level is solved when all satellites are placed at the right spot.\n    It does not matter what satellite is placede at the marked location\n");
                    System.out.println(ca.cat + " = Player");
                    System.out.println(ca.rat + " = Enemy");
                    System.out.println(ca.bcube + " = wall");
                    System.out.println(ca.ccir + " = satellite " );
                    System.out.println(ca.star + " = correct position marker" );
                    System.out.println(color.ANSI_GREEN + "w" + color.ANSI_RESET + " = up \n" +
                            color.ANSI_GREEN + "s" + color.ANSI_RESET + " = down\n" +
                            color.ANSI_GREEN + "d" + color.ANSI_RESET + " = right\n" +
                            color.ANSI_GREEN + "a" + color.ANSI_RESET + " = left" );

                    break;
                case 4:
                    System.out.println(".......Astrocat has gone back to base.......");
                    break;
                default:
                    System.out.println("invalid answer - try again - ");
                    break;
            }
        }while(nrInput != 4);

    }

}
