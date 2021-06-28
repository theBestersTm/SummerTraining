package Model;

import View.ShowResult;

import java.util.ArrayList;

public class GameAlgorithm implements ShowResult {

    private final ArrayList<Integer> userHistory = new ArrayList<>();

    public boolean gameAlgorithm(int userNumber) {
        int randomNumber = yourRandomNumber();

        userHistory.add(userNumber);
        if (userNumber > randomNumber) {
            printBiggerResponse(userNumber);
        } else if (userNumber < randomNumber) {
            printSmallerRepsonse(userNumber);
        } else {
            return true;
        }
        return false;
    }

    public int yourRandomNumber() {
        return (int) (Math.random() * 100);
    }

    public void printUserHistory() {
        System.out.println("Your previous attempts: ");
        userHistory.forEach(System.out::print);
    }

    @Override
    public void printUserHistory(ArrayList<Integer> history) {

    }

    public void printBiggerResponse(int bigger) {
        System.out.println("Your number is bigger " + bigger + " than random number");
    }

    public void printSmallerRepsonse(int smaller) {
        System.out.println("Your number is smaller " + smaller + " than random number");
    }
}
