package org.example.designpatterns.behavioural.command;

public interface Command {

    public boolean matches(String input);

    public void execute(String input);
}
