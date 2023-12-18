package JAVA_Teaching.Demo_Java_Teaching.JAVA_BASIC;

import java.util.Arrays;

public class Array {

	   public static void main(String[] args) {
			
		   //Array has to type 
			
		   //single-dimensional array
		   int ShowArr3[] = {90, 97, 95, 99, 100};
		   ShowArr3[2] = 03;
		   System.out.print("int ShowArr3[]" + "\t" + "=" + "\t" + ShowArr3[2]);
		   System.out.print("\n");
		   int showArr1[] = new int[5];
		   showArr1[0] = 22;
		   showArr1[1] = 33;
		   showArr1[2] = 44;
		   showArr1[3] = 55;
		   showArr1[4] = 66;
		   System.out.print("int showArr1[]" + "\t" + "=" + "\t" + showArr1[2]);
		   System.out.print("\n");
		   int[] showArr = new int[5];
		   showArr[0] = 2;
		   showArr[1] = 3;
		   showArr[2] = 4;
		   showArr[3] = 5;
		   showArr[4] = 6;
		   System.out.print("int[] showArr" + "\t" + "=" + "\t" + showArr[2]);
		   int []ShowArr2 = new int[5];
		   ShowArr2[0] = 2;
		   ShowArr2[1] = 3;
		   ShowArr2[2] = 4;
		   ShowArr2[3] = 5;
		   ShowArr2[4] = 6;
		   System.out.print("\n");
		   System.out.print(" int []ShowArr2" + "\t" + "=" + "\t" + ShowArr2[2]);
		   
		   // loop 
		   int number[]; 
		   number = new int[10];
		   number[0] = 11;
		   number[1] = 22;
		   number[2] = 33;
		   number[3] = 44;
		   number[4] = 55;
		   number[5] = 66;
		   number[6] = 77;
		   number[7] = 88;
		   number[8] = 99;
		   number[9] = 100;
		   System.out.print("\n");
		   System.out.println("=======================");
		   for (int i = 0; i < number.length; i++) {
			      System.out.println("This is my loop array " + number[i]);
			    }
		   System.out.print("\n");
		   System.out.println("=======================");
		   int showArray[] = { 1, 5, 10, 15, 20 };
		    for (int i = 0; i < showArray.length; i++) {
		      System.out.println(showArray[i]);
		    }
		 
		    //multi-dimenional array
		    int[][] array1 = new int[2][3]; 
		    int array2[][] = new int[4][5];
		    int[][] array3 = new int[3][4];
		    
		    int[][] array11 = {{1, 3, 4}, {9, 8, 6},{2, 0, 5}}; 
		    int array22[][] = {{1, 3, 4}, {9, 8, 6},{2, 0, 5}};
		    int[][] array33 = {{1, 3, 4}, {9, 8, 6},{2, 0, 5}};
		    
			   System.out.print("\n");
			   System.out.println("=======================");
		       int[][] array4 = {{1, 3, 4}, {9, 8, 6},{2, 0, 5}};
				for(int[] getArr : array4){
				for(int val : getArr){
				System.out.print(val+" ");
				}
				System.out.println("hello");
				}
				
				
				  System.out.print("\n");
				  System.out.println("=======================");
				char[][] Array5 = new char[2][4];
				Array5[0][0] = 'J';
				Array5[0][1] = 'A';
				Array5[0][2] = 'V';
				Array5[0][3] = 'A';
				Array5[1][0] = 'j';
				Array5[1][1] = 'a';
				Array5[1][2] = 'v';
				Array5[1][3] = 'a';
		        System.out.println( " Show arrays " + Arrays.deepToString(Array5));
		        
		        
		        System.out.print("\n");
			    System.out.println("=======================");
		        int[][] jaggedArray = new int[4][]; //[4] -> row ->[] -> column
		        int[] array01 = { 3, 6, 8, 1, 0, 9 };
		        int[] array02 = {};
		        int[] array03 = { 90, 86, 71, 55 };
		        int[] array04 = { 12, 6 };
		        jaggedArray[0] = array01;
		        jaggedArray[1] = array02;
		        jaggedArray[2] = array03;
		        jaggedArray[3] = array04;
		        System.out.println(Arrays.deepToString(jaggedArray));
		        
		        
		        
		        
		        System.out.print("\n");
			    System.out.println("======================= execute again");
		        int n = 3;
		        int m = 3;
		        int[][] matrixA = {{1,6,8},{5,8,0},{2,5,9}};
		        int[][] matrixB = {{7,9,2},{1,0,6},{4,3,5}};
		        int[][] matrixC = new int[n][m];
		        for(int i=0; i< n; i++){
		            for(int j=0; j< m; j++){
		                matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
		            }
		        }
		        for(int i=0; i<n; i++){
		            for(int j=0; j< m; j++){
		                System.out.print(matrixC[i][j]+" ");
		            }
		            System.out.println();
		        }
		        
		        System.out.print("\n");
			    System.out.println("======================= execute again"); 
		        int[][][] arrayList = new int[2][2][2];
		        arrayList[0][1][1] = 708;
		        for (int i = 0; i < arrayList.length; i++) {
		            for (int j = 0; j < arrayList[i].length; j++) {
		                for (int k = 0; k < arrayList[i][j].length; k++) {
		                    System.out.print("arrayList[i][j]-1" + " " + Arrays.deepToString(arrayList));
		                }
		                System.out.println("arrayList[i][j]-2" + " " +Arrays.deepToString(arrayList));
		            }
		            System.out.println("arrayList[i][j]-3" + " " +Arrays.deepToString(arrayList));
		        }
		        
		        
		        System.out.print("\n");
			    System.out.println("======================= execute again"); 
		        int totalStudents = 3;
		        int subjects = 4;
		        int totalSemesters = 2;
		        // Data of Student 1
		        int[][] Student1 = {{ 87, 79, 91, 88 },{ 92, 80, 86, 91 }};
		        // Data of Student 2
		        int[][] Student2 = {{ 80, 75, 66, 74 },{ 81, 89, 70, 83 }};
		        // Data of Student 3
		        int[][] Student3 = {{ 98, 88, 94, 95 },{ 99, 93, 96, 97 }};
		        // array for storing data of all three students
		        int[][][] studentArray = new int[totalStudents][totalSemesters][subjects];
		        // storing data of students into 3D array
		        studentArray[0] = Student1;
		        studentArray[1] = Student2;
		        studentArray[2] = Student3;
		        // an element of the student Array is a 2D array containing information of each
		        // student
		        for (int i = 0; i < totalStudents; i++) {
		            System.out.println("Student " + (i + 1) + ":-"); // printing student number
		            for (int j = 0; j < totalSemesters; j++) {
		                // for each student printing all semesters and their scores in it
		                System.out.println("Semester " + (j + 1) + ":");

		            for (int k = 0; k < subjects; k++) {
		                System.out.print(studentArray[i][j][k] + " ");
		                // i = student number, j = semester, k = subject number
		            }
		            System.out.println();
		        }
		        System.out.println();
		    }
		        
		        System.out.print("\n");
			    System.out.println("======================= execute again"); 
		        int[][] array001 = {
		                {1,2,1},{3,4,1}};   // declaring array1
		            int[][] array002 = {
		                {2,3},{4,1},{8,3}};    // declaring array2
		            // rows and columns of arrays, respectively
		            int row1 = array001.length, row2 = array002.length, col1 = array001[0].length, col2 = array002[0].length;

		        // Check if multiplication is Possible 
		        if (row2 != col1) {
		            System.out.println("number of rows of array1 is not equal to the number of columns of array2");
		        }
		        else{
		            int[][] arrayAns = new int[row1][col2]; // ans array

		            // Multiplying the two matrices
		            for (int i = 0; i < row1; i++) { // row of array1
		                for (int j = 0; j < col2; j++) { // column of array 2
		                    for (int k = 0; k < row2; k++) 
		                        arrayAns[i][j] += array001[i][k] * array002[k][j];  
		                }
		            }
		            // printing the resultant array
		            for(int[] temp : arrayAns){
		                for(int val : temp){
		                    System.out.print(val+" ");
		                }
		                System.out.println();
		            }
		        }
		 
		       
		        System.out.print("\n");
				System.out.println("======================= execute again"); 
		   
		         String strArray[] = {"Python", "Java", "C++", "C", "PHP"};

		        // Find the length of an array
		        int lengthOfArray = strArray.length;

		        // using for loop
		        for(int i=0;i<lengthOfArray;i++) {
		          System.out.println(strArray[i]);
		        }

		        String strArrayss[] = {"Python", "Java", "C++", "C", "PHP"};

		        // using for-each loop
		        for(String i : strArrayss) {
		          System.out.println(i);
		        }
	 
		}
		
	}

