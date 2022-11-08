package ru.netology;

public class Radio {
    public int currentNumber;
    public int currentVolume;
    int minNumber = 0;
    int maxNumber = 9;
    int minVolume = 0;
    int maxVolume = 10;

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
        }
        else {
            currentNumber = minNumber; // переход счетчика после 9 на 0
        }
    }

    public void prevNumber() {
        if (currentNumber > minNumber) {
            currentNumber = currentNumber - 1;
        }
        else {
            currentNumber = maxNumber; // переход счетчика после 0 на 9
        }
    }

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
