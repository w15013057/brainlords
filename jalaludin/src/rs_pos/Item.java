/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs_pos;

/**
 *
 * @author w15015051
 */
public class Item {
    String itemName;
    int price;
    int quantity;
    
    public Item (String itemName, int price, int quantity)
    {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
