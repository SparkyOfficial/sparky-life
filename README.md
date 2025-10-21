# Симулятор Життя Спаркі / Sparky's Life Simulator / Симулятор жизни Спарки

## Українська

Це простий симулятор життя, написаний на Java з використанням об'єктно-орієнтованого програмування. Проект моделює щоденне життя Спаркі, включаючи такі дії як прокидання, робота, програмування, відпочинок та сон.

### Структура проекту

- `Person.java` - базовий клас людини
- `Sparky.java` - клас, що представляє Спаркі, успадковує Person
- `LifeSimulator.java` - головний клас з методом main для запуску симуляції

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

Это простой симулятор жизни, написанный на Java с использованием объектно-ориентированного программирования. Проект моделирует повседневную жизнь Спарки, включая такие действия, как пробуждение, работа, программирование, отдых и сон.

### Структура проекта

- `Person.java` - базовый класс человека
- `Sparky.java` - класс, представляющий Спарки, наследует Person
- `LifeSimulator.java` - главный класс с методом main для запуска симуляции

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

This is a simple life simulator written in Java using object-oriented programming. The project models Sparky's daily life, including actions like waking up, working, coding, relaxing, and sleeping.

### Project Structure

- `Person.java` - base human class
- `Sparky.java` - class representing Sparky, inherits from Person
- `LifeSimulator.java` - main class with main method to run the simulation

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