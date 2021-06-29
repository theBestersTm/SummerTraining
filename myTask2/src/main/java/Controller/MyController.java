package Controller;

import Model.GameAlgorithm;

public class MyController {
    GameAlgorithm gameAlgorithm = new GameAlgorithm();

    public boolean startGame(String userNumber, int randomNumber) {
        if (userNumber.matches("^[0-9][0-9]?$|^100$")) {
            int validUserNumber = Integer.parseInt(userNumber);
            return gameAlgorithm.gameAlgorithm(validUserNumber, randomNumber);
        }
        return false;
    }
}
