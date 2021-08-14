public class code {
	
	public static void main(String []argv){
		
     // Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.       
     int[] arr = new int[]{3, 9, 23, 64, 2, 8, 28, 93};
     
     // NEXT QUESTION///////////////////////////////////////////////////////////////////////////////////////
     
     // Programmatically subtract the value of the first element in the array from the value in 
     // the last element of the array (i.e. do not use ages[7] in your code). 
     int sub1 = subtract(arr);
     
     // Print the result to the console.
     System.out.println("Subtracting the first and last element gives you " + sub1);
     
     // NEXT QUESTION///////////////////////////////////////////////////////////////////////////////////////
     
     // Add a new age to your array and repeat the step above to ensure it is dynamic 
     // (works for arrays of different lengths).
     int[] arr1=new int[]{3, 9, 23, 64, 2, 8, 28, 93, 100};
     
     int sub2=subtract(arr1);
     
     System.out.println("Subtracting the first and last element gives you " + sub2);
     
     // NEXT QUESTION///////////////////////////////////////////////////////////////////////////////////////
     
     // Use a loop to iterate through the array  
     int sum = 0;
     sum = calculatesum(arr1);
     
     // and calculate the average age.
     int average = sum / arr1.length;
     
     // Print the result to the console.
     System.out.println("Average is " + average);
     
     // NEXT QUESTION///////////////////////////////////////////////////////////////////////////////////////
     
     // Create an array of String called names that contains the following values:
     // “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
     String names[] = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
     
     // Use a loop to iterate through the array and calculate the average number of letters per name.
     int count = 0;
     for(int i = 0; i < names.length; i++)
     {
            String temp = names[i];
            count += temp.length();
     }
     
     int avNames = count / names.length;

     // Print the result to the console.
     System.out.println("Average number of letters per name is " + avNames);
     
     // Use a loop to iterate through the array again and concatenate all the names together,
     // separated by spaces, 
     String concat="";
     for(int i = 0; i < names.length; i++)
     {
            concat+=names[i];
            concat+=" ";
     }
     
     
     // and print the result to the console.
     System.out.println("Concatenation of all String is  " + concat);
     
     // NEXT QUESTION///////////////////////////////////////////////////////////////////////////////////////

     // Create a new array of int called nameLengths.
     int []nameLengths=new int[names.length];
     
     // Write a loop to iterate over the previously created names array and add the length of each name
     // to the nameLengths array.
     for(int i = 0; i < names.length; i++){
         String temp = names[i];
         nameLengths[i] = temp.length();
     }
     
     // Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the
     //array. 
     int sumLength = calculatesum(nameLengths);
     
     // Print the result to the console.
     System.out.println("Sum of nameLengths Array is " + sumLength);
     
     // NEXT QUESTION///////////////////////////////////////////////////////////////////////////////////////
     
     // Write a method that takes a String, word, and an int, n, as arguments
     // and returns the word concatenated to itself n number of times.
     // (i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).
     String conc1 = Concatenate("Hello",3);
     System.out.println("Concatenation of string after calling Concatenate method is "+conc1);
     
     // NEXT QUESTION///////////////////////////////////////////////////////////////////////////////////////

     // Write a method that takes two Strings, firstName and lastName, and returns a full name 
     // (the full name should be the first and the last name as a String separated by a space).
     String conc2=ConcatenateFirstLast("Xyz","LastXyz");
     System.out.println("Concatenation of First and last name " + conc2);
     
     // NEXT QUESTION///////////////////////////////////////////////////////////////////////////////////////

     // Write a method that takes an array of int and
     // returns true if the sum of all the ints in the array is greater than 100.
     if(isGreaterthan(arr))
     {
            System.out.println("Sum is greater than 100");
     }
     else{
            System.out.println("Sum is not greater than 100");
     }
     
     // NEXT QUESTION///////////////////////////////////////////////////////////////////////////////////////

     // Write a method that takes an array of double and
     // returns the average of all the elements in the array.
     double[] dorray = new double[]{6.1, 8.0, 45.2, 11, 1000.2, 0.0009};
     double avgdouble=Averagedouble(dorray);
     System.out.println("Average of array of double is " + avgdouble);
     
     
     // NEXT QUESTION///////////////////////////////////////////////////////////////////////////////////////

     // Write a method that takes two arrays of double and returns true if the average of the elements
     // in the first array is greater than the average of the elements in the second array.
     double[] dorray1 = new double[] {1.0,7.0,5.4,3,12.7};
     
     if (isGreaterAverage(dorray, dorray1)){
            System.out.println("Average of first array is greater than second ");
     } else{
            System.out.println("Average of first array is less than second ");
     }
     
     // NEXT QUESTION///////////////////////////////////////////////////////////////////////////////////////

     // Write a method called willBuyDrink that takes
     // a boolean isHotOutside,
     // and a double moneyInPocket,
     // and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
     if(willBuyDrink(true,11.76)){
            System.out.println("You can buy Drink");
     } else{
            System.out.println("You cannot buy Drink!!");
     }
     
     // NEXT QUESTION///////////////////////////////////////////////////////////////////////////////////////
     
     // Create a method of your own that solves a problem.
     // In comments, write what the method does and why you created it.
     boolean triedReallyHard = false;
     boolean completedIt = false;
     int gradeNumber = 0;
     
     // Change as you see fit
     int done = isKyleHappyWithGrade(triedReallyHard = false, completedIt = true, gradeNumber = 100);
     
     
     
     
    }
     
     


	private static int isKyleHappyWithGrade(boolean triedReallyHard, boolean completedIt, int gradeNumber) {
		System.out.print("System Checking To See Kyle Feelings About The Grade: ");
		
		if (triedReallyHard == true && completedIt == true && gradeNumber > 90) {
			System.out.println("KYLE IS HAPPY ABOUT HIS GRADE TY");
			
		} else if (triedReallyHard == false && completedIt == false && gradeNumber > 90) {
			System.out.println("IDK how but okay ty");
			
		} else if (triedReallyHard == true && completedIt == false && gradeNumber > 90) {
			System.out.println("Kyle sees this as good and thanks you");
			
		} else if (triedReallyHard == false && completedIt == true && gradeNumber > 90) {
			System.out.println("TBH already did this last class so that grade makes sense");
			
		} else if (triedReallyHard == true && completedIt == true && gradeNumber < 90) {
			System.out.println("WHYYYYYYYYYYYYYYYYYYYYYY - Kyle");
			
		} else if (triedReallyHard == false && completedIt == false && gradeNumber < 90) {
			System.out.println("Yeah that makes sense");
			
		} else if (triedReallyHard == true && completedIt == false && gradeNumber < 90) {
			System.out.println(":( A for effort?");
			
		} else if (triedReallyHard == false && completedIt == true && gradeNumber < 90) {
			System.out.println("Hmmmmmmmm ok");
			
		} else {
			System.out.println("Oops");
		}
		return 0;
	}





















	public static int subtract(int arr[]){
            int last = 0, first = 0;
            for(int i = 0; i < arr.length; i++){
            	
                    if (i == 0){
                            first=arr[i];
                    } else{
                            last=arr[i];
                    }
            }
            return last-first;
    }
    // method to calculate sum of array elements.
    public static int calculatesum(int arr[]){
            int sum=0;
            for(int i=0;i<arr.length;i++)
            {
                    sum+=arr[i];
            }
            return sum;
    }
    // method to concatenate string with arguments as a word and integer
    public static String Concatenate(String word,int n)
    {
            String answer = "";
            for(int i = 0; i < n ; i++)
            {
                    answer += word;
            }
            // return the answer String
            return answer;
    } 
    // method to concatenate two strings with a space
    public static String ConcatenateFirstLast(String first,String last)
    {
            return first+" "+last;
    }
    // method to check if sum of array element is greater than 100
    public static boolean isGreaterthan(int arr[])
    {
            // call calculatesum method to calculate the sum.
            int sum=calculatesum(arr);
            // if greater than 100 return true
            if(sum>100)
            {
                    return true;
            }
            // else return false.
            return false;
    }
    // method to find average of array of double.
    public static double Averagedouble(double arr[])
    {
            double sum=0.0;
            for(int i=0;i<arr.length;i++)
            {
                    sum+=arr[i];
            }
            return sum/arr.length;
    }
    // method to check if average of first array is greater
    public static boolean isGreaterAverage(double array1[],double array2[])
    {
            // calculate average and then compare
            double avg1=Averagedouble(array1);
            double avg2=Averagedouble(array2);
            if(avg1>avg2)
            {
                    return true;
            }
            return false;
    }
    // willBuyDrink method
    public static boolean willBuyDrink(boolean isHotOutside,double moneyInPocket)
    {
            // if it is hot outside and money in pocket is greater than 10.50 return true.
            if(isHotOutside==true && moneyInPocket>10.50)
            {
                    return true;
            }
            return false;
    }

}
