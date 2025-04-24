package Praktikum.sesi13.Latihan;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {
    public static void main(String[] args) {
        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();

        // Menambahkan elemen ke himpunan A
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);

        // Menambahkan elemen ke himpunan B
        B.add(5);
        B.add(6);
        B.add(7);
        B.add(8);
        B.add(9);
        B.add(10);

        // A - B
        Set<Integer> differenceAB = new HashSet<>(A);
        differenceAB.removeAll(B);
        System.out.println("A - B: " + differenceAB);

        // A ∩ B
        Set<Integer> intersectionAB = new HashSet<>(A);
        intersectionAB.retainAll(B);
        System.out.println("A ∩ B: " + intersectionAB);

        // A U B
        Set<Integer> unionAB = new HashSet<>(A);
        unionAB.addAll(B);
        System.out.println("A U B: " + unionAB);

        // A C B (Apakah A subset dari B?)
        boolean isSubset = B.containsAll(A);
        System.out.println("A C B: " + isSubset);
    }
}
