package Activities;

public class activity1 
{
    public static void main(String[] args) 
    {
        car BMW= new car();
        BMW.make=2021;
        BMW.color="Black";
        BMW.transmission="Manual";
        BMW.tyres=4;
        BMW.doors=4;

        BMW.displaycharacteristics();
        BMW.accelerate();
        BMW.brake();


        
    }


}
 class car
{
    String color;
    String transmission;
    int make;
    int tyres;
    int doors;
 
car()
{
    tyres=4;
    doors=4;
}
public void displaycharacteristics()
{
    System.out.println("Color of the car:"+color);
    System.out.println("Make of the Car: " + make);
    System.out.println("Transmission of the Car: " + transmission);
	System.out.println("Number of doors on the car: " + doors);
    System.out.println("Number of tyres on the car: " + tyres);
}

    public void accelerate() 
    {
	System.out.println("Car is moving forward.");
    }
	
    public void brake() 
    {
	System.out.println("Car has stopped.");
    }
}





