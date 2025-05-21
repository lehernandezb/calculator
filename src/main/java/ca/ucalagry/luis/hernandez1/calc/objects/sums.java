package ca.ucalagry.luis.hernandez1.calc.objects;

import java.util.ArrayList;

public class sums {
    private final int sums;
    public ArrayList<sums> sumsList = new ArrayList<sums>();

    public sums(int number) {
        this.sums = number;

    }

    public int getSums() {
        return sums;
    }

    public void add(int number) {
        sumsList.add(new sums(number));
    }
}
