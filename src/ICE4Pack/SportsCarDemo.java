/**
   This program demonstrates the SportsCar class.
*/
package ICE4Pack;

public class SportsCarDemo
{
   public static void main(String[] args)
   {
      // Create a SportsCar object.
      SportsCar yourNewCar = 
         new SportsCar(CarType.PORSCHE, CarColor.RED, CarTransmission.MANUAL,
                 100000);

      // Display the object's values.
      System.out.println(yourNewCar);
   }
}