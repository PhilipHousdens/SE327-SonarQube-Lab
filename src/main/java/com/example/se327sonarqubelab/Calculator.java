package com.example.se327sonarqubelab;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Calculator {
    public int add(int a, int b) {
    return a + b;
    }
    public int subtract(int a, int b) {
       return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }

     public double divide(int a, int b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
            }
        return (double) a / b;
    }
}