/**
   The Stock class holds data about a stock.
*/

package ICE3Pack;
public class StockDetail
{
   private String symbol;     // Trading symbol of stock
   private double sharePrice; // Current price per share
   private String dividendDate;

   /**
      Constructor
      @param sym The stock's trading symbol.
      @param price The stock's share price.
   */

   public StockDetail(String sym, double price, String divDate)
   {
      symbol = sym;
      sharePrice = price;
      dividendDate = divDate;
   }
   
   /**
      getSymbol method
      @return The stock's trading sysmbol.
   */
   
   public String getSymbol()
   {
      return symbol;
   }
   
   /**
      getSharePrice method
      @return The stock's share price
   */
   
   public double getSharePrice()
   {
      return sharePrice;
   }

   /**
      toString method
      @return A string indicating the object's
              trading symbol and share price.
   */
   
   public String toString()
   {
      // Create a string describing the stock.
      String str = "Trading symbol: " + symbol +
                   "\nShare price: " + sharePrice +
                   "\nDividend date: " + dividendDate;
      
      // Return the string.
      return str;
   }
}
