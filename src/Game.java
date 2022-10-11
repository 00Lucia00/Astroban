import java.util.Scanner;

public class Game {
    Scanner scan = new Scanner(System.in);
    void gameOperator(){
        int nrInput;
        do{
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
                        System.out.println("Astrocat is flying solo today");
                        //sätt in spel funktion här
                    }
                    else if (input.equals("C") || input.equals("c")){
                        System.out.println("Astrocat has a co-pilot");
                        // och här, fast för två spelare
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
                    System.out.println("Welcome, Astrocat! \n" +
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

                    break;
                case 4:
                    System.out.println("..........Astrocat has gone back to base.........");
                    break;
                default:
                    System.out.println("unvalide answer - try again - ");
                    break;
            }
        }while(nrInput != 4);
    }

}