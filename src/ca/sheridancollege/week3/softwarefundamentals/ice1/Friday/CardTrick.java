
package ca.sheridancollege.week3.softwarefundamentals.ice1.Friday;

/**
 *
 * @author Name:Ningxin Gu Student Number:991624189
 */
public class CardTrick {
    public static void main(String[] args)
    {
       
      Card cardA = new Card();
      cardA.setSuit("Clubs");
      cardA.setValue(5);
      System.out.println("The new card suit is :"+cardA.getSuit()+"\n The new card value is :"+cardA.getValue());
     
      Card cardB = new Card();
      cardB.setSuit("Dimonds");
      cardB.setValue(8);
      System.out.println("The new card suit is :"+cardB.getSuit()+"\n The new card value is :"+cardB.getValue());
    }
    
    
}
