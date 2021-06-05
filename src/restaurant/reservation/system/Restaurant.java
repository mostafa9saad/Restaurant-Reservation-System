/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant.reservation.system;

import java.util.ArrayList;
import javax.xml.bind.annotation.*;

@XmlRootElement(name = "restaurant")

public class Restaurant {
     
        private ArrayList<user> user;
     private ArrayList<table> table;
     private ArrayList<Dish> dish ;
     private ArrayList<Customer_data>data;

    public Restaurant() {
    }

    public Restaurant(ArrayList<user> user, ArrayList<table> table, ArrayList<Dish> dish, ArrayList<Customer_data> data) {
        this.user = user;
        this.table = table;
        this.dish = dish;
        this.data = data;
    }

 
@XmlElementWrapper (name="users")

    public ArrayList<user> getUser() {
        return user;
    }

    public void setUser(ArrayList<user> user) {
        this.user = user;
    }
@XmlElementWrapper (name="tables")
    public ArrayList<table> getTable() {
        return table;
    }

    public void setTable(ArrayList<table> table) {
        this.table = table;
    }
@XmlElementWrapper (name="dishes")
    public ArrayList<Dish> getDish() {
        return dish;
    }

    public void setDish(ArrayList<Dish> dish) {
        this.dish = dish;
    }
@XmlElementWrapper (name="customer_data")
    public ArrayList<Customer_data> getData() {
        return data;
    }

    public void setData(ArrayList<Customer_data> data) {
        this.data = data;
    }
    
     public void delete(){
     user.removeAll(user);
     table.removeAll(table);
     dish.removeAll(dish);
     data.removeAll(data);
     
     
     
     }
}
