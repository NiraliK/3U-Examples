
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
 * @author Kantn4608
 */
public class Example2 {
    private static City kitchener;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating a new city called kitcehener 
        City kitchener = new City ();
        
        // cretaing a robot
        Robot karel = new Robot (kitchener, 3, 2, Direction.SOUTH);
        // wall created
        new Thing(kitchener, 4, 2);
        new Wall(kitchener, 4, 2, Direction.NORTH);
        karel.turnLeft();
        new Wall(kitchener, 3, 2, Direction.EAST);
        karel.turnLeft();
       
       new Wall(kitchener, 3, 2, Direction.NORTH);
       karel.turnLeft();
       karel.move();
       new Wall(kitchener, 3, 1, Direction.NORTH);
       new Wall(kitchener, 3, 1, Direction.WEST);
       karel.turnLeft();
       karel.move();
       new Wall(kitchener, 4, 1, Direction.WEST);
       new Wall (kitchener, 4, 1, Direction.SOUTH);
       karel.turnLeft();
       karel.turnLeft();
       karel.move();
       karel.turnLeft();
       karel.turnLeft();
       karel.turnLeft();
       karel.move();
       karel.turnLeft();
       karel.turnLeft();
       karel.turnLeft();
            
    }
 

