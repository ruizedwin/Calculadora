package com.example.pcfamily.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tDisplay;
    double num1, num2, resul;
    String oper;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bCero (View View)
    {
        tDisplay = (TextView) findViewById(R.id.tDisplay);
        tDisplay.setText (tDisplay.getText()+"0");
    }

    public void bUno (View View)
    {
        tDisplay = (TextView) findViewById(R.id.tDisplay);
        tDisplay.setText (tDisplay.getText()+"1");
    }

    public void bDos (View View)
    {
        tDisplay = (TextView) findViewById(R.id.tDisplay);
        tDisplay.setText (tDisplay.getText()+"2");
    }

    public void bTres (View View)
    {
        tDisplay = (TextView) findViewById(R.id.tDisplay);
        tDisplay.setText (tDisplay.getText()+"3");
    }

    public void bCuatro (View View)
    {
        tDisplay = (TextView) findViewById(R.id.tDisplay);
        tDisplay.setText (tDisplay.getText()+"4");
    }

    public void bCinco (View View)
    {
        tDisplay = (TextView) findViewById(R.id.tDisplay);
        tDisplay.setText (tDisplay.getText()+"5");
    }

    public void bSeis (View View)
    {
        tDisplay = (TextView) findViewById(R.id.tDisplay);
        tDisplay.setText (tDisplay.getText()+"6");
    }

    public void bSiete (View View)
    {
        tDisplay = (TextView) findViewById(R.id.tDisplay);
        tDisplay.setText (tDisplay.getText()+"7");
    }

    public void bOcho (View View)
    {
        tDisplay = (TextView) findViewById(R.id.tDisplay);
        tDisplay.setText (tDisplay.getText()+"8");
    }

    public void bNueve (View View)
    {
        tDisplay = (TextView) findViewById(R.id.tDisplay);
        tDisplay.setText (tDisplay.getText()+"9");
    }

    public void bPunto (View View)
    {
        tDisplay = (TextView) findViewById(R.id.tDisplay);
        tDisplay.setText (tDisplay.getText()+".");
    }

    public void onClickOperacionCapturaNumero1 (View View){
        tDisplay=(TextView) findViewById(R.id.tDisplay);
        num1=Double.parseDouble(tDisplay.getText().toString());
        tDisplay.setText("");
    }

    public void Sumar (View View){
        oper="+";
        onClickOperacionCapturaNumero1(View);
    }

    public void Restar (View View){
        oper="-";
        onClickOperacionCapturaNumero1(View);
    }

    public void Multiplicar (View View){
        oper="*";
        onClickOperacionCapturaNumero1(View);
    }

    public void Dividir (View View){
        oper="/";
        onClickOperacionCapturaNumero1(View);
    }

    public void Igual (View View) {
        tDisplay = (TextView) findViewById(R.id.tDisplay);
        num2=Double.parseDouble(tDisplay.getText().toString());

        if (oper.equals("+"))
        {
            resul = num1 + num2;
        }else if (oper.equals("-")) {
            resul = num1 - num2;
        }else if (oper.equals("*")) {
            resul = num1 * num2;
        }else if (oper.equals("/")) {
            resul = num1 / num2;
        }

        tDisplay.setText(String.valueOf(resul));
    }

    public void Ac (View View) {

        num1 = 0.0;
        num2 = 0.0;
        tDisplay = (TextView) findViewById(R.id.tDisplay);
        tDisplay.setText("");
    }

}