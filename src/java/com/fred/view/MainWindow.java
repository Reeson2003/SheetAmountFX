package com.fred.view;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

import static javafx.scene.paint.Color.TRANSPARENT;

/**
 * Created by nimtego_loc on 21.08.2017.
 */
public class MainWindow extends Application {
    private double xOffset;
    private double yOffset;
    private Stage primaryStage;
    private BorderPane rootLayout;
    private String fxml = "Main_window.fxml";

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("AddressApp");
        this.primaryStage.initStyle(StageStyle.TRANSPARENT);
        initRootLayout();
    //    showPersonOverview();
    }


    public void initRootLayout() {
        try {
            // Загружаем корневой макет из fxml файла.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainWindow.class.getResource(fxml));
            Parent root = loader.load();
            ((MainWindowController) loader.getController()).setWindowOwner(this);
          //  ResourceBundle.getBundle("Text.properties");
            Scene scene = new Scene(root);

            movementWindowWithoutFrame(scene);
            scene.setFill(TRANSPARENT);

            primaryStage.setScene(scene);
            /*primaryStage.getScene().getStylesheets().add("DarkTheme.css");*/
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showPersonOverview() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainWindow.class.getResource("Sheet_window.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public Stage getPrimaryStage() {
        return primaryStage;
    }
    private void movementWindowWithoutFrame(Scene scene) {
        scene.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = primaryStage.getX() - event.getScreenX();
                yOffset = primaryStage.getY() - event.getScreenY();
            }
        });
        scene.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                primaryStage.setX(event.getScreenX() + xOffset);
                primaryStage.setY(event.getScreenY() + yOffset);
            }
        });
    }

    public static void run() {
        launch();
    }
}
