package org.example.designpatterns.behavioural.command;

public class Client {

    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutor();

        AdditionOperation additionOperation = new AdditionOperation();
        executor.addCommand(additionOperation);

        SubtractionOperation subtractionOperation = new SubtractionOperation();
        executor.addCommand(subtractionOperation);

        executor.execute("add-3-4");
        executor.execute("subtract-7-2");
    }
}
