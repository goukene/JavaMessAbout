package fifth;

public class SearchResultsPage {

    private AdvertRepository advertRepository;

    public SearchResultsPage(AdvertRepository advertRepository) {
        this.advertRepository = advertRepository;
    }

    public void displaySearchResults() {
        Advert[] advertsArray = advertRepository.getAdvertsArray();

        for (int i = 0; i < advertsArray.length; i++) {
            String display = searchResultsPageDisplay(advertsArray[i]);

            System.out.println(display);
            System.out.println("****************************");
        }
    }

    private String searchResultsPageDisplay(Advert advert) {
        String display = advert.getTitle();

        display = display + "\t\t" + advert.getOwnerPhoneNumber() + "\n";
        display += advert.getPrice();

        return display;
    }
}
