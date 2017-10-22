package ru;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by victor.burtsev@gmail.com on 9/6/17.
 */

class Strings {

    private List<String> words = new ArrayList<>();
    private StringBuilder stringTemp = new StringBuilder();
    private String finalString = "";

    String reverseWordsInString(String string) {
        char[] chars = string.toCharArray();

        for (int i = 0, j = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                stringTemp.append(chars[i]);
            } else {
                words.add(stringTemp.toString());
                stringTemp.delete(0, stringTemp.length());
            }
        }

        words.add(stringTemp.toString());

        for (int i = 0; i < words.size(); i++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(words.get(i)).reverse();

            if (i < words.size() - 1) {
                finalString += stringBuilder.toString() + " ";
            } else {
                finalString += stringBuilder.toString();
            }
        }
        return finalString;
    }
}
