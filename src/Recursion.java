
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Homework2 problem 3 and 4.
 * @author Thanaphon Keawjam
 */
public class Recursion {
	
	/**    
	 * Remove duplicate consecutive items from a list, changing the list parameter.  
	 * For example, if list = { a, b, b, b, c, b, c, c} then after calling unique the list  
	 * will contain {a, b, c, b, c}.  Only consecutive duplicates are removed.  
	 * Objects are compared using their own equals method.  
	 * @param list of any kind of object.  The elements are not null. 
	 * @return reference to the list parameter with consecutive duplicates removed.
	 */
	public static List<?> unique(List<?> list){
		if(list.size() < 2) return list;
		if(list.get(0).equals(list.get(1))) {
			list.remove(0);
			return unique(list);
		}
		else return unique(list.subList(1, list.size()));
	}
	
	/**
	 * Compute fibonacci number.
	 * @param n is number to find fibonacci number.
	 * @return values of fibonacci number
	 */
	public static long fibonacci(int n) {
		if(n < 2) return 1;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	/**
	 * Compute fibonacci number.
	 * @param n is number to find fibonacci number.
	 * @return values of fibonacci number.
	 */
	public static long fibonacci2(int n) {
		return helper(n, 0, 1);
	
	}
	
	/**
	 * This method uses for help find fibonacci number.
	 * Start with f(0) = 1, f(1) = 1.
	 * @param n is number to find fibonacci number.
	 * @param previous is previous vale and start with 0.
	 * @param current is current vale and start with 1.
	 * @return values of fibonacci number.
	 */
	public static long helper(int n, long previous, long current) {
		if(n == 0) return previous;
		else return helper(n - 1, current, previous + current);
	} 
	
	public static void main(String[] args) {
	/*	List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(30);
		list.add(30);
		unique(list);
		System.out.println(list); */
		
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("b");
		list.add("c");
		list.add("c");
		unique(list);
		System.out.println(Arrays.toString(list.toArray()));
		System.out.println();
		
		int n = 48;
		for(int i = 0; i <= n; i++) {
			System.out.println((i) + " = " + fibonacci2(i));
		} 
		
	}

}
