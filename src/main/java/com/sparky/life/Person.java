package com.sparky.life;

/**
 * базовий клас людини
 * @author Андрій Будильников
 */
public class Person {
    private String name;
    private int age;
    private String mood;
    
    public Person(String name, int age, String mood) {
        this.name = name;
        this.age = age;
        this.mood = mood;
    }
    
    // геттери і сеттери
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
    
    public String getMood() {
        return mood;
    }
    
    public void setMood(String mood) {
        this.mood = mood;
    }
    
    // методи для щоденних дій
    public void wakeUp() {
        System.out.println(name + " прокидається...");
        mood = "бадьорий";
    }
    
    public void sleep() {
        System.out.println(name + " лягає спати...");
        mood = "втомлений";
    }
    
    public void eat(String food) {
        System.out.println(name + " їсть " + food);
        if (food.contains("кава")) {
            mood = "енергійний";
        }
    }
    
    public void work() {
        System.out.println(name + " працює...");
        mood = "зайнятий";
    }
    
    public void relax() {
        System.out.println(name + " відпочиває...");
        mood = "щасливий";
    }
    
    @Override
    public String toString() {
        return "Персона{" +
                "ім'я='" + name + '\'' +
                ", вік=" + age +
                ", настрій='" + mood + '\'' +
                '}';
    }
}