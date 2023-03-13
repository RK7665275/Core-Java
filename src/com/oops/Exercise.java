package com.oops;
////
//import java.util.Random;
//import java.util.Scanner;
////
//////class Game{
//////	
//////	int number;
//////	
//////	public int getNumber() {
//////		return number;
//////	}
//////	public void setNumber(int number) {
//////		this.number = number;
//////	}
//////	public int takeUserInput() {
//////		return number;
//////	}
//////	public int isCOrrectNumber() {
//////		return number;
//////	}
//////}
//////public class Exercise {
//////	
//////	public static void main(String[] args) {
////	
////		class game{
////			public int a,b,c=0;
////			
////			public int play() {
////				Random random= new Random();
////				a= random.nextInt(0,100);
////				return a;
////			}
////			public void getuserinput() {
////				do {
////				Scanner sc= new Scanner(System.in);
////				System.out.println("Guess the nubmer: ");
////				b = sc.nextInt();
////				if (a>b) {
////					System.out.println("Think for a biger number");
////				}
////				else if (a<b) {
////					System.out.println("Think for a smaller number");
////				}
////				c++;
////				}while (a!=b);
////				
////			}
////			public void iscorrectnumber() {
////				System.out.println("Correct Guess");
////				}
////			
////			public void numbofguess(){
////				System.out.println("total number of guesses: " +c);
////				if (c<=3) {
////					System.out.println("Pro player");
////				}
////				else if (c>3 && c<7) {
////					System.out.println("Good player");
////				}
////				else {
////					System.out.println("nice try but can do better");
////				}
////			}
////				
////				 
////			}
////			
////		public class Exercise {
////			public static void main(String[] args) {
////				game player= new game();
////				player.play();
////				player.getuserinput();
////				player.iscorrectnumber();
////				player.numbofguess();
////				
//////			}
////
//////		}
////		
////	
////	}
////}
//
///*	Create a class Game, which allows a user to play "Gess the Number" game once.
////
////		Game should have the following methods:
////		Constructor to generate the random number
////		takeUserInput() to take a user input of number
////		isCorrectNumber() to detect whether the number entered by the user is true
////		getter and setter for noOfGuesses
////		Use properties such as noOfGuesses(int), etc to get this task done!
////	*/
//
//class Game{
//	public int num;
//	public int input;
//	public int gusses=0;
//	
//	 Game() {
//		Random rand = new Random();
//		
//		this.num = rand.nextInt(100);
//	}
//	void  takeUserInput(){
//		System.out.println("Guess The Number:");
//		Scanner sc = new Scanner(System.in);
//		input = sc.nextInt();
//		
//	}
//	boolean isCorrectNumber() {
//		gusses++;
//		if(input==num) {
//			System.out.println("CORRECT GUESS!!!");
//		 return true;
//		}else if(input>num) {
//			System.out.println("Go for Lower Number");
//			
//		}
//		else if(input<num){
//		System.out.println("Go for Higher Number");	
//		}
//		
//		return false;
//		}
//	
//
//	public int getGusses() {
//		return gusses;
//	}
//	public void setGusses(int gusses) {
//		this.gusses = gusses;
//	}
//}
//public class Exercise {
//	public static void main(String[] args) {
//		
//		Game g= new Game();
//		g.takeUserInput();
//	    boolean b= false;
//        while(!b){
//        g.takeUserInput();
//        b = g.isCorrectNumber();
//
//        }
//	}
//}
//	package com.company;
import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber==number){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("Too low...");
        }
        else if(inputNumber>number){
            System.out.println("Too high...");
        }
        return false;
    }

}
public class Exercise {
    public static void main(String[] args) {
        /*
            Create a class Game, which allows a user to play "Guess the Number"
            game once. Game should have the following methods:
            1. Constructor to generate the random number
            2. takeUserInput() to take a user input of number
            3. isCorrectNumber() to detect whether the number entered by the user is true
            4. getter and setter for noOfGuesses
            Use properties such as noOfGuesses(int), etc to get this task done!
         */

        Game g = new Game();
        boolean b= false;
        while(!b){
        g.takeUserInput();
        b = g.isCorrectNumber();
        }

    }
}

