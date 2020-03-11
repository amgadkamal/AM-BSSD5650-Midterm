package com.example.am_bssd5650_midterm;

public class Bluetooth extends  Decorator{


    public Bluetooth( InterfaceComponent addcomponents){
        super(addcomponents);


    }


    @Override
    public String getDescription(){
        return super.getDescription() + " Bluetooth Module";
    }

    @Override
    public double getConsumedPower(){
        return super.getConsumedPower()+ 0.15;
    }
}
