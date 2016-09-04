package track;

/**
 * Created by Sergey on 28.08.16.
 */
public class Main {

    public static void main(String[] args) {
        City dnepr = new City();
        City kiev = new City();
        City lviv = new City();
        City varshava = new City();

        dnepr.createCity("Dnepr", 1_000_000);
        kiev.createCity("Kiev", 3_000_000);
        lviv.createCity("Lviv", 700_000);
        warshawa.createCity("Varshava", 2_000_000);

        Route dneprKievRoute = new Route();
        Route kievDneprRoute = new Route();
        Route dneprLvivRoute = new Route();
        Route lvivDneprRoute = new Route();
        Route dneprWarshawaRoute = new Route();

        Route dneprKievRoute = dneprKievRoute.createRoute(dnepr, kiev, 500);
        Route kievDneprRoute = kievDneprRoute.createRoute(kiev, dnepr, 500);
        Route dneprLvivRoute = dneprLvivRoute.createRoute(dnepr, lviv, 900);
        Route lvivDneprRoute = lvivDneprRoute.createRoute(lviv, dnepr, 900);
        Route dneprWarshawaRoute = dneprWarshawaRoute.createRoute(dnepr, warshawa, 1300);

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

    private City createCity(String name, int population) {

        city.setName(name);
        city.setPopulation(population);
        return city;
    }

    private Route createRoute(City fromCity, City toCity, int distance) {

        route.setFromCity(fromCity);
        route.setToCity(toCity);
        route.setDistance(distance);
        return route;
    }

}
