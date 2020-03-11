package com.example.am_bssd5650_midterm;


public class Resistance1K extends  Decorator{

    public Resistance1K( InterfaceComponent addcomponents){
        super(addcomponents); }

    @Override
    public String getDescription(){
        return super.getDescription() + " Resistance 1K "; }

    @Override
    public double getConsumedPower(){
        return super.getConsumedPower()+ .25; }
}