package com.fred.view;

import com.fred.entity.UserController;
import com.fred.exception.ErrorMessageException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.StageStyle;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by nimtego_loc on 24.08.2017.
 */
public class MainWindowController {
    public Button singUp;
    public AnchorPane leftBar;
    public AnchorPane emptyRightPanel;
    public Button logIn;
    public AnchorPane rightBarSheetAmount;
    public PasswordField fieldPassword;
    public TextField fieldLogIn;
    public Label labelMain;
    public Button buttonCurrent;
    public Button buttonLighting;
    private Map<String, AnchorPane> paneMap;
    public Button buttonSheetAmount;
    public AnchorPane mainAnchorPane;
    private MainWindow owner;
    private Color color = Color.SKYBLUE;


    public MainWindowController() {
        this.paneMap = new HashMap<>();
    }

    @FXML
    private void initialize() {
/*        fieldLogIn.setText("Enter");
        fieldPassword.setText("Enter");*/
        fieldLogIn.setStyle("-fx-control-inner-background: #3D4956");
        fieldPassword.setStyle("-fx-control-inner-background: #3D4956");
    }

    public void setWindowOwner(MainWindow owner) {
        this.owner = owner;
    }

    public void action(ActionEvent actionEvent) {

        if (singUp.isArmed()) {
            String logIn = fieldLogIn.getText();
            String password = fieldPassword.getText();
            try {
                if (UserController.singUpUser(logIn, password)) {
                    labelMain.setText(logIn);
                    setLoginFormVisible(false);
                    moveMenu(true);
                }

            } catch (ErrorMessageException e) {
                alert(e.getMessage());
            }

        }
        if (logIn.isArmed()) {
            String logIn = fieldLogIn.getText();
            String password = fieldPassword.getText();
            try {
                if (UserController.logInUser(logIn, password) != null) {
                    labelMain.setText(logIn);
                    setLoginFormVisible(false);
                    moveMenu(true);
                }
                else
                    alert("Log in or password is wrong");
            } catch (ErrorMessageException e) {
                alert(e.getMessage());
            }

        }
            /*owner.getPrimaryStage().close();*/


        if (buttonSheetAmount.isArmed()) {
            if (emptyRightPanel.isVisible()) {
                emptyRightPanel.setVisible(false);
                rightBarSheetAmount.setVisible(true);
            } else {
                emptyRightPanel.setVisible(true);
                rightBarSheetAmount.setVisible(false);
            }
        }
    }

    private void moveMenu(boolean up) {
        if (up) {
            buttonCurrent.setLayoutY(buttonCurrent.getLayoutY() - 100.0);
            buttonLighting.setLayoutY(buttonLighting.getLayoutY() - 100.0);
            buttonSheetAmount.setLayoutY(buttonSheetAmount.getLayoutY() - 100.0);

        }
        else {
            buttonCurrent.setLayoutY(buttonCurrent.getLayoutY() + 100.0);
            buttonLighting.setLayoutY(buttonLighting.getLayoutY() + 100.0);
            buttonSheetAmount.setLayoutY(buttonSheetAmount.getLayoutY() + 100.0);
        }
    }
    private void setLoginFormVisible(boolean flag) {
        singUp.setVisible(flag);
        logIn.setVisible(flag);
        fieldPassword.setVisible(flag);
        fieldLogIn.setVisible(flag);
    }

    private void alert(String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.initStyle(StageStyle.TRANSPARENT);
        alert.setTitle("Attention");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public void mouseMoved(MouseEvent mouseEvent) {
        if (mouseEvent.getSource() instanceof Button)
            ((Button) mouseEvent.getSource()).setTextFill(Color.SKYBLUE);
        if (mouseEvent.getSource() instanceof Label)
            ((Label) mouseEvent.getSource()).setTextFill(Color.SKYBLUE);
    }

    public void mouseReMoved(MouseEvent mouseEvent) {
        if (mouseEvent.getSource() instanceof Button)
            ((Button) mouseEvent.getSource()).setTextFill(Color.BLACK);
        if (mouseEvent.getSource() instanceof Label)
            ((Label) mouseEvent.getSource()).setTextFill(color);
    }

    public void actionLabel(MouseEvent mouseEvent) {
        if (mouseEvent.getSource() instanceof Label) {
            Parent parent = ((Label) mouseEvent.getSource()).getParent();
            Random random = new Random();
            int r, g, b;
            r = random.nextInt(255);
            g = random.nextInt(255);
            b = random.nextInt(255);
            if (parent.getId().equals("leftBar")) {
                System.out.println(parent.getId().equals("leftBar"));
                parent.getScene().setFill(Color.rgb(r, g, b));
            }
            color = Color.rgb(r, g, b);
        }
    }
}