package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldDefaultNumber() {
        Radio radio = new Radio();

        int expected = 10;
        int actual = radio.getNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextNumber() {
        Radio radio = new Radio(6, 8, 30, 0, 29, 0, 100);

        radio.nextNumber();

        int expected = 7;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextNumberAfterMax() {
        Radio radio = new Radio(29, 8, 30, 0, 29, 0, 100);

        radio.nextNumber();

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPreviousNumber() {
        Radio radio = new Radio(5, 8, 30, 0, 29, 0, 100);

        radio.prevNumber();

        int expected = 4;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPreviousNumberBeforeMin() {
        Radio radio = new Radio(0, 8, 30, 0, 29, 0, 100);

        radio.prevNumber();

        int expected = 29;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }
//
    @Test
    public void shouldNumberAboveMax() {
        Radio radio = new Radio(31, 8, 30, 0, 29, 0, 100);

        radio.nextNumber();

        int expected = 0;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNumberBelowMin() {
        Radio radio = new Radio(-2, 8, 30, 0, 29, 0, 100);

        radio.prevNumber();

        int expected = 29;
        int actual = radio.getCurrentNumber();

        Assertions.assertEquals(expected, actual);
    }

   @Test
   public void shouldSpecificallyNumber () {
       Radio radio = new Radio(3, 8, 30, 0, 29, 0, 100);

       int expected = 3;
       int actual = radio.getCurrentNumber();

       Assertions.assertEquals(expected, actual);
   }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio(3, 8, 30, 0, 29, 0, 100);

        radio.increaseVolume();

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio(3, 8, 30, 0, 29, 0, 100);

        radio.decreaseVolume();

        int expected = 7;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMax() {
        Radio radio = new Radio(3, 100, 30, 0, 29, 0, 100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeMin() {
       Radio radio = new Radio(3, 0, 30, 0, 29, 0, 100);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeAboveMax() {
        Radio radio = new Radio(3, 102, 30, 0, 29, 0, 100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumeBelowMin() {
        Radio radio = new Radio(3, -3, 30, 0, 29, 0, 100);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
