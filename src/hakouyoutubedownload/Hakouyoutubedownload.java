package hakouyoutubedownload;

import animatefx.animation.SlideInUp;
import animatefx.animation.ZoomIn;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author hakou
 */
public class Hakouyoutubedownload extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("HYD.fxml"));
        //set animation to the page 1
        //new FadeInDown(root).setSpeed(0.4).play();
        new ZoomIn(root).setSpeed(0.4).play();

        Scene scene = new Scene(root);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.getIcons().add(new Image(Hakouyoutubedownload.class.getResourceAsStream("logo.png")));
        stage.setScene(scene);
        stage.setX(483);//383
        stage.setY(234);//134
        
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
