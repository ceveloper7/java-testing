package com.ceva.testing.ch02.parametrized;

public class WordCounter {
    public int countWords(String sentence){
        return sentence.split(" ").length;
    }
}
