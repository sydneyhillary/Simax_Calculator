package com.simax.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {



    Button button0 , button1 , button2 , button3 , button4 , button5 , button6 ,
            button7 , button8 , button9 , buttonAdd , buttonSub , buttonDivision ,
            buttonMul , buttonDot , buttonC , buttonEqual , buttonBackSpace, buttonSmallBracket;

    TextView displayText ;
    TextView resultText ;

    String processor;
    Boolean isSmallBracketOpen;
    int developedCounter;
    static String goodJob = "Nice work";

    DecimalFormat df = new DecimalFormat("@###########");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        isSmallBracketOpen = false;
        developedCounter = 0;

        df.setMinimumFractionDigits(0);
        df.setMinimumIntegerDigits(1);
        df.setMaximumIntegerDigits(8);

        button0 = (Button) findViewById(R.id.set0);
        button1 = (Button) findViewById(R.id.set1);
        button2 = (Button) findViewById(R.id.set2);
        button3 = (Button) findViewById(R.id.set3);
        button4 = (Button) findViewById(R.id.set4);
        button5 = (Button) findViewById(R.id.set5);
        button6 = (Button) findViewById(R.id.set6);
        button7 = (Button) findViewById(R.id.set7);
        button8 = (Button) findViewById(R.id.set8);
        button9 = (Button) findViewById(R.id.set9);
        buttonDot = (Button) findViewById(R.id.setDot);
        buttonAdd = (Button) findViewById(R.id.add);
        buttonSub = (Button) findViewById(R.id.subtract);
        buttonMul = (Button) findViewById(R.id.multiply);
        buttonDivision = (Button) findViewById(R.id.divide);
        buttonSmallBracket = (Button) findViewById(R.id.smallbracket);
        buttonC = (Button) findViewById(R.id.clear);
        buttonBackSpace = (Button) findViewById(R.id.backSpace);
        buttonEqual = (Button) findViewById(R.id.equals);
        displayText = (TextView) findViewById(R.id.setText);
        resultText = (TextView) findViewById(R.id.resultText);
        displayText.setText("");
        resultText.setText("");




        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                processor = displayText.getText().toString();
                displayText.setText(processor + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                processor = displayText.getText().toString();
                displayText.setText(processor + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                processor = displayText.getText().toString();
                displayText.setText(processor + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                processor = displayText.getText().toString();
                displayText.setText(processor + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                processor = displayText.getText().toString();
                displayText.setText(processor + "5");;
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                processor = displayText.getText().toString();
                displayText.setText(processor + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                processor = displayText.getText().toString();
                displayText.setText(processor + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                processor = displayText.getText().toString();
                displayText.setText(processor + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                processor = displayText.getText().toString();
                displayText.setText(processor + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                processor = displayText.getText().toString();
                displayText.setText(processor + "0");


            }
        });

        buttonSmallBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                if(isSmallBracketOpen){
                    processor = displayText.getText().toString();
                    displayText.setText(processor + ")");
                    isSmallBracketOpen = false;
                }else{
                    processor = displayText.getText().toString();
                    displayText.setText(processor + "(");
                    isSmallBracketOpen = true;
                }
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                processor = displayText.getText().toString();
                displayText.setText(processor + "+");
            }

        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                processor = displayText.getText().toString();
                displayText.setText(processor + "-");
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                processor = displayText.getText().toString();
                displayText.setText(processor + "*");
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                processor = displayText.getText().toString();
                displayText.setText(processor + "/");
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                developedCounter++;
                if(developedCounter >= 5){
                    developedCounter=0;
                    displayText.setText(goodJob);
                    resultText.setText("");
                }else {
                    displayText.setText("");
                    displayText.setText("");
                }

            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                processor = displayText.getText().toString();
                displayText.setText(processor + ".");
            }
        });
        buttonBackSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearScreen();
                processor = displayText.getText().toString();
                if(processor.length() > 0){
                    processor = processor.substring(0, processor.length()-1);
                    displayText.setText(processor);
                }else{
                    resultText.setText("");
                }
            }
        });
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearScreen();
                processor = displayText.getText().toString();


                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);
                String result = "";

                try{
                    Scriptable scope = rhino.initStandardObjects();
                    result = rhino.evaluateString(scope, processor, "JavaScript", 1, null).toString();
                }catch (Exception e){
                    result = "Error";
                }

                resultText.setText(result);
            }
        });


    }

    public void clearScreen(){
        processor = displayText.getText().toString();
        if(processor.contains(goodJob)){
            displayText.setText("");
            resultText.setText("");
        }
        developedCounter = 0;
    }

}
