package ru.netology.maven;

public class Radio {
    protected int currentStation;
    protected int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }

        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;

    }

    public void next() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
            return;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = 9;
        }
    }


     public void setMaxStation() {
        currentStation = 9;
    }

    public void setMinStation() {
        currentStation = 0;
    }

    public void currentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;

        }
        this.currentVolume = currentVolume;

    }

}


