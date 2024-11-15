package ru.netology.homeworkOOP2.service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
@Data
public class Radio {
    @Getter
    private int currentStationNumber;
    @Getter
    private int volumeOfSound;
    private int numberStation;

    public Radio(int numberStation) {
        this.numberStation = numberStation;
    }

    public Radio() {
        this.numberStation = 10;
    }

    public void setStationNumber(int stationNumber) {
        if (stationNumber >= 0 && stationNumber < numberStation) {
            currentStationNumber = stationNumber;
        }
    }

    public void nextStation() {
        if (currentStationNumber == numberStation - 1) {
            currentStationNumber = 0;
        } else {
            setStationNumber(currentStationNumber + 1);
        }
    }

    public void prevStation() {
        if (currentStationNumber == 0) {
            currentStationNumber = numberStation - 1;
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
