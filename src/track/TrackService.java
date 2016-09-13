package track;

/**
 * Created by Sergey on 05.09.16.
 */
public class TrackService {

    int petrolRefill;
    /**
     * Мы должны заправить бензин до начала движения.
     * Мы должны знать  максимальное расстояние движения с полным баком бензина.
     * Если бензина хватает на весь роут - мы заправляемся в конечном городе, если нет - дозаправляемся до полного бака.
     * В конечном городе заправляемся до полного бака.
     **/
    public int petrolFilling(Route route, Track track) {
        petrolRefill = track.getTank();
        int maxDistance = track.getConsumption() * petrolRefill;
        if (maxDistance > route.getDistance()) {
            petrolRefill += petrolConsumpted(route, track);
        } else {
            petrolRefill = track.getTank();
            petrolRefill += petrolConsumpted(route, track);
        }
        return petrolRefill;
    }

     // Движение начинаем после заправки машины.

    public City move(Route route, Track track) {
        track.setCurrentCity(route.getFromCity());
        if(petrolRefill>0) {
            track.setCurrentCity(route.getToCity());
        }
        return track.getCurrentCity();
    }

    public int counterPath(Route route, Track track) {
        track.setSumDistance(track.getSumDistance() + route.getDistance());
        return track.getSumDistance();
    }
    public int petrolConsumpted(Route route, Track track) {
        return route.getDistance() / track.getConsumption();
    }

    public int getPetrolRefill() {
        return petrolRefill;
    }

    public void setPetrolRefill(int petrolRefill) {
        this.petrolRefill = petrolRefill;
    }
}