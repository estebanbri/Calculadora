package com.example.esteban.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    public String resultado = "";
    public String operador ="";
    public float resultadofinal;
    float operandoA;
    public Button boton1;
    public Button boton2;
    public Button boton3;
    public Button boton4;
    public Button boton5;
    public Button boton6;
    public Button boton7;
    public Button boton8;
    public Button boton9;
    public TextView resultado_textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado_textView = (TextView)findViewById(R.id.id_resultado);
        boton1 = (Button)findViewById(R.id.id_1);
        boton2 = (Button)findViewById(R.id.id_2);
        boton3 = (Button)findViewById(R.id.id_3);
        boton4 = (Button)findViewById(R.id.id_4);
        boton5 = (Button)findViewById(R.id.id_5);
        boton6 = (Button)findViewById(R.id.id_6);
        boton7 = (Button)findViewById(R.id.id_7);
        boton8 = (Button)findViewById(R.id.id_8);
        boton9 = (Button)findViewById(R.id.id_9);

    }

    //Metodos onClick de los botones operadores
    public void onClick_1(View vista){
        /*Cuando apreto el boton 1 concateno el valor 1 al resultado y lo seteo al textview*/
        resultado = resultado + "1";
        resultado_textView.setText(resultado);
    }
    public void onClick_2(View vista){
        resultado = resultado + "2";
        resultado_textView.setText(resultado);
    }
    public void onClick_3(View vista){
        resultado = resultado + "3";
        resultado_textView.setText(resultado);
    }
    public void onClick_4(View vista){
        resultado = resultado + "4";
        resultado_textView.setText(resultado);
    }
    public void onClick_5(View vista){
        resultado = resultado + "5";
        resultado_textView.setText(resultado);
    }
    public void onClick_6(View vista){
        resultado = resultado + "6";
        resultado_textView.setText(resultado);
    }
    public void onClick_7(View vista){
        resultado = resultado + "7";
        resultado_textView.setText(resultado);
    }
    public void onClick_8(View vista){
        resultado = resultado + "8";
        resultado_textView.setText(resultado);
    }
    public void onClick_9(View vista){
        resultado = resultado + "9";
        resultado_textView.setText(resultado);
    }

    //Metodos onClick de los botones operaciones
    public void onClickSuma(View vista){
        //Almaceno la el operandoA en una variable
        operandoA = getOperando();
        //Almaceno el operador correspondiente en una variable
        operador = "+";
        //limpio el valor resultado para empezar a almacenar el nuevo operandoB
        resultado="";
        resultado_textView.setText(resultado);

    }
    public void onClickResta(View vista){
        operandoA = getOperando();
        operador = "-";
        resultado="";
        resultado_textView.setText(resultado);
    }
    public void onClickMultiplicacion(View vista){
        operandoA = getOperando();
        operador = "*";
        resultado="";
        resultado_textView.setText(resultado);
    }
    public void onClickDivision(View vista){
        operandoA = getOperando();
        operador = "/";
        resultado="";
        resultado_textView.setText(resultado);
    }
    public void onClickAplica_operacion(View vista){
        float operandoB = getOperando();
        //segun el simbolo de operando almacenado en la variable operando aplico la operacion correspondiente
        switch (operador) {
            case "+":
                resultadofinal = sumar(operandoA, operandoB);
                break;
            case "-":
                resultadofinal = restar(operandoA, operandoB);
                break;
            case "*":
                resultadofinal = multiplicar(operandoA, operandoB);
                break;
            case "/":
                resultadofinal = dividir(operandoA, operandoB);
                break;
        }
        resultado_textView.setText(Float.toString(resultadofinal));

    }

    public float getOperando(){
        //Convierto el resultado string a flot para poder aplicarles las operacioens aritemticas
        float operando = Float.parseFloat(resultado_textView.getText().toString());
        return operando;
    }

    //Operaciones aritmeticas
    public float sumar(float a, float b){return a + b;}
    public float restar(float a, float b){return a - b;}
    public float multiplicar(float a, float b){return a * b;}
    public float dividir(float a, float b){return a / b;}

}
