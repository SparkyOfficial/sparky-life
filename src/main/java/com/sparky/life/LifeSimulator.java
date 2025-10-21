package com.sparky.life;

/**
 * симулятор життя спаркі
 * @author Андрій Будильников
 */
public class LifeSimulator {
    
    public static void main(String[] args) {
        System.out.println("=== Симулятор життя Спаркі ===");
        
        // створюємо спаркі
        Sparky sparky = new Sparky();
        System.out.println("Створено: " + sparky);
        
        // починаємо день
        sparky.wakeUp();
        sparky.eat("сніданок з кавою");
        
        // працюємо
        sparky.work();
        sparky.code("проект життя");
        
        // вивчаємо щось нове
        sparky.learnNewSkill("машинне навчання");
        
        // відпочиваємо
        sparky.relax();
        sparky.drinkCoffee();
        
        // ще трохи кодимо
        sparky.code("java додаток");
        
        // кінець дня
        sparky.eat("вечеря");
        sparky.sleep();
        
        System.out.println("\nКінець дня. Стан Спаркі: " + sparky);
    }
}