package sauceda_PA2;
import java.util.Scanner;
public class Polling_p3 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		final int ROWS = 5;
		final int COLUMNS = 10;
		String[] topics = new String[ROWS];
		int[][] responses = new int[ROWS][COLUMNS];
		int i, j = 0, tacos = 0, pizza = 0, ramen = 0, wings = 0, steak = 0, answer;
		double tacosTotal = 0, pizzaTotal = 0, ramenTotal = 0, wingsTotal = 0, steakTotal = 0;
		String highestPointTotal, lowestPointTotal;
		
		topics[0] = "tacos";
		topics[1] = "pizza";
		topics[2] = "ramen";
		topics[3] = "wings";
		topics[4] = "steak";
		
		System.out.println("Please rate the following foods from 1(least favorite) to 10(most favorite). Enter 1 to continue or 0 to exit.");
		answer = scnr.nextInt();
		
		while (answer != 0) {
		System.out.println(topics[0]);
		tacos = scnr.nextInt();
		++responses[0][tacos - 1];
		tacosTotal = tacosTotal + tacos;
		System.out.println(topics[1]);
		pizza = scnr.nextInt();
		++responses[1][pizza - 1];
		pizzaTotal = pizzaTotal + pizza;
		System.out.println(topics[2]);
		ramen = scnr.nextInt();
		++responses[2][ramen - 1];
		ramenTotal = ramenTotal + ramen;
		System.out.println(topics[3]);
		wings = scnr.nextInt();
		++responses[3][wings - 1];
		wingsTotal = wingsTotal + wings;
		System.out.println(topics[4]);
		steak = scnr.nextInt();
		++responses[4][steak - 1];
		steakTotal = steakTotal + steak;
		System.out.println("Please rate the following foods from 1(least favorite) to 10(most favorite). Enter 1 to continue or 0 to exit.");
		answer = scnr.nextInt();
		++j;
		}
		
		if (tacosTotal > pizzaTotal && tacosTotal > ramenTotal && tacosTotal > wingsTotal && tacosTotal > steakTotal) {
			highestPointTotal = topics[0];
		}
		else if (pizzaTotal > ramenTotal && pizzaTotal > wingsTotal && pizzaTotal > steakTotal) {
			highestPointTotal = topics[1];
		}
		else if (ramenTotal > wingsTotal && ramenTotal > steakTotal) {
			highestPointTotal = topics[2];
		}
		else if (wingsTotal > steakTotal) {
			highestPointTotal = topics[3];
		}
		else {
			highestPointTotal = topics[4];
		}
		
		if (tacosTotal < pizzaTotal && tacosTotal < ramenTotal && tacosTotal < wingsTotal && tacosTotal < steakTotal) {
			lowestPointTotal = topics[0];
		}
		else if (pizzaTotal < ramenTotal && pizzaTotal < wingsTotal && pizzaTotal < steakTotal) {
			lowestPointTotal = topics[1];
		}
		else if (ramenTotal < wingsTotal && ramenTotal < steakTotal) {
			lowestPointTotal = topics[2];
		}
		else if (wingsTotal < steakTotal) {
			lowestPointTotal = topics[3];
		}
		else {
			lowestPointTotal = topics[4];
		}
		
		if (j == 0) {
			j = 1;
		}
		System.out.println("\t\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10\tAVG");
		System.out.print(topics[0]+ "\t\t");
			for (i = 0; i < 10; ++i) {
				System.out.print(responses[0][i] + "\t");
			}
		System.out.print(tacosTotal/j + "\n");
		System.out.print(topics[1]+ "\t\t");
			for (i = 0; i < 10; ++i) {
				System.out.print(responses[1][i] + "\t");
			}
			System.out.print(pizzaTotal/j + "\n");	
		System.out.print(topics[2]+ "\t\t");
			for (i = 0; i < 10; ++i) {
				System.out.print(responses[2][i] + "\t");
			}
			System.out.print(ramenTotal/j + "\n");	
		System.out.print(topics[3]+ "\t\t");
			for (i = 0; i < 10; ++i) {
				System.out.print(responses[3][i] + "\t");
			}
			System.out.print(wingsTotal/j + "\n");
		System.out.print(topics[4]+ "\t\t");
			for (i = 0; i < 10; ++i) {
				System.out.print(responses[4][i] + "\t");
			}
			System.out.print(steakTotal/j + "\n\n");
		
		System.out.println("The food that received the most points is " + highestPointTotal + ".");
		System.out.println("The food that received the least points is " + lowestPointTotal + ".");

	}

}
