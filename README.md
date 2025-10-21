# Симулятор Життя Спаркі / Sparky's Life Simulator / Симулятор жизни Спарки

## Українська

Це простий симулятор життя, написаний на Java з використанням об'єктно-орієнтованого програмування. Проект моделює щоденне життя Спаркі з гнучкою системою розкладу.

### Структура проекту

- `Person.java` - базовий клас людини
- `Sparky.java` - клас, що представляє Спаркі, успадковує Person
- `TimeSlot.java` - клас для представлення часових проміжків
- `ScheduleManager.java` - клас для управління розкладом
- `LifeSimulator.java` - головний клас з методом main для запуску симуляції

### Гнучкий розклад

За замовчуванням встановлено такий розклад:
- 10:30-15:30 - школа
- 15:30-16:00 - вільний час
- 16:00-23:00 - програмування, ігри, компухтер
- Весь інший час - нічого не робить

Розклад можна легко змінити через API ScheduleManager.

### Як запустити

#### Використовуючи build.bat (Windows)
```cmd
build.bat
```

#### Вручну
```cmd
mkdir classes
javac -d classes src\main\java\com\sparky\life\*.java
java -cp classes com.sparky.life.LifeSimulator
```

---

## Русский

Это простой симулятор жизни, написанный на Java с использованием объектно-ориентированного программирования. Проект моделирует повседневную жизнь Спарки с гибкой системой расписания.

### Структура проекта

- `Person.java` - базовый класс человека
- `Sparky.java` - класс, представляющий Спарки, наследует Person
- `TimeSlot.java` - класс для представления временных промежутков
- `ScheduleManager.java` - класс для управления расписанием
- `LifeSimulator.java` - главный класс с методом main для запуска симуляции

### Гибкое расписание

По умолчанию установлено следующее расписание:
- 10:30-15:30 - школа
- 15:30-16:00 - свободное время
- 16:00-23:00 - программирование, игры, компьютер
- Все остальное время - ничего не делает

Расписание можно легко изменить через API ScheduleManager.

### Как запустить

#### Используя build.bat (Windows)
```cmd
build.bat
```

#### Вручную
```cmd
mkdir classes
javac -d classes src\main\java\com\sparky\life\*.java
java -cp classes com.sparky.life.LifeSimulator
```

---

## English

This is a simple life simulator written in Java using object-oriented programming. The project models Sparky's daily life with a flexible schedule system.

### Project Structure

- `Person.java` - base human class
- `Sparky.java` - class representing Sparky, inherits from Person
- `TimeSlot.java` - class for representing time slots
- `ScheduleManager.java` - class for managing schedule
- `LifeSimulator.java` - main class with main method to run the simulation

### Flexible Schedule

Default schedule:
- 10:30-15:30 - school
- 15:30-16:00 - free time
- 16:00-23:00 - programming, games, computer
- All other times - doing nothing

The schedule can be easily modified through the ScheduleManager API.

### How to Run

#### Using build.bat (Windows)
```cmd
build.bat
```

#### Manually
```cmd
mkdir classes
javac -d classes src\main\java\com\sparky\life\*.java
java -cp classes com.sparky.life.LifeSimulator
```