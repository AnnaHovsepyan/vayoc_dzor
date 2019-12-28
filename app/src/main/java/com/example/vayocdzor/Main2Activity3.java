package com.example.vayocdzor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main23);
        String savedExtra31 = getIntent().getStringExtra("value31");
        Button myButton31 = (Button) findViewById(R.id.value31);
        myButton31.setText(savedExtra31);

        String savedExtra32 = getIntent().getStringExtra("value32");
        Button myButton32 = (Button) findViewById(R.id.value32);
        myButton32.setText(savedExtra32);

        String savedExtra33 = getIntent().getStringExtra("value33");
        Button myButton33 = (Button) findViewById(R.id.value33);
        myButton33.setText(savedExtra33);

        String savedExtra34 = getIntent().getStringExtra("value34");
        Button myButton34 = (Button) findViewById(R.id.value34);
        myButton34.setText(savedExtra34);

        String savedExtra35 = getIntent().getStringExtra("value35");
        Button myButton35 = (Button) findViewById(R.id.value35);
        myButton35.setText(savedExtra35);

        String savedExtra36 = getIntent().getStringExtra("value36");
        Button myButton36 = (Button) findViewById(R.id.value36);
        myButton36.setText(savedExtra36);

        String savedExtra37 = getIntent().getStringExtra("value37");
        Button myButton37 = (Button) findViewById(R.id.value37);
        myButton37.setText(savedExtra37);

        String savedExtra38 = getIntent().getStringExtra("value38");
        Button myButton38 = (Button) findViewById(R.id.value38);
        myButton38.setText(savedExtra38);

        String savedExtra39 = getIntent().getStringExtra("value39");
        Button myButton39 = (Button) findViewById(R.id.value39);
        myButton39.setText(savedExtra39);

        String savedExtra310 = getIntent().getStringExtra("value310");
        Button myButton310 = (Button) findViewById(R.id.value310);
        myButton310.setText(savedExtra310);

        String savedExtra311 = getIntent().getStringExtra("value311");
        Button myButton311 = (Button) findViewById(R.id.value311);
        myButton311.setText(savedExtra311);

        String savedExtra312 = getIntent().getStringExtra("value312");
        Button myButton312 = (Button) findViewById(R.id.value312);
        myButton312.setText(savedExtra312);

        String savedExtra313 = getIntent().getStringExtra("value313");
        Button myButton313 = (Button) findViewById(R.id.value313);
        myButton313.setText(savedExtra313);

        String savedExtra314 = getIntent().getStringExtra("value314");
        Button myButton314 = (Button) findViewById(R.id.value314);
        myButton314.setText(savedExtra314);

        String savedExtra315 = getIntent().getStringExtra("value315");
        Button myButton315 = (Button) findViewById(R.id.value315);
        myButton315.setText(savedExtra315);

        String savedExtra316 = getIntent().getStringExtra("value316");
        Button myButton316 = (Button) findViewById(R.id.value316);
        myButton316.setText(savedExtra316);

        String savedExtra317 = getIntent().getStringExtra("value317");
        Button myButton317 = (Button) findViewById(R.id.value317);
        myButton317.setText(savedExtra317);

    }
    public void onClick1(View view1){
        Intent intent231=new Intent(getBaseContext(),Noravank.class);
        startActivity(intent231);}
    public void onClick2(View view1){
        Intent intent232=new Intent(getBaseContext(),Smbatabert.class);
        startActivity(intent232);}
    public void onClick3(View view1){
        Intent intent233=new Intent(getBaseContext(),Spitakavor.class);
        startActivity(intent233);}
    public void onClick4(View view1){
        Intent intent234=new Intent(getBaseContext(),Tanahat.class);
        startActivity(intent234);}
    public void onClick5(View view1){
        Intent intent235=new Intent(getBaseContext(),Arkaz.class);
        startActivity(intent235);}
    public void onClick6(View view1){
        Intent intent236=new Intent(getBaseContext(),Gndevank.class);
        startActivity(intent236);}
    public void onClick7(View view1){
        Intent intent237=new Intent(getBaseContext(),Herher.class);
        startActivity(intent237);}
    public void onClick8(View view1){
        Intent intent238=new Intent(getBaseContext(),Zorac.class);
        startActivity(intent238);}
    public void onClick9(View view1){
        Intent intent239=new Intent(getBaseContext(),Sion.class);
        startActivity(intent239);}
    public void onClick10(View view1){
        Intent intent2310=new Intent(getBaseContext(),Shativank.class);
        startActivity(intent2310);}
    public void onClick11(View view1){
        Intent intent2311=new Intent(getBaseContext(),Caxac.class);
        startActivity(intent2311);}
    public void onClick12(View view1){
        Intent intent2312=new Intent(getBaseContext(),Gayane.class);
        startActivity(intent2312);}
    public void onClick13(View view1){
        Intent intent2313=new Intent(getBaseContext(),Areni.class);
        startActivity(intent2313);}
    public void onClick14(View view1){
        Intent intent2314=new Intent(getBaseContext(),Astvacacin.class);
        startActivity(intent2314);}
    public void onClick15(View view1){
        Intent intent2315=new Intent(getBaseContext(),Trdat.class);
        startActivity(intent2315);}

    public void onClick17(View view1){
        Intent intent2317=new Intent(getBaseContext(),Angx.class);
        startActivity(intent2317);}


}
