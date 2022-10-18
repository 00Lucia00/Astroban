import java.util.ArrayList;
import java.util.Scanner;

public class GameLogic {
    Map map;
    characters ca = new characters();
    int count = 0;
    ArrayList<characters> objects = new ArrayList<characters>();
    characters player = new characters(2, 2, ca.cat);
    characters enemy = new characters(1, 7, ca.rat);

    public GameLogic() {
        map = new Map();
        objects.add(player);
        objects.add(enemy);

        map.PrintMap(objects);
    }

    // Move the given object one step left.
    public boolean MoveLeft(characters gameObject) {
        // Get what kind of tile we're stepping on.
        String tile = map.ReturnTile(gameObject.getX() - 1, gameObject.getY());

        if (tile.equals("")) {
            System.out.println("That's out of bounds!");
            return false;
        } else if (tile.equals(ca.bcube)) {
            System.out.println("That's a wall!");
            return false;
        } else if (tile.equals(ca.rat)) {
            System.out.println("You died :((");
            return false;
        }
        // Perhaps add code to see if we're walking into another object, too.
        gameObject.setX(gameObject.getX() - 1); // Move the object's x one step left.
        return true;
    }

    boolean MoveUp(characters gameObject) {
        String tile = map.ReturnTile(gameObject.getX(), gameObject.getY() - 1);

        if (tile.equals("")) {
            System.out.println("That's out of bounds!");
            return false;
        } else if (tile.equals(ca.bcube)) {
            System.out.println("That's a wall!");
            return false;
        } else if (tile.equals(ca.rat)) {
            System.out.println("You died :((");
            return false;
        }

        // Perhaps add code to see if we're walking into another object, too.

        gameObject.setY(gameObject.getY() - 1); // Move the object's x one step left.
        return true;
    }

    boolean MoveRight(characters gameObject) {
        String tile = map.ReturnTile(gameObject.getX() + 1, gameObject.getY());

        if (tile.equals("")) {
            System.out.println("That's out of bounds!");
            return false;
        } else if (tile.equals(ca.bcube)) {
            System.out.println("That's a wall!");
            return false;
        } else if (tile.equals(ca.rat)) {
            System.out.println("You died :((");
            return false;
        }

        // Perhaps add code to see if we're walking into another object, too.

        gameObject.setX(gameObject.getX() + 1); // Move the object's x one step right
        return true;
    }

    boolean MoveDown(characters gameObject) {
        String tile = map.ReturnTile(gameObject.getX(), gameObject.getY() + 1);

        if (tile.equals("")) {
            System.out.println("That's out of bounds!");
            return false;
        } else if (tile.equals(ca.bcube)) {
            System.out.println("That's a wall!");
            return false;
        } else if (tile.equals(ca.rat)) {
            System.out.println("You died :((");
            // lägg in reset funktion
            return false;
        }

        // Perhaps add code to see if we're walking into another object, too.

        gameObject.setY(gameObject.getY() + 1); // Move the object's x one step left.
        return true;
    }
    boolean enemyMove(characters gameObject){
        String tile = map.ReturnTile(gameObject.getX() - 1, gameObject.getY());
        gameObject.setX(gameObject.getX() - 1); // Move the object's x one step left.
        if(tile.equals("")){
            for(int i = 0; i < 8; i++) {
                tile = map.ReturnTile(gameObject.getX() + 1, gameObject.getY());
                gameObject.setX(gameObject.getX() + 1);
            }
        }
        return true;
    }
    void PlayerMove(){
        Scanner scan = new Scanner(System.in);
        boolean pressKey = true;
        while (pressKey) {
            System.out.println("Moves made: "+ count +"\nEnter move here: ");
            String input = scan.nextLine();
            if (input.equals("W") || input.equals("w")) {
                count++;
                MoveUp(player);
                enemyMove(enemy);
                map.PrintMap(objects);
            } else if (input.equals("D") || input.equals("d")) {
                count++;
                MoveRight(player);
                enemyMove(enemy);
                map.PrintMap(objects);
            } else if (input.equals("S") || input.equals("s")) {
                MoveDown(player);
                enemyMove(enemy);
                count++;
                map.PrintMap(objects);
            } else if (input.equals("A") || input.equals("a")) {
                count++;
                MoveLeft(player);
                enemyMove(enemy);
                map.PrintMap(objects);
            }
            else if (input.equals("b") || input.equals("B")) {
                pressKey = false;
            }
        }

    }
}


