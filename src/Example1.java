
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
public class Example1 {
    private static City kitchener;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating a new city called kitcehener 
        City kitchener = new City ();
        
        // cretaing a robot
        Robot karel = new Robot (kitchener, 3, 2, Direction.EAST);
        karel.move();
        karel.turnLeft();
        // Creating wall
        new Thing(kitchener, 3, 3);
        new Wall(kitchener, 3, 3, Direction.EAST);
        karel.move();
        new Wall(kitchener, 2, 3, Direction.EAST); 
        new Wall(kitchener, 2, 3, Direction.NORTH);
        karel.turnLeft();
        karel.move();
        new Wall(kitchener, 2, 2, Direction.NORTH);
        new Wall(kitchener, 2, 2, Direction.WEST);
        karel.turnLeft();
        karel.move();
        new Wall(kitchener, 3, 2, Direction.WEST);
        new Wall(kitchener, 3, 2, Direction.SOUTH);
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move(); 
        new Wall(kitchener, 3, 3, Direction.SOUTH);
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        
    }
            
        }
       
             

