package studio2;
import java.util.Scanner;
import java.util.Random;

public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int simulations = 10000;
		
		int count = 0;
		
		for(int i = 0; i < simulations; i++) {
			
			double x = Math.random();
			double y = Math.random();
			
			double distance = Math.sqrt((x-0.5)*(x-0.5)+(y-0.5)*(y-0.5));
			
			if (distance <= 0.5)
				count ++;
			
		}
		
		double estimation = count*1.0/simulations;
		
		
		
		System.out.println(estimation*4);
	}

}
