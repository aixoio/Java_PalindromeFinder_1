
public class Main {
	
	public static long currentNum;
	public static long times;

	public static void main(String[] args) {
		
		Main.currentNum = 98L;
		Main.times = 0L;
		
		
		Thread thread = new Thread(new Threads.Thread1());
		
		thread.setDaemon(false);
		thread.start();
		
		

	}
	
	
	public static String reverse(String str) {
		
		String res = "";
		
		
		for (int i = (int) (str.length() - 1); i >= 0; i--) {
			
			res += String.valueOf(str.charAt(i));
			
		}
		
		
		return res;
		
	}
	

}
