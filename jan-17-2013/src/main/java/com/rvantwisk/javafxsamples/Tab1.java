package com.rvantwisk.javafxsamples;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by rvt on 1/17/14.
 */
public class Tab1 extends AnchorPane {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btClickMe;

    @FXML
    private Label lbText;

    public Tab1() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Tab1.fxml"));
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
        assert btClickMe != null : "fx:id=\"btClickMe\" was not injected: check your FXML file 'Tab1.fxml'.";
        assert lbText != null : "fx:id=\"lbText\" was not injected: check your FXML file 'Tab1.fxml'.";


    }

    public Button getBtClickMe() {
        return btClickMe;
    }

    public Label getLbText() {
        return lbText;
    }
}
