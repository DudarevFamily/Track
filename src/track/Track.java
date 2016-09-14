package track;

/**
 * Created by Sergey on 28.08.16.
 */
public class Track {

    private int maxTank;
    private int consumption;
    private String name;
    private City currentCity;
    private int sumDistance;
    private int currentPetrol;

    public int getMaxTank() {
        return maxTank;
    }

    public void setMaxTank(int maxTank) {
        this.maxTank = maxTank;
    }

    public int getCurrentPetrol() {
        return currentPetrol;
    }

    public void setCurrentPetrol(int currentPetrol) {
        this.currentPetrol = currentPetrol;
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
                "tank max=" + maxTank +
                ", full distance=" + sumDistance +
                ", consumption=" + consumption +
                ", current pertol=" + currentPetrol +
                ", name='" + name + '\'' +
                ", currentCity= " + currentCity+"}";
    }


}
