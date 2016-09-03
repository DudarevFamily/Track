package track;

/**
 * Created by Sergey on 28.08.16.
 */
public class Route {

    private int distance;
    private City fromCity;
    private City toCity;

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public City getFromCity() {
        return fromCity;
    }

    public void setFromCity(City fromCity) {
        this.fromCity = fromCity;
    }

    public City getToCity() {
        return toCity;
    }

    public void setToCity(City toCity) {
        this.toCity = toCity;
    }

    @Override
    public String toString() {
        return "Route{" +
                "distance=" + distance +
                ", fromCity=" + fromCity +
                ", toCity=" + toCity +
                '}';
    }
}
