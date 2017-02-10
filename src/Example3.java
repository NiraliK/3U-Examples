
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kantn4608
 */
public class Example3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating a new city called kitcehener 
        City kitchener = new City ();
        
        // cretaing a robot
        Robot karel = new Robot (kitchener, 3, 0, Direction.EAST);
        new Thing(kitchener, 3, 1);
        new Wall(kitchener, 3, 1, Direction.EAST);
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        new Wall(kitchener, 2, 2, Direction.SOUTH);
        new Wall(kitchener, 2, 2, Direction.EAST);
        karel.turnLeft();
        karel.move();
        new Wall(kitchener, 1, 2, Direction.EAST);
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        new Wall(kitchener, 0, 3, Direction.SOUTH);
        new Thing(kitchener, 0, 3);
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        new Wall(kitchener, 1, 3, Direction.EAST);
        karel.move();
        new Wall(kitchener, 2, 3, Direction.EAST);
        
    }
}
