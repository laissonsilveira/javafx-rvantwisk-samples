package com.rvantwisk.javafxsamples;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by rvt on 1/17/14.
 */
public class Tab2 extends AnchorPane {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lbText;

    public Tab2() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Tab2.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    @FXML
    void initialize() {
        assert lbText != null : "fx:id=\"lbText\" was not injected: check your FXML file 'Tab2.fxml'.";


    }

    public Label getLbText() {
        return lbText;
    }

}
