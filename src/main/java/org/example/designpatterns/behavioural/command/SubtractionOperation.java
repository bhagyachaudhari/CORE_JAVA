package org.example.designpatterns.behavioural.command;

public class SubtractionOperation implements Command{
    @Override
    public boolean matches(String input) {
        String[] inputParams = input.split("-");
        if(inputParams.length == 3 && inputParams[0].equalsIgnoreCase("subtract")){
            return true;
        }
        return false;
    }

    @Override
    public void execute(String input) {
        String[] inputParams = input.split("-");
        int output = Integer.parseInt(inputParams[1]) + Integer.parseInt(inputParams[2]);
        System.out.println("Subtraction = "+output);
    }
}
