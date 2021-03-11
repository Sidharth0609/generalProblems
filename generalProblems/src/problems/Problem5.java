package problems;

public class Problem5 {

	public static void main(String[] args) {
		 
	        int a =10;
	        int b=20;
	        a ^= b; 
	        b ^= a; 
	        a ^= b;  
	        System.out.println(a + "  and  "+ b);
	}

}
