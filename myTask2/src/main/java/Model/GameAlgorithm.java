package Model;

import View.ShowResult;

import java.util.ArrayList;

public class GameAlgorithm implements ShowResult {

    private final ArrayList<Integer> userHistory = new ArrayList<>();


    public boolean gameAlgorithm(int userNumber, int randomNumber) {


        userHistory.add(userNumber);

        if (userNumber > randomNumber) {
            printUserHistory();
            printBiggerResponse(userNumber);
        } else if (userNumber < randomNumber) {
            printUserHistory();

            printSmallerRepsonse(userNumber);
        } else if(userNumber == randomNumber) {
            return true;
        }
        return false;
    }

    public int yourRandomNumber() {
        return (int) (Math.random() * 100);
    }

    public void printUserHistory() {
        System.out.print("Your previous attempts: ");

        userHistory.forEach((k)->System.out.print(k + " ") );
    }

    @Override
    public void printUserHistory(ArrayList<Integer> history) {

    }

    public void printBiggerResponse(int bigger) {
        System.out.println("\nYour number is bigger " + bigger + " than random number");
    }

    public void printSmallerRepsonse(int smaller) {
        System.out.println("\nYour number is smaller " + smaller + " than random number");
    }
}
