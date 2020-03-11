package com.example.am_bssd5650_midterm;

public class Resistance100K extends  Decorator{

    public Resistance100K( InterfaceComponent addcomponents){
        super(addcomponents); }

    @Override
    public String getDescription(){
        return super.getDescription() + " Resistance 100K "; }

    @Override
    public double getConsumedPower(){
        return super.getConsumedPower()+ .5; }
}