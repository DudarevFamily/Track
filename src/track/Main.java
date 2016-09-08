package track;

/**
 * Created by Sergey on 28.08.16.
 */
public class Main {

    public static void main(String[] args) {

        Main main = new Main();

        City dnepr = main.createCity("Dnepr", 1_000_000);
        City kiev = main.createCity("Kiev", 3_000_000);
        City lviv = main.createCity("Lviv", 700_000);
        City warshawa = main.createCity("Varshava", 2_000_000);

        Route dneprKievRoute = main.createRoute(dnepr, kiev, 500);
        Route kievDneprRoute = main.createRoute(kiev, dnepr, 500);
        Route dneprLvivRoute = main.createRoute(dnepr, lviv, 900);
        Route lvivDneprRoute = main.createRoute(lviv, dnepr, 900);
        Route dneprWarshawaRoute = main.createRoute(dnepr, warshawa, 1300);

        Track track = new Track();
        track.setName("Volvo");
        track.setTank(100);
        track.setConsumption(10);
        track.setCurrentCity(dnepr);

        TrackService trackService = new TrackService();

        System.out.println(track);
        System.out.println("Track moved: ");
        trackService.move(dneprLvivRoute, track);
        trackService.petrolResidue(dneprLvivRoute, track);
        trackService.counterPath(dneprLvivRoute, track);
        trackService.petrolFilling(dneprLvivRoute, track);
        System.out.println(track);
    }

    private City createCity(String name, int population) {
        City city = new City();
        city.setName(name);
        city.setPopulation(population);
        return city;
    }

    private Route createRoute(City fromCity, City toCity, int distance) {
        Route route = new Route();
        route.setFromCity(fromCity);
        route.setToCity(toCity);
        route.setDistance(distance);
        return route;
    }
}
