import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import matrix.NormalMatrix;
import sample.Controller;

import java.net.URL;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        URL xmlUrl = getClass().getResource("/sample/sample.fxml");
        loader.setLocation(xmlUrl);
        Parent root = loader.load();

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        Application.launch(args);
    }
}

/*

        System.out.println(nMatrix.demonstrate(true));

        primaryStage.setTitle("Hello world Application");
        primaryStage.setWidth(300);
        primaryStage.setHeight(200);
        //System.out.println(new NormalMatrix(5, 5).demonstrate(true));

        //Label helloWorldLabel = new Label();
        //helloWorldLabel.setAlignment(Pos.CENTER_RIGHT);
        //TextArea textArea = new TextArea(new NormalMatrix(30, 20).demonstrate(true));

        TextField border = new TextField(nMatrix.demonstrate(true));
        Scene primaryScene = new Scene(border);
        primaryStage.setScene(primaryScene);*/