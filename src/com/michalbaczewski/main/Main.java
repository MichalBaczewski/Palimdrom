package com.michalbaczewski.main;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Palimdrom palimdrom = new Palimdrom();
        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList = palimdrom.fileToList("src/com/michalbaczewski/main/words.txt");
        System.out.println(palimdrom.palimdromListCheck(stringArrayList));

    }
}
