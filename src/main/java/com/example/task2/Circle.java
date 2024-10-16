package com.example.task2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle implements Shape{
    @Override
    public void draw(GraphicsContext gr){
        gr.setFill(Color.GREEN);
        gr.fillOval(25, 25, 225, 225);
    }

    @Override
    public String descriptor(){
        return "Круг";
    }
}
