/**
   The CellPhone class holds data about a cell phone.
*/
package ICE2Pack;
public class CellPhone
{
   // Fields
   private String manufact;    // Manufacturer
   private String model;       // Model
   private double retailPrice; // Retail price
   private String color;       // Color of the phone
   private int size;           // Number of diagonal inches of screen
   
   /**
    * Constructor
    *
    * @param man   The phone's manufacturer.
    * @param mod   The phone's model number.
    * @param price The phone's retail price.
    * @param phoneColor The phone's color.
    * @param screenSize The phone's screen size
    */
   
   public CellPhone(String man, String mod, double price, String phoneColor,
                    int screenSize)
   {
      manufact = man;
      model = mod;
      retailPrice = price;
      color = phoneColor;
      size = screenSize;
   }
   
   /**
      The setManufact method sets the phone's
      manufacturer name.
      @param man The phone's manufacturer.
   */
   
   public void setManufact(String man)
   {
      manufact = man;
   }

   /**
      The setModel method sets the phone's
      model number.
      @param mod The phone's model number.
   */
   
   public void setMod(String mod)
   {
      model = mod;
   }
   
   /**
      The setRetailPrice method sets the phone's
      retail price.
      @param price The phone's retail price.
   */
   
   public void setRetailPrice(double price)
   {
      retailPrice = price;
   }

   /**
    * The setColor method sets the phone's
    * color.
    * @param phoneColor The color of the phone.
    */

   public void setColor(String phoneColor) {color = phoneColor;}

   /**
    * The setSize method sets the phone's screen
    * size in inches (rounded).
    * @param screenSize The size of the screen.
    */

   public void setSize(int screenSize) {size = screenSize; }

   /**
    getManufact method
    @return The name of the phone's manufacturer.
    */

   public String getManufact()
   {
      return manufact;
   }
   
   /**
      getModel method
      @return The phone's model number.
   */
   
   public String getModel()
   {
      return model;
   }
   
   /**
      getretailPrice method
      @return The phone's retail price.
   */
   
   public double getRetailPrice()
   {
      return retailPrice;
   }

   /**
    * getColor method
    * @return The phone's color.
    */
   public String getColor() { return color; }

   /**
    * getSize method
    * @return The phone's screen size.
    */

   public int getSize() { return size; }
}