package ca.ucalagry.luis.hernandez1.calc.objects;

import java.util.ArrayList;

public class characters {

    public String character;
    public static ArrayList<String> characters = new ArrayList<>();

    public characters(String number) {
        this.character = number;
    }

    public static void clearArrayList() {
        characters.clear();
    }

    public static void add(characters character) {
        characters.add(character.character);
    }

    public static void remove(characters character) {
        characters.remove(character.character);
    }

    public static void removeLastCharacter() {
        if (!characters.isEmpty()) {characters.removeLast();}
    }
}
