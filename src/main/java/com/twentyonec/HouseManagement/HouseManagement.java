/*
 * Cheran (21C)
 * 
 * Copyright (c) 2024 21C, Inc. All Rights Reserved.
 */
package com.twentyonec.HouseManagement;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Program main class
 * 
 * @version 0.0.1 14 June 2024
 * @author Cheran (21C)
 */
public class HouseManagement extends Application {
	
	 @Override
	    public void start(Stage primaryStage) {
	        primaryStage.setTitle("Hotel House Manager");

	        // Example UI Components
	        Button btn1 = new Button("Manage Finances");
	        Button btn2 = new Button("Manage Bookings");

	        VBox vBox = new VBox(btn1, btn2);
	        Scene scene = new Scene(vBox, 300, 200);

	        primaryStage.setScene(scene);
	        primaryStage.show();
	    }

	    public static void main(String[] args) {
	        launch(args);
	    }

}
