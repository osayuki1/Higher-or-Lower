import java.util.Random;	 	       	    	     	 	      	 	
import java.util.Scanner;	 	       	    	     	 	      	 	
	 	       	    	     	 	      	 	
public class Main	 	       	    	     	 	      	 	
{	 	       	    	     	 	      	 	
  public static void main(String[] args)	 	       	    	     	 	      	 	
  {	 	       	    	     	 	      	 	
    Random random = new Random();	 	       	    	     	 	      	 	
    Deck deck = new Deck();	 	       	    	     	 	      	 	
	 	       	    	     	 	      	 	
    int randomNumber = random.nextInt(deck.getCards().size() - 1);	 	       	    	     	 	      	 	
    Card startingCard = deck.drawCard(randomNumber);	 	       	    	     	 	      	 	
    System.out.println(startingCard);	 	       	    	     	 	      	 	
	 	       	    	     	 	      	 	
    int score = 0;	 	       	    	     	 	      	 	
	 	       	    	     	 	      	 	
    while (true)	 	       	    	     	 	      	 	
    {	 	       	    	     	 	      	 	
      Scanner input = new Scanner(System.in);	 	       	    	     	 	      	 	
      System.out.println("Choose higher or lower.");	 	       	    	     	 	      	 	
      String text = input.nextLine();	 	       	    	     	 	      	 	
	 	       	    	     	 	      	 	
      randomNumber = random.nextInt(deck.getCards().size() - 1);	 	       	    	     	 	      	 	
      Card newCard = deck.drawCard(randomNumber);	 	       	    	     	 	      	 	
      System.out.println(newCard);	 	       	    	     	 	      	 	
      if ((text.equals("higher") && newCard.getValues() > startingCard.getValues()) || (text.equals("lower") && newCard.getValues() < startingCard.getValues()))	 	       	    	     	 	      	 	
      {	 	       	    	     	 	      	 	
        score++;	 	       	    	     	 	      	 	
        System.out.println("Your score is now: " + score);	 	       	    	     	 	      	 	
        startingCard = newCard;	 	       	    	     	 	      	 	
      }	 	       	    	     	 	      	 	
      else	 	       	    	     	 	      	 	
      {	 	       	    	     	 	      	 	
        System.out.println("Wrong guess. You have lost.");	 	       	    	     	 	      	 	
        break;	 	       	    	     	 	      	 	
      }	 	       	    	     	 	      	 	
    }	 	       	    	     	 	      	 	
    System.out.println("Your total score is " + score);	 	       	    	     	 	      	 	
  }	 	       	    	     	 	      	 	
}