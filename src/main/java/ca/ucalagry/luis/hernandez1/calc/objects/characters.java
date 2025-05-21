package ca.ucalagry.luis.hernandez1.calc.objects;

import java.util.ArrayList;

public class characters {

    public String character;
    public static ArrayList<String> characters = new ArrayList<>();

    public characters(String number) {
        this.character = number;
        characters.add(this.character);
    }

    public static void clearArrayList() {
        characters.clear();
    }
}
