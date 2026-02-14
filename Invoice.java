public class Invoice{
    public String partNumber = null;
    public String partDescription = null;
    public Integer partQuantity = null;
    public Double partPrice = null;

    public Invoice(String number, String description, Integer quantity, Double price){
        this.partNumber = number;
        this.partQuantity = quantity;
        this.partDescription = description;
        this.partPrice = price;
    }

    // get part
    public String getNumber(){
        return partNumber;
    }
    public String getDescription(){
        return partDescription;
    }
    public Integer getQuantity(){
        return partQuantity;
    }
    public Double getPrice(){
        return partPrice;
    }


    // set
    public void setNumber(String number){
        this.partNumber = number;
    }
    public void setDescription(String description){
        this.partDescription = description;
    }
    public void setQuantity(Integer quantity){
        this.partQuantity = Math.max(quantity, 0);
    }
    public void setPrice(Double price){
        this.partPrice = Math.max(price, 0.0d);
    }

    public Double getInvoiceAmount(){
        return (Double)((this.partQuantity * 1.0d) * this.partPrice);
    }


}