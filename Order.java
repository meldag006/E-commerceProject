/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopProject;

import java.util.Scanner;



/**
 *
 * @author Melda
 */
public class Order {
 User user;
    Product product;
    CreditCard creditCard;
    
    public Order(User user, Product product, int quantity, CreditCard creditCard, String address){
        this.product = product;
        this.user = user;
        this.creditCard = creditCard;
      
        System.out.println("\n\nDo you want to complete ordering");
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();
        if(answer.equalsIgnoreCase("YES")){
            user.productOrdering(product, quantity, creditCard, address);
            product.reduceStocks(user);
        }
        else{
            System.out.println("Your order has been cancelled.\n");
        }
    }
    
}

    
    
    

