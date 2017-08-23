package com.fred.view;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

/**
 * Created by nimtego_loc on 24.08.2017.
 */
public class MainWindowController {
    public Button singUp;
    public AnchorPane leftBar;
    public AnchorPane emptyRightPanel;
    public Button logIn;
    public AnchorPane rightBarSheetAmount;

    public void action(ActionEvent actionEvent) {
            if (singUp.isArmed()) {
                emptyRightPanel.setVisible(false);
                rightBarSheetAmount.setVisible(true);
            }
            if (logIn.isArmed()) {
                emptyRightPanel.setVisible(true);
                rightBarSheetAmount.setVisible(false);
            }
        }
}
