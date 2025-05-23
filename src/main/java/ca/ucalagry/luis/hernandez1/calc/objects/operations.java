package ca.ucalagry.luis.hernandez1.calc.objects;

import java.util.ArrayList;

public class operations {

    public static ArrayList<String> operations = new ArrayList<String>();
    private final String operation;


    public operations(String operation) {
        this.operation = operation;
    }

    public static void add(operations operation) {
        operations.add(operation.operation);
    }

    public static ArrayList<String> getOperations() {
        return operations;
    }

    public static void clearArrayList() {
        operations.clear();
    }

    public static void removeLastOperation() {
        if (!operations.isEmpty()) {operations.removeLast();}
    }
}
