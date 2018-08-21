 
import java.util.Timer;
import java.util.TimerTask;
 
class Helper extends TimerTask
{
	public static i = 0;
    public void run()
    {
	System.out.println("Window Hibernate..." + ++i );
    }
	}
}
 
