package ca.ucalagry.luis.hernandez1.calc;

import ca.ucalagry.luis.hernandez1.calc.objects.characters;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

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
    }

    @FXML
    void equals(ActionEvent event) {

    }

    @FXML
    void five(ActionEvent event) {
        String five = "5";
        characters character = new characters(five);
        characters.add(character);
    }

    @FXML
    void four(ActionEvent event) {
        String four = "4";
        characters character = new characters(four);
        characters.add(character);
    }

    @FXML
    void left(ActionEvent event) {

    }

    @FXML
    void minus(ActionEvent event) {

    }

    @FXML
    void multiply(ActionEvent event) {

    }

    @FXML
    void nine(ActionEvent event) {
        String nine = "9";
        characters character = new characters(nine);
        characters.add(character);

    }

    @FXML
    void off(ActionEvent event) {

    }

    @FXML
    void one(ActionEvent event) {
        String one = "1";
        characters character = new characters(one);
        characters.add(character);
    }


    @FXML
    void percent(ActionEvent event) {

    }

    @FXML
    void plus(ActionEvent event) {

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

    }

    @FXML
    void six(ActionEvent event) {
        String six = "6";
        characters character = new characters(six);
        characters.add(character);
    }

    @FXML
    void three(ActionEvent event) {
        String three = "3";
        characters character = new characters(three);
        characters.add(character);
    }

    @FXML
    void two(ActionEvent event) {
        String two = "2";
        characters character = new characters(two);
        characters.add(character);
    }

    @FXML
    void zero(ActionEvent event) {
        String zero = "0";
        characters character = new characters(zero);
        characters.add(character);
    }

}
