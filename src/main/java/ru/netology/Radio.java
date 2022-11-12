package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int currentNumber;
    private int currentVolume;
    private int number = 10;
    private int minNumber;
    private int maxNumber;
    private int minVolume;
    private int maxVolume;

    public void nextNumber() {
        if (currentNumber < maxNumber) {
            currentNumber = currentNumber + 1;
        } else {
            currentNumber = getMinNumber(); // переход счетчика после 9 на 0
        }
    }

    public void prevNumber() {
        if (currentNumber > minNumber) {
            currentNumber = currentNumber - 1;
        } else {
            currentNumber = getMaxNumber(); // переход счетчика после 0 на 9
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = getMaxVolume();
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = getMinVolume();
        }
    }
}

