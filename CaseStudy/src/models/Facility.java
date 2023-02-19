package models;

public  abstract  class Facility {
    private String id;
    private String serviceName;
    private double usableArea;
    private double rentalCosts;
    private int maxPeople;
    private String rentalType;
    private int numberOfUses;
    public Facility(){};

    public Facility(String id, String serviceName, double usableArea, double rentalCosts, int maxPeople, String rentalType, int numberOfUses) {
        this.id = id;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCosts = rentalCosts;
        this.maxPeople = maxPeople;
        this.rentalType = rentalType;
        this.numberOfUses = numberOfUses;
    }

    public String getId() {
        return id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public double getRentalCosts() {
        return rentalCosts;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public int getNumberOfUses() {
        return numberOfUses;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public void setRentalCosts(double rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public void setNumberOfUses(int numberOfUses) {
        this.numberOfUses = numberOfUses;
    }

    @Override
    public String toString() {
        return "Facility{ " + "id = "+ id + " , serviceName=" + serviceName+
                " , usableArea="+usableArea+
                " , rentalCost="+ rentalCosts+
                " , maxPeople= "+ maxPeople+
                " , rentalType="+rentalType+
                " , numberOfUses="+numberOfUses+"}";
    }
    public abstract String showInfor();
}
