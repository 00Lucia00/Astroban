import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Game {
    Scanner scan = new Scanner(System.in);
    characters ca = new characters();
    randome r = new randome();

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
                    System.out.println("Incoming transmission on CATCOM…");
                    System.out.println("Astrocat do you copy?...");
                    //r.coPilot(); - inte funktionabel än så länge
                    r.levelSelect();
                    break;
                case 2:
                    r.highScore();
                    break;
                case 3:
                    r.rules();
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
