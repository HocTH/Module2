package model;

public abstract class Card {
    protected int id;
    private String numCard;
    private String cardHolder;
    private String identifyCard;
    private String address;

    public Card(int id, String numCard, String cardHolder, String identifyCard, String address) {
        this.id = id;
        this.numCard = numCard;
        this.cardHolder = cardHolder;
        this.identifyCard = identifyCard;
        this.address = address;
    }

    public Card() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumCard() {
        return numCard;
    }

    public void setNumCard(String numCard) {
        this.numCard = numCard;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getIdentifyCard() {
        return identifyCard;
    }

    public void setIdentifyCard(String identifyCard) {
        this.identifyCard = identifyCard;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Card{" +
                "id="+ id+
                ", numCard=" + numCard  +
                ", cardHolder=" + cardHolder +
                ", identifyCard=" + identifyCard  +
                ", address=" + address +
                '}';
    }
    public abstract String showInformation();
    public abstract String getInformationToTXT();
}
