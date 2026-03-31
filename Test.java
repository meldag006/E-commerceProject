/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oopProject;

/**
 *
 * @author Melda
 */
public class Test{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User u1 = new User("feyzaozdemir", "Feyza", "Ozdemir", "12.03.2005", "feyza123", "feyzaozdemir@email.com", "Efeler/Aydin", "Yunusemre/Manisa");
        User u2 = new User("meldagungor", "Melda", "Gungor", "27.03.2004", "melda06", "meldagungor06@email.com", "Mamak/Ankara", "Yunusemre/Manisa");
        User u3 = new User("kubratemur", "Kubra", "Temur", "04.05.2005", "kubra123", "kubratemur@email.com", "Arnavutkoy/Istanbul", "Yunusemre/Manisa");
        
        CreditCard c1 = new CreditCard("1111111111111111", "Feyza Ozdemir","123", "12/36");
        CreditCard c2 = new CreditCard("2222222222222222", "Melda Gungor", "244", "12/30");
        CreditCard c3 = new CreditCard("3333333333333333", "Kubra Temur",  "968", "09/32");
        CreditCard c4 = new CreditCard("4444444444444444", "Melda Gungor", "777", "05/29");
        
        Product p1 = new Product("Old Season T-Shirt", "Yellow", "Clothing", "S", 10, 5.1, "It has a soft fabric and is oversize.", 699.99);
        Product p2 = new Product("New Season T-Shirt", "Yellow", "Clothing", "M", 10, 6.1, "It has a stiff fabric and wraps the body.", 599.99);
        Product p3 = new Product("Satchel bag","Brown","Bag","",30,100.0,"It is very useful for school",400.1);
        Product p4 = new Product("High heels shoes","Black","Shoe","38",20,200.2,"It is recommended to buy one size larger.",1500.0);
        Product p5 = new Product("The Little Prince book","","Book&Stationery&Hobby","",5,50.0,"This book is not only for children.",200.0);
        Product p6= new Product ("Victoria's Secret bare vanilla body mist","","Cosmetics","",55,100.8,"Every particle deserves to be celebrated.",1350.0);
        Product p7 = new Product("Lenovo gaming laptop","","Electronics","",1,2200.0,"LENOVO LOQ AMD Ryzen 5-7235HS Gaming Laptop",25999.9);
        Product p8 = new Product("Philips Avent Baby Bottle","","Mother&Baby","",8,55.0,"It makes your baby's feeding experience more comfortable",489.99);
        
        u1.productFavorite(p1);
        
        Order o1 = new Order(u1,p1,7,c1,u1.getHomeAddress());
        
         p1.queryingNumberOfStocks();
        
        Order o2 = new Order(u3,p1,2,c3,u3.getWorkAddress());
        
       p1.queryingNumberOfStocks();
         
         u3.productFavorite(p6);
        
       Order o3 = new Order(u2,p1,3,c2,u2.getWorkAddress()); 
        
        p1.queryingNumberOfStocks();
        
        u3.productFavorite(p7);
        
       u2.productFavorite(p5);
        
        Order o4 = new Order(u2,p3,4,c4,u2.getHomeAddress());
        
      p3.queryingNumberOfStocks();
        
       u3.productFavorite(p2);
       
       Order o5= new Order(u1,p5,1,c1,u1.getWorkAddress());
        
       u1.productFavorite(p2);
             
       Order o6= new Order(u3,p5,2,c2,u3.getWorkAddress());
       
       p8.queryingNumberOfStocks(); 
        
       Order o7= new Order(u2,p6,2,c3,u2.getHomeAddress());
        
       Order o8= new Order(u1,p7,2,c1,u1.getHomeAddress());  
        
        u3.productFavorite(p6);
        
        u1.viewProfile();
        
        u2.viewProfile();
        
        u3.viewProfile();
    }
}
     
    
    

