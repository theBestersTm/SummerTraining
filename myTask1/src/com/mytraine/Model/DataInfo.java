package com.mytraine.Model;

import com.mytraine.MyConstants.Constants;
import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class DataInfo {

    private final Scanner input = new Scanner(System.in);

    private void restartProgram() {
        checkWord(Constants.stringPattern1, Constants.stringPattern2);

    }

    public String checkWord(String stringPattern1, String stringPattern2) {
        String word = readWord();
        String buffer = word;

        if (stringPattern1.contains(word)) {
            word = readWord();
            if (stringPattern2.contains(word)) {
                return buffer = buffer + " " + word;

            } else {
                System.out.println("Please write down correct words");
                restartProgram();
            }
        } else {
            System.out.println("Please write down correct words");
            restartProgram();
        }

        return "Wrong result";
    }

    public String readWord() {
        String word = input.nextLine();
        return word;
    }


}
