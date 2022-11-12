package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldDefaultNumber() { // передача данных через конструктор
        Radio radio = new Radio();

        int expected = 10;
        int actual = radio.getNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextNumber() { // передача данных через конструктор
        Radio radio = new Radio(6, 8, 30, 0, 29, 0, 100);

        radio.nextNumber();

        int expected = 7;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextNumberAfterMax() { // передача данных через конструктор
        Radio radio = new Radio(29, 8, 30, 0, 29, 0, 100);

        radio.nextNumber();

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextNumberAfterMaxWithSetter() { // передача данных через сеттеры
        Radio radio = new Radio();

        radio.setNumber(30);
        radio.setCurrentNumber(29);
        radio.setMaxNumber(29);
        radio.nextNumber();

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPreviousNumber() { // передача данных через конструктор
        Radio radio = new Radio(5, 8, 30, 0, 29, 0, 100);

        radio.prevNumber();

        int expected = 4;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPreviousNumberBeforeMin() { // передача данных через конструктор
        Radio radio = new Radio(0, 8, 30, 0, 29, 0, 100);

        radio.prevNumber();

        int expected = 29;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPreviousNumberBeforeMinWithSetter() { // передача данных через сеттеры
        Radio radio = new Radio(0, 8, 30, 0, 29, 0, 100);

        radio.setNumber(30);
        radio.setCurrentNumber(0);
        radio.setMinNumber(0);
        radio.prevNumber();

        int expected = 29;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNumberAboveMax() { // передача данных через конструктор
        Radio radio = new Radio(31, 8, 30, 0, 29, 0, 100);

        radio.nextNumber();

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNumberBelowMin() { // передача данных через конструктор
        Radio radio = new Radio(-2, 8, 30, 0, 29, 0, 100);

        radio.prevNumber();

        int expected = 29;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSpecificallyNumber() { // передача данных через конструктор
        Radio radio = new Radio(3, 8, 30, 0, 29, 0, 100);

        int expected = 3;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() { // передача данных через конструктор
        Radio radio = new Radio(3, 8, 30, 0, 29, 0, 100);

        radio.increaseVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeWithSetter() { // передача данных через сететры
        Radio radio = new Radio();

        radio.setCurrentVolume(8);
        radio.setMaxVolume(100);
        radio.increaseVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() { // передача данных через конструктор
        Radio radio = new Radio(3, 8, 30, 0, 29, 0, 100);

        radio.decreaseVolume();

        int expected = 7;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeWithSetter() { // передача данных через сететры
        Radio radio = new Radio();

        radio.setCurrentVolume(8);
        radio.setMinVolume(0);
        radio.decreaseVolume();

        int expected = 7;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMax() { // передача данных через конструктор
        Radio radio = new Radio(3, 100, 30, 0, 29, 0, 100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeMin() { // передача данных через конструктор
        Radio radio = new Radio(3, 0, 30, 0, 29, 0, 100);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeAboveMax() { // передача данных через конструктор
        Radio radio = new Radio(3, 102, 30, 0, 29, 0, 100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeBelowMin() { // передача данных через конструктор
        Radio radio = new Radio(3, -3, 30, 0, 29, 0, 100);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldHashCode() {
        Radio radio = new Radio(3, 15, 30, 0, 29, 0, 100);

        int expected = 2055554250;
        int actual = radio.hashCode();

        Assertions.assertEquals(expected, actual);
    }
}
