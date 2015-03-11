package fifth;

import java.util.ArrayList;
import java.util.List;

public class AdvertRepository {

    private final List<Advert> advertsDatabase = new ArrayList<Advert>();

    //Constructor
    public AdvertRepository() {
        initialiseDatabase();
    }

    //initialising method called from constructor above to put 'data' into db
    private void initialiseDatabase() {
        Advert advert1 = new Advert("Ford Fiesta", 2000, "/image1", new String[]{"Electric windows", "Manual"}, "444-3456");
        Advert advert2 = new Advert("Ford Focus", 3000, "/image2", new String[]{"4 Doors", "Manual"}, "333-3456");
        Advert advert3 = new Advert("Vauxhall Corsa", 2000, "/image3", new String[]{"Spare wheel", "Automatic"}, "222-3456");
        Advert advert4 = new Advert("Renault Clio", 2000, "/image4", new String[]{"Red", "Manual"}, "444-3456");
        Advert advert5 = new Advert("Volkswagen Golf", 2000, "/image5", new String[]{"Gti", "Manual"}, "111-3456");
        Advert advert6 = new Advert("Ford Ka", 2000, "/image6", new String[]{"Cheap runner", "Manual"}, "333-3456");
        Advert advert7 = new Advert("Toyota Corolla", 2000, "/image7", new String[]{"Reliable", "Manual"}, "555-3456");
        Advert advert8 = new Advert("Toyota Yaris", 2000, "/image8", new String[]{"Some damage", "Manual"}, "666-3456");
        Advert advert9 = new Advert("Nissan Note", 2000, "/image9", new String[]{"2 Owners", "Automatic"}, "444-3456");

        advertsDatabase.add(advert1);
        advertsDatabase.add(advert2);
        advertsDatabase.add(advert3);
        advertsDatabase.add(advert4);
        advertsDatabase.add(advert5);
        advertsDatabase.add(advert6);
        advertsDatabase.add(advert7);
        advertsDatabase.add(advert8);
        advertsDatabase.add(advert9);
    }


    //get all adds to display in search results page
    public List<Advert> getAdverts() {
        return advertsDatabase;
    }

    public Advert[] getAdvertsArray() {
        Advert[] adverts = new Advert[advertsDatabase.size()];

        for (int i = 0; i < adverts.length; i++) {
            adverts[i] = advertsDatabase.get(i);  //questionable..
        }

        return adverts;
    }

    //get a particular advert by id number to display in FPA
    public Advert getAdvertById(int id) {
        return advertsDatabase.get(id);
    }
}
