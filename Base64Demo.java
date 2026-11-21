package Finaltopic;

import java.util.*;

public class Base64Demo {
	public static void main (String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Secret Message:");
		String message=sc.nextLine();
		
		String encoded=Base64.getEncoder().encodeToString(message.getBytes());
		
		String decoded=new String(Base64.getDecoder().decode(encoded));
		
		System.out.println("\nOriginal Message:"+message);
		System.out.println("Encoded Message:"+encoded);
		System.out.println("Decoded Message:"+decoded);
		
		sc.close();
	}
}
