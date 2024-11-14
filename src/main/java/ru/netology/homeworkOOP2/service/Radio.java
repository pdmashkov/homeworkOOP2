package ru.netology.homeworkOOP2.service;

public class Radio {
    private int currentStationNumber;
    private int volumeOfSound;

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public int getVolumeOfSound() {
        return volumeOfSound;
    }

    public void setStationNumber(int stationNumber) {
        if (stationNumber >= 0 && stationNumber <= 9) {
            currentStationNumber = stationNumber;
        }
    }

    public void nextStation() {
        if (currentStationNumber == 9) {
            currentStationNumber = 0;
        } else {
            setStationNumber(currentStationNumber + 1);
        }
    }

    public void prevStation() {
        if (currentStationNumber == 0) {
            currentStationNumber = 9;
        } else {
            setStationNumber(currentStationNumber - 1);
        }
    }

    public void increaseVolume() {
        if (volumeOfSound < 100) {
            volumeOfSound = volumeOfSound + 1;
        }
    }

    public void turnDownVolume() {
        if (volumeOfSound > 0) {
            volumeOfSound = volumeOfSound - 1;
        }
    }
}
