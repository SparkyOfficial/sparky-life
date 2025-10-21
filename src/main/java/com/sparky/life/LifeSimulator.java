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
        
        // показуємо розклад
        System.out.println("\n" + sparky.getSchedule().toString());
        
        // симулюємо день з 00:00 до 23:59 з кроком 30 хвилин
        System.out.println("\n=== Симуляція дня ===");
        for (int hour = 0; hour < 24; hour++) {
            for (int minute = 0; minute < 60; minute += 30) {
                sparky.doActivityAt(hour, minute);
                
                // кожні 6 годин показуємо стан
                if (minute == 0 && hour % 6 == 0) {
                    System.out.println("Стан: " + sparky);
                }
            }
        }
        
        System.out.println("\nКінець симуляції. Фінальний стан Спаркі: " + sparky);
    }
}