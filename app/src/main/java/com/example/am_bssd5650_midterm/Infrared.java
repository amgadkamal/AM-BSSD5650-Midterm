package com.example.am_bssd5650_midterm;
public class Infrared extends  Decorator{
    public Infrared ( InterfaceComponent addcomponents){
        super(addcomponents); }

    @Override
    public String getDescription(){
        return super.getDescription() + " Infrared "; }

    @Override
    public double getConsumedPower(){
        return super.getConsumedPower()+ 0.1; }}
