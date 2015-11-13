package algorithms.strings;

public class LongestPalindromicSubstring {

	static int longestPalindromicSubstring(String str){
		
		int max = 1;
		int start = 0;
		
		for(int i=1;i<str.length();i++){
			
			int low = i-1,high = i;
			
			while(low>=0 && high<str.length() && str.charAt(low)==str.charAt(high)){
				if (high - low + 1>max){
					max = high-low+1;
					start = low;
				}
				low --;
				high ++;
			}
			
			low = i-1;
			high = i+1;
			while(low>=0 && high<str.length() && str.charAt(low)==str.charAt(high)){
				if (high - low + 1>max){
					max = high-low+1;
					start = low;
				}
				low --;
				high ++;
			}
			
		}
		
		System.out.println("Palindromic substring is : " + str.substring(start, max+start));
		return max;
		
	}
	public static void main(String[] args) {
		String str = "geeks";
		System.out.println(longestPalindromicSubstring(str));
	}
}
