package com.example.am_bssd5650_midterm;


public abstract class Decorator implements InterfaceComponent {
    protected InterfaceComponent addcomponents;

    public Decorator(InterfaceComponent addcomponents){
        this.addcomponents = addcomponents; }

    @Override
    public String getDescription(){
        return addcomponents.getDescription(); }

    @Override
    public double getConsumedPower(){
        return addcomponents.getConsumedPower(); }



}