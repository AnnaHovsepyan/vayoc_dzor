package com.example.vayocdzor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main21);

        String savedExtra11 = getIntent().getStringExtra("value11");
        Button myButton11 = (Button) findViewById(R.id.value11);
        myButton11.setText(savedExtra11);

        String savedExtra12 = getIntent().getStringExtra("value12");
        Button myButton12 = (Button) findViewById(R.id.value12);
        myButton12.setText(savedExtra12);

        String savedExtra13 = getIntent().getStringExtra("value13");
        Button myButton13 = (Button) findViewById(R.id.value13);
        myButton13.setText(savedExtra13);

        String savedExtra14 = getIntent().getStringExtra("value14");
        Button myButton14 = (Button) findViewById(R.id.value14);
        myButton14.setText(savedExtra14);

        String savedExtra15 = getIntent().getStringExtra("value15");
        Button myButton15 = (Button) findViewById(R.id.value15);
        myButton15.setText(savedExtra15);

        String savedExtra16 = getIntent().getStringExtra("value16");
        Button myButton16 = (Button) findViewById(R.id.value16);
        myButton16.setText(savedExtra16);

        String savedExtra17 = getIntent().getStringExtra("value17");
        Button myButton17 = (Button) findViewById(R.id.value17);
        myButton17.setText(savedExtra17);

        String savedExtra18 = getIntent().getStringExtra("value18");
        Button myButton18 = (Button) findViewById(R.id.value18);
        myButton18.setText(savedExtra18);
    }
    public void onClick11(View view1){
        Intent intent11=new Intent(getBaseContext(),VayocDzor.class);
        startActivity(intent11);}
    public void onClick12(View view1){
        Intent intent12=new Intent(getBaseContext(),Vay.class);
        startActivity(intent12);}
    public void onClick13(View view1){
        Intent intent13=new Intent(getBaseContext(),Jrahars.class);
        startActivity(intent13);}
    public void onClick14(View view1){
        Intent intent14=new Intent(getBaseContext(),Exnik.class);
        startActivity(intent14);}
    public void onClick15(View view1){
        Intent intent15=new Intent(getBaseContext(),Herher.class);
        startActivity(intent15);}
    public void onClick16(View view1){
        Intent intent16=new Intent(getBaseContext(),Momik.class);
        startActivity(intent16);}
    public void onClick17(View view1){
        Intent intent17=new Intent(getBaseContext(),Gndevank.class);
        startActivity(intent17);}
    public void onClick18(View view1){
        Intent intent18=new Intent(getBaseContext(),Smbat_bert.class);
        startActivity(intent18);}


}
