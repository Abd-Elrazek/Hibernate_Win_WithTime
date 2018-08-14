
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXScrollPane;
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
/**
 *
 * @author Abdelrazek
 */
public class Shut_Content implements Initializable {
    

     // Variables
    private Stage Data_Emails;
    @FXML
    private JFXButton changeColor;
    
    @FXML
    private JFXButton button2;
    
    private AnchorPane Data_Fxml; 
    
    private int button_index = 1;
    private double layoutX = 284;
    private double layoutY = 0;
                  // functions
    
    // this function used to initialize my variables
    @Override
    public void initialize(URL url, ResourceBundle rb) {
   
        // initialize my data emails in stage and scence and its url 
        Data_Emails = new Stage();
        Data_Emails.setResizable(false);
        Data_Emails.setTitle("Insert or Edit Details");
        try {
            Data_Fxml = FXMLLoader.load(getClass().getResource("Data_Emails.fxml"));
            Data_Emails.setScene(new Scene(Data_Fxml));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("here wrong .....");
        }
        
      
    } // end Function initialize 
    
    // function to show Data Emails
    public void showData_Emails(MouseEvent event){
        Data_Emails.show();
    }
    
   
    @FXML
    public void insert_Button(){
    button2 = new JFXButton();
    button2.setText("button2");
    button2.setStyle("-fx-background-color: red;");

    }
    
}
    /* 
     @FXML
      public void setCursor(){
        button.setStyle("-fx-cursor : url(images/cursor.png) , auto");
    }
    */
   

