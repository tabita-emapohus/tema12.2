import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniquePairs {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        
	        Set<String> pairs = new HashSet<>();
	        
	        for (int i = 0; i < n; i++) {
	            String first = scan.next();
	            String second = scan.next();
	            pairs.add(first + " " + second);
	            System.out.println(pairs.size());
	            //System.out.println(pairs); 
	        }
	        
	        scan.close();
	}

}
