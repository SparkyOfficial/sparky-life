@echo off
echo Компіляція проекту життя Спаркі...
mkdir classes 2>nul
javac -d classes -cp classes src\main\java\com\sparky\life\*.java
if %errorlevel% == 0 (
    echo Компіляція успішна!
    echo Запуск симулятора життя...
    java -cp classes com.sparky.life.LifeSimulator
) else (
    echo Помилка компіляції!
)
pause