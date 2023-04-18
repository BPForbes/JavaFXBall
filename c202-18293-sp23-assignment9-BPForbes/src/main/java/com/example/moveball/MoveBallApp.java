package com.example.MoveBall;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class moveballApp extends Application {
    public static Circle circle = new Circle(30);
    public static double height;
    public static double width;
    
    public void start(Stage stage) {
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);

        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);

        Button btUp = new Button("Up");

        hBox.getChildren().add(btUp);

        UpBtHandler handlerU = new UpBtHandler();

        btUp.setOnAction(handlerU);

        BorderPane borderPane = new BorderPane();
        borderPane.getChildren().add(circle);
        borderPane.setBottom(hBox);
        BorderPane.setAlignment(hBox, Pos.CENTER);
        stage.setHeight(400);
        stage.setWidth(650);
        stage.setResizable(false);
        height = stage.getHeight();
        width = stage.getWidth();
        circle.setLayoutY(stage.getHeight()/2);
        circle.setLayoutX(stage.getWidth()/2);

        Scene scene = new Scene(borderPane, 320, 240);
        stage.setTitle("{Name Here}");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main method is only needed for the IDE with limited
     * JavaFX support. Not needed for running from the command line.
     */
    public static void main(String[] args) {
        launch(args);
    }
}






