package first.view;

import javax.swing.JOptionPane;
import first.model.Friend;
import first.model.Thingy;

public class FirstGUI
{
	//Declaration Section
	private Thingy myGUIThingy;
	private Friend randomFriend;
	private Friend friendMikel;
	private Friend friendKelsey;
	
	
	public FirstGUI()
	{
		myGUIThingy = new Thingy();
		randomFriend = new Friend();
		friendMikel = new Friend();
		friendKelsey = new Friend();
	}
	
	public void start()
	{
		findOutAboutFriends();
		showAndTell();
//		JOptionPane.showMessageDialog(null,"Once upon a time");
//		JOptionPane.showMessageDialog(null,"there was a beggining");
//		JOptionPane.showMessageDialog(null,"a middle");
//		JOptionPane.showMessageDialog(null,"and an end");
//		JOptionPane.showMessageDialog(null,"the end");	
//		interact();
//		meetTheThingyGUI();
//		checkWrapper();
	}
	

	private void showAndTell()
	{
		findOutAboutFriends();	
		//JOptionPane.showMessageDialog(friendMikel.getName());
	}

	private void findOutAboutFriends()
	{
//		String answer;
//		JOptionPane.showMessageDialog(null, "Tell me about yourself human.");
//		answer = JOptionPane.showInputDialog("What is your name?");
//		if (answer.equals("Mikel"))
//		{
//			mikelFriend();
//		}
//		else if (answer.equals("Kelsey"))
//		{
//			kelseyFriend();
//		}
		kelseyFriend();
		mikelFriend();
	}
	
	private void mikelFriend()
	{
		int age;
		boolean likesPinapple;
		double weight;
		String answer;
		JOptionPane.showMessageDialog(null, "Tell me about yourself human.");
		answer = JOptionPane.showInputDialog("What is your name?");
		friendMikel.setName(answer);
		answer = JOptionPane.showInputDialog("What's your humor like?");
		friendMikel.setHumorStyle(answer);
		answer = JOptionPane.showInputDialog("How old are you?");
		age = Integer.parseInt(answer);
		answer = JOptionPane.showInputDialog("What are you interested in?");
		friendMikel.setInterest(answer);
		answer = JOptionPane.showInputDialog("Do you like Pinapple?"); 
		likesPinapple = Boolean.parseBoolean(answer);
		if (answer.equalsIgnoreCase("yes"))
		{
					likesPinapple = true;
		}
		else if (answer.equalsIgnoreCase("No"))
		{
					likesPinapple = false;
		}
		answer = JOptionPane.showInputDialog("how much do you weigh?");
		weight = Double.parseDouble(answer);
	}
	
	private void kelseyFriend()
	{
		int age;
		boolean likesPinapple;
		double weight;
		String answer;
		JOptionPane.showMessageDialog(null, "Tell me about yourself human.");
		answer = JOptionPane.showInputDialog("What is your name?");
		friendKelsey.setName(answer);
		answer = JOptionPane.showInputDialog("What's your humor like?");
		friendKelsey.setHumorStyle(answer);
		answer = JOptionPane.showInputDialog("How old are you?");
		age = Integer.parseInt(answer);
		answer = JOptionPane.showInputDialog("What are you interested in?");
		friendKelsey.setInterest(answer);
		answer = JOptionPane.showInputDialog("Do you like Pinapple?"); 
		likesPinapple = Boolean.parseBoolean(answer);
		if (answer.equalsIgnoreCase("yes"))
		{
					likesPinapple = true;
		}
		else if (answer.equalsIgnoreCase("No"))
		{
					likesPinapple = false;
		}
		answer = JOptionPane.showInputDialog("how much do you weigh?");
		weight = Double.parseDouble(answer);
	}
	
	
	private void meetTheThingyGUI()
	{
		
		String answerThingyName;
		String answerThingyNameCorrect;
		JOptionPane.showMessageDialog(null, "Hi, my name is Thingy, but I don't like my name...");
		answerThingyName = JOptionPane.showInputDialog("What do you think it should be?");
		answerThingyNameCorrect = JOptionPane.showInputDialog(null, "Are you really sure my name should be " + answerThingyName + "?");
		if (answerThingyNameCorrect.equalsIgnoreCase("Yes"))
		{
			JOptionPane.showMessageDialog(null, "Yay! I love my new name!");
		}
		
		else if (answerThingyNameCorrect.equalsIgnoreCase("No"))
		{
			JOptionPane.showMessageDialog(null, "I never liked " + answerThingyName + " anyways...");
		}
		
		else
		{
			JOptionPane.showMessageDialog(null, "Stop typing gibberish!!");
			meetTheThingyGUI();
		}
		
	}
		
	private void interact()
	{
		
		String answer;
		JOptionPane.showMessageDialog(null,"Lets chat");
		answer = JOptionPane.showInputDialog("What is your name?");
		//If I do not type a response, null will be stored in my variable
		//Cancel is the same as pressing the red X in the corner
		JOptionPane.showMessageDialog(null,"Hi there, " + answer);
		
	}
	
	private void checkWrapper()
	{
		int age;
		boolean myPineapple;
		String answer;
		JOptionPane.showMessageDialog(null,"Hi, let's try something new");
		answer = JOptionPane.showInputDialog("How old are you?");
		
		if(answer.equals("yes"))
		{
			myPineapple = true;
		}
		
		
		age = Integer.parseInt(answer);
		//parseInt reads a counting number out of a String
		
		JOptionPane.showMessageDialog(null, "you are " + age + " years old. Next year you will be " + (age+1) + " years old");
		JOptionPane.showMessageDialog(null, "you are also " + (age*12) + " months old");
		JOptionPane.showMessageDialog(null, "As well as " + (age*365) + " days old");
		
	}
	
}
