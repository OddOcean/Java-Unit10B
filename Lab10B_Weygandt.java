// Aidan Weygandt 10.27.21
// Purpose of Program: 
// Create a deck of cards and output the ordered deck
// ask user if should shuffle, if yes output shuffled version  

import java.util.Scanner;

class Lab10B_Weygandt {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Deck deck = new Deck();//creats deck object
    System.out.println();
    System.out.println(deck);//prints deck contents
    String shuff = enterData(input, "\nWould you like the deck shuffled? (yes, no): ");//takes input from user if they would like to shuffle the deck or not
    if (shuff.equals("YES")){//if user responds yes shuffle the deck
      deck.Shuffle();
      System.out.println();
      System.out.println(deck);
    }else{
      System.out.println("\nThat is my only function so i hope you weren't expecting anything else");
    }
  }

  //get user input and check that it is what we want
  public static String enterData(Scanner console, String prompt){
    System.out.print(prompt);
    String i = console.nextLine().toUpperCase();//sets i to input and capitalizes it
    while(!i.equals("YES") && !i.equals("NO")){//while user did not enter a yes or no keep asking for an input
      System.out.print("Please enter a yes or no: ");
      i = console.nextLine().toUpperCase();
    }
    return i;
  }
}