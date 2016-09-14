package track;

/**
 * Created by Sergey on 05.09.16.
 */
public class TrackService {

    /**
     * Узнаем сколько надо бензина на поездку.
     * Узнаем текущий уровень бензина в машине.
     * Сравниваем достаточно ли текущего уровня бензина для поездки. Если да - возвращаем 0.
     * Если нет - вычисляем разницу недостающего бензина и прибавляем ее к текущему уровню.
     * Расходуем бензин на поездку, в конечном городе текущий уровень бензина равен 0.
     **/
    public int petrolFilling(Route route, Track track) {
        int petrolNeeded = petrolConsumpted(route, track);
        int currentPetrol = track.getCurrentPetrol();
        int petrolRefueled;
        if (currentPetrol >= petrolNeeded) {
            petrolRefueled = 0;
        } else {
            petrolRefueled = petrolNeeded - currentPetrol;
            track.setCurrentPetrol(currentPetrol + petrolRefueled);
        }
        return petrolRefueled;
    }

    public City move(Route route, Track track) {
        track.setCurrentCity(route.getToCity());
        calculateSumDistance(route, track);
        int currentPetrol = track.getCurrentPetrol();
        int petrolNeeded = petrolConsumpted(route, track);
        track.setCurrentPetrol(currentPetrol - petrolNeeded);
        System.out.println("Track '" + track.getName() + "' moved from " + route.getFromCity().getName() +
                " to " + route.getToCity().getName() + ". Petrol consumpted: " + petrolNeeded + " litres. " +
                "Total distance: " + track.getSumDistance() + " km.");
        return track.getCurrentCity();
    }

    public int calculateSumDistance(Route route, Track track) {
        track.setSumDistance(track.getSumDistance() + route.getDistance());
        return track.getSumDistance();
    }

    public int petrolConsumpted(Route route, Track track) {
        return route.getDistance() / track.getConsumption();
    }
}