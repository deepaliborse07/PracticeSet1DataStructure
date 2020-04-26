/*Check weather 2 strings are anagram of each other*/
package string;
import java.util.Arrays;

public class TestAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char str1[]= {'t','e','s','t'};
		char str2[]= {'t','t','e','w'};
		if(areAnagram(str1,str2))
			System.out.println("The 2 strings are:"+"anagram of each ther");
		else
			System.out.println("not an anagram");
		
	}

	private static boolean areAnagram(char[] str1, char[] str2) {
		// TODO Auto-generated method stub
		//get length
		int n1=str1.length;
		int n2=str2.length;
		
		//if length not same not an anagram
		if(n1!=n2) {
			return false;
		}
		
		//sort both strings
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		//cmpare sorted string
		for(int i=0;i<n1;i++) 
			if(str1[i]!=str2[i])
				
				return false;
			
		
		
		return true;
	}

}
