package logic;

import java.util.ArrayList;

public class Order {
	private ArrayList<OrderItem> orderItemList;
	private static int totalOrderCount = 0;
	private int orderNumber;
	//constructor
	public Order() {
		// TODO
        orderItemList = new ArrayList<>();
        orderNumber = totalOrderCount++;
	}

    //method
	public OrderItem addItem(Item item, int amount) {
		// TODO
		// Loop the orderItemList to find if item of any orderItem equals to the given item
		// if there is orderItem with given item, increase that orderItem itemAmount with amount
		// and return that orderItem
        for(OrderItem orderItem : orderItemList) {
            if (orderItem.getItem().getName().equals(item.getName())) {
                orderItem.increaseItemAmount(amount);
                return orderItem;
            }
        }
		// else create new orderItem with given item and amount, then return the new orderItem
            OrderItem neworder = new OrderItem(item,amount);
            orderItemList.add(neworder);
            return neworder;
    }

	public int calculateOrderTotalPrice() {
		// TODO
		// Calculate total price of the order by summing total price of each orderItem in orderItemList
		int totalprice = 0;
        for(OrderItem orderItem : orderItemList){
            totalprice += orderItem.calculateTotalPrice();
        }
        return totalprice;
	}

	public static int getTotalOrderCount() {
		return totalOrderCount;
	}
	
	public static void resetTotalOrderCount() {
		totalOrderCount = 0;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public ArrayList<OrderItem> getOrderItemList() {
		return orderItemList;
	}

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public static void setTotalOrderCount(int totalOrderCount) {
        Order.totalOrderCount = totalOrderCount;
    }


    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
}