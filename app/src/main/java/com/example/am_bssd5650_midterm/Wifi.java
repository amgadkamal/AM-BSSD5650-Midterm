package com.example.am_bssd5650_midterm;


public class Wifi extends  Decorator{


    public Wifi( InterfaceComponent addcomponents){
        super(addcomponents);


    }


    @Override
    public String getDescription(){
        return super.getDescription() + " Wifi Module";
    }

    @Override
    public double getConsumedPower(){
        return super.getConsumedPower()+ .36;
    }
}
