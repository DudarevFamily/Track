package track;

/**
 * Created by Sergey on 05.09.16.
 */
public class ServiceTrack {

    private int currentPetrol;
    private int petrolRefill;

    Track track = new Track();

    public int petrolFilling(Route route) {
        currentPetrol = track.getTank() - track.petrolConsumpted(route);
        petrolRefill = track.petrolConsumpted(route);
        return petrolRefill;
    }

    public int getCurrentPetrol() {
        return currentPetrol;
    }

    public void setCurrentPetrol(int currentPetrol) {
        this.currentPetrol = currentPetrol;
    }

    public int getPetrolRefill() {
        return petrolRefill;
    }

    public void setPetrolRefill(int petrolRefill) {
        this.petrolRefill = petrolRefill;
    }

}
