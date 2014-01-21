package first.view;

import first.model.Thingy;

import java.util.Scanner;

public class ConsoleView
{
	
	//Declare a Scanner object to use in the console
	private Scanner wordScanner;
	/**
	 * Declare a Thingy object for testing purposes
	 */
	private Thingy testThingy;
	
	/**
	 * 
	 */
	
	public ConsoleView()
	{
		wordScanner = new Scanner(System.in);
		testThingy = new Thingy();
	}
	
	public void start()
	{
		
//		System.out.println("Hi there, lets talk!");
//		getWords();
//		getWords();
//		questionsAndAnswers();
		reallyMeetTheThingy();
	}
	
	private void meetTheThingy()
	{
		System.out.println("Here is a Thingy: " + testThingy.getName());
		System.out.println("What do you want to change my name to?");
		
		String newName = wordScanner.nextLine();
		
		System.out.print("Are you really sure my name should be: " + newName + "?");
		System.out.println(" Type Yes or No");
		
		String answer = wordScanner.nextLine();
		
		if (answer.equalsIgnoreCase("Yes"))
		{
			System.out.println("I love my new name!");
			testThingy.setName(newName);
			System.out.println("My new name is: " + testThingy.getName());
		}
		
		else if (answer.equalsIgnoreCase("No"))
		{
			System.out.println("I never liked " + newName + " anyway...");
		}
		
		else
		{
			System.out.println("Stop typing gibberish!!!");
			meetTheThingy();
		}
		
	}
	
	private void reallyMeetTheThingy()
	{
		System.out.println("Hi! my name is " + testThingy.getName());
		System.out.println("What's your name?");
		
		String newName = wordScanner.nextLine();
		
		System.out.println("Right! So your name is " + newName);
		System.out.println("What's your favorite food?");
		
		String newFood = wordScanner.nextLine();
		
		if (newFood.equalsIgnoreCase("Spicy Food"))
		{
			System.out.println("That's mine too!");
		}
		else
		{
			System.out.println(newFood + " sounds tasty, but I prefer spicy food");
		}
		
		System.out.println("My favorite movie is the " + testThingy.getMovie() + ", What's yours?");
		
		String newMovie = wordScanner.nextLine();
		
		System.out.println(newMovie + " is amazing!!!");
		
		finalQuestion();
		
	}	
		
	private void finalQuestion()
	{
	
		System.out.println("My vision has been failing me lately. Are you a boy? Or are you a girl?");
		
		String answer = wordScanner.nextLine();
		
		if (answer.equalsIgnoreCase("boy"))
		{
			System.out.println("Oh, I see now! Your a boy!");
		}
		
		else if (answer.equalsIgnoreCase("girl"))
		{
			System.out.println("Oh, I see now! Your a girl!");
		}
		
		else
		{
			System.out.println("Stop typing gibberish!");
			finalQuestion();
		}
	}	

	
	private void getWords()
	{
		String test = wordScanner.nextLine();
		System.out.print("Your answer: ");
		System.out.println(test);
		
	}
	
	/**
	 * Ask the user four questions. Print their answers.
	 */
	
	private void questionsAndAnswers()
	{
		System.out.println("I have seas with no water, coast with no sand, towns without people, mountains without land. What am I?");
		getWords();
		System.out.println("Correct Answer: A Map");
		System.out.println("I'm rarely touched but often held. If you have wit, you'll use me well. What am I?");
		getWords();
		System.out.println("Correct Answer: Tongue");
		System.out.println("Often will I spin a tale, never will I charge a fee. I'll amuse you an entire eve, but, alas, you won't remember me. What am I?");
		getWords();
		System.out.println("Correct Answer: A Dream");
		System.out.println("No man has seen it but all men know it. lighter than air, sharper than any sword. Comes from nothing, but will fell the strongest armies. Of what do I speak?");
		getWords();
		System.out.println("Correct Answer: Hunger");
		
	}
	
	private void show()
	{
		System.out.println("show this on my screen.");
		System.out.println("Show this on my screen on the next line.");
		
	}
	
}
