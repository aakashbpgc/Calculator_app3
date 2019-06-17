package com.example.calculator_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button plus;
    private Button minus;
    private Button multiply;
    private Button divide;
    private Button equal;
    private TextView info;
    private TextView result;
    private String equation;
    private Button CE;
    private Button clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUIViews();

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() +  "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() +  "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() +  "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() +  "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() +  "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() +  "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() +  "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() +  "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() +  "9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() +  "0");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() +  "+");
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() +  "-");
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() +  "*");
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(info.getText().toString() +  "/");
            }
        });
        CE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info.setText(null);
                result.setText(null);
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String temp = info.getText().toString();
                int len = temp.length();
                temp = temp.substring(0,len-1);
                info.setText(temp);
            }
        });



        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                equation = info.getText().toString();
                String eq = equation;
                int length= equation.length();


                //divide
                for(int i=0;i<length;i++){

                    int num = equation.charAt(i) - 48;
                    if (num == -1){
                        int flag1=i-1,multiplier=1;
                        int num1=0,num2=0;
                        int temp=equation.charAt(flag1) - 48;

                        while(temp>=0){
                            num1 = temp*multiplier + num1;
                            multiplier*=10;

                            if(flag1==0){
                                break;
                            }

                            flag1--;
                            temp=equation.charAt(flag1)-48;

                        }
                        int flag2=i+1;

                        temp = equation.charAt(flag2) - 48;

                        while(temp>=0){
                            num2 = temp + num2 * 10;

                            if(flag2==length-1){
                                break;
                            }
                            flag2++;
                            temp =  equation.charAt(flag2)-48;

                        }

                        int quotient = num1/num2;

                        if(flag2 != length-1 && flag1!= 0 ){
                            result.setText(equation.substring(0,flag1+1) + quotient + equation.substring(flag2));
                            info.setText(equation.substring(0,flag1+1) + quotient + equation.substring(flag2));
                            equation = result.getText().toString();
                            length= equation.length();
                            i=0;
                        }
                        else if(flag1 == 0 && flag2 != length-1){
                            result.setText(quotient + equation.substring(flag2));
                            info.setText(quotient + equation.substring(flag2));
                            equation = result.getText().toString();
                            length= equation.length();
                            i=0;

                        }
                        else if(flag1 != 0 && flag2 == length-1){
                            info.setText(equation.substring(0,flag1+1) + quotient);
                            result.setText(equation.substring(0,flag1+1) + quotient);
                            equation = result.getText().toString();
                            length= equation.length();
                            i=0;

                        }
                        else {
                            result.setText(String.valueOf(quotient));
                            info.setText(String.valueOf(quotient));
                            equation = result.getText().toString();
                            length= equation.length();
                            i=0;


                        }

                    }
                }


                //multiply

                equation = info.getText().toString();
                length= equation.length();

                for(int i=0;i<length;i++){

                    int num = equation.charAt(i) - 48;
                    if (num == -6){
                        int flag1=i-1,multiplier=1;
                        int num1=0,num2=0;
                        int temp=equation.charAt(flag1) - 48;

                        while(temp>=0){
                            num1 = temp*multiplier + num1;
                            multiplier*=10;

                            if(flag1==0){
                                break;
                            }

                            flag1--;
                            temp=equation.charAt(flag1)-48;

                        }
                        int flag2=i+1;

                        temp = equation.charAt(flag2) - 48;

                        while(temp>=0){
                            num2 = temp + num2 * 10;

                            if(flag2==length-1){
                                break;
                            }
                            flag2++;
                            temp =  equation.charAt(flag2)-48;

                        }

                        int quotient = num1*num2;

                        if(flag2 != length-1 && flag1!= 0 ){
                            result.setText(equation.substring(0,flag1+1) + quotient + equation.substring(flag2));
                            info.setText(equation.substring(0,flag1+1) + quotient + equation.substring(flag2));
                            equation = result.getText().toString();
                            length= equation.length();
                            i=0;
                        }
                        else if(flag1 == 0 && flag2 != length-1){
                            result.setText(quotient + equation.substring(flag2));
                            info.setText(quotient + equation.substring(flag2));
                            equation = result.getText().toString();
                            length= equation.length();
                            i=0;

                        }
                        else if(flag1 != 0 && flag2 == length-1){
                            info.setText(equation.substring(0,flag1+1) + quotient);
                            result.setText(equation.substring(0,flag1+1) + quotient);
                            equation = result.getText().toString();
                            length= equation.length();
                            i=0;

                        }
                        else {
                            result.setText(String.valueOf(quotient));
                            info.setText(String.valueOf(quotient));
                            equation = result.getText().toString();
                            length= equation.length();
                            i=0;


                        }


                    }
                }

//plus

                equation = info.getText().toString();
                length= equation.length();

                for(int i=0;i<length;i++){

                    int num = equation.charAt(i) - 48;
                    if (num == -5){
                        int flag1=i-1,multiplier=1;
                        int num1=0,num2=0;
                        int temp=equation.charAt(flag1) - 48;

                        while(temp>=0){
                            num1 = temp*multiplier + num1;
                            multiplier*=10;

                            if(flag1==0){
                                break;
                            }

                            flag1--;
                            temp=equation.charAt(flag1)-48;

                        }
                        int flag2=i+1;

                        temp = equation.charAt(flag2) - 48;

                        while(temp>=0){
                            num2 = temp + num2 * 10;

                            if(flag2==length-1){
                                break;
                            }
                            flag2++;
                            temp =  equation.charAt(flag2)-48;

                        }

                        int quotient = num1+num2;


                        if(flag2 != length-1 && flag1!= 0 ){
                            result.setText(equation.substring(0,flag1+1) + quotient + equation.substring(flag2));
                            info.setText(equation.substring(0,flag1+1) + quotient + equation.substring(flag2));
                            equation = result.getText().toString();
                            length= equation.length();
                            i=0;
                        }
                        else if(flag1 == 0 && flag2 != length-1){
                            result.setText(quotient + equation.substring(flag2));
                            info.setText(quotient + equation.substring(flag2));
                            equation = result.getText().toString();
                            length= equation.length();
                            i=0;

                        }
                        else if(flag1 != 0 && flag2 == length-1){
                            info.setText(equation.substring(0,flag1+1) + quotient);
                            result.setText(equation.substring(0,flag1+1) + quotient);
                            equation = result.getText().toString();
                            length= equation.length();
                            i=0;

                        }
                        else {
                            result.setText(String.valueOf(quotient));
                            info.setText(String.valueOf(quotient));
                            equation = result.getText().toString();
                            length= equation.length();
                            i=0;


                        }


                    }
                }

//minus

                equation = info.getText().toString();
                length= equation.length();

                for(int i=0;i<length;i++){

                    int num = equation.charAt(i) - 48;
                    if (num == -3){
                        int flag1=i-1,multiplier=1;
                        int num1=0,num2=0;
                        int temp=equation.charAt(flag1) - 48;

                        while(temp>=0){
                            num1 = temp*multiplier + num1;
                            multiplier*=10;

                            if(flag1==0){
                                break;
                            }

                            flag1--;
                            temp=equation.charAt(flag1)-48;

                        }
                        int flag2=i+1;

                        temp = equation.charAt(flag2) - 48;

                        while(temp>=0){
                            num2 = temp + num2 * 10;

                            if(flag2==length-1){
                                break;
                            }
                            flag2++;
                            temp =  equation.charAt(flag2)-48;

                        }

                        int quotient = num1-num2;


                        if(flag2 != length-1 && flag1!= 0 ){
                            result.setText(equation.substring(0,flag1+1) + quotient + equation.substring(flag2));
                            info.setText(equation.substring(0,flag1+1) + quotient + equation.substring(flag2));
                            equation = result.getText().toString();
                            length= equation.length();
                            i=0;
                        }
                        else if(flag1 == 0 && flag2 != length-1){
                            result.setText(quotient + equation.substring(flag2));
                            info.setText(quotient + equation.substring(flag2));
                            equation = result.getText().toString();
                            length= equation.length();
                            i=0;

                        }
                        else if(flag1 != 0 && flag2 == length-1){
                            info.setText(equation.substring(0,flag1+1) + quotient);
                            result.setText(equation.substring(0,flag1+1) + quotient);
                            equation = result.getText().toString();
                            length= equation.length();
                            i=0;

                        }
                        else {
                            result.setText(String.valueOf(quotient));
                            info.setText(String.valueOf(quotient));
                            equation = result.getText().toString();
                            length= equation.length();
                            i=0;


                        }



                    }
                }
                info.setText(eq);
            }
        });

    }
    private void setupUIViews(){
        one= findViewById(R.id.button1);
        two= findViewById(R.id.button2);
        three= findViewById(R.id.button3);
        four= findViewById(R.id.button4);
        five= findViewById(R.id.button5);
        six= findViewById(R.id.button6);
        seven= findViewById(R.id.button7);
        eight= findViewById(R.id.button8);
        nine= findViewById(R.id.button9);
        zero= findViewById(R.id.button0);
        plus= findViewById(R.id.plus);
        minus= findViewById(R.id.minus);
        divide= findViewById(R.id.divide);
        multiply= findViewById(R.id.multiply);
        info=findViewById(R.id.text2);
        result=findViewById(R.id.text1);
        equal=findViewById(R.id.equal);
        CE=findViewById(R.id.clearall);
        clear=findViewById(R.id.clear);
    }

}
