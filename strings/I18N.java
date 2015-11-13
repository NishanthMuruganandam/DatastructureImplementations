package algorithms.strings;

public class I18N {

	static void printI18N(String str){
		
		String start ,end;		
		int count = str.length()-2;
		
		System.out.println(str.charAt(0) + "" +count +"" +str.charAt(str.length()-1));
		count-=1;
		for(int k=2;count >= 1; count--,k++){
			
			start = str.substring(0, k);
			end = str.substring(str.length()-1, str.length());			
			System.out.println(start +""+ count +"" + end);
			start = str.substring(0,1);
			end = str.substring(str.length()-k, str.length());
			System.out.println(start +""+ count+"" + end);
		}			
	}
	
	public static void main(String[] args) {
		String str = "Nishanth";
		printI18N(str);
	}
}
