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
				//askNumberOfQuestions();
				quizUser();
				reportScore();
				askForContinue();
				takeChoice();
				}
			sayGoodbye();
			}
		private static void greetUser()
			{
				System.out.println("Welcome to the Inheritance Quizzer! What is your name?");
				Scanner userName = new Scanner(System.in);
				name = userName.nextLine();
				quizContinues = true;
				System.out.println("Hello, + " + name + "! I will now quiz you on 7 inheritance questions.");
				System.out.println("");
			}
		private static void askNumberOfQuestions()
			{
				Scanner number = new Scanner(System.in);
				numOfQ = number.nextInt();
			}
		private static void quizUser()
			{
				for(int i = 7; i > 0; i--)
					{
					System.out.println("If I instantiate...");
					System.out.println("");
					int randomNumber = (int) (Math.random()*4);
					switch(randomNumber)
						{
							case 0:
								{
									System.out.println("Vehicle x = new Vehicle()");
									break;
								}
							case 1:
								{
									System.out.println("Vehicle x = new Car()");
									break;
								}
							case 2:
								{
									System.out.println("Car x = new Vehicle()");
									break;
								}
							case 3:
								{
									System.out.println("Car x = new Car()");
									break;
								}
						}
					System.out.println("");
					System.out.println("Then what will print if I tried to run this method?");
					System.out.println("");
					Scanner userAnswer = new Scanner(System.in);
					int randomNumber2 = (int) (Math.random()*3);
					switch(randomNumber2)
						{
						case 0:
								{
									System.out.println("x.buy();");
									System.out.println("");
									int correctAnswer;
									ArrayList <String> answers = new ArrayList <String>();
									answers.add("1) Congratulations on the purchase of your new vehicle!");
									answers.add("1) Congratulations on the purchase of your new car!");
									answers.add("2) Vehicle is spelled: V E H I C L E.");
									answers.add("3) None of these work.");
									answers.add("4) This code will not run.");
									if(randomNumber == 0)
										{
										correctAnswer = 1;
										answers.remove(answers.get(1));
										Vehicle x = new Vehicle();
										}
									else if(randomNumber == 1)
										{
										correctAnswer = 1;
										answers.remove(answers.get(0));
										Vehicle x = new Car();
										}
									else if(randomNumber == 3)
										{
										correctAnswer = 1;
										answers.remove(answers.get(0));
										Car x = new Car();
										}
									else
										{
										correctAnswer = 4;
										answers.remove(answers.get(1));
										}
									for(int j = 0; j < answers.size(); j++)
										{
										System.out.println(answers.get(j));
										}
									System.out.println("");
									System.out.println("Please type in your answer now.");
									int userInput = userAnswer.nextInt();
									System.out.println("Alright, you answered " + userInput + ". Let's see what the correct answer is:");
									System.out.println("");
									System.out.println(answers.get(correctAnswer - 1).substring(3));
									System.out.println("");
									if(userInput == correctAnswer)
										{
										System.out.println("Congratulations! You are correct.");
										numCorrect++;
										}
									else
										{
										System.out.println("You are incorrect!");
										}
									System.out.println("");
									break;
								}
						case 1:
								{
									System.out.println("x.spell();");
									System.out.println("");
									int correctAnswer;
									ArrayList <String> answers = new ArrayList <String>();
									answers.add("1) Vehicle is spelled: I C I C L E.");
									answers.add("1) Car is spelled: C A R.");
									answers.add("2) Vehicle is spelled: V E H I C L E.");
									answers.add("3) The engine starts with a hearty roar.");
									answers.add("4) This code will not run.");
									if(randomNumber == 0)
										{
										correctAnswer = 2;
										answers.remove(answers.get(1));
										Vehicle x = new Vehicle();
										}
									else if(randomNumber == 1)
										{
										correctAnswer = 2;
										answers.remove(answers.get(0));
										Vehicle x = new Car();
										}
									else if(randomNumber == 3)
										{
										correctAnswer = 2;
										answers.remove(answers.get(0));
										Car x = new Car();
										}
									else
										{
										correctAnswer = 4;
										answers.remove(answers.get(0));
										}
									for(int j = 0; j < answers.size(); j++)
										{
										System.out.println(answers.get(j));
										}
									System.out.println("");
									System.out.println("Please type in your answer now.");
									int userInput = userAnswer.nextInt();
									System.out.println("Alright, you answered " + userInput + ". Let's see what the correct answer is:");
									System.out.println("");
									System.out.println(answers.get(correctAnswer - 1).substring(3));
									System.out.println("");
									if(userInput == correctAnswer)
										{
										System.out.println("Congratulations! You are correct.");
										numCorrect++;
										}
									else
										{
										System.out.println("Sorry! You are incorrect!");
										}
									System.out.println("");
									break;
								}
						case 2:
								{
									System.out.println("x.turnOn();");
									System.out.println("");
									int correctAnswer;
									ArrayList <String> answers = new ArrayList <String>();
									answers.add("1) Sheesh. Who cares?");
									answers.add("1) The car's engine starts up quickly.");
									answers.add("2) Vehicle is spelled: V E H I C L E.");
									answers.add("3) The engine starts with a hearty roar.");
									answers.add("4) This code will not run.");
									if(randomNumber == 0)
										{
										correctAnswer = 3;
										answers.remove(answers.get(1));
										Vehicle x = new Vehicle();
										}
									else if(randomNumber == 1)
										{
										correctAnswer = 3;
										answers.remove(answers.get(0));
										Vehicle x = new Car();
										}
									else if(randomNumber == 3)
										{
										correctAnswer = 3;
										answers.remove(answers.get(0));
										Car x = new Car();
										}
									else
										{
										correctAnswer = 4;
										answers.remove(answers.get(0));
										}
									for(int j = 0; j < answers.size(); j++)
										{
										System.out.println(answers.get(j));
										}
									System.out.println("");
									System.out.println("Please type in your answer now.");
									int userInput = userAnswer.nextInt();
									System.out.println("Alright, you answered " + userInput + ". Let's see what the correct answer is:");
									System.out.println("");
									System.out.println(answers.get(correctAnswer - 1).substring(3));
									System.out.println("");
									if(userInput == correctAnswer)
										{
										System.out.println("Congratulations! You are correct.");
										numCorrect++;
										}
									else
										{
										System.out.println("Sorry! You are incorrect!");
										}
									System.out.println("");
									break;
								}
						}
					}
			}
		private static void reportScore()
			{
				System.out.println("Alright! That's the end of the quiz.");
				int percent = (numCorrect / 7) * 100;
				System.out.println("You got " + numCorrect + " out of " + 7 + " questions right! That's " + percent + "%!");
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
