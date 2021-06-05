/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant.reservation.system;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import static restaurant.reservation.system.RestaurantReservationSystem.main;
import static restaurant.reservation.system.RestaurantReservationSystem.user;

@XmlRootElement(name = "user")


public class user extends Login implements detect {
   public static boolean flag;
    protected String name;
    protected String role;
   
    public user() {
    }

    public user(String name, String role, String username, String password) {
        this.name = name;
        this.role = role;
        this.username = username;
        this.password = password;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }



    @Override
    public String toString() {
        return "Users{" + "name=" + name + ", role=" + role + ", username=" + username + ", password=" + password + '}';
    }

    @Override
    public void detect_username(String username,String name,String role,String pass) {
        int i;
       flag =true;
        Restaurant re=new Restaurant();
       
        ArrayList<user> user = RestaurantReservationSystem.user;
        for(i=0;i<user.size();i++){
        if(username == null ? user.get(i).username == null : username.equals(user.get(i).username)){
           
            System.out.println("this username is taken");
             flag = false;
            
            
        }
        
      
          
        
    
        }
        if(flag){
     user.add(new user(name, role,username,pass));
         re.setUser(user);
        }
    }
    
    
     
}
