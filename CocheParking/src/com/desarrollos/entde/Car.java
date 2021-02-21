package com.desarrollos.entde;
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
    public static void main(String[] args) throws InterruptedException{
    	Garage g = new Garage();
    	Car car = new Car(g);
        car.accelerate();
        slowDown();
        moveDown();
        accelerate();
        g.printGarage();
//        turnRight();
//        turnHeadlightsOn();
//        turnHeadlightsOff();
    }    

    /**
     * Accelerate the car
     * @throws InterruptedException 
     */
    public static void accelerate() throws InterruptedException{
        String c = new String("*");
        String space = new String(" ");
    	for(int i=0; i<5; i++)
        {
        	System.out.print(c);
        	c = space.concat(c);
        	Thread.sleep(10);
        }
    }
    
    /**
     * Slow down the car
     * @throws InterruptedException 
     */
    public static void slowDown() throws InterruptedException{
    	String c = new String("     *");
    	for(int i=0; i<5; i++)
        {
        	System.out.print(c);
        	c = c.substring(1);
        	Thread.sleep(10);
        }
    	System.out.println();
    }    
    
    /**
     * Move the car downwards
     * @throws InterruptedException 
     */    
    public static void moveDown() throws InterruptedException{
    	String c = new String("\t\t\t\t  *");
    	for(int i=0; i<5; i++)
        {
    		if(i!=4)
    			System.out.println(c);
    		else 
    			System.out.print(c);
        	Thread.sleep(10);
        }
    }
    
}


/*
 * ERRORES
 * Los metodos no estaban static.
 * Los String estaban escrritos mal(system y deberia de ser System).
 * Los separadores de un for estaban mal escritos(, y deberuia de ser ;).
 * Habían utilidades inecesarias, ya que no las usamos, las quitamos.
 * EL  car.printGarage(); está mal escrito, sedeberia de pasar  g.printGarage();
 * */
