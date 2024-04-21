package View;

import Controller.FatController;

public class Main {
    public static void main(String[] args) {
        long number = (long) (Math.random() * 50) + 1;
        FatController FC1 = new FatController(1, number);
        FatController FC2 = new FatController(2, number);
        FC1.start();
        FC2.start();

    }
}
