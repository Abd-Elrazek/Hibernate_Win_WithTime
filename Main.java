
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.awt.SplashScreen;
import java.awt.Color; 
/**
 *
 * @author Abdelrazek
 */
public class Main extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Shut_Content.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Hibernate Computer");
		stage.initStyle(StageStyle.UNDECORATED);
		stage.toFront();
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
	 
     */
	
	 
   public static void main(String[] args) {
       
        // end condition of Splash Screen
         java.awt.EventQueue.invokeLater(() -> {
             launch(args);
          });
    }
    
}
