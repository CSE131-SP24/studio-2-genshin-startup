package studio2;

import java.util.Scanner;
import java.util.Random;

public class Gambler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("please input the startAmount:");
		int startAmount = in.nextInt();
		
		System.out.println("please input the winChance:");
		double winChance = in.nextDouble();
		
		System.out.println("please input the winLimit:");
		int winLimit = in.nextInt();
		
		
		System.out.println("please input the totalSimulations:");
		int simulations = in.nextInt();
		int i = simulations;
		
		int winTime = 0;
		
		while (i > 0) {
			
			boolean comment = true;
			int current1 = startAmount;
			
			while(current1 > 0 && current1 < winLimit) {
				
				double winRate = Math.random();
				
				// 0.3 
				if (winRate >= winChance) {
					current1--;
					comment = false;
				}
				
				else {
					current1++;
					comment = true;
				}	
			}
			
			if (comment == true)
				winTime ++;
			
			System.out.println(comment);
			
			i --; 
			
		}
		
		double ruinRate = (simulations - winTime) * 1.0 / simulations;
		
		System.out.println(ruinRate);

	}
	
	

}
