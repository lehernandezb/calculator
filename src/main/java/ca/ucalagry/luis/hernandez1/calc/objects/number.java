package ca.ucalagry.luis.hernandez1.calc.objects;

public class number {

    private final int[] number;

    public number(int[] number) {
        this.number = number;
    }

    public int getNumber(int[] number) {
        int sum = 0;
        for (int j : number) {
            sum += j;
        }
        return sum;
    }

}
