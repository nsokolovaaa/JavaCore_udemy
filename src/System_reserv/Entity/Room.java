package System_reserv.Entity;

public class Room {
     private int numberOfPerson;
     private  int costOfNumber;
     private boolean free;

    public Room(int numberOfPerson, int costOfNumber, boolean free) {
        this.numberOfPerson = numberOfPerson;
        this.costOfNumber = costOfNumber;
        this.free = free;
    }

    public int getNumberOfPerson() {
        return numberOfPerson;
    }

    public void setNumberOfPerson(int numberOfPerson) {
        this.numberOfPerson = numberOfPerson;
    }

    public int getCostOfNumber() {
        return costOfNumber;
    }

    public void setCostOfNumber(int costOfNumber) {
        this.costOfNumber = costOfNumber;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }
}
