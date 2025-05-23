package ca.ucalagry.luis.hernandez1.calc;

import ca.ucalagry.luis.hernandez1.calc.objects.characters;
import ca.ucalagry.luis.hernandez1.calc.objects.operations;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;

public class guiController {

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
    private Button percent;

    @FXML
    private Button plus;

    @FXML
    private Button plusOrMinus;

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

    @FXML
    void clear(ActionEvent event) {

    }

    @FXML
    void delete(ActionEvent event) {

    }

    @FXML
    void display(MouseEvent event) {
    }

    @FXML
    void divide(ActionEvent event) {
        String divide = "÷";
        operations operation = new operations(divide);
        operations.add(operation);

    }

    @FXML
    void dot(ActionEvent event) {
        String dot = ".";
        characters character = new characters(dot);
        characters.add(character);
    }

    @FXML
    void eight(ActionEvent event) {
        String eight = "8";
        characters character = new characters(eight);
        characters.add(character);
        display.appendText(eight);
    }

    @FXML
    void equals(ActionEvent event) {

    }

    @FXML
    void five(ActionEvent event) {
        String five = "5";
        characters character = new characters(five);
        characters.add(character);
        display.appendText(five);
    }

    @FXML
    void four(ActionEvent event) {
        String four = "4";
        characters character = new characters(four);
        characters.add(character);
        display.appendText(four);
    }

    @FXML
    void left(ActionEvent event) {

    }

    @FXML
    void minus(ActionEvent event) {
        String minus = "-";
        operations operation = new operations(minus);
        operations.add(operation);

    }

    @FXML
    void multiply(ActionEvent event) {
        String multiply = "*";
        operations operation = new operations(multiply);
        operations.add(operation);

    }

    @FXML
    void nine(ActionEvent event) {
        String nine = "9";
        characters character = new characters(nine);
        characters.add(character);
        display.appendText(nine);

    }

    @FXML
    void off(ActionEvent event) {

    }

    @FXML
    void one(ActionEvent event) {
        String one = "1";
        characters character = new characters(one);
        characters.add(character);
        display.appendText(one);
    }


    @FXML
    void percent(ActionEvent event) {
        String percent = "%";
        operations operation = new operations(percent);
        operations.add(operation);

    }

    @FXML
    void plus(ActionEvent event) {
        String plus = "+";
        operations operation = new operations(plus);
        operations.add(operation);

    }

    @FXML
    void plusOrMinus(ActionEvent event) {

    }

    @FXML
    void right(ActionEvent event) {

    }

    @FXML
    void seven(ActionEvent event) {
        String seven = "7";
        characters character = new characters(seven);
        characters.add(character);
        display.appendText(seven);

    }

    @FXML
    void six(ActionEvent event) {
        String six = "6";
        characters character = new characters(six);
        characters.add(character);
        display.appendText(six);
    }

    @FXML
    void three(ActionEvent event) {
        String three = "3";
        characters character = new characters(three);
        characters.add(character);
        display.appendText(three);
    }

    @FXML
    void two(ActionEvent event) {
        String two = "2";
        characters character = new characters(two);
        characters.add(character);
        display.appendText(two);
    }

    @FXML
    void zero(ActionEvent event) {
        String zero = "0";
        characters character = new characters(zero);
        characters.add(character);
        display.appendText(zero);
    }

}
