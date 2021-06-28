import Controller.MyController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MyController myController = new MyController();

        while (!myController.startGame(input.nextLine())) {}

        System.out.println("Hello world");
    }

}
