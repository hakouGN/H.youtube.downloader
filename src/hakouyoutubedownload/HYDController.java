package hakouyoutubedownload;

import animatefx.animation.Bounce;
import animatefx.animation.BounceIn;
import animatefx.animation.BounceInUp;
import animatefx.animation.BounceOut;
import animatefx.animation.FadeInDown;
import animatefx.animation.FadeInLeft;
import animatefx.animation.FlipInX;
import animatefx.animation.RotateIn;
import animatefx.animation.Shake;
import animatefx.animation.SlideInUp;
import animatefx.animation.SlideOutRight;
import animatefx.animation.Swing;
import animatefx.animation.Tada;
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
import javafx.scene.image.ImageView;
import javafx.util.Duration;


public class HYDController implements Initializable {
    @FXML
    private JFXColorPicker color;
    @FXML
    private AnchorPane ap;
    @FXML
    private JFXButton btnclose;
    @FXML
    private JFXButton btnstart;
    @FXML
    private ImageView img;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //animation to btn start and color picker 
        btnstart.setOnMouseEntered(e ->{
                new Tada(btnstart).setSpeed(0.8).play();
        });
        color.setOnMouseEntered(e ->{
                new Tada(color).setSpeed(0.8).play();
        });
        
       color.setOnAction(e ->{
                           //new SlideOutRight(root).setSpeed(0.8).play();   
           Color selected = color.getValue();
        ap.setBackground(new Background(new BackgroundFill(selected, CornerRadii.EMPTY, Insets.EMPTY)) );
       });
       
       btnstart.setOnAction((ActionEvent e) ->{
           Stage stage = (Stage)color.getScene().getWindow();
           Parent root=null;
           try {
               root = FXMLLoader.load(getClass().getResource("page2.fxml"));
               stage.setScene(new Scene(root));
               stage.setX(383);//
                stage.setY(134);//134 
                new Shake(root).setSpeed(0.4).play();
        } catch (IOException ex) {
               Logger.getLogger(HYDController.class.getName()).log(Level.SEVERE, null, ex);
           }
       
       });
       btnclose.setOnAction(e ->{
           Platform.exit();

       });
    }    
     
     
    
}
