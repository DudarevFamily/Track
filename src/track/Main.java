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
        City varshava = main.createCity("Varshava", 2_000_000);

        Track track = new Track();
        track.setName("Volvo");
        track.setTank(100);
        track.setConsumption(10);
        track.setCurrentCity(dnepr);

        TrackService trackService = new TrackService();

        Route dneprKievRoute = main.createRoute(dnepr, kiev, 500);
        Route kievDneprRoute = main.createRoute(kiev, dnepr, 500);
        Route dneprLvivRoute = main.createRoute(dnepr, lviv, 900);
        Route lvivDneprRoute = main.createRoute(lviv, dnepr, 900);
        Route dneprVarshavaRoute = main.createRoute(dnepr, varshava, 1300);
        Route varshavaDneprRoute = main.createRoute(varshava, dnepr, 1300);


        System.out.println(track);
        System.out.println("Track moved: ");
        trackService.petrolFilling(varshavaDneprRoute, track);
        trackService.move(varshavaDneprRoute, track);
        trackService.counterPath(varshavaDneprRoute, track);

        System.out.println(track+", petrol refill="+trackService.getPetrolRefill());
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
