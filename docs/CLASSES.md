# Опис класів / Classes Description / Описание классов

## Українська

### Person.java
Базовий клас, що представляє людину з основними атрибутами:
- ім'я (name)
- вік (age)
- настрій (mood)

Методи:
- wakeUp() - прокидання
- sleep() - сон
- eat() - їжа
- work() - робота
- relax() - відпочинок

### Sparky.java
Клас, що розширює Person, представляє конкретну людину - Спаркі:
- хобі (hobbies)
- улюблена мова програмування (favoriteLanguage)
- рівень енергії (energyLevel)
- розклад (scheduleManager)

Методи:
- code() - програмування
- learnNewSkill() - вивчення нових навичок
- drinkCoffee() - пити каву
- addHobby() - додати хобі
- doActivityAt() - виконати активність за часом
- setSchedule() - встановити розклад

### LifeSimulator.java
Головний клас з методом main, що демонструє роботу програми.

### TimeSlot.java
Клас для представлення часових проміжків:
- початок (startHour, startMinute)
- кінець (endHour, endMinute)
- активність (activity)

### ScheduleManager.java
Клас для управління розкладом:
- додавання часових проміжків
- видалення часових проміжків
- отримання активності за часом

---

## Русский

### Person.java
Базовый класс, представляющий человека с основными атрибутами:
- имя (name)
- возраст (age)
- настроение (mood)

Методы:
- wakeUp() - пробуждение
- sleep() - сон
- eat() - еда
- work() - работа
- relax() - отдых

### Sparky.java
Класс, расширяющий Person, представляет конкретного человека - Спарки:
- хобби (hobbies)
- любимый язык программирования (favoriteLanguage)
- уровень энергии (energyLevel)
- расписание (scheduleManager)

Методы:
- code() - программирование
- learnNewSkill() - изучение новых навыков
- drinkCoffee() - пить кофе
- addHobby() - добавить хобби
- doActivityAt() - выполнить активность по времени
- setSchedule() - установить расписание

### LifeSimulator.java
Главный класс с методом main, демонстрирующий работу программы.

### TimeSlot.java
Класс для представления временных промежутков:
- начало (startHour, startMinute)
- конец (endHour, endMinute)
- активность (activity)

### ScheduleManager.java
Класс для управления расписанием:
- добавление временных промежутков
- удаление временных промежутков
- получение активности по времени

---

## English

### Person.java
Base class representing a person with basic attributes:
- name
- age
- mood

Methods:
- wakeUp() - waking up
- sleep() - sleeping
- eat() - eating
- work() - working
- relax() - relaxing

### Sparky.java
Class extending Person, representing a specific person - Sparky:
- hobbies
- favorite programming language
- energy level
- schedule

Methods:
- code() - coding
- learnNewSkill() - learning new skills
- drinkCoffee() - drinking coffee
- addHobby() - adding a hobby
- doActivityAt() - do activity at specific time
- setSchedule() - set schedule

### LifeSimulator.java
Main class with main method demonstrating the program functionality.

### TimeSlot.java
Class for representing time slots:
- start (startHour, startMinute)
- end (endHour, endMinute)
- activity

### ScheduleManager.java
Class for managing schedule:
- adding time slots
- removing time slots
- getting activity by time