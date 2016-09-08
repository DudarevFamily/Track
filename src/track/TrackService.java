package track;

/**
 * Created by Sergey on 05.09.16.
 */
public class TrackService {


    public int petrolFilling(Route route, Track track) {

        track.setPetrolRefill(petrolConsumpted(route, track));
        return track.getPetrolRefill();
    }

    public int petrolResidue(Route route, Track track) {
        track.setCurrentPetrol(track.getTank() - petrolConsumpted(route, track));
        return track.getCurrentPetrol();
    }

    public City move(Route route, Track track) {

        track.setCurrentCity(route.getToCity());
        return track.getCurrentCity();
    }

    public int counterPath(Route route, Track track) {

        track.setSumDistance(track.getSumDistance()+ route.getDistance());
        return track.getSumDistance();
    }

    public int petrolConsumpted(Route route, Track track) {
        return route.getDistance()/track.getConsumption();
    }
}
