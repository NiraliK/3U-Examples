
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
public class Example5 {
private static City kitchener;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating a new city called kitcehener 
        City kitchener = new City ();
        
        // cretaing a robot and labels created
        Robot karel = new Robot (kitchener, 3, 3, Direction.EAST); 
        karel.setLabel("K");
       
        Robot maria = new Robot (kitchener, 0, 1, Direction.WEST);
        maria.setLabel("M");
       //wall created
        new Wall(kitchener, 3, 3, Direction.EAST);
        new Wall(kitchener, 3, 3, Direction.SOUTH);
        new Wall(kitchener, 2, 3, Direction.EAST);
        new Wall(kitchener, 2, 3, Direction.NORTH);
        new Wall(kitchener, 2, 3, Direction.WEST);
        new Thing(kitchener, 2, 2);
        new Thing(kitchener, 1, 2);
        new Thing(kitchener, 1, 1);
        new Thing(kitchener, 1, 0);
        new Thing(kitchener, 0, 0);
        
        //robot:maria move
        maria.move();
        maria.pickThing();
        maria.turnLeft();
        maria.move();
        maria.pickThing();
        maria.turnLeft();
        maria.move();
        maria.pickThing();
        
        //robot:karel move
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.pickThing();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
    }
 