package ShoppingApplication;

public class Item {
	 public String itemId ;
     public float price;
	public String getitemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		itemId = itemId;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		price = price;
	}
	
	public Item(String itemId)
    {
        this.itemId = itemId;
        switch (itemId)
        {
            case "A":
                this.price = 50;

                break;
            case "B":
                this.price = 30;

                break;
            case "C":
                this.price = 20;

                break;
            case "D":
                this.price = 15;
                break;
        }
    }

}
