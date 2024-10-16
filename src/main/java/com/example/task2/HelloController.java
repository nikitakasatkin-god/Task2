package com.example.task2;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Canvas canvas;
    @FXML
    private TextField textField;

    public void drawShapes(){
        int numberOfSides;
        try{
            numberOfSides = Integer.parseInt(textField.getText());
        }catch (NumberFormatException e){
            System.out.println("Введите праивльное значение");
            return;
        }

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.createShape(numberOfSides);

        if (shape != null){
            GraphicsContext context = canvas.getGraphicsContext2D();
            context.clearRect(0,0, canvas.getWidth(), canvas.getHeight());
            shape.draw(context);

            System.out.println(shape.descriptor());
        }else {
            System.out.println("Такого выбора нет");
        }
    }
}