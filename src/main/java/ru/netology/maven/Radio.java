package ru.netology.maven;

    public class Radio {
        public int currentStation;
        public int currentVolume;

        public int getCurrentStation() {
            return currentStation;
        }
        public int getCurrentVolume() {
            return currentVolume;
        }

        public void setCurrentStation(int newCurrentStation) {
            if (newCurrentStation < 0) {
                newCurrentStation = 9;
                return;
            }
            if (newCurrentStation > 9) {
                return;
            }
            currentStation = newCurrentStation;

        }

        public void setCurrentVolume(int newCurrentVolume) {
            if (newCurrentVolume < 0) {
                return;
            }
            if (newCurrentVolume > 10) {
                return;

            }
            currentVolume = newCurrentVolume;

        }

        public void increaseStation() {
            if (currentStation < 9) {
                currentStation = currentStation + 1;
            }
        }

        public void increaseVolume() {
            if (currentVolume < 10) {
                currentVolume = currentVolume + 1;
            }
        }


        public void setMaxStation() {
            currentStation = 9;
        }

        public void setMinStation() {
            currentStation = 0;
        }
        public void setMaxVolume() {
            currentVolume = 10;
        }

        public void setMinVolume() {
            currentVolume = 0;
        }

    }
