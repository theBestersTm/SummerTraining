import Controller.MyController;
import Model.GameAlgorithm;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyController myController = new MyController();
        GameAlgorithm gameAlgorithm = new GameAlgorithm();
        int rand = gameAlgorithm.yourRandomNumber();
        while (!myController.startGame(input.nextLine(), rand)) {}

        System.out.println("You won");
    }

}
