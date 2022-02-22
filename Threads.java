
public class Threads {

	public static class Thread1 implements Runnable {

		@Override
		public void run() {
			
			do {
				
				
				Main.times++;
				
				long res = (long) (
								
								Main.currentNum + Long.parseLong(Main.reverse(String.valueOf(Main.currentNum)))
						
							);
				
				
				if (
						
						res == Long.parseLong(Main.reverse(String.valueOf(res)))
						
					) {
					System.out.println(
							Main.times + "\t" + res
						);
					
					System.out.println(res);
					System.out.println(Main.reverse(String.valueOf(res)));
					
					System.exit(0);
					
				} else {
					
					Main.currentNum = res;
					
					
					System.out.println(
										Main.times + "\t" + res
									);
										
					
					
					
				}
				
			} while (true);
			
		}

	}

	

}
