package com.company;

import java.util.Objects;

public class Man {
    protected String name;
    protected int age;

    public Man(String name, int age) {
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

    public void walk() {
        System.out.println("Man walks");
    }

    public void eat() {
        System.out.println("Man eats");
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(" ");
        sb.append("name = ").append(name);
        sb.append(", age = ").append(age);
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Man man = (Man) o;
        return age == man.age &&
                name.equals(man.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
