package com.example.am_bssd5650_midterm;

//Source of icons

//WIFI//Icons made by <a href="https://www.flaticon.com/authors/freepik" title="Freepik">Freepik</a> from <a href="https://www.flaticon.com/" title="Flaticon"> www.flaticon.com</a>
//Bluetooth//Icons made by <a href="https://www.flaticon.com/authors/alfredo-hernandez" title="Alfredo Hernandez">Alfredo Hernandez</a> from <a href="https://www.flaticon.com/" title="Flaticon"> www.flaticon.com</a>
//Ardunio//https://icons8.com/icon/11643/arduino
//RasperiPi//https://icons8.com/icons/set/raspberry-pi
//Infrared//https://icons8.com/icons/set/infrared
//Ultrasonic//https://www.vectorstock.com/royalty-free-vector/ultrasonic-sensor-icon-from-sensors-icons-vector-24036645
//I made the icons for resistance.

import androidx.appcompat.app.AppCompatActivity;
import android.content.ClipData;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import static com.example.am_bssd5650_midterm.R.id.arduino;

public class MainActivity extends AppCompatActivity {

    //Image views
    ImageView wifiv;
    ImageView bluetoothv;
    ImageView resistance1v;
    ImageView resistance100v;
    ImageView ultrasonicv;
    ImageView infraredv;
    ImageView arduino;
    ImageView arduinomega;
    ImageView raspberrypi;

    //reset button
    Button reset;

    //LinerLayouts
    LinearLayout wifiL;
    LinearLayout bluetoothL;
    LinearLayout resistance1KL;
    LinearLayout resistance100KL;
    LinearLayout ultrasonicL;
    LinearLayout infraredL;
    LinearLayout controllerdropL ;
    LinearLayout consumedpowerL ;
    LinearLayout reservalues;

    //textviews
    TextView wifiT;
    TextView bluetoothT;
    TextView resistance1KT;
    TextView resistance100KT;
    TextView ultrasonicT;
    TextView infraredT;
    TextView total;
    TextView  controllerdropT;

    double TotalConsumedPower = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Design with imageviews and button
        wifiv = (ImageView) findViewById(R.id.wifi);
        bluetoothv = (ImageView) findViewById(R.id.bluetooth);
        resistance1v = (ImageView) findViewById(R.id.resistance);
        resistance100v = (ImageView) findViewById(R.id.resistnacee);
        ultrasonicv = (ImageView) findViewById(R.id.ultrasonic);
        infraredv = (ImageView) findViewById(R.id.infrared);
        arduino = (ImageView) findViewById(R.id.arduino);
        arduinomega = (ImageView) findViewById(R.id.mega);
        raspberrypi = (ImageView) findViewById(R.id.raspberrypiF);
        reset= (Button) findViewById(R.id.reset);

        //Clicklisteners with 6 images decorators and reset button.

        wifiv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { wifiT.setText(addingwifi.getDescription()+" "+addingwifi.getConsumedPower());
                TotalConsumedPower = TotalConsumedPower + addingwifi.getConsumedPower();
                total.setText("Total consumed power ="+TotalConsumedPower+"W"); }});

        bluetoothv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { bluetoothT.setText(addingbluetooth.getDescription()+""+addingbluetooth.getConsumedPower()+" ");
                TotalConsumedPower = TotalConsumedPower + addingbluetooth.getConsumedPower();
                total.setText("Total consumed power ="+TotalConsumedPower+"W");}
        });

       resistance1v.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { resistance1KT.setText(addingresistance1.getDescription()+" "+addingresistance1.getConsumedPower());
                TotalConsumedPower = TotalConsumedPower + addingresistance1.getConsumedPower();
                total.setText("Total consumed power ="+TotalConsumedPower+"W");}
        });

        resistance100v.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { resistance100KT.setText(addingresistance100.getDescription()+" "+addingresistance100.getConsumedPower());
                TotalConsumedPower = TotalConsumedPower + addingresistance100.getConsumedPower();
                total.setText("Total consumed power ="+TotalConsumedPower+"W");}});

        ultrasonicv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { ultrasonicT.setText(addingultrasonic.getDescription()+""+addingultrasonic.getConsumedPower());
                TotalConsumedPower = TotalConsumedPower + addingultrasonic.getConsumedPower();
                total.setText("Total consumed power ="+TotalConsumedPower+"W");}});

        infraredv.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { infraredT.setText(addinginfraredd.getDescription()+""+addinginfraredd.getConsumedPower());
                TotalConsumedPower = TotalConsumedPower + addingbluetooth.getConsumedPower();
                total.setText("Total consumed power ="+TotalConsumedPower+"W");}});

        reset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { TotalConsumedPower=0;
                total.setText("Total consumed power ="+TotalConsumedPower+"W");
                wifiT.setText("");bluetoothT.setText(" ");ultrasonicT.setText(" ");infraredT.setText(" ");resistance100KT.setText(" ");resistance1KT.setText(" ");controllerdropT.setText("            Drop controller here"); }});

        //Linearlayouts
       consumedpowerL= (LinearLayout)findViewById(R.id.four);
        controllerdropL = (LinearLayout)findViewById(R.id.five);
        wifiL = (LinearLayout)findViewById(R.id.six);
        bluetoothL = (LinearLayout)findViewById(R.id.seven);
        infraredL= (LinearLayout)findViewById(R.id.eight);
        ultrasonicL = (LinearLayout)findViewById(R.id.nine);
        resistance1KL = (LinearLayout)findViewById(R.id.ten);
        resistance100KL = (LinearLayout)findViewById(R.id.eleven);
        reservalues=(LinearLayout)findViewById(R.id.twelve);

        //TextViews
        wifiT = (TextView) findViewById(R.id.wifiT);
        bluetoothT = (TextView) findViewById(R.id.bluetoothT);
        ultrasonicT = (TextView) findViewById(R.id.ultrasonicT);
        infraredT = (TextView) findViewById(R.id.infraredT);
        resistance1KT = (TextView) findViewById(R.id.resistanceT);
        resistance100KT = (TextView) findViewById(R.id.resistanceeT);
        controllerdropT = (TextView) findViewById(R.id.controller);
        total = (TextView) findViewById(R.id.total);
        total.setText("Total consumed power"+TotalConsumedPower);

        //Drag and drop
        //listners for the three images of controllers
        arduino.setOnLongClickListener(longClickListener);
        arduinomega.setOnLongClickListener(longClickListener);
        raspberrypi.setOnLongClickListener(longClickListener);

        //drag listner for text
        controllerdropT.setOnDragListener(dragListener);}


     //factory for controller
    ControllerFactory controllerFactory1 = new ControllerFactory();
    final Controller arduinounoi = controllerFactory1.controller("ArduinoUno");

    ControllerFactory controllerFactory2 = new ControllerFactory();
    final Controller arduinomegai = controllerFactory2.controller("ArduinoMega");

    ControllerFactory controllerFactory3 = new ControllerFactory();
    final Controller raspberrypii = controllerFactory3.controller("RaspberryPi");

    //decorators
    final InterfaceComponent addingbluetooth = new Bluetooth(new Components());
    final InterfaceComponent addingwifi = new Wifi(new Components());
    final InterfaceComponent addingresistance1 = new Resistance1K(new Components());
    final InterfaceComponent addingresistance100 = new Resistance100K(new Components());
    final InterfaceComponent addingultrasonic = new Ultrasonic(new Components());
    final InterfaceComponent addinginfraredd = new Infrared(new Components());


    //drag and drop
        View.OnLongClickListener longClickListener = new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ClipData data = ClipData.newPlainText("","");
                View.DragShadowBuilder myShadowBuilder = new View.DragShadowBuilder(v);
                v.startDrag(data,myShadowBuilder,v,0);
                return true;
            }
        };
        View.OnDragListener dragListener = new View.OnDragListener() {
            @Override
            public boolean onDrag(View v, DragEvent event) {
                int dragEvent = event.getAction();
                switch (dragEvent){
                    case DragEvent.ACTION_DRAG_ENTERED:
                        final View view = (View) event.getLocalState();
                        if (view.getId() == R.id.arduino) {
                            controllerdropT.setText ((arduinounoi.description()).toString());
                        }else if (view.getId() == R.id.raspberrypiF){
                            controllerdropT.setText ((raspberrypii.description()).toString()); }
                        else if (view.getId() == R.id.mega){
                            controllerdropT.setText ((arduinomegai.description()).toString()); }
                        break;
                    case DragEvent.ACTION_DRAG_EXITED:
                        break;
                    case DragEvent.ACTION_DROP:
                        break; }return true; }

        };









    }