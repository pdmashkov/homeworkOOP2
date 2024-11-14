package ru.netology.homeworkOOP2.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetStationNumberMinValue() {
        Radio radio = new Radio();

        radio.setStationNumber(0);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationNumberMaxValue() {
        Radio radio = new Radio();

        radio.setStationNumber(9);

        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationNumberBelowAcceptable() {
        Radio radio = new Radio();

        radio.setStationNumber(-1);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationNumberAboveAcceptable() {
        Radio radio = new Radio();

        radio.setStationNumber(10);

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation() {
        Radio radio = new Radio();

        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation0() {
        Radio radio = new Radio();

        radio.setStationNumber(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation() {
        Radio radio = new Radio();

        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation9() {
        Radio radio = new Radio();

        radio.setStationNumber(9);
        radio.prevStation();

        int expected = 8;
        int actual = radio.getCurrentStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getVolumeOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotIncreaseVolume() {
        Radio radio = new Radio();

        for (int i = 0; i < 101; i++) {
            radio.increaseVolume();
        }

        int expected = 100;
        int actual = radio.getVolumeOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldTurnDownVolume() {
        Radio radio = new Radio();

        for (int i = 0; i < 51; i++) {
            radio.increaseVolume();
        }

        radio.turnDownVolume();

        int expected = 50;
        int actual = radio.getVolumeOfSound();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotTurnDownVolume() {
        Radio radio = new Radio();

        radio.turnDownVolume();

        int expected = 0;
        int actual = radio.getVolumeOfSound();

        Assertions.assertEquals(expected, actual);
    }
}
