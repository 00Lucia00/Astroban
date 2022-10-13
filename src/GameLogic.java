import java.util.ArrayList;

public class GameLogic {
        Map map;
        characters ca = new characters();
        ArrayList<characters> objects = new ArrayList<characters>();
        public GameLogic()
        {
            map = new Map();
            objects.add(new characters(2, 2, ca.cat));
            objects.add(new characters(1,7, ca.rat));

            map.PrintMap(objects);
        }

        // Move the given object one step left.
        public boolean MoveLeft(characters gameObject)
        {
            // Get what kind of tile we're stepping on.
            String tile = map.ReturnTile(gameObject.getX() - 1, gameObject.getY());

            if (tile.equals(""))
            {
                System.out.println("That's out of bounds!");
                return false;
            }
            else if (tile.equals("▄"))
            {
                System.out.println("That's a wall!");
                return false;
            }

            // Perhaps add code to see if we're walking into another object, too.

            gameObject.setX(gameObject.getX()-1); // Move the object's x one step left.
            return true;
        }
    }


