
package hakouyoutubedownload;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXProgressBar;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import java.io.File;
import javafx.animation.FadeTransition;
import javafx.util.Duration;

public class Page2Controller implements Initializable {
       @FXML
       private JFXButton btnreturn;
       
         @FXML
    private AnchorPane anchor;
         @FXML
    private JFXTextField textedit;

    @FXML
    private JFXComboBox<String> quality;

    @FXML
    private JFXButton btndownload;

    @FXML
    private JFXButton btnsave;

    @FXML
    private JFXProgressBar progres;

        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //return to scane 1
       
        btnreturn.setOnAction( (ActionEvent e) ->{
            Stage stage = (Stage)anchor.getScene().getWindow();
            try {
                Parent root =  FXMLLoader.load(getClass().getResource("HYD.fxml"));
                stage.setScene(new Scene(root));
               
            } catch (IOException ex) {
                Logger.getLogger(Page2Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        // save file in path as you wanted 
        btnsave.setOnAction(e -> {
            FileChooser  fc = new FileChooser();
            fc.setTitle("Select Path to save file ");
            fc.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("MP4 ","*.mp4"));
            File file = fc.showSaveDialog(anchor.getScene().getWindow());
            String path = file.getPath();
            System.out.println(path);
        
        
        
        });
    }    
    
}
