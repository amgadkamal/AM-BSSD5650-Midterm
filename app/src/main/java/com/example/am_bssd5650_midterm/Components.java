package com.example.am_bssd5650_midterm;

public class Components implements InterfaceComponent {

    public Components (){


    }

    @Override
    public String getDescription() {
        return "  Add component:";
    }

    @Override
    public double getConsumedPower() {
        return 0;
    }
}
