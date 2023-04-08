package misc;


public class main_misc2 {
	
	//private static HashMap<Integer,Integer> cache = new HashMap<>();
	public static void main(String[] args) {
		// 
		int[][]s = {{4,8,2},{4,5,7},{6,1,6}};
		System.out.println(min_cost(s));
	
	
	}
	
		
	
	
	
	private static int mod(int a) {
		if(a < 0) {
			return -a;
		}
		return a;
	}
	private static int min_cost(int[][]s) {
		//the magic constant is 15
		int sum = 0;
		int a = s[0][0] + s[1][1] + s[2][2];
		sum += mod(15-a);
		int b = s[0][2] + s[1][1] + s[2][0];
		sum += mod(15-b);
		int c = s[1][0] + s[1][1] + s[1][2];
		sum += mod(15-c);
		int d = s[0][1] + s[1][1] + s[2][1];
		sum += mod(15-d);
		
		return sum;
	}
	
	
	
	
	
	}
	
	
