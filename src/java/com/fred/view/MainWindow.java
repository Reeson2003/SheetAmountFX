package com.fred.view;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

import static com.fred.view.fxml.ReferenceFXML.MAIN_WINDOW;
import static javafx.scene.paint.Color.TRANSPARENT;

/**
 * Created by nimtego_loc on 21.08.2017.
 */
public class MainWindow extends Application {
    private double xOffset;
    private double yOffset;
    private Stage primaryStage;
    private AnchorPane anchorPane;


    public static void run() {
        launch();
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.initStyle(StageStyle.TRANSPARENT);
        initRootLayout();
    //    showPersonOverview();
    }


    private void initRootLayout() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainWindow.class.getResource(MAIN_WINDOW));
            anchorPane = (AnchorPane) loader.load();
            ((MainWindowController) loader.getController()).setWindowOwner(this);
            Scene scene = new Scene(anchorPane);

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


    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public AnchorPane getAnchorPane() {
        return anchorPane;
    }

    public void setAnchorPane(AnchorPane anchorPane) {
        this.anchorPane = anchorPane;
    }
}
