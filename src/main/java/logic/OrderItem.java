package logic;

public class OrderItem {
    private Item item;
    private int itemAmount;

    //constructor
    public OrderItem(Item item, int itemAmount){
        setItem(item);
        setItemAmount(itemAmount);
    }

    //method
    public void increaseItemAmount(int amount){
        if(amount >= 0){
            setItemAmount(getItemAmount() + amount);
        }
    }

    public int calculateTotalPrice(){
        int total = item.getPricePerPiece()*getItemAmount();
        return total;
    }

    public void setItemAmount(int itemAmount){
        if(itemAmount < 0){
            itemAmount = 0;
        }
        this.itemAmount = itemAmount;
    }


    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getItemAmount() {
        return itemAmount;
    }
}
