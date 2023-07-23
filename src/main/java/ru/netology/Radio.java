package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private final int numberStation = 10;
    private final int minStation = 0;
    private int maxStation = numberStation - 1;
    private final int minVolume = 0;
    private final int maxVolume = 100;

    public Radio(int numberStation) { // конструктор для задания числа радиостанций
        maxStation = numberStation - 1;
    }

    public Radio() { // конструктор для задания числа радиостанций по умолчанию
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) { // указываем границы диапазона
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = minStation; // переход счетчика после 9 на 0
        }
    }

    public void prevStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation; // переход счетчика после 0 на 9
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) { // указываем границы диапазона
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        else {
            currentVolume = maxVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        else {
            currentVolume = minVolume;
        }
    }
}
