/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant.reservation.system;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import static java.lang.System.exit;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;


public class RestaurantReservationSystem {
    
    public static final String restaurant ="C:\\Users\\user\\Documents\\NetBeansProjects\\Restaurant Reservation System\\src\\data\\restaurant.xml";
  public static ArrayList<user> user = new ArrayList<user>();
  public static ArrayList<table> table = new ArrayList<table>();
  public static ArrayList<Dish> dish = new ArrayList<Dish>();

  
   
   public static ArrayList<customer_dish> dc = new ArrayList<customer_dish>();
public static int tablenumber=table.size()+1;
  public static ArrayList<Customer_data> data =new ArrayList<Customer_data>();
public static boolean flag=true,flag2=true;
public static float total_money_earned;

public static float  price;
public static String name_customer;
public static int customer_table_num;

    public static void main(String[] args) {
     
   
//    
//
//            if(flag==true){
//        
//                read();
//                flag=false;
//                          }
//       
//         gui g=new gui();
//         g.setVisible(true);
//       

     
      
      

      
     
        
        
   }
    
    public static void sign_up(String name,String role,String username,String pass){
    
         user u=  new user();        
        u.detect_username(username, name, role, pass);
        
        
    }
    public static void save(){
//           String restaurant ="C:\\Users\\user\\Documents\\NetBeansProjects\\Restaurant Reservation System\\src\\data\\restaurant.xml";
      try {
       
          Restaurant re =new Restaurant(user, table, dish,data);
          JAXBContext jc=JAXBContext.newInstance(Restaurant.class);
          Marshaller ms=jc.createMarshaller();
          ms.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,Boolean.TRUE);
          ms.marshal(re,System.out);
          ms.marshal(re, new File(restaurant));

      } catch (Exception ex) {
          System.out.println("erorr");
      }
        
    
    
    
    }
    public static void read() {
        try {
            Restaurant re =new Restaurant();
//            String restaurant ="C:\\Users\\user\\Documents\\NetBeansProjects\\Restaurant Reservation System\\src\\data\\restaurant.xml";
            
            int i;
            
            JAXBContext jc=JAXBContext.newInstance(Restaurant.class);
            Unmarshaller ums =jc.createUnmarshaller();
            Restaurant   user1 = (Restaurant)ums.unmarshal(new FileReader(restaurant));
            ArrayList<Customer_data> listc = user1.getData();
            ArrayList<user> list = user1.getUser();
            ArrayList<table> listt = user1.getTable();
            ArrayList<Dish> listd = user1.getDish();
            
            
            
            if(!listc.isEmpty()){
                for(i=0;i<listc.size();i++){
                    data.add(listc.get(i));
                    
                    
                    re.setData(data);
                }}
            if(!list.isEmpty()){
                for(i=0;i<list.size();i++){
                    user.add(list.get(i));
                    re.setUser(user);
                }}
            if(!listt.isEmpty()){
                for(i=0;i<listt.size();i++){
                    table.add(listt.get(i));
                    re.setTable(table);}}
            if(!listd.isEmpty()){
                for(i=0;i<listd.size();i++){
                    dish.add(listd.get(i));
                    re.setDish(dish);
                }
                
            }
        } catch (JAXBException ex) {
            Logger.getLogger(RestaurantReservationSystem.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RestaurantReservationSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
                            
    
        
        
        
    }

    public static void login(String username,String pass) {

   int i;
      
        
        for(i=0;i<user.size();i++){
       
            
            if(username.equals(user.get(i).getUsername())&&pass.equals(user.get(i).getPassword())){
        
              if("customer".equals(user.get(i).getRole())){
                  
               name_customer=user.get(i).getName();
               
             
              customer_dashboard c=new customer_dashboard();
              c.setVisible(true);
              
              
              }
               if("waiter".equals(user.get(i).getRole()))
              {
              
           waiter_dashboard w=new waiter_dashboard();
           w.setVisible(true);
              
              
              }
               if("cooker".equals(user.get(i).getRole())){
                   
                   Cooker c=new Cooker();
                   c.setVisible(true);
                   
                   

              }
               if("manager".equals(user.get(i).getRole())){
              
         Manger_dashboard m=new Manger_dashboard();
         m.setVisible(true);
         
              
              }
            
                 
        
        
        
        }
        
        
        }
    
        
        
        
    }

    public static void customer_dashboard(int s,int n, boolean sm) {
     Restaurant tables =new Restaurant();
   
   

n=table.size()+1;
        
            if(table.size()<10){
            flag2=true;



    

        table.add(new table(n, s, sm));
        
        tables.setTable(table);
        tablenumber++;
        customer_table_num=n;
        
        
         }
           
    
    else{
            System.out.println("there is not empty tables");
    flag2=false;
    }
            }
    
    
   
    public static void manu(){
  Restaurant re =new Restaurant();
  dish.add(new Dish("beef_steak​", 80,"main_course" ));
  dish.add(new Dish("mushroom_soup", 60,"main_course" ));
  dish.add(new Dish("molten_cake", 60,"desert" ));
  dish.add(new Dish("apple_pie", 50,"desert" ));
  dish.add(new Dish("fried_potatos", 30,"appetizer" ));
  dish.add(new Dish("greek_salade", 35,"appetizer" ));
  dish.add(new Dish("grilled_chicken", 75,"main_course" ));
        re.setDish(dish);
    
    
    
    
    }
 
    
    
   public static void Add_Dish(String n){
   int i,c = 0;
   float p = 0;
   for(i=0;i<dish.size();i++){
      if(n.equals(dish.get(i).getName())){
      if( null != dish.get(i).type)
         
         
          switch (dish.get(i).type) {
              case "appetizer":
                  p=(float) (dish.get(i).getPrice()+dish.get(i).getPrice()*0.1);
                  break;
              case "main_course":
                  p=(float) (dish.get(i).getPrice()+dish.get(i).getPrice()*0.15);
                  break;
              case "desert":
                  p=(float) (dish.get(i).getPrice()+dish.get(i).getPrice()*0.2);
                  break;
              default:
                  break;
          }
     
     
      }
       
      
      }price=price+p;
   
   
      total_money_earned=total_money_earned+price;
   
   }
    
    public static void delete(){
    user.removeAll(user);
    table.removeAll(table);
     dish.removeAll(dish);
     data.removeAll(data);
            
    
    
    
    
    }

  
    
    
    
    
    
}