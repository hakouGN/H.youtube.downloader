
package hakouyoutubedownload;

import animatefx.animation.BounceIn;
import animatefx.animation.FadeInDown;
import animatefx.animation.FadeOut;
import animatefx.animation.Tada;
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

public class Page2Controller implements Initializable {
    //declare componants
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

    // end declaration of componants    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //set animation to button 
        btndownload.setOnMouseEntered(e ->{
                new Tada(btndownload).setSpeed(0.8).play();
        });
        btnsave.setOnMouseEntered(e ->{
                new Tada(btnsave).setSpeed(0.8).play();
        });
        btnreturn.setOnMouseEntered(e ->{
                new Tada(btnreturn).setSpeed(0.8).play();
        });
        //return to scane 1
        btnreturn.setOnAction( (ActionEvent e) ->{
            Stage stage = (Stage)anchor.getScene().getWindow();
            try {
                Parent root =  FXMLLoader.load(getClass().getResource("HYD.fxml"));
                stage.setScene(new Scene(root));
                stage.setX(483);//383
               stage.setY(234);//134
               //set animation to return page 1
                new BounceIn(root).setSpeed(0.4).play();

               
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
