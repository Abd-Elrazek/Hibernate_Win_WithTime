import java.io.IOException;

public class Shutdown{
        public static String shutdownCommand="";
	  public static void main(String []args) throws IOException
    {
        String operatingSystem = System.getProperty("os.name");
		
	if (operatingSystem.startsWith("Windows"))
        {
            shutdownCommand = "shutdown.exe -h"; // This code for s and a and sleep only not h 
        }
        else
        {
            //throw new RuntimeException("Unsupported operating system.");
        }
        Runtime.getRuntime().exec(shutdownCommand);
        System.exit(0);
    }
}

