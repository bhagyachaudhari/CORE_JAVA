package my.practice.java8.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Client1 {
    public static void main(String[] args) {

        System.out.println("PROBLEM 1: ");
        System.out.println();

        Transaction1 t1 = new Transaction1("ACCOUNT-1", 3000);
        Transaction1 t2 = new Transaction1("ACCOUNT-2",5000);
        Transaction1 t3 = new Transaction1("ACCOUNT-1",1000);
        Transaction1 t4 = new Transaction1("ACCOUNT-2",8000);
        Transaction1 t5 = new Transaction1("ACCOUNT-3",9000);
        Transaction1 t6 = new Transaction1("ACCOUNT-1",8000);

        List<Transaction1> list = Arrays.asList(t1, t2, t3, t4, t5, t6);

        Map<String, Integer> output = list.stream()
                .collect(Collectors.groupingBy(
                        Transaction1::getAccountId,
                        Collectors.summingInt(Transaction1::getAmount)
                ));
        output.entrySet().stream().forEach(o -> System.out.println(o.getKey() + " = "+o.getValue()));

        System.out.println();
        System.out.println("PROBLEM 2: ");
        System.out.println();


    }
}

class Transaction1 {
    String accountId;
    int amount;

    public Transaction1(String accountId, int amount) {
        this.accountId = accountId;
        this.amount = amount;
    }

    public String getAccountId() {
        return accountId;
    }

    public int getAmount() {
        return amount;
    }
}

