package algorithms.array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RunLength {

	public static void main(String[] args) {
		List<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(1);
		arr.add(2);
		arr.add(2);
		arr.add(2);
		arr.add(1);
		Integer element = null,count = null;
		Iterator<Integer> itr = arr.iterator();
		
		while(itr.hasNext()){
			int i = itr.next();
			if (element == null){
				count = 1;
				element = i;
				continue;
			}
			if(i!=element){
				System.out.println(element +"\t" + count);
				count = 1;
				element = i;
			}else{
				count++;
			}
		}
		System.out.println(element +"\t" + count);
	}

}
