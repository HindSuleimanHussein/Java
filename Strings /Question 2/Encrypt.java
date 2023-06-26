package com.project;

public class Encrypt {

    public static String capital(String word){
        return word.toUpperCase();
    }
    public static String reverse(String word){
        StringBuilder st = new StringBuilder(word);
        st.reverse();
        return st.toString();
    }

    public static String myReplace(String word) {
        String st1 = word.replace("O", "0");
        st1 = st1.replace("S", "$");
        st1 = st1.replace("L", "1");
        return st1;


    }

    public static String beginAndEnd(String word){
        StringBuilder st = new StringBuilder(word);
        st.insert(0, "**");
        st.insert(st.length(), "**");
        return st.toString();
    }
}
