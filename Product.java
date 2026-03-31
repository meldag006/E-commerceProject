/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopProject;


/**
 *
 * @author Melda
 */
public class Product {

     private String productName;
    private String colour;
    private String category;
    private String size;
    private int numberOfStocks;
    private double weight;
    private String descriptionInf;
    private double price;
   

    public Product(String productName, String colour, String category, String size, int numberOfStocks,double weight, String descriptionInf, double price){
        this.productName = productName;
        this.colour = colour;
        this.category = category;
        this.size = size;
        this.numberOfStocks = numberOfStocks;
        this.weight = weight;
        this.descriptionInf = descriptionInf;
        this.price = price;
        writeAllAtts();
      
       
    }

    public String getProductName() {
        return productName;
    }

    public String getColour() {
        return colour;
    }

    public String getCategory() {
        return category;
    }

    public String getSize() {
        return size;
    }

    public int getNumberOfStocks() {
        return numberOfStocks;
    }
    public double getWeight() {
        return weight;
    }

    public String getDescriptionInf() {
        return descriptionInf;
    }
    
    public double getPrice(){
        return price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    public void setNumberOfStocks(int numberOfStocks) {
        this.numberOfStocks = numberOfStocks;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setDescriptionInf(String descriptionInf) {
        this.descriptionInf = descriptionInf;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public void writeAllAtts(){
        System.out.println("Product Name: " + getProductName());
        System.out.println("Colour: " + getColour());
        System.out.println("Category: " + getCategory());
        System.out.println("Weight: " + getWeight());
        System.out.println("Size: " + getSize());
        System.out.println("Description Information: " + getDescriptionInf());
        System.out.println("Price: " + getPrice() + " TL");
        System.out.println("\n\n");
       }
       
    

    public int reduceStocks(User user){
        if(getNumberOfStocks()>= user.getQuantity()){
            setNumberOfStocks(getNumberOfStocks() - user.getQuantity());
        }
        else{
            System.out.println();
            System.out.println("There is not enough stock. This order cannot be fulfilled. ");
        }
            return getNumberOfStocks();
    }
    public void queryingNumberOfStocks(){
        System.out.println();
        System.out.println(getProductName()+" has "+ getNumberOfStocks()+" stocks now");
       
    }
    
  
    
}


      