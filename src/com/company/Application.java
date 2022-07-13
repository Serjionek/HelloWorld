package com.company;

import java.io.*;
import java.util.*;

public class Application {
    public void run() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        FileInputStream inputStream = new FileInputStream(name);
        HashSet<Integer> set = new HashSet<>();

        while (inputStream.available() > 0) {
            set.add(inputStream.read());
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        for (Integer element : list) {
            System.out.print(element + " ");
        }

        reader.close();
        inputStream.close();
    }
}
