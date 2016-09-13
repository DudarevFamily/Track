package track;

/**
 * Created by Sergey on 28.08.16.
 */
public class Track {

    private int tank;
    private int consumption;
    private String name;
    private City currentCity;
    private int sumDistance;

    public int getTank() {
        return tank;
    }

    public void setTank(int tank) {
        this.tank = tank;
    }

    public City getCurrentCity() {
        return currentCity;
    }

    public void setCurrentCity(City currentCity) {
        this.currentCity = currentCity;
    }

    public int getSumDistance() {
        return sumDistance;
    }

    public void setSumDistance(int sumDistance) {
        this.sumDistance = sumDistance;
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
        return "Track {" +
                "tank=" + tank +
                ", full distance=" + sumDistance +
                ", consumption=" + consumption +
                ", name='" + name + '\'' +
                ", currentCity= " + currentCity+"}";
    }
}
