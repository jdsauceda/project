package sauceda_PA2;
import java.util.Scanner;
public class decrypt_p1 {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int firstDigit, secondDigit, thirdDigit, fourthDigit, data, temp1;
		
		System.out.print("Please, enter your four digit integer for decryption> ");
		data = scnr.nextInt();
		
		firstDigit = data / 1000;
		secondDigit = (data / 100) % 10;
		thirdDigit = (data % 100) / 10;
		fourthDigit = data % 10;
		
		if (firstDigit == 7) {
			firstDigit = 0;
		}
		else {
			firstDigit = (firstDigit - 7) + 10;
		}
		if (secondDigit == 7) {
			secondDigit = 0;
		}
		else {
			secondDigit = (secondDigit - 7) + 10;
		}
		if (thirdDigit == 7) {
			thirdDigit = 0;
		}
		else {
			thirdDigit = (thirdDigit - 7) + 10;
		}
		if (fourthDigit == 7) {
			fourthDigit = 0;
		}
		else {
			fourthDigit = (fourthDigit - 7) + 10;
		}
			
		
		temp1 = firstDigit;
		firstDigit = thirdDigit;
		thirdDigit = temp1;
		temp1 = secondDigit;
		secondDigit = fourthDigit;
		fourthDigit = temp1;		
		
		System.out.print(firstDigit);
		System.out.print(secondDigit);
		System.out.print(thirdDigit);
		System.out.print(fourthDigit);

	}

}
