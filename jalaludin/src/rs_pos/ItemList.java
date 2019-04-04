/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs_pos;

import java.util.ArrayList;
/**
 *
 * @author w15015051
 */
public class ItemList {
    private ArrayList<Item> itemList; 
    
    public ItemList() 
    {
        itemList = new ArrayList<Item>();
    }
    
    public void addItem(Item itemToAdd)
    {
        itemList.add(itemToAdd);
    }
    
    public ArrayList<Item> getItemList()
    {
        return itemList;
    }
}
