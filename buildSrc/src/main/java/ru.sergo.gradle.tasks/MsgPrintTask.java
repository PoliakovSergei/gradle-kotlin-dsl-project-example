package ru.sergo.gradle.tasks;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.TaskAction;

public class MsgPrintTask extends DefaultTask {
    private String message;

    @Input
    public String getMessage() {
        return message;
    }

    public void setMessage(String msg) {
        this.message = msg;
    }

    @TaskAction
    public void printMessage() {
        getLogger().lifecycle("Printing message: " + message);
    }

}
