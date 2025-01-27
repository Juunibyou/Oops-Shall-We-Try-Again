package org.example;
import java.util.Scanner;

public class App {
  public int getInput(int min, int max, String P, String E) {
  Scanner scanner = new Scanner(System.in);

    //Loop 
    while(true){
    System.out.println(P);
    int input = scanner.nextInt();

      //Check if valid input
      if(input >= min && input <= max){
        return input;
      }
      else{System.out.println(E);}

    }
  }

  public static void main(String[] args) {
  App app = new App();

  //Programmer edit here
  int lowerbound = 0;
  int upperbound = 100;
  String prompt = "\n\nPlease enter a value bwteen " + lowerbound + " and " + upperbound; 
  String error = "\nInvalid input please try again!";

  int valid_input = app.getInput(lowerbound, upperbound, prompt, error);

  System.out.println("\nThe user input is " + valid_input);
  }
}

