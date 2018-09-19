package hakouyoutubedownload;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

/**
 *
 * @author hakou
 */
public class Hakouyoutubedownload extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("HYD.fxml"));
        FadeTransition ft =new FadeTransition();
               ft.setDuration(Duration.millis(5000));
               ft.setNode(root);
               ft.setFromValue(0);
               ft.setToValue(1);
               ft.play();
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
