
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
import javafx.scene.control.Label;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.application.Platform;
import javafx.scene.paint.Color;

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
	@FXML 
	private Label  label_time;
	private String shutdownCommand="";
	private String value_text = "";
	boolean runnig = true;
	private int number_ = 0;
	
	
// Functions 
    // this function used to initialize my variables
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }
	public void alert_msg(){
		Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle("Warning!!");
        alert.setHeaderText("There's Error..");
        alert.setContentText("Insert only Number between 1 to 9");
        alert.showAndWait();
	}
	
	
	
	// abort 
	public void abort(MouseEvent event){
		System.exit(0);
	}
	//sleep 
	public void sleep_(MouseEvent event){
		number_ = 0;
		value_text =  btn_time.getText();
        if (!value_text.matches("[1-9]+0?")) {
        alert_msg();
        }else{
		label_time.setText(value_text);
			new Thread() {
				public void run() {
					number_ = Integer.parseInt(value_text);
					try{
						for(int i = 1; i <= number_ * 8; i++){
							Thread.sleep(60000); 
							number_ -= 1;
							Platform.runLater(new Runnable(){
								@Override public void run() {
									label_time.setText(""+ number_);
									 if (number_ < 10){
									    label_time.setTextFill(Color.web("#FF0000"));
										Alert alert = new Alert(AlertType.INFORMATION);
										alert.setTitle("Warning!!");
										alert.setContentText("The Time remaining : "+ number_ + " Minute.");
										alert.show();
									} 
								}
							});
						}
			            hibernate();
					}catch(InterruptedException e){}
				}
	   
		    }.start();
	    }
	}
	
	// Hibernate 
	public void hibernate(){
		// Local Variables
		String operatingSystem = System.getProperty("os.name");
		System.out.println("The Computer is hibernate now...");
		if (operatingSystem.startsWith("Windows"))
        {
            shutdownCommand = "shutdown.exe -h"; // For h only
        }
		try{
	    Runtime.getRuntime().exec(shutdownCommand);
        System.exit(0);
		}catch (IOException e){
			throw new RuntimeException("Unsupported operating system.");
		}
	}
   
}