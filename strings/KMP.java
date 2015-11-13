package algorithms.strings;

public class KMP {

	static int[] computeLPS(String pattern){
		int[] lps = new int[pattern.length()];
		
		int i = 1;
		int len = 0;
		while(i<pattern.length()){
			if (pattern.charAt(i) == pattern.charAt(len)){
				lps[i] = ++len;
				i++;
			}
			else{
				if (len != 0){
					len = lps[len-1];
				}else{
					lps[i] = len;
					i++;
				}
			}			
		}
		return lps;
	}
	
	static void kmpSearch(String str,String pattern){
		
		int[] lps = computeLPS(pattern);
				
		int i=0,j=0;
		while(i<str.length()){
			if (pattern.charAt(j) == str.charAt(i)){
				i++;
				j++;
			}
			if (j==pattern.length()){
				System.out.println("Pattern found at " + (i-j));
				j = lps[j-1];						
			}
			else if ((i<str.length()) && (pattern.charAt(j) != str.charAt(i))){
				if (j!=0){
					j = lps[j-1];					
				}else{
					i++;
				}				
			}
		}
	}
	
	public static void main(String[] args) {
		kmpSearch("AAAAAAAAAAAAAAAAAB", "AAAAB");
	}
}
