package sauceda_PA2;
import java.util.Scanner;
public class encrypt_p1 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int firstDigit, secondDigit, thirdDigit, fourthDigit, data, temp1;
		
		
		System.out.print("Please, enter your four digit integer for encryption> ");
		
		data = scnr.nextInt();
		firstDigit = data / 1000;
		secondDigit = (data / 100) % 10;
		thirdDigit = (data % 100) / 10;
		fourthDigit = data % 10;
		
		firstDigit = (firstDigit + 7) % 10;
		secondDigit = (secondDigit + 7) % 10;
		thirdDigit = (thirdDigit + 7) % 10;
		fourthDigit = (fourthDigit + 7) % 10;
		
		temp1 = firstDigit;
		firstDigit = thirdDigit;
		thirdDigit = temp1;
		temp1 = secondDigit;
		secondDigit = fourthDigit;
		fourthDigit = temp1;		

		System.out.print(firstDigit);
		System.out.print(secondDigit);
		System.out.print(thirdDigit);
		System.out.println(fourthDigit);
	
	}

}
