/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant.reservation.system;

import java.util.ArrayList;
import javax.xml.bind.*;
import javax.xml.bind.annotation.*;

/**
 *
 * @author user
 */
@XmlRootElement

public class Customer_data {
    private String name ;
    private int table_num;
    private float price_of_dishes;
    private ArrayList<customer_dish> dishes;
    
    public Customer_data() {
    }

    public Customer_data(String name, int table_num, float price_of_dishes, ArrayList<customer_dish> dishes) {
        this.name = name;
        this.table_num = table_num;
        this.price_of_dishes = price_of_dishes;
        this.dishes = dishes;
    }
    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
@XmlElement
    public int getTable_num() {
        return table_num;
    }

    public void setTable_num(int table_num) {
        this.table_num = table_num;
    }
@XmlElement
    public float getPrice_of_dishes() {
        return price_of_dishes;
    }

    public void setPrice_of_dishes(float price_of_dishes) {
        this.price_of_dishes = price_of_dishes;
    }
@XmlElement
public ArrayList<customer_dish> getDishes() {
        return dishes;
    }

    public void setDishes(ArrayList<customer_dish> dishes) {
        this.dishes = dishes;
    }

    @Override
    public String toString() {
        return "Customer_data{" + "name=" + name + ", table_num=" + table_num + ", price_of_dishes=" + price_of_dishes + ", dishes=" + dishes + '}';
    }

  

   
  
   

 
    
    
}
