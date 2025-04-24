package Praktikum.sesi13.Tugas;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String text = "Java is powerful and Java is easy to learn and powerful";

        // Memisahkan kata berdasarkan spasi
        String[] words = text.split(" ");

        // Membuat HashMap untuk menyimpan frekuensi kata
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Menghitung frekuensi setiap kata
        for (String word : words) {
            word = word.toLowerCase(); // Menghindari perbedaan huruf kapital
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Menampilkan hasil frekuensi kata
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println("Word: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }
}