package us.mattgreen.model;

public class Product
{
    private int productNumber;
    private String productName;
    private String description;
    private double price;
    private String image;

    public Product(int productNumber, String productName, String description, double price, String image)
    {
        this.productNumber = productNumber;
        this.productName = productName;
        this.description = description;
        this.price = price;
        this.image = image;
    }

    public int getProductNumber()
    {
        return productNumber;
    }
    public String getProductName()
    {
        return productName;
    }
    public String getDescription()
    {
        return description;
    }
    public double getPrice()
    {
        return price;
    }
    public String getImage()
    {
        return "images/" + image + ".jpg";
    }
    @Override
    public String toString()
    {
        return price + productName;
    }
}