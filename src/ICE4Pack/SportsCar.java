/**
   SportsCar class
*/
package ICE4Pack;
public class SportsCar
{
   private CarType make;    // The car's make
   private CarColor color;  // The car's color
   private double price;    // The car's price
   private CarTransmission transmission;
   
   /**
      The constructor initializes the car's make, 
      color, and price.
      @param aMake The car's make.
      @param aColor The car's color.
      @param aPrice The car's price.
   */
   
   public SportsCar(CarType aMake, CarColor aColor,
                    CarTransmission aTransmission, double aPrice)
   {
      make = aMake;
      color = aColor;
      price = aPrice;
      transmission = aTransmission;
   }

   /**
      getMake method
      @return The car's make.
   */
   
   public CarType getMake()
   {
      return make;
   }

   /**
      getColor method
      @return The car's color.
   */
   
   public CarColor getColor()
   {
      return color;
   }
   
   /**
      getPrice method
      @return The car's price.
   */
   
   public double getPrice()
   {
      return price;
   }
   
   /**
      toString method
      @return A string indicating the car's make,
              color, and price.
   */
   
   public String toString()
   {
      // Create a string representing the object.
      String str = String.format("Make: %s\nColor: %s\nTransmission: " +
                      "%s\nPrice: $%,.2f",
                                 make, color, transmission, price);
      
      // Return the string.
      return str;
   }
}
