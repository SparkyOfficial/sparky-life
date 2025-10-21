package com.sparky.life;

import java.util.ArrayList;
import java.util.List;

/**
 * клас що описує мене, спаркі
 * @author Андрій Будильников
 */
public class Sparky extends Person {
    private List<String> hobbies;
    private String favoriteLanguage;
    private int energyLevel;
    
    public Sparky() {
        super("Спаркі", 25, "зацікавлений");
        this.hobbies = new ArrayList<>();
        this.favoriteLanguage = "Java";
        this.energyLevel = 100;
        
        // додаємо дефолтні хоббі
        hobbies.add("програмування");
        hobbies.add("читання");
        hobbies.add("музика");
    }
    
    // геттери і сеттери
    public List<String> getHobbies() {
        return hobbies;
    }
    
    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
    
    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }
    
    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }
    
    public int getEnergyLevel() {
        return energyLevel;
    }
    
    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }
    
    // специфічні методи для спаркі
    public void code(String project) {
        if (energyLevel > 20) {
            System.out.println(getName() + " кодить " + project + " на " + favoriteLanguage);
            energyLevel -= 20;
            if (project.toLowerCase().contains("java")) {
                setMood("задоволений");
            } else {
                setMood("незадоволений");
            }
        } else {
            System.out.println(getName() + " занадто втомився для програмування");
            setMood("втомлений");
        }
    }
    
    public void learnNewSkill(String skill) {
        System.out.println(getName() + " вивчає новий навик: " + skill);
        hobbies.add(skill);
        energyLevel -= 15;
        setMood("навчається");
    }
    
    public void drinkCoffee() {
        System.out.println(getName() + " п'є каву...");
        energyLevel += 30;
        if (energyLevel > 100) energyLevel = 100;
        setMood("бадьорий");
    }
    
    public void addHobby(String hobby) {
        hobbies.add(hobby);
        System.out.println(getName() + " тепер має нове хобі: " + hobby);
    }
    
    @Override
    public String toString() {
        return "Спаркі{" +
                "хоббі=" + hobbies +
                ", улюблена мова='" + favoriteLanguage + '\'' +
                ", рівень енергії=" + energyLevel +
                "} " + super.toString();
    }
}