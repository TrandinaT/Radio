public class Radio {
    private int station;
    private int sound;


    public void next() {
        if (station < 9) {
            station++;
        } else {
            station = 0;
        }
    }

    public void prev() {
        if (station > 0) {
            station--;
        } else {
            station = 9;
        }
    }

    public void increaseSound() {
        if (sound < 10) {
            sound++;
        } else {
            sound = 0;
        }
    }

    public void turnDownTheSound() {
        if (sound > 0) {
            sound--;
        } else {
            sound = 10;
        }
    }

    public int getStation() {
        return station;
    }

    public void setStation(int station) {
        if (station < 0) {
            return;
        }
        if (station > 9) {
            return;
        }
        this.station = station;
    }

    public int getSound() {
        return sound;
    }

    public void setSound(int sound) {
        if (sound < 0) {
            return;
        }
        if (sound > 10) {
            return;
        }
        this.sound = sound;
    }
}

