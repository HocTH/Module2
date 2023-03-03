package model;

public class CreditCard extends Card{
   private int duNo=0;
   private int hanMuc;

    public CreditCard(int id, String numCard, String cardHolder, String identifyCard, String address, int duNo, int hanMuc) {
        super(id, numCard, cardHolder, identifyCard, address);
        this.duNo = duNo;
        this.hanMuc = hanMuc;
    }

    public CreditCard(int duNo, int hanMuc) {
        this.duNo = duNo;
        this.hanMuc = hanMuc;
    }

    public CreditCard() {
    }

    public int getDuNo() {
        return duNo;
    }

    public void setDuNo(int duNo) {
        this.duNo = duNo;
    }

    public int getHanMuc() {
        return hanMuc;
    }

    public void setHanMuc(int hanMuc) {
        this.hanMuc = hanMuc;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "id="+getId()+
                ", numCard=" + getNumCard() +
                ", cardHolder=" + getCardHolder() +
                ", identifyCard=" + getIdentifyCard() +
                ", address=" + getAddress() +
                ", duNo=" + duNo +
                ", hanMuc=" + hanMuc +
                "} " ;
    }

    @Override
    public String showInformation() {
        return "CreditCard={" +"id="+getId()+
                ", numCard=" + getNumCard() +
                ", cardHolder=" + getCardHolder() +
                ", identifyCard=" + getIdentifyCard() +
                ", address=" + getAddress() +
                ", duNo=" + duNo +
                ", hanMuc=" + hanMuc +
                "} " ;
    }

    @Override
    public String getInformationToTXT() {
        return  getId()+","+
                getNumCard() +
                "," + getCardHolder() +
                "," + getIdentifyCard() +
                "," + getAddress() +
                "," + duNo+
                "," + hanMuc;
    }
}
