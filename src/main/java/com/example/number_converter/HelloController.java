package com.example.number_converter;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    private Parent root;
    private Stage stage;
    private Scene scene;

    @FXML
    private TextField input1;

    @FXML
    private TextField ans1;

    @FXML
    private TextField input2;

    @FXML
    private TextField ans2;

    @FXML
    private TextField input3;

    @FXML
    private  TextField ans3;

    @FXML
    void onConvert1ButtonClick(ActionEvent event) {
        int n1 = Integer.parseInt(input1.getText());

        ans1.setText(Integer.toBinaryString(n1));

    }

    @FXML
    void onConvert2ButtonClick(ActionEvent event) {

        int n2 = Integer.parseInt(input2.getText());

        ans2.setText(Integer.toOctalString(n2));
    }
    @FXML
    void onConvert3ButtonClick(ActionEvent event) {

        int n3 = Integer.parseInt(input3.getText());

        ans3.setText(Integer.toHexString(n3));
    }


    public void goToScene1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("dtobinary.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void goToScene2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("dtoOct.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void goToScene3(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("dtohex.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void onHomeButtonClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("home.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
