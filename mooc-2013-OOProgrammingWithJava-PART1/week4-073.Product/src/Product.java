/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aboud
 */
public class Product {
    private String nameOfProduct;
    private double price;
    private int amount;
    
    public Product(String nameAtStart, double priceAtStart, int amountAtStart){
        this.nameOfProduct = nameAtStart;
        this.price = priceAtStart;
        this.amount = amountAtStart;
    }
    
    public void printProduct(){
        System.out.println(this.nameOfProduct + ", price " + this.price +
                ", amount "  + this.amount);
    }
    
}
