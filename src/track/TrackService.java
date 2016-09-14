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

        petrolConsumpted(route, track);
        track.getCurrentPetrol();
        if (track.getCurrentPetrol()>=petrolConsumpted(route, track))
            return 0;
         else {
            track.setCurrentPetrol(track.getCurrentPetrol() + (petrolConsumpted(route, track) - track.getCurrentPetrol()));
            track.setCurrentPetrol(petrolConsumpted(route, track) - track.getCurrentPetrol());
        }
            return track.getCurrentPetrol();
    }

    public City move(Route route, Track track) {

        track.setCurrentCity(route.getToCity());

        return track.getCurrentCity();
    }

    public int calculatorSumDistance(Route route, Track track) {
        track.setSumDistance(track.getSumDistance() + route.getDistance());
        return track.getSumDistance();
    }

    public int petrolConsumpted(Route route, Track track) {
        return route.getDistance() / track.getConsumption();
    }
}