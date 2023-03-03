package model;

public class ATM extends Card {
    private int soDu=0;

    public ATM(int id, String numCard, String cardHolder, String identifyCard, String address, int soDu) {
        super(id, numCard, cardHolder, identifyCard, address);
        this.soDu = soDu;
    }


    public ATM() {
    }

    public int getSoDu() {
        return soDu;
    }

    public void setSoDu(int soDu) {
        this.soDu = soDu;
    }

    @Override
    public String toString() {
        return "ATM{" +"id="+getId()+
                ", numCard=" + getNumCard() +
                ", cardHolder=" + getCardHolder() +
                ", identifyCard=" + getIdentifyCard() +
                ", address=" + getAddress() +
                ", soDu=" + soDu +
                "} ";
    }

    @Override
    public String showInformation() {
        return "ATM{" +"id="+getId()+
                ", numCard=" + getNumCard() +
                ", cardHolder=" + getCardHolder() +
                ", identifyCard=" + getIdentifyCard() +
                ", address=" + getAddress() +
                ",  soDu=" + soDu +
                "} ";
    }

    public String getInformationToTXT() {
        return  getId()+","+
                getNumCard() +
                "," + getCardHolder() +
                "," + getIdentifyCard() +
                "," + getAddress() +
                "," + soDu;
    }
}
