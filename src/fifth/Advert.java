package fifth;

public class Advert {
    private String title;
    private int price;
    private String imageUri;
    private String [] advertBulletPoints;
    private String ownerPhoneNumber;

    public Advert(String title, int price, String imageUri, String[] advertBulletPoints, String ownerPhoneNumber) {
        this.title = title;
        this.price = price;
        this.imageUri = imageUri;
        this.advertBulletPoints = advertBulletPoints;
        this.ownerPhoneNumber = ownerPhoneNumber;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public String getImageUri() {
        return imageUri;
    }

    public String[] getAdvertBulletPoints() {
        return advertBulletPoints;
    }

    public String getOwnerPhoneNumber() {
        return ownerPhoneNumber;
    }
}
