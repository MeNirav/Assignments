package assignments;

import java.util.Scanner;

public class SecondsMinutesHours {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Seconds");
		int sec = scan.nextInt();
		
		int S = sec % 60;
		int H = sec/60;
		
		int M = H % 60;
		H= H/60;
        System.out.print( H + ":" + M + ":" + S);

	}

}
