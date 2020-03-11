package com.example.am_bssd5650_midterm;
public class Ultrasonic extends  Decorator{

    public Ultrasonic( InterfaceComponent addcomponents){
        super(addcomponents); }

    @Override
    public String getDescription(){
        return super.getDescription() + " Ultrasonic "; }

    @Override
    public double getConsumedPower(){
        return super.getConsumedPower()+ .075; }}

