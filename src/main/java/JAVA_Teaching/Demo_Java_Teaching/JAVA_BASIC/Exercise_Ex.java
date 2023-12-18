package JAVA_Teaching.Demo_Java_Teaching.JAVA_BASIC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Map.Entry;

public class Exercise_Ex {

	  static int pick;
	
	public static void main(String[] args) {
		
		//example 1
		int[] arrayNumber = {1, 3, 4, 2, 5, 8};
		//show all index of array
		for(int i = 0; i<arrayNumber.length; i++) {
			System.out.println(arrayNumber[i]);
		}
		//find odd number in array
		System.out.println("=============");
		for(int i = 0; i<arrayNumber.length; i++) {
			if(arrayNumber[i] % 2 != 0) {
				System.out.println(arrayNumber[i]);
			}
		}
		
		// example 2
		System.out.println("\n");
		System.out.println("=============");
		ArrayList<Integer> all = new ArrayList<Integer>();
		 Random ran = new Random();
		 for(int j = 0; j < 10; j++) {
			 pick = ran.nextInt(10);
			 all.add(pick);
		 }
			System.out.print(all);
			System.out.print(sumEven(all));
			
			
			
		// example 3
	    System.out.println("\n");
	    System.out.println("=============");
		String myText;
		Scanner myInput = new Scanner(System.in);
		Map<Integer, String> map = new HashMap<Integer, String>();
		do {
			System.out.print("your name:");
			myText = myInput.nextLine();
			
			if(!myText.equals("")) {
				System.out.print("your Id : ");
				Integer newId = myInput.nextInt();
				map.put(newId, myText);
				
				myInput.nextLine();
			}
		}while(!myText.equals(""));
		myInput.close();
		
		for(Entry<Integer, String> newMap : map.entrySet()) {
			System.out.print(newMap.getValue() + "and "+ newMap.getKey());
		}
		System.out.print("Show me this size" + map.size());
	}
	
	public static int sumEven(ArrayList<Integer> showMe) {
		int total = 0;
		ArrayList<Integer> show = new ArrayList<Integer>();
		for(int showList : showMe) {
			if(showList % 2 == 0) {
				total += showList;
				show.add(showList);
			}
		}
		System.out.println("\n");
		System.out.println("=============");
		System.out.print(show.toString());
		return total;
	}
	
}
