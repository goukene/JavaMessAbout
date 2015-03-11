package fifth;

public class SearchPresenterRunner {
    public static void main(String[] args) {
        AdvertRepository advertRepository = new AdvertRepository();
        SearchResultsPage searchResultsPage = new SearchResultsPage(advertRepository);

        searchResultsPage.displaySearchResults();
    }
}
