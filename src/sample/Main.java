package sample;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

private int width = 1920;
private int height = 1080;
private boolean running = false;
private String title = "Drone Simulation - hb000671 - 27000671";

public void setTop(BorderPane root)
{
        MenuBar menuBar = new MenuBar();

        Menu file = new Menu("File");
        MenuItem exit = new MenuItem("Exit");
        exit.setOnAction(click -> System.exit(0));
        file.getItems().addAll(exit);

        menuBar.getMenus().addAll(file);
        root.setTop(menuBar);
}
    public void setBottom(BorderPane root) {
        HBox buttons = new HBox();

        Button start = new Button("Start Animation");
        start.setOnAction(click -> running = true);

        Button stop = new Button("Stop Animation");
        stop.setOnAction(click -> running = false);

        buttons.getChildren().addAll(start, stop);
        root.setBottom(buttons);
    }
    public void setLeft(BorderPane root) {

    }

    public void setRight(BorderPane root) {

    }

    public void start(Stage primarystage) {
        BorderPane root = new BorderPane();
        setTop(root);
        setBottom(root);
        Scene scene = new Scene(root, width, height - 85);
        primarystage.setScene(scene);
        primarystage.setTitle(title);
        primarystage.show();

        AnimationTimer timer = new AnimationTimer() {
            public void handle(long now) {
                if (running == true) {

                }
            }
        };
        timer.start();
    }
    public static void main(String[] args){
        launch();
    }

}
