
public class Test{
	public static void main(String []args) {
		boolean running = true;
		     int current_time_minute = 0;
			 int dist_time = (int)current_time_minute + 1;
		  while(running){
			 System.out.println("current_time_minute : " + (System.nanoTime()/1000000000) / 60);
			try{
			 Thread.sleep(1000);
			 System.out.println("Loading....");
			 if (current_time_minute == dist_time){
				 System.out.println("Succes");
				 running = false;
			 current_time_minute = (int)(System.nanoTime()/1000000000) / 60; 
			 }
		    }catch(InterruptedException e){
				
			}
		} 
		
	}
}