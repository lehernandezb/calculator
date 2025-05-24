package ca.ucalagry.luis.hernandez1.calc;

import ca.ucalagry.luis.hernandez1.calc.objects.characters;
import ca.ucalagry.luis.hernandez1.calc.objects.operations;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class guiController {

    characters tempCharacter;
    operations tempOperation;
    Boolean characterSelected = null;
    Boolean positive = true;

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

    private void addCharacter(String variable) {
        characters character = new characters(variable);
        tempCharacter = character;
        characters.add(character);
        display.appendText(variable);
        characterSelected = true;
    }

    public void addOperation(String variable) {
        operations operation = new operations(variable);
        tempOperation = operation;
        operations.add(operation);
        display.appendText(variable);
        characterSelected = false;

    }

    @FXML
    void clear(ActionEvent event) {
        display.clear();
        characters.clearArrayList();
        operations.clearArrayList();
    }

    @FXML
    void delete(ActionEvent event) {
        if (characterSelected) {
            characters.removeLastCharacter();
            String text = display.getText();
            int length = text.length();
            if (length > 0) {
                display.deleteText(length - 1, length);
            }
        } else {
            operations.removeLastOperation();
            String text = display.getText();
            int length = text.length();
            if (length > 0) {
                display.deleteText(length - 1, length);
            }
        }
    }

    @FXML
    void display(MouseEvent event) {
    }

    @FXML
    void divide(ActionEvent event) {
        addCharacter("÷");
    }

    @FXML
    void dot(ActionEvent event) {
        addCharacter(".");
    }

    @FXML
    void eight(ActionEvent event) {
        addCharacter("8");
    }

    @FXML
    void equals(ActionEvent event) {

    }

    @FXML
    void five(ActionEvent event) {
        addCharacter("5");
    }

    @FXML
    void four(ActionEvent event) {
        addCharacter("4");
    }

    @FXML
    void left(ActionEvent event) {
        addCharacter("(");
    }

    @FXML
    void minus(ActionEvent event) {
        addOperation("-");
    }

    @FXML
    void multiply(ActionEvent event) {
        addOperation("x");
    }

    @FXML
    void nine(ActionEvent event) {
        addCharacter("9");

    }

    @FXML
    void off(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void one(ActionEvent event) {
        addCharacter("1");
    }


    @FXML
    void percent(ActionEvent event) {
        addOperation("%");

    }

    @FXML
    void plus(ActionEvent event) {
        addOperation("+");

    }

    @FXML
    void plusOrMinus(ActionEvent event) {
        if (Boolean.TRUE.equals(characters.plusOrMinusCheck(positive))) {
            display.deleteText(0, 1);
            positive = true;
        } else if (Boolean.FALSE.equals(characters.plusOrMinusCheck(positive))) {
            String text = display.getText();
            display.setText("-" + text);
            positive = false;
        }
    }

    @FXML
    void right(ActionEvent event) {
        addCharacter(")");
    }

    @FXML
    void seven(ActionEvent event) {
        addCharacter("7");

    }

    @FXML
    void six(ActionEvent event) {
        addCharacter("6");
    }

    @FXML
    void three(ActionEvent event) {
        addCharacter("3");
    }

    @FXML
    void two(ActionEvent event) {
        addCharacter("2");
    }

    @FXML
    void zero(ActionEvent event) {
        addCharacter("0");
    }

}
