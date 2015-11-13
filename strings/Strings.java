package strings;

public class Strings {

	public static void permute(String str){
		permute(new StringBuffer(str),0);
	}
	
	public static void permuteOfLengthN(String str,int n){
		for (Character c:str.toCharArray()){
			for(int i = 0;i<n;i++){
				System.out.print(c);
			}
			System.out.println();
		}
		permuteOfLengthN(new StringBuffer(str),0,n);
	}
		
	private static void permuteOfLengthN(StringBuffer str,int start, int n){
		if (start == str.length()-1){			
			System.out.println(str.substring(0, n));
		}
		
		for(int i=start;i<str.length();i++){
			swap(str,i,start);
			permuteOfLengthN(str, start+1,n);
			swap(str,i,start);			
		}
	}
	
	private static void permute(StringBuffer str,int start){
		if (start == str.length()-1){
			System.out.println(str);
		}
		
		for(int i=start;i<str.length();i++){
			swap(str,i,start);
			permute(str, start+1);
			swap(str,i,start);			
		}
	}

	private static void swap(StringBuffer str, int i, int start) {
		if ( i == start ){
			return;
		}
		char temp = str.charAt(start);		
		str.setCharAt(start, str.charAt(i));
		str.setCharAt(i, temp);		
	}
	
}
