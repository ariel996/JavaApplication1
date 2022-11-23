/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

/**
 *
 * @author ariel
 */
public class JavaApplication1 extends Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    Button btn;
     @Override
    public void start(Stage primaryStage) {
     // Create the button   
         btn = new Button();
         btn.setText("Click me please");
         btn.setOnAction(e -> buttonClick());
         
         // Add the button to a layout pane
         BorderPane pane = new BorderPane();
         pane.setCenter(btn);
         
         // Add the layout pane to a scene
         Scene scene = new Scene(pane, 300, 250);
         
         // Finalize and show the stage
         primaryStage.setScene(scene);
         primaryStage.setTitle("The Click Me App");
         primaryStage.show();
    }
    
    public void buttonClick()
    {
        if (btn.getText() == "Click me please!")
        {
            btn.setText("You clicked me!");
        } else {
            btn.setText("Click me please!");
        }
    }
    
}
