
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXScrollPane;
// import com.jfoenix.controls.JFXTextField;
import javafx.scene.control.TextField;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.OverrunStyle;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;
import javafx.util.Duration;
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
	

    // this function used to initialize my variables
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    } // end Function initialize 
    
    // function to show Data Emails
    public void vlidation_text(MouseEvent event){
	  String value_text =  btn_time.getText();
	  if (!value_text.matches("[1-9]+")) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Warning!!");
        alert.setHeaderText("There's Error..");
        alert.setContentText("Insert only Number between 1 to 9");
        alert.showAndWait();
        }
    }
   
}