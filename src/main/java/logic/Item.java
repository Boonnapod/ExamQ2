package logic;

public class Item {
    private String name;
    private int pricePerPiece;


    //constructor
    public Item(String name, int pricePerPiece){
        setName(name);
        setPricePerPiece(pricePerPiece);
    }

    //method
    public void setPricePerPiece(int pricePerPiece){
        if(pricePerPiece < 1){
            this.pricePerPiece = 1;
        }else{
            this.pricePerPiece = pricePerPiece;
        }
    }

    public int getPricePerPiece() {
        return pricePerPiece;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
