package hakouyoutubedownload;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXColorPicker;
import java.io.IOException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.net.URL;

public class HYDController implements Initializable {
    @FXML
    private JFXColorPicker color;
    @FXML
    private AnchorPane ap;
    @FXML
    private JFXButton btnclose;
    @FXML
    private JFXButton btnstart;  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
               
       btnclose.setOnAction(e ->{
           Platform.exit();
       });
       color.setOnAction(e ->{
           Color selected = color.getValue();
        ap.setBackground(new Background(new BackgroundFill(selected, CornerRadii.EMPTY, Insets.EMPTY)));
       });
       
       btnstart.setOnAction((ActionEvent e) ->{
           Stage stage = (Stage)color.getScene().getWindow();
           Parent root=null;
           try {
               root = FXMLLoader.load(getClass().getResource("page2.fxml"));
               stage.setScene(new Scene(root));
        } catch (IOException ex) {
               Logger.getLogger(HYDController.class.getName()).log(Level.SEVERE, null, ex);
           }
       
       });
    }    
     
     
    
}
