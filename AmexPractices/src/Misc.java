import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Misc {

	public Misc() {
		// TODO Auto-generated constructor stub
	}

	private static void generateRandom() {
		// TODO Auto-generated method stub

		Random rand = new Random();
		int pickedNumber = 0;
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i = 1; i <= 10; i++) {
			pickedNumber = rand.nextInt(40) + 1;
			set.add(pickedNumber);
			System.out.println(pickedNumber);
		}
		// Method-1
		System.out.println("HashSet elements before sorting: " + set);
		// Method-2
		// elements before Sorting
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println("HashSet Iterator elements Before Sorting" + itr.next());

		}

		// Method 1: Sorting HashSet using List interface
		List<Integer> fruitList = new ArrayList<Integer>(set);
		Collections.sort(fruitList);

		// Displaying list
		System.out.println("HashSet elements after LIST sorting: " + fruitList);

		// Method 2: Sorting using TreeSet
		TreeSet<Integer> tset = new TreeSet<Integer>(set);

		System.out.println("HashSet elements after using TreeSet: " + tset);
		
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();  
		for(Integer val: fruitList) {
			hm.put(val, val);
		}
		
		System.out.println("HashMap elements after using Map: " + hm);
		Map<Integer,Integer> tMap = new TreeMap<>(hm);
		Set set2 = tMap.entrySet();
		Iterator iter2 = set2.iterator();
		while(iter2.hasNext()) {
			 Map.Entry me2 = (Map.Entry)iter2.next();
             System.out.print(me2.getKey() + ": ");
             System.out.println(me2.getValue());
			
			
			
			
			
		}
		System.out.println("Sorting HashMap elements after using Map: " + tMap);
		
		
	

	}

	public static void main(String args[]) {

		generateRandom();

	}
}
