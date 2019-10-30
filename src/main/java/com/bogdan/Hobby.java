package com.bogdan;

public abstract class Hobby
{
    private String name;
    private int age;

    public Hobby()
    {
    }

    public Hobby(String name, int age)
    {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    protected abstract void tellAboutHobby() throws HobbyException;
}

