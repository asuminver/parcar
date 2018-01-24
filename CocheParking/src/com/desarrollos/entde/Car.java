package com.desarrollos.entde;

//import java.util.Arrays;no se usa
//import java.awt.Color; no se usa
/**
 * Class that models objects of type "car"
 * 
 * @Java MOOC team, UC3M
 * @2.0
 */

public class Car
{
    // Attributes of the class Car
    static int numberWheels = 4;                // Number of wheels                           
    
    Garage theGarage=null;

    
    /**
     * Constructor of a car specifying the garage object
     */
    public Car (Garage g){
    	theGarage = g;
    }
    /**
     * Method that is being always invoked when the program is running
     * @throws InterruptedException 
     */
    public static void main(String[] args) throws InterruptedException{//string
    	Garage g = new Garage();
   // 	Car car = new Car(g); Esta linea ya no se usa
        accelerate();
        slowDown();
        moveDown();
        accelerate();
        g.printGarage();//car -> g
//        turnRight();
//        turnHeadlightsOn();
//        turnHeadlightsOff();
    }    

    /**
     * Accelerate the car
     * @throws InterruptedException 
     */
    public static void accelerate() throws InterruptedException{//añadir static
        String c = new String("*");//string c = new string("*");
        String space = new String(" ");//string space = new string(" ");
        for(int i=0; i<5; i++)//for(int i=0, i<5; i++)
        {
        	System.out.print(c);
        	c = space.concat(c);
        	Thread.sleep(1000);
        }
    }
    
    /**
     * Slow down the car
     * @throws InterruptedException 
     */
    public static void slowDown() throws InterruptedException{//añadir static
    	String c = new String("     *");//S
    	for(int i=0; i<5; i++)
        {
        	System.out.print(c);
        	c = c.substring(1);
        	Thread.sleep(1000);
        }
    	System.out.println();
    }    
    
    /**
     * Move the car downwards
     * @throws InterruptedException 
     */    
    public static void moveDown() throws InterruptedException{//añadir static
    	String c = new String("\t\t\t\t  *");//Añadir S y quitar ) del final
    	for(int i=0; i<5; i++)//sustituir , por ; en for
        {
    		if(i!=4)
    			System.out.println(c);
    		else 
    			System.out.print(c);
        	Thread.sleep(1000);
        }
    }
    
}
