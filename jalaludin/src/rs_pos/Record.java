/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs_pos;

import java.time.LocalDate;

/**
 *
 * @author w15015051
 */
public class Record extends Item {
    String artist;
    String format;
    String catalogueNumber;
    String condition;
    String notes;
    LocalDate released;
    LocalDate pressed; 
    
    public Record (String albumName, String artist, String format, String catalogueNumber,
            String condition, String notes, LocalDate released, LocalDate pressed,
            int price, int quantity)
    {
        super(albumName, price, quantity);
    }
}
