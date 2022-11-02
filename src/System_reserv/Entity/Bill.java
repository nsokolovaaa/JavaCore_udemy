package System_reserv.Entity;

public class Bill {
    private int sumCosts;

    public Bill(int sumCosts) {
        this.sumCosts = sumCosts;
    }


    public int getSumCosts() {
        return sumCosts;
    }

    public void setSumCosts(int sumCosts) {
        this.sumCosts = sumCosts;
    }
}
