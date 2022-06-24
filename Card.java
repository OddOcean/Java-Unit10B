// Aidan Weygandt 10.27.21
// Purpose of Program: 
// Create a deck of cards and output the ordered deck
// ask user if should shuffle, if yes output shuffled version  

public class Card
{
  private String suit;
  private String rank;
  private int value;

  public Card(String s, String r, int v){
    suit = s;
    rank = r;
    value = v;
  }

  public String getSuit()       { return suit; }
  public String getRank()       { return rank; }
  public int getValue()         { return value; }

  public void setSuit(String s) { suit = s; }
  public void setRank(String r) { rank = r; }
  public void setValue(int v)   { value = v; } 
   
  public String toString(){
    return "[" + suit + ", " + rank + ", " + value + "]";
  }
   
  public boolean matches(Card otherCard){
    return otherCard.getSuit().equals(this.suit)
        && otherCard.getRank().equals(this.rank)
        && otherCard.getValue() == this.value;
	}
}