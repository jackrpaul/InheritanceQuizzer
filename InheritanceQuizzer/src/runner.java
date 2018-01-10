import java.util.*;
import java.io.*;
import java.text.*;


public class runner
	{
		static String name;
		static boolean quizContinues;
		static int numOfQ, numCorrect;
		public static void main(String[] args)
			{
			greetUser();
			while(quizContinues)
				{
				askNumberOfQuestions();
				//quizUser();
				reportScore();
				askForContinue();
				takeChoice();
				sayGoodbye();
				}
			}
		private static void greetUser()
			{
				System.out.println("Welcome to the Inheritance Quizzer! What is your name?");
				Scanner userName = new Scanner(System.in);
				name = userName.nextLine();
				quizContinues = true;
			}
		private static void askNumberOfQuestions()
			{
				Scanner number = new Scanner(System.in);
				System.out.println("How many questions would you like to answer?");
				numOfQ = number.nextInt();
			}
		private static void quizUser()
			{
				for(int i = numOfQ; i > 0; i--)
					{
					//do this soon
					}
			}
		private static void reportScore()
			{
				System.out.println("Alright! That's the end of the quiz.");
				double percent = (double)(numCorrect / numOfQ);
				System.out.println("You got " + numCorrect + " out of " + numOfQ + " questions right! That's " + percent + "%!");
			}
		private static void askForContinue()
			{
				System.out.println("Would you like to try another quiz?");
				System.out.println("1) Yes.");
				System.out.println("2) No.");
			}
		private static void takeChoice()
			{
				Scanner choice = new Scanner(System.in);
				int choose = choice.nextInt();
				if(choose == 1)
					{
					quizContinues = true;
					}
				else if(choose == 2)
					{
					quizContinues = false;
					}
				else
					{
					System.out.println("That's not a valid answer! Try again.");
					takeChoice();
					}
			}
		private static void sayGoodbye()
			{
				System.out.println("Okay! Have a nice day!");
			}
	}
