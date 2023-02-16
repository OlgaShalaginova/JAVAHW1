package org.example.HW1.Task1;

public class Task1 {
    public static void main(String[] args) {
        String s = "java Olga      proba";
        String[] s_split = s.split("\\s+");
        String new_s = "";
        for (int i = s_split.length-1; i >= 0; i--) {
            new_s += (s_split[i] + " ");
        }
        System.out.println(new_s);
    }
}
