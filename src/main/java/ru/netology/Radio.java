package ru.netology;

public class Radio {
    private int currentNumber;
    private int currentVolume;
    private int number = 10;
    private int minNumber = 0;
    private int maxNumber = minNumber + number - 1;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(int number) { // конструктор для задания числа радиостанций
        this.maxNumber = minNumber + number - 1;
    }

    public Radio() { // конструктор для задания числа радиостанций по умолчанию
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(int newCurrentNumber) { // указываем границы диапазона
        if (newCurrentNumber < minNumber) {
            return;
        }
        if (newCurrentNumber > maxNumber) {
            return;
        }
        currentNumber = newCurrentNumber;
    }

    public void nextNumber() {
        if (currentNumber < maxNumber) {
            currentNumber = currentNumber + 1;
        } else {
            currentNumber = minNumber; // переход счетчика после 9 на 0
        }
    }

    public void prevNumber() {
        if (currentNumber > minNumber) {
            currentNumber = currentNumber - 1;
        } else {
            currentNumber = maxNumber; // переход счетчика после 0 на 9
        }
    }

//    public Radio(int minVolume, int maxVolume) { // конструктор для задания уровня громкости
//        this.minVolume = minVolume;
//        this.maxVolume = maxVolume;
//    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) { // указываем границы диапазона
        if (newCurrentVolume < minVolume) {
            newCurrentVolume = minVolume;
        }
        if (newCurrentVolume > maxVolume) {
            newCurrentVolume = maxVolume;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }
}
