package ru.netology.maven;

public class Radio {
    protected int currentStation;
    protected int currentVolume;
    protected int maxStation;
    protected int minStation;

    public Radio() {
        maxStation = 9;
        minStation = 0;

    }

    public Radio(int stationCount) {
        maxStation = stationCount - 1;

    }


    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }

        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;

    }

    public void next() {
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
            return;
        } else {
            currentStation = minStation;
        }
    }

    public void prev() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
    }


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;

        }
    }


    public void setMaxStation() {
        currentStation = maxStation;
    }

    public void setMinStation() {
        currentStation = minStation;
    }

    public void currentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;

        }
        this.currentVolume = currentVolume;

    }
}