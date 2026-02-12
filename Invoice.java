package src.invoice;
public class Invoice {
    private String PartNum;
    private String PartDescript;
    private int quantity;
    private double price;
    public Invoice(String PartNum, String PartDescript, int quantity, double price) {
        this.PartNum = PartNum;
        this.PartDescript = PartDescript;
        this.quantity = quantity;
        this.price = price;
    }
    public String getPartNum()
    {
        return PartNum;
    }
    public void setPartNum(String PartNum)
    {
        this.PartNum = PartNum;
    }
    public String getPartDescript()
    {
        return PartDescript;
    }
    public void setPartDescript(String PartDescript)
    {
        this.PartDescript = PartDescript;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public void setQuantity(int quantity)
    {
        if(quantity < 0)
        {
            this.quantity = 0;
        }
        this.quantity = quantity;
    }
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price)
    {
        if(price < 0){
            this.price = 0;
        }
        this.price = price;
    }
}

