package com.sparky.life;

/**
 * клас для представлення часових проміжків
 * @author Андрій Будильников
 */
public class TimeSlot {
    private int startHour;
    private int startMinute;
    private int endHour;
    private int endMinute;
    private String activity;
    
    public TimeSlot(int startHour, int startMinute, int endHour, int endMinute, String activity) {
        this.startHour = startHour;
        this.startMinute = startMinute;
        this.endHour = endHour;
        this.endMinute = endMinute;
        this.activity = activity;
    }
    
    // геттери
    public int getStartHour() {
        return startHour;
    }
    
    public int getStartMinute() {
        return startMinute;
    }
    
    public int getEndHour() {
        return endHour;
    }
    
    public int getEndMinute() {
        return endMinute;
    }
    
    public String getActivity() {
        return activity;
    }
    
    /**
     * перевіряє чи час входить в цей проміжок
     */
    public boolean includes(int hour, int minute) {
        // перетворюємо в хвилини для легшого порівняння
        int currentTime = hour * 60 + minute;
        int startTime = startHour * 60 + startMinute;
        int endTime = endHour * 60 + endMinute;
        
        return currentTime >= startTime && currentTime < endTime;
    }
    
    @Override
    public String toString() {
        return String.format("%02d:%02d-%02d:%02d: %s", 
            startHour, startMinute, endHour, endMinute, activity);
    }
}