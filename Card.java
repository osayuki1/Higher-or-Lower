public class Card	 	       	    	     	 	      	 	
{	 	       	    	     	 	      	 	
	 	       	    	     	 	      	 	
  private String suit;	 	       	    	     	 	      	 	
  private String value;	 	       	    	     	 	      	 	
	 	       	    	     	 	      	 	
  public Card(String s, String v)	 	       	    	     	 	      	 	
  {	 	       	    	     	 	      	 	
    this.suit = s;	 	       	    	     	 	      	 	
    this.value = v;	 	       	    	     	 	      	 	
  }	 	       	    	     	 	      	 	
	 	       	    	     	 	      	 	
    public void setSuits(String suit)	 	       	    	     	 	      	 	
  {	 	       	    	     	 	      	 	
     this.suit = suit;	 	       	    	     	 	      	 	
  }	 	       	    	     	 	      	 	
	 	       	    	     	 	      	 	
  public String getSuits()	 	       	    	     	 	      	 	
  {	 	       	    	     	 	      	 	
     return this.suit;	 	       	    	     	 	      	 	
  }	 	       	    	     	 	      	 	
	 	       	    	     	 	      	 	
   public void setValues(String value)	 	       	    	     	 	      	 	
  {	 	       	    	     	 	      	 	
     this.value = value;	 	       	    	     	 	      	 	
  }	 	       	    	     	 	      	 	
	 	       	    	     	 	      	 	
  public int getValues()	 	       	    	     	 	      	 	
  {	 	       	    	     	 	      	 	
    if(!value.equals("ace") && !value.equals("jack") && !value.equals("queen") && !value.equals("king"))	 	       	    	     	 	      	 	
    {	 	       	    	     	 	      	 	
      return Integer.parseInt(this.value);	 	       	    	     	 	      	 	
    }	 	       	    	     	 	      	 	
    else if(value.equals("king") || value.equals("queen") || value.equals("jack"))	 	       	    	     	 	      	 	
    {	 	       	    	     	 	      	 	
      return 10;	 	       	    	     	 	      	 	
    }	 	       	    	     	 	      	 	
    return 1;	 	       	    	     	 	      	 	
  }	 	       	    	     	 	      	 	
	 	       	    	     	 	      	 	
  @Override	 	       	    	     	 	      	 	
  public String toString()	 	       	    	     	 	      	 	
  {	 	       	    	     	 	      	 	
    return this.getSuits() + " - " + this.getValues();	 	       	    	     	 	      	 	
  }	 	       	    	     	 	      	 	
}