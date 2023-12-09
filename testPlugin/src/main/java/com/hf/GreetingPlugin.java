package com.hf;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * Ref: https://github.com/gradle/greeting-plugin-example
 */
public class GreetingPlugin implements Plugin<Project> {
    public void apply(Project project) {
        // Register a task call `hello`
        project.getTasks().create("hello", Greeting.class, (task) -> { // <1>
            task.setMessage("Hello");
            task.setRecipient("World");                                // <2>
        });
    }
}