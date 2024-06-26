/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.guanzon.cas.model;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author User
 */
public class ModelAPClientLedgers {
    public SimpleStringProperty index01;
    public SimpleStringProperty index02;
    public SimpleStringProperty index03;
    public SimpleStringProperty index04; 
    public SimpleStringProperty index05;
    public SimpleStringProperty index06; 
    
    
    ObservableList<String> AccountType = FXCollections.observableArrayList("Accounts Payable", "Accounts Receivable");
    ObservableList<String> AccountStatus = FXCollections.observableArrayList("Approved", "Disapproved", "Blocklist");
    public ModelAPClientLedgers(String index01,
               String index02,
               String index03,
               String index04,
               String index05,
               String index06){
        
        this.index01 = new SimpleStringProperty(index01);
        this.index02 = new SimpleStringProperty(index02);
        this.index03 = new SimpleStringProperty(index03);
        this.index04 = new SimpleStringProperty(index04);
        this.index05 = new SimpleStringProperty(index05);
        this.index06 = new SimpleStringProperty(index06);
    }

   

//    public String getIndex03(){
//        return AccountStatus.get(Integer.parseInt(index03.get()));
//    }
//    public void setIndex03(String index03){this.index03.set(index03);}
    
    

    public String getIndex01(){return index01.get();}
    public void setIndex01(String index01){this.index01.set(index01);}
    
    public String getIndex02(){return index02.get();}
    public void setIndex02(String index02){this.index02.set(index02);}
    
    public String getIndex03(){return index03.get();}
    public void setIndex03(String index03){this.index03.set(index03);}
    
    public String getIndex04(){return index04.get();}
    public void setIndex04(String index04){this.index04.set(index04);}
    
    public String getIndex05(){return index05.get();}
    public void setIndex05(String index05){this.index05.set(index05);}
    
    public String getIndex06(){
        return AccountStatus.get(Integer.parseInt(index06.get().toString()));
    }
    
}
