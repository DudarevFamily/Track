package track;

/**
 * Created by Sergey on 28.08.16.
 */
public class Main {

    public static void main(String[] args) {
        City dnepr = createCity("Dnepr", 1_000_000);
        City kiev = createCity("Kiev", 3_000_000);
        City lviv = createCity("Lviv", 700_000);
        City warshawa = createCity("Varshava", 2_000_000);

        Route dneprKievRoute = createRoute(dnepr, kiev, 500);
        Route kievDneprRoute = createRoute(kiev, dnepr, 500);
        Route dneprLvivRoute = createRoute(dnepr, lviv, 900);
        Route lvivDneprRoute = createRoute(lviv, dnepr, 900);
        Route dneprWarshawaRoute = createRoute(dnepr, warshawa, 1300);

        Track track = new Track();
        track.setName("Volvo");
        track.setTank(100);
        track.setConsumption(10);
        track.setCurrentCity(dnepr);

        System.out.println(track);
        System.out.println("Track moved: ");
        track.move(dneprKievRoute);
        track.filling(dneprKievRoute);
        track.sumDistance(dneprKievRoute);
        System.out.println(track);
    }

    private static City createCity(String name, int population) {
        City city = new City();
        city.setName(name);
        city.setPopulation(population);
        return city;
    }

    private static Route createRoute(City fromCity, City toCity, int distance) {
        Route route = new Route();
        route.setFromCity(fromCity);
        route.setToCity(toCity);
        route.setDistance(distance);
        return route;
    }

}
