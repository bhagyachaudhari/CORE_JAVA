package my.practice.java8.streamapi;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {

        System.out.println("PROBLEM 1: ");
        System.out.println();

        Transaction t1 = new Transaction(3000);
        Transaction t2 = new Transaction(5000);
        Transaction t3 = new Transaction(1000);
        Transaction t4 = new Transaction(8000);
        Transaction t5 = new Transaction(9000);
        Transaction t6 = new Transaction(8000);

        List<Transaction> list = Arrays.asList(t1, t2, t3, t4, t5);

        List<Integer> output = list.stream()
                .map(Transaction::getAmount)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .limit(3).collect(Collectors.toList());

        output.forEach(amt -> System.out.println(amt));

        System.out.println();
        System.out.println("PROBLEM 2: ");
        System.out.println();

        List<String> list2 = Arrays.asList("TXN1", "TXN2", "TXN1", "TXN3");
        list2.stream()
                .distinct()
                .collect(Collectors.toList())
                .forEach(ele -> System.out.println(ele));
    }
}

class Transaction {
    private int amount;

    public Transaction(int amount) {
        this.amount = amount;
    }
    public int getAmount() { return amount; }

}

