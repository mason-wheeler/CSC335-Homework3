package edu.missouristate;


import java.sql.Array;
import java.util.Arrays;

public class HomeworkThreeTestHarness {

	private int index = 1;
	private String answer = "";
	
	public HomeworkThreeTestHarness() {
		
		/**
		 * PLEASE USE THIS HW3 TEMPLATE
		 * I would like to test the result of your code by getting a 
		 * String only. This means that we have to convert some of our 
		 * Objects to Strings. I have included some examples. I hope this
		 * template makes things easier for you.
		 */
		// Get the String representation of an Integer Array
		Integer[] arr1example = new Integer[] {1,2,3};
		System.out.println(arrayToString(arr1example));
	
		// Get the String representation of a String Array
		String[] arr2example = new String[] {"a","b","c"};
		System.out.println(arrayToString(arr2example));		
		
		// Get the String representation of an int
		System.out.println(String.valueOf(5));
		
		// Get the String representation of a boolean
		System.out.println(String.valueOf(new Boolean(true)));
				
		/**
		 * COMPLETE THE METHODS FOR 10 OF THE 12 PROBLEMS BELOW:
		 * (You can complete all 12 if you want)  
		 */

		/***************************************************************************
		 * Script 1 
		 * Add value1 plus value2
		 *   Expected Output: 
		 *     3
		 **************************************************************************/
		try {	
			answer = add(1,2);
			System.out.println("\nSCRIPT " + index + "=> "+ answer);
		} catch (Exception e) {
			handleError(e, index);
		} finally {
			index += 1;
		}

		/*************************************************************************** 
		 * Script 2 
		 * Create a string with the value ' ## mitchues ' 
		 * ## Represents a two digit number 
		 * The space at the start and end is important
		 * Expected Output: 
		 *   " 99 mitchues "  (without the double quotes)
		 **************************************************************************/
		try {
			answer = getMitchuesString(99);  
			System.out.println("\nSCRIPT " + index + "=> "+ answer);
		} catch (Exception e) {
			handleError(e, index);
		} finally {
			index += 1;
		} 				
		
		/***************************************************************************
		 * Script 3
		 * Get the length of the array
		 * 	Test Data: 
		 *     [1,2,3,4,5,6,7,8,9]
		 *   Expected Output: 
		 *      9
		 **************************************************************************/
		try {
			// Build the example array 
			// Delete parameter "null" 
			// Pass "arr" into the getArrayLength method to get the length
			
			Integer[] arr = {1,2,3,4};
		    answer = getArrayLength(arr);
		    System.out.println("\nSCRIPT " + index + "=> "+ answer);
		} catch (Exception e) {
			handleError(e, index);
		} finally {
			index += 1;
		}

		/*************************************************************************** 
		 * Script 4
		 * Write a JavaScript public String to check whether an `input` is an array or not.
		 * Test Data :
		 *   isArray('w3resource'));
		 *   isArray([1, 2, 4, 0]));
		 * Expected Output:
		 *   false
		 *   true
		 **************************************************************************/
		try {
			// Populate the array below and pass it to the appropriate method
			// Delete parameter "null" 
			// Pass "arr" into the isArray method to check if the object is an array
			
			Integer[] arr = {1,2,3,4};
		    answer = isArray(arr);
		    System.out.println("\nSCRIPT " + index + "=> "+ answer);	
		} catch (Exception e) {
			handleError(e, index);
		} finally {
			index += 1;
		} 

		/***************************************************************************
		 * Script 5
		 * Write a JavaScript public String to clone an array.
		 * Test Data :
		 *   console.log(arrayClone([1, 2, 4, 0]));
		 *   console.log(arrayClone([1, 2, [4, 0]]));
		 * Expected Output:
		 *   [1, 2, 4, 0]
		 *   [1, 2, [4, 0]]
		 **************************************************************************/
		try {
			// Populate the array below and pass it to the appropriate method
			// Delete parameter "null" 
			// Pass "arr" into the cloneArray method to build a cloned array
			
			Integer[] arr = {5,4,3,1,2};
		    answer = cloneArray(arr);
		    System.out.println("\nSCRIPT " + index + "=> "+ answer);	
		} catch (Exception e) {
			handleError(e, index);
		} finally {
			index += 1;
		} 
		       
		/*************************************************************************** 
		 * Script 6
		 * Write a JavaScript public String to get the first element of an array. 
		 * Passing a parameter 'n' will return the first 'n' elements of the array.
		 *   Test Data :
		 *     console.log(first([7, 9, 0, -2]));
		 *     console.log(first([],3));
		 *     console.log(first([7, 9, 0, -2],3));
		 *     console.log(first([7, 9, 0, -2],6));
		 *     console.log(first([7, 9, 0, -2],-4));
		 *   Expected Output:
		 *     7
		 *     []
		 *     [7, 9, 0]
		 *     [7, 9, 0, -2]
		 *     []
		 **************************************************************************/
		try {
		    answer = first(new Integer[]{1,2,3}, 2);
		    System.out.println("\nSCRIPT " + index + "=> "+ answer);	
		} catch (Exception e) {
			handleError(e, index);
		} finally {
			index += 1;
		}
		       
		/***************************************************************************
		 * Script 7
		 * Write a JavaScript public String to get the last element of an array. 
		 * Passing a parameter 'n' will return the last 'n' elements of the array. 
		 *   Test Data :
		 *     console.log(last([7, 9, 0, -2]));
		 *     console.log(last([7, 9, 0, -2],3));
		 *     console.log(last([7, 9, 0, -2],6));   
		 *  Expected Output:        
		 *   -2
		 *   [9, 0, -2]
		 *   [7, 9, 0, -2]          
		 **************************************************************************/
		try {
			answer = last(new Integer[] {1,2,3}, 2);
		    System.out.println("\nSCRIPT " + index + "=> "+ answer);	
		} catch (Exception e) {
			handleError(e, index);
		} finally {
			index += 1;
		}
		 

		/*************************************************************************** 
		 * 8. Write a simple JavaScript program to join all elements of the following 
		 * array into a string. 
		 * Sample array : myColor = ["Red", "Green", "White", "Black"];
		 * Given a delimiter: , or + 
		 * Expected Output:
		 *   "Red,Green,White,Black"
		 *   "Red+Green+White+Black" 
		 **************************************************************************/
		try {
		    String[] arr = new String[] {"Red", "Green", "White", "Black"};
		    answer = joinElements(arr, "+");   
		    System.out.println("\nSCRIPT " + index + "=> "+ answer);	
		} catch (Exception e) {
			handleError(e, index);
		} finally {
			index += 1;
		}
		       
		/***************************************************************************
		 * 9. Write a JavaScript program to sort the items of an array. 
		 * Sample array : var arr1 = [ 3, 8, 7, 6, 5, -4, 3, 2, 1 ];
		 * Expected Output:
		 *    -4,-3,1,2,3,5,6,7,8
		 **************************************************************************/
		try {
		    Integer[] arr1 = new Integer[] {3, 8, 7, 6, 5, -4, 3, 2, 1};      
		    answer = "";   
		    System.out.println("\nSCRIPT " + index + "=> "+ answer);	
		} catch (Exception e) {
			handleError(e, index);
		} finally {
			index += 1;
		}
		 
		/***************************************************************************
		 * 10. Write a JavaScript program to find the most frequent item of an array.
		 * Sample array : var arr1=[3, 'a', 'a', 'a', 2, 3, 'a', 3, 'a', 2, 4, 9, 3];
		 * Expected Output:
		 *   a ( 5 times )
		 **************************************************************************/
		try {
			
		    answer = findMostFrequent(new Integer[] {1,1,2,2,2});   
		    System.out.println("\nSCRIPT " + index + "=> "+ answer);	
		} catch (Exception e) {
			handleError(e, index);
		} finally {
			index += 1;
		}

		/***************************************************************************
		 * 11. Write a JavaScript program to compute the sum of an array of integers.
		 * Create your own array of numbers.
		 * Example Input: [1,2,3]
		 * Expected Output: 6
		 **************************************************************************/
		try {
		    answer = sumOfIntegers(new Integer[] {1,2,3});   
		    System.out.println("\nSCRIPT " + index + "=> "+ answer);	
		} catch (Exception e) {
			handleError(e, index);
		} finally {
			index += 1;
		}
		       
		/***************************************************************************
		 * 12. Write a JavaScript program to compute the product of an array of integers.
		 * Create or reuse your array of numbers
		 * Example Input: [1,2,3]
		 * Expected Output: 6
		 **************************************************************************/
		try {
		    answer = productOfIntegers(new Integer[] {1,2,3,4});   
		    System.out.println("\nSCRIPT " + index + "=> "+ answer);	
		} catch (Exception e) {
			handleError(e, index);
		} finally {
			index += 1;
		}

		/** EXTRA CREDIT
		 * 
		 * @param string
		 * @returns
		 */
		// Given a string of letters/words, remove the duplicate spaces (leaving only 1 space max)
		// Example Input: "  1  2  3  ";
		// Example Output: " 1 2 3 ";
		System.out.println("Removed internal spaces : " + removeInternalDuplicateSpaces("  1  2  3  "));	
		
	}

	/**************************************
	 * 
	 *          PUBLIC METHODS
	 * 
	 **************************************/

	//Extra Credit
	public String removeInternalDuplicateSpaces(String string) {
		
		return ""; 
	}
	
	//Method 12
	public String productOfIntegers(Integer[] arr) {
		
		return "";
	}
	
	//Method 11
	public String sumOfIntegers(Integer[] arr) {
		
		return "";
	}
	
	//Method 10
	public String findMostFrequent(Integer[] arr) {
		
		return "";
	}
	
	//Method 9
	public String sort(Integer[] arr) {
		String result = new String();
		 int temp;
		 for (int i = 1; i < arr.length; i++) {
			 for (int j = i; j > 0; j--) {
				 if (arr[j] < arr [j - 1]) {
					 temp = arr[j];
					 arr[j] = arr[j - 1];
					 arr[j - 1] = temp;
				 }
			 }
		   	}
		   	for (int i = 0; i < arr.length; i++) {
		     result += arr[i];
		     if (i != (arr.length - 1))
				{
					result += ",";
				}
		   	}
		return result;
	} 

	//Method 8
	public String joinElements(String[] arr, String delimeter) {
		String result = new String();
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
			if (i != (arr.length - 1))
			{
				result += " " + delimeter + " ";
			}
		}
		return result;
	}
	
	//Method 7
	public String last(Integer[] arr, Integer count) {
		// If count is null, return last element
		// Otherwise return last n number of elements where n = count
		// If count <= arr.length return all elements 
		String result = new String("[");
		for (int i = 1; i <= count; i++)
		{
			result += arr[arr.length-i];
			if (i != count)
			{
				result += ",";
			}
		}
		result += "]";
		return result;
	}
	
	//Method 6
	public String first(Integer[] arr, Integer count) {
		// If count is null, return first element
		// Otherwise return first n number of elements where n = count
		// If count >= arr.length return all elements
		String result = new String("[");
		for (int i = 0; i < count ; i++)
		{
			result += arr[i];
			if (i + 1 != count)
			{
				result += ",";
			}
		}
		result += "]";
		return result;
	}
	
	//Method 5
	public String cloneArray(Integer[] array) {
		Integer[] copyArray = array;
		return Arrays.toString(copyArray);
	}
	
	//Method 4
	public String isArray(Object obj) {
		// Return "true" if it is an array of any kind
		// Return "false" if it is not an array
		return String.valueOf(obj.getClass().isArray());
	}
	
	//Method 3
	public String getArrayLength(Integer[] array) {
		// Return the length of the array passed into this function.
		// If the array is null, pass back 0.
		Integer len = array.length;
		return len.toString();
	}
	
	//Method 2
	public String getMitchuesString(Integer num) {
		// Build the proper string
		String result = num + " mitchues ";
		return result;
	}	
	
	//Method 1
	public String add(Integer value1, Integer value2) {
		Integer sum = value1 + value2;
		String result = sum.toString();
		return result;
	}
	
	public String handleError(Exception e, Integer index) {
	    String errorMessage = "Script "+ index +"=> There was an error running script " + index + "=> ";
	    String error = (e == null || e.getMessage() == null) ? "Null Pointer Exception" : e.getMessage();
	    errorMessage += ("Error: " + error);
	    System.out.println(errorMessage);
	    return errorMessage;
	}
	
	public String arrayToString(Object[] objArray) {	
		StringBuilder sb = new StringBuilder();
		
		if (objArray != null && objArray.length > 0) {
			for (int i=0; i < objArray.length; i++) {
				if (i != 0)
					sb.append(",");
				
				sb.append(objArray[i]);
			}
		}

		return sb.toString();
	}
	
	public static void main(String[] args) {
		new HomeworkThreeTestHarness();
	}
}