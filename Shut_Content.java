
import com.jfoenix.controls.JFXButton;
import javafx.scene.control.TextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

/**
 *
 * @author Abdelrazek
 */
public class Shut_Content implements Initializable {
    

     // Variables
    private Stage Data_Emails;
    @FXML
    private JFXButton run;
    
    @FXML
    private JFXButton abort;
    
	@FXML 
	private TextField btn_time ;
	
	private String shutdownCommand="";
	private String value_text = "";
	boolean runnig = true;
	
	
// Functions 
    // this function used to initialize my variables
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }
	// Check ValidationEvent
    public void vlidation_text(MouseEvent event){
	  value_text =  btn_time.getText();
	  if (!value_text.matches("[1-9]+")) {
        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle("Warning!!");
        alert.setHeaderText("There's Error..");
        alert.setContentText("Insert only Number between 1 to 9");
        alert.showAndWait();
        }
    }
	
	// abort 
	public void abort(MouseEvent event){
		System.exit(0);
	}
	//sleep 
	public void sleep_(MouseEvent event){
		int number_ = Integer.parseInt(value_text);
		while(runnig){
		try{ System.out.println("Is Sleeping..."); Thread.sleep(number_ * 60000); }catch(InterruptedException e){}
		hibernate();
		}
	}
	
	// Hibernate 
	public void hibernate(){
		// Local Variables
		String operatingSystem = System.getProperty("os.name");
		
		if (operatingSystem.startsWith("Windows"))
        {
            shutdownCommand = "shutdown.exe -h"; // For h only
        }else
        {
           
        }
		try{
	    Runtime.getRuntime().exec(shutdownCommand);
        System.exit(0);
		}catch (IOException e){
			throw new RuntimeException("Unsupported operating system.");
		}
	}
   
}