package ca.ucalagry.luis.hernandez1.calc;

import ca.ucalagry.luis.hernandez1.calc.objects.Calculator;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class guiController {

    public static ArrayList<Character> sum = new ArrayList<>();
    public boolean results = false;


    @FXML
    private Button clear;

    @FXML
    private Button delete;

    @FXML
    private TextArea display;

    @FXML
    private Button divide;

    @FXML
    private Button dot;

    @FXML
    private Button eight;

    @FXML
    private Button equals;

    @FXML
    private Button five;

    @FXML
    private Button four;

    @FXML
    private Button left;

    @FXML
    private Button minus;

    @FXML
    private Button multiply;

    @FXML
    private Button nine;

    @FXML
    private Button off;

    @FXML
    private Button one;

    @FXML
    private Button R;

    @FXML
    private Button plus;

    @FXML
    private Button L;

    @FXML
    private Button right;

    @FXML
    private Button seven;

    @FXML
    private Button six;

    @FXML
    private Button three;

    @FXML
    private Button two;

    @FXML
    private Button zero;

    public void add(Character text) {
        if (results) {
            display.clear();
            results = false;
        }
        sum.add(text);
        display.appendText(String.valueOf(text));
    }



    @FXML
    void clear(ActionEvent event) {
        display.clear();
    }

    @FXML
    void delete(ActionEvent event) {
        if (!sum.isEmpty()) {
            String text = display.getText();
            display.deleteText(text.length() - 1, text.length());
            sum.removeLast();
        }
    }

    @FXML
    void display(MouseEvent event) {
    }

    @FXML
    void divide(ActionEvent event) {
        add('÷');
    }

    @FXML
    void dot(ActionEvent event) {
        add('.');
    }

    @FXML
    void eight(ActionEvent event) {
        add('8');
    }

    @FXML
    void equals(ActionEvent event) {
        try {

            double result = Calculator.calculate(sum);
            display.setText(String.valueOf(result));
            sum.clear();
            results = true;
        }catch (Exception e) {
            display.setText("Syntax Error!");
            results = true;
        }
    }

    @FXML
    void five(ActionEvent event) {
        add('5');
    }

    @FXML
    void four(ActionEvent event) {
        add('4');
    }

    @FXML
    void left(ActionEvent event) {
        add(')');
    }

    @FXML
    void minus(ActionEvent event) {
        add('-');
    }

    @FXML
    void multiply(ActionEvent event) {
        add('x');
    }

    @FXML
    void nine(ActionEvent event) {
        add('9');
    }

    @FXML
    void off(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void one(ActionEvent event) {
        add('1');
    }


    @FXML
    void R(ActionEvent event) {
    }

    @FXML
    void plus(ActionEvent event) {
        add('+');
    }

    @FXML
    void L(ActionEvent event) {
    }

    @FXML
    void right(ActionEvent event) {
        add('(');
    }

    @FXML
    void seven(ActionEvent event) {
        add('7');
    }

    @FXML
    void six(ActionEvent event) {
        add('6');
    }

    @FXML
    void three(ActionEvent event) {
        add('3');
    }

    @FXML
    void two(ActionEvent event) {
        add('2');
    }

    @FXML
    void zero(ActionEvent event) {
        add('0');
    }

}
