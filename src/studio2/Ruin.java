package studio2;
import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		
		double startAmount;
		double winChance;
		double winLimit;
		int simLimit;
		double odds = 0.50;
		int winTracker=0;
		double totalGames=0;
		
		Scanner kadenwantsmetorenamethis = new Scanner(System.in);
		System.out.println("How many meal points do you have to gamble with today?");
		
		
		
		startAmount = kadenwantsmetorenamethis.nextDouble();
		

		System.out.println("What's da win limit?");
		winLimit = kadenwantsmetorenamethis.nextDouble();
		
		System.out.println("How many simulation iterations do you want?");
		simLimit = kadenwantsmetorenamethis.nextInt();
		
		winChance = 0.5;
		
		System.out.println("Initial win chance:" + winChance);
		//single day, win/lose $1
		
		while(startAmount<winLimit && simLimit!=0 && startAmount > 0)
		{
			
			
			if(Math.random()>=winChance)
			{
				startAmount++;
				System.out.println("You win! $" + startAmount);
				winTracker++;
				
			}
			
			else
			{
				startAmount--;
				System.out.println("You lose! Loser boy $" + startAmount);
			}
			totalGames++;
			simLimit--;
			
			if(winTracker !=0)
			{
				winChance *= ((winTracker/totalGames));
			}
			
			System.out.println("Win Chance: " + winChance);
			

			
		}
		
		System.out.println(winTracker/totalGames);
		
		
		

		
		
		
		
	}
	
	
	
	
	
	

}
