import java.util.ArrayList;	 	       	    	     	 	      	 	
	 	       	    	     	 	      	 	
public class Deck	 	       	    	     	 	      	 	
{	 	       	    	     	 	      	 	
  private String[] suits = {"clubs", "spades", "hearts", "diamonds"};	 	       	    	     	 	      	 	
  private String[] values = {"ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king"};	 	       	    	     	 	      	 	
  private ArrayList<Card> cards = new ArrayList();	 	       	    	     	 	      	 	
	 	       	    	     	 	      	 	
  public Deck()	 	       	    	     	 	      	 	
  {	 	       	    	     	 	      	 	
    for(String suit: suits)	 	       	    	     	 	      	 	
    {	 	       	    	     	 	      	 	
      for(String value : values)	 	       	    	     	 	      	 	
      {	 	       	    	     	 	      	 	
        Card card = new Card(suit, value);	 	       	    	     	 	      	 	
        cards.add(card);	 	       	    	     	 	      	 	
      }	 	       	    	     	 	      	 	
    }	 	       	    	     	 	      	 	
  }	 	       	    	     	 	      	 	
  public void setCard(ArrayList<Card> cards)	 	       	    	     	 	      	 	
  {	 	       	    	     	 	      	 	
     this.cards = cards;	 	       	    	     	 	      	 	
  }	 	       	    	     	 	      	 	
	 	       	    	     	 	      	 	
  public ArrayList<Card> getCards()	 	       	    	     	 	      	 	
  {	 	       	    	     	 	      	 	
     return this.cards;	 	       	    	     	 	      	 	
  }	 	       	    	     	 	      	 	
	 	       	    	     	 	      	 	
  public Card drawCard(int chosen)	 	       	    	     	 	      	 	
  {	 	       	    	     	 	      	 	
    Card currentCard = cards.get(chosen);	 	       	    	     	 	      	 	
    cards.remove(chosen);	 	       	    	     	 	      	 	
    return currentCard;	 	       	    	     	 	      	 	
  }	 	       	    	     	 	      	 	
	 	       	    	     	 	      	 	
}