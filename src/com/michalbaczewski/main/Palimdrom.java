package com.michalbaczewski.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Palimdrom {

    public ArrayList<String> fileToList(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner sc = new Scanner(file);
        ArrayList<String> listOfWords = new ArrayList<String>();
        while (sc.hasNext()) {
            listOfWords.add(sc.nextLine());
        }
        return listOfWords;
    }

    public boolean palimdromWordCheck(String word) {
        for (int iL = 0, iP = word.length() - 1; iL < iP; iL++, iP--) {
            if (word.charAt(iL) != word.charAt(iP)) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<String> palimdromListCheck(ArrayList<String> wordsList) {
        ArrayList<String> palimdromList = new ArrayList<String>();
        for (int index = 0; index < wordsList.size(); index++) {
            if (palimdromWordCheck(wordsList.get(index))) {
                palimdromList.add(wordsList.get(index));
            }
        }
        return palimdromList;
    }

}
