package com.example.lifecycle2;

import static java.util.concurrent.ThreadLocalRandom.*;

import androidx.lifecycle.ViewModel;

import java.util.concurrent.ThreadLocalRandom;

public class DataModel extends LogableViewModel {
    public static final String NAME = "name";
    public static final String FIRST_NAME = "firstName";

    private String name = NAME;
    private String firstName = FIRST_NAME;
    private int age = 0;

    public DataModel() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void process() {
        ThreadLocalRandom random = current();
        name = NAME + random.nextInt(100);
        firstName = FIRST_NAME + random.nextInt(100);
        age = random.nextInt(100);
    }
}
