
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kantn4608
 */
public class Example4 {
   private static City kitchener;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating a new city called kitcehener 
        City kitchener = new City ();
        
        // cretaing a robot
       
       Robot karel = new Robot (kitchener, 0, 0, Direction.SOUTH);
        Robot jake = new Robot (kitchener, 0, 1, Direction.SOUTH);
       new Wall(kitchener, 0, 0, Direction.EAST);
       new Wall(kitchener, 1, 0, Direction.EAST);
       new Wall (kitchener, 1, 1, Direction.SOUTH); 
      karel.move(); jake.move();
      karel.move(); 
      jake.turnLeft();
      jake.move();
      karel.turnLeft();
      jake.turnLeft();
      jake.turnLeft();
     jake.turnLeft();
     jake.move();
     karel.move();
     jake.turnLeft();
      jake.turnLeft();
     jake.turnLeft();   
      jake.move();  
        
        
}

    
  