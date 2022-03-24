package com.example.lifecycle2;

import static java.util.concurrent.ThreadLocalRandom.*;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.concurrent.ThreadLocalRandom;

public class DataModel extends LogableViewModel {
    public static final String NAME = "name";
    public static final String FIRST_NAME = "firstName";

    // déclaration des propriétés
    private String name = NAME;
    private String firstName = FIRST_NAME;
    private int age = 0;

    // déclaration des MutableLiveData correspondant aux propriétés
    // pour que l'activité puisse observer les modifications et
    // MAJ les texts
    private MutableLiveData<String> mName;
    private MutableLiveData<String> mFirstName;
    private MutableLiveData<Integer> mAge;

    public DataModel() {
        super();
    }

    // Les getters renvoie des MutableLiveData
    // On les initialise avec la valeur initial des propriététes
    public MutableLiveData<String> getName() {
        if (mName == null) {
            mName = new MutableLiveData<>();
            mName.setValue(name);
        }
        return mName;
    }

    // Les setter on MAJ également MutableLiveData
    public void setName(String name) {
        this.name = name;
        mName.setValue(name);
    }

    public MutableLiveData<String> getFirstName() {
        if (mFirstName == null) {
            mFirstName = new MutableLiveData<>();
            mFirstName.setValue(firstName);
        }
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        mFirstName.setValue(firstName);
    }

    public MutableLiveData<Integer>  getAge() {
        if (mAge == null) {
            mAge = new MutableLiveData<>();
            mAge.setValue(age);
        }
        return mAge;
    }

    public void setAge(int age) {
        this.age = age;
        mAge.setValue(this.age);
    }

    // il faut MAJ les MutableLiveData
    public void process() {
        ThreadLocalRandom random = current();
        name = NAME + random.nextInt(100);
        mName.setValue(name);
        firstName = FIRST_NAME + random.nextInt(100);
        mFirstName.setValue(firstName);
        age = random.nextInt(100);
        mAge.setValue(age);
    }
}
