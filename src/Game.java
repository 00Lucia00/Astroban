import java.util.Scanner;

public class Game {
    Scanner scan = new Scanner(System.in);
    void gameOperator(){
        int nrInput;
        do{
            System.out.println("..Welcome to Astroban..");
            System.out.println(".....maka a choice.....");
            System.out.println("1.Play.................");
            System.out.println("2.High-Score...........");
            System.out.println("3.Rules................");
            System.out.println("4.Quit.................");

            nrInput = scan.nextInt();
        }while(nrInput != 4);
    }

}
