package ICE3Pack;

/**
   This program demonstrates the Stock class's
   toString method.
*/

public class StockDemoDetail
{
   public static void main(String[] args)
   {
      // Create a Stock object for the XYZ Company.
      // The trading symbol is XYZ and the current
      // price per share is $9.62.
      StockDetail xyzCompany = new StockDetail ("XYZ", 9.62,
              "07-25-2024");
      
      // Display the object's values.
      System.out.println(xyzCompany);
   }
}