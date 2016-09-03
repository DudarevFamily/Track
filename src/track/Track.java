package track;

/**
 * Created by Sergey on 28.08.16.
 */
public class Track {
    private int tank;
    private int consumption;
    private String name;
    private City currentCity;
    private int refill;
    private int sum;

    public int move(Route route) {

        if (tank>10)
        tank = tank - petrolConsumpted(route);
        else
            filling(route);
        currentCity = route.getToCity();
        return tank;}

    public int filling(Route route) {
            refill = 100 - tank;
        tank += refill;
        return tank;
        }

    public int sumDistance (Route route) {
        sum += route.getDistance();
        return sum; }

    public int petrolConsumpted(Route route) {
        return route.getDistance()/getConsumption();
    }

    public int getRefill() {
        return refill;
    }

    public void setRefill(int refill) {
        this.refill = refill;
    }

    public City getCurrentCity() {
        return currentCity;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void setCurrentCity(City currentCity) {
        this.currentCity = currentCity;
    }

    public int getTank() {
        return tank;
    }

    public void setTank(int tank) {
        this.tank = tank;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public String getName() {
        if (name == null) {
            name = "Default";
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Track{" +
                "tank=" + tank +
                ", full distance=" + sum +
                ", consumption=" + consumption +
                ", full refill=" + refill +
                ", name='" + name + '\'' +
                ", currentCity=" + currentCity +
                '}';
    }

}
