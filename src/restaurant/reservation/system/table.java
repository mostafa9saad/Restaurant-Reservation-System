/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant.reservation.system;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author user
 */
@XmlRootElement(name = "table")
@XmlType(propOrder = { "num", "num_set", "smoking" })

public class table {
      protected int num;
    protected int num_set;
    protected boolean smoking;

    public table() {
    }
    

    public table(int num, int num_set, boolean smoking) {
        this.num = num;
        this.num_set = num_set;
        this.smoking = smoking;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum_set() {
        return num_set;
    }

    public void setNum_set(int num_set) {
        this.num_set = num_set;
    }

    public boolean isSmoking() {
        return smoking;
    }

    public void setSmoking(boolean smoking) {
        this.smoking = smoking;
    }
    
}
