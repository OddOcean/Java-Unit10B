// Aidan Weygandt 10.27.21
// Purpose of Program: 
// Create a deck of cards and output the ordered deck
// ask user if should shuffle, if yes output shuffled version  
import java.util.*;

class Deck {
  private ArrayList<Card> cards = new ArrayList<Card>();
  private int size;
  private String [] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
  private String [] ranks = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
  private int [] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
  //create other necessary class variables
  public int rand(int num){//returns random number from 0-num
    int rand = (int)(Math.random()*num);
    return rand;
  }
  //default constructor that will create all 52 playing cards in a card array
  public Deck(){
    //build the deck of cards by creating 52 cards with the approriate suits, values, and ranks
    for (int s = 0; s < suits.length; s++){//adds all cards of same suit before moving on to next suit
      for (int r = 0; r < ranks.length; r++){
        cards.add(new Card(suits[s], ranks[r], values[r]));//adds card to array
      }
    }
  }   

  //create an overide of the toString method to printout the entire deck
  public String toString(){
    String deck = "";
    for (int i = 0; i < cards.size() - 1; i++){//adds whole deck to a string to be printed
      deck += cards.get(i) + ", ";
    }
    deck += cards.get(cards.size() - 1);
    return deck;
  }
  //create a public shuffle method that can be called from the main method
  //shuffle will randomly swap two cards in the deck 1000 times
  public void Shuffle(){
    int iter = 0;
    while (iter < 1000){//makes sure each random card is different
      int rand1 = rand(52);
      int rand2 = rand(52);
      Card temp;//variable for holding value to swap cards
      while (rand2 == rand1){
        rand2 = rand(52);
      }
      temp = cards.get(rand1);
      cards.set(rand1, cards.get(rand2));
      cards.set(rand2, temp);
      iter++;
    } 
  }

}