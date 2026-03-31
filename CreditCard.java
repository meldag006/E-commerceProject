/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopProject;

/**
 *
 * @author Melda
 */
public class CreditCard {
   
    private String creditCardNumber;
    private String creditCardUser;
    private String securityCode;
    private String expirationDateOfCreditCard;
    
    public CreditCard (String creditCardNumber, String creditCardUser, String securityCode, String expirationDateOfCreditCard){
     this.creditCardNumber=creditCardNumber;
     this.creditCardUser=creditCardUser;
     this.securityCode = securityCode;
     this.expirationDateOfCreditCard=expirationDateOfCreditCard;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getCreditCardUser() {
        return creditCardUser;
    }

    public void setCreditCardUser(String creditCardUser) {
        this.creditCardUser = creditCardUser;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public String getExpirationDateOfCreditCard() {
        return expirationDateOfCreditCard;
    }

    public void setExpirationDateOfCreditCard(String expirationDateOfCreditCard) {
        this.expirationDateOfCreditCard = expirationDateOfCreditCard;
    }
}



