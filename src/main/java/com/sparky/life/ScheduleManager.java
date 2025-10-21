package com.sparky.life;

import java.util.ArrayList;
import java.util.List;

/**
 * менеджер розкладу спаркі
 * @author Андрій Будильников
 */
public class ScheduleManager {
    private List<TimeSlot> schedule;
    
    public ScheduleManager() {
        this.schedule = new ArrayList<>();
        // додаємо дефолтний розклад
        loadDefaultSchedule();
    }
    
    /**
     * завантажує дефолтний розклад
     */
    private void loadDefaultSchedule() {
        // очищуємо існуючий розклад
        schedule.clear();
        
        // додаємо нові часові проміжки
        addTimeSlot(10, 30, 15, 30, "школа");
        addTimeSlot(15, 30, 16, 0, "вільний час");
        addTimeSlot(16, 0, 23, 0, "програмування, ігри, компухтер");
    }
    
    /**
     * додає новий часовий проміжок
     */
    public void addTimeSlot(int startHour, int startMinute, int endHour, int endMinute, String activity) {
        schedule.add(new TimeSlot(startHour, startMinute, endHour, endMinute, activity));
    }
    
    /**
     * видаляє часовий проміжок за активністю
     */
    public void removeTimeSlot(String activity) {
        schedule.removeIf(slot -> slot.getActivity().equals(activity));
    }
    
    /**
     * очищує весь розклад
     */
    public void clearSchedule() {
        schedule.clear();
    }
    
    /**
     * повертає активність за часом
     */
    public String getActivityAt(int hour, int minute) {
        for (TimeSlot slot : schedule) {
            if (slot.includes(hour, minute)) {
                return slot.getActivity();
            }
        }
        // якщо нічого не знайдено, значить спаркі нічого не робить
        return "нічого не робить";
    }
    
    /**
     * повертає весь розклад
     */
    public List<TimeSlot> getSchedule() {
        return new ArrayList<>(schedule); // повертаємо копію
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Розклад Спаркі:\n");
        for (TimeSlot slot : schedule) {
            sb.append("- ").append(slot.toString()).append("\n");
        }
        return sb.toString();
    }
}