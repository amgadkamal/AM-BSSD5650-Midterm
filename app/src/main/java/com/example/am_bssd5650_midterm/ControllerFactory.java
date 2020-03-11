package com.example.am_bssd5650_midterm;

public class ControllerFactory {


        public Controller controller(String controllertype) {

            if (controllertype == "ArduinoUno") {
                return new ArduinoUno() {
                    @Override
                    public String description() {
                        return super.description();
                    }
                };

            }

            if (controllertype == "ArduinoMega") {
                return new ArduinoMega() {
                    @Override
                    public String description() {
                        return super.description();
                    }
                };

            }

            if (controllertype == "RaspberryPi") {
                return new RaspberryPi() {
                    @Override
                    public String description() {
                        return super.description();
                    }
                };

            }

            return null;
        }
    }