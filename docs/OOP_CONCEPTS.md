# Об'єктно-орієнтоване програмування / Object-Oriented Programming / Объектно-ориентированное программирование

## Українська

У цьому проекті використовуються наступні принципи ООП:

### Інкапсуляція (Encapsulation)
Всі поля класів [Person](file:///c%3A/Users/%D0%91%D0%BE%D0%B3%D0%B4%D0%B0%D0%BD/Desktop/sparky-life/src/main/java/com/sparky/life/Person.java#L5-L78) і [Sparky](file:///c%3A/Users/%D0%91%D0%BE%D0%B3%D0%B4%D0%B0%D0%BD/Desktop/sparky-life/src/main/java/com/sparky/life/Sparky.java#L6-L94) є приватними, доступ до них здійснюється через публічні методи (геттери та сеттери).

### Успадкування (Inheritance)
Клас [Sparky](file:///c%3A/Users/%D0%91%D0%BE%D0%B3%D0%B4%D0%B0%D0%BD/Desktop/sparky-life/src/main/java/com/sparky/life/Sparky.java#L6-L94) успадковує клас [Person](file:///c%3A/Users/%D0%91%D0%BE%D0%B3%D0%B4%D0%B0%D0%BD/Desktop/sparky-life/src/main/java/com/sparky/life/Person.java#L5-L78), отримуючи всі його поля та методи, а також додає власні.

### Поліморфізм (Polymorphism)
Хоча в цьому простому прикладі не використовується багато форм поліморфізму, перевизначення методу [toString()](file:///c%3A/Users/%D0%91%D0%BE%D0%B3%D0%B4%D0%B0%D0%BD/Desktop/sparky-life/src/main/java/com/sparky/life/Person.java#L74-L77) в обох класах демонструє один із його видів.

---

## Русский

В этом проекте используются следующие принципы ООП:

### Инкапсуляция (Encapsulation)
Все поля классов [Person](file:///c%3A/Users/%D0%91%D0%BE%D0%B3%D0%B4%D0%B0%D0%BD/Desktop/sparky-life/src/main/java/com/sparky/life/Person.java#L5-L78) и [Sparky](file:///c%3A/Users/%D0%91%D0%BE%D0%B3%D0%B4%D0%B0%D0%BD/Desktop/sparky-life/src/main/java/com/sparky/life/Sparky.java#L6-L94) являются приватными, доступ к ним осуществляется через публичные методы (геттеры и сеттеры).

### Наследование (Inheritance)
Класс [Sparky](file:///c%3A/Users/%D0%91%D0%BE%D0%B3%D0%B4%D0%B0%D0%BD/Desktop/sparky-life/src/main/java/com/sparky/life/Sparky.java#L6-L94) наследует класс [Person](file:///c%3A/Users/%D0%91%D0%BE%D0%B3%D0%B4%D0%B0%D0%BD/Desktop/sparky-life/src/main/java/com/sparky/life/Person.java#L5-L78), получая все его поля и методы, а также добавляет собственные.

### Полиморфизм (Polymorphism)
Хотя в этом простом примере не используется много форм полиморфизма, переопределение метода [toString()](file:///c%3A/Users/%D0%91%D0%BE%D0%B3%D0%B4%D0%B0%D0%BD/Desktop/sparky-life/src/main/java/com/sparky/life/Person.java#L74-L77) в обоих классах демонстрирует один из его видов.

---

## English

This project uses the following OOP principles:

### Encapsulation
All fields in [Person](file:///c%3A/Users/%D0%91%D0%BE%D0%B3%D0%B4%D0%B0%D0%BD/Desktop/sparky-life/src/main/java/com/sparky/life/Person.java#L5-L78) and [Sparky](file:///c%3A/Users/%D0%91%D0%BE%D0%B3%D0%B4%D0%B0%D0%BD/Desktop/sparky-life/src/main/java/com/sparky/life/Sparky.java#L6-L94) classes are private, accessed through public methods (getters and setters).

### Inheritance
The [Sparky](file:///c%3A/Users/%D0%91%D0%BE%D0%B3%D0%B4%D0%B0%D0%BD/Desktop/sparky-life/src/main/java/com/sparky/life/Sparky.java#L6-L94) class inherits from the [Person](file:///c%3A/Users/%D0%91%D0%BE%D0%B3%D0%B4%D0%B0%D0%BD/Desktop/sparky-life/src/main/java/com/sparky/life/Person.java#L5-L78) class, gaining all its fields and methods, and adds its own.

### Polymorphism
Although this simple example doesn't use many forms of polymorphism, overriding the [toString()](file:///c%3A/Users/%D0%91%D0%BE%D0%B3%D0%B4%D0%B0%D0%BD/Desktop/sparky-life/src/main/java/com/sparky/life/Person.java#L74-L77) method in both classes demonstrates one of its forms.