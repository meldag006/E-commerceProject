/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopProject;

import java.util.ArrayList;

/**
 *
 * @author Melda
 */
public class User {

    
    private String userName;
    private String name;
    private String surname;
    private String dateOfBirth;
    private String password;
    private String email;
    private String homeAddress;
    private String workAddress;
    private int quantity;
    private ArrayList<Product> productsOrdered= new ArrayList<>();;
    private ArrayList<Product> favoriteProducts= new ArrayList<>();;
    private ArrayList<CreditCard> creditCard= new ArrayList<>();;
    private ArrayList<Integer> quantities = new ArrayList<>();
    
    public User(String userName, String name, String surname, String dateOfBirth, String password, String email, String homeAddress, String workAddress){
        this.userName = userName;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
        this.email = email;
        this.homeAddress = homeAddress;
        this.workAddress = workAddress;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantities(int index){
        return this.quantities.get(index);
    }
    
    public Product getProductsOrderedByIndex(int index){
        return this.productsOrdered.get(index);
    }
    
    public Product getFavoriteProductsByIndex(int index){
        return this.favoriteProducts.get(index);
    }
    
    public CreditCard getCreditCardByIndex(int index){
        return this.creditCard.get(index);
    }
    
    public void productOrdering(Product p, int quantity, CreditCard c, String address){
        this.quantity= quantity;
        if((quantity<=p.getNumberOfStocks()) && (quantity>0)){
                            
        productsOrdered.add(p);

        quantities.add(quantity);
        
        if(!creditCard.contains(c)){
            creditCard.add(c);
        }
            System.out.println("\n\n-------------------------------");
        System.out.println("\nYour Order Informations: ");
        System.out.println(p.getProductName() + " x" + quantity + "   " + p.getPrice()*quantity + "TL\n" );
        System.out.println("Credit Card Number: ************" + c.getCreditCardNumber().substring(12));
        System.out.println("Adress Information For This Order: " + address);
            System.out.println("\n------------------------------\n\n");
        }
    }
    
    public void productFavorite(Product p){
        if(!favoriteProducts.contains(p)){
            favoriteProducts.add(p);
        }
    }
    public void viewProfile(){
        System.out.println("\n\n"+getName()+" "+getSurname()+"'s Account\n");
        System.out.println("Your favorite products: ");
        for(Product p : favoriteProducts){
            System.out.println(p.getProductName()+" ");   
        }
        System.out.println();
        System.out.println("Your ordered products: ");
        for(int i = 0; i < productsOrdered.size(); i++){
            Product p = getProductsOrderedByIndex(i);
            int q = getQuantities(i);
            System.out.println(p.getProductName() + " x" + q);
        }
        System.out.println();
        System.out.println("Your credit cards: ");
        for(CreditCard c : creditCard){
            System.out.println(c.getCreditCardNumber() + " ");
        }
    }
}


   
    
    
     

            
           

    
   