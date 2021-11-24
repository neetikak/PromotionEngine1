package ShoppingApplication;

import java.util.ArrayList;
import java.util.List;

public class Checkout {
	 private static int TotalPrice(List<Item> items)
     {
         int countA = 0;
         int priceA = 50;
         int countB = 0;
         int priceB = 30;
         int CountC = 0;
         int priceC = 20;
         int CountD = 0;
         int priceD = 15;
         for (Item i :items)
         {
             if (i.itemId.equals("A"))
             {
            	 countA=countA + 1;
             }
             if (i.itemId.equals("B"))
             {
            	 countB = countB + 1;
             }
             if (i.itemId == "C")
             {
            	 CountC = CountC + 1;
             }
             if (i.itemId == "D" )
             {
            	 CountD = CountD + 1;
             }
         }
         int totalPriceofA = (countA / 3) * 130 + (countA % 3 * priceA);
         int totalPriceofB = (countB / 2) * 45 + (countB % 2 * priceB);
         int totalPriceofC = (CountC * priceC);
         int totalPriceofD = (CountD * priceD);
         return totalPriceofA + totalPriceofB + totalPriceofC + totalPriceofD;

     }
	 
	 public static void main(String[] args)
	 
	 {
		 List<Item> items = new ArrayList<Item>();
		 for (String val : args)
		 {
			Item i = new Item(val);
			 items.add(i);
		 }
		 System.out.println(TotalPrice(items));
	 }
	
}
