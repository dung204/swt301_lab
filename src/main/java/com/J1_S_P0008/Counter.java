package com.J1_S_P0008;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Map.Entry;

/**
 *
 * @author THAYCACAC
 */
public class Counter {
    
    private Map<Character, Integer> charCounter = 
            new HashMap<Character, Integer>();
    
    private Map<String, Integer> wordCounter =
            new HashMap<String, Integer>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your content: ");
        String content = scanner.nextLine();
       
        Counter counter = new Counter();
        counter.analyze(content);
        counter.display();
    }
    
    public void display() {
        System.out.println(wordCounter);
        System.out.println(charCounter);
    }
    
    public Entry<Map<Character, Integer>, Map<String, Integer>> analyze(String content) {
        for (char ch : content.toCharArray()) {
            if (Character.isSpaceChar(ch)) continue;
            if (!charCounter.containsKey(ch)) {
                charCounter.put(ch, 1);
            } else {
                charCounter.put(ch, ((int) charCounter.get(ch)) + 1);
            }
        }
        StringTokenizer tokenizer = new StringTokenizer(content);
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken().toLowerCase();
            if (!wordCounter.containsKey(token)) {
                wordCounter.put(token, 1);
            } else {
                wordCounter.put(token, ((int) wordCounter.get(token)) + 1);
            }
        }

        return Map.entry(charCounter, wordCounter);
    }
}
