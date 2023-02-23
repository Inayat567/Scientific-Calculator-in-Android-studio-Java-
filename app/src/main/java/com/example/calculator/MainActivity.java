package com.example.calculator;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.Selection;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import org.mariuszgromada.math.mxparser.*;

public class MainActivity extends AppCompatActivity {
    private Button one, two, three, four, five, six, seven, eight, nine, left, right, plus, minus, equal, clr;
    private Button clrScreen, sin, cos, tan, pi, ln, log, square, sqrt, powern, mod, zero, point, divide;
    private Button multiply, factorial;
    private EditText output;
    DBHandler dbHandler;
    String FinalResult="";
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        point = findViewById(R.id.point);
        equal = findViewById(R.id.equal);
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        multiply = findViewById(R.id.multiply);
        divide = findViewById(R.id.divide);
        left = findViewById(R.id.leftBracket);
        right = findViewById(R.id.rightBracket);
        sqrt = findViewById(R.id.sqrt);
        square = findViewById(R.id.square);
        powern = findViewById(R.id.powern);
        sin = findViewById(R.id.sin);
        cos = findViewById(R.id.cos);
        tan = findViewById(R.id.tan);
        pi = findViewById(R.id.pi);
        clrScreen = findViewById(R.id.clearScreen);
        clr = findViewById(R.id.clear);
        ln = findViewById(R.id.ln);
        log = findViewById(R.id.log);
        mod = findViewById(R.id.mod);
        factorial = findViewById(R.id.factorial);
        output = findViewById(R.id.finalResult);
        try {
            Intent intent = getIntent();
            FinalResult = intent.getStringExtra("Expr");
            if(FinalResult == null) {
                FinalResult = "";
            }else{
                output.setText(FinalResult);
                output.setSelection(output.getText().length());
            }
        }catch (Exception e){

        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            output.setShowSoftInputOnFocus(false);
        }
        one.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FinalResult=FinalResult+one.getText().toString();
                output.setText(FinalResult);
                output.setSelection(output.getText().length());
            }
        });
        two.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FinalResult=FinalResult+two.getText().toString();
                output.setText(FinalResult);
                output.setSelection(output.getText().length());
            }
        });
        three.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FinalResult=FinalResult+three.getText().toString();
                output.setText(FinalResult);
                output.setSelection(output.getText().length());
            }
        });
        four.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FinalResult=FinalResult+four.getText().toString();
                output.setText(FinalResult);
                output.setSelection(output.getText().length());
            }
        });
        five.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FinalResult=FinalResult+five.getText().toString();
                output.setText(FinalResult);
                output.setSelection(output.getText().length());
            }
        });
        six.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FinalResult=FinalResult+six.getText().toString();
                output.setText(FinalResult);
                output.setSelection(output.getText().length());
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FinalResult=FinalResult+seven.getText().toString();
                output.setText(FinalResult);
                output.setSelection(output.getText().length());
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FinalResult=FinalResult+eight.getText().toString();
                output.setText(FinalResult);
                output.setSelection(output.getText().length());
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FinalResult=FinalResult+nine.getText().toString();
                output.setText(FinalResult);
                output.setSelection(output.getText().length());
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FinalResult=FinalResult+zero.getText().toString();
                output.setText(FinalResult);
                output.setSelection(output.getText().length());
            }
        });
        point.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FinalResult=FinalResult+point.getText().toString();
                output.setText(FinalResult);
                output.setSelection(output.getText().length());
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FinalResult=FinalResult+plus.getText().toString();
                output.setText(FinalResult);
                output.setSelection(output.getText().length());
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FinalResult=FinalResult+minus.getText().toString();
                output.setText(FinalResult);
                output.setSelection(output.getText().length());
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FinalResult=FinalResult+"*";
                output.setText(FinalResult);
                output.setSelection(output.getText().length());
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FinalResult=FinalResult+divide.getText().toString();
                output.setText(FinalResult);
                output.setSelection(output.getText().length());
            }
        });
        factorial.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FinalResult=FinalResult+factorial.getText().toString();
                output.setText(FinalResult);
                output.setSelection(output.getText().length());
            }
        });
        mod.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FinalResult=FinalResult+"#";
                output.setText(FinalResult);
                output.setSelection(output.getText().length());
            }
        });
        log.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FinalResult=FinalResult+"lg(";
                output.setText(FinalResult);
                output.setSelection(output.getText().length());
            }
        });
        ln.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FinalResult=FinalResult+"ln(";
                output.setText(FinalResult);
                output.setSelection(output.getText().length());
            }
        });
        square.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FinalResult=FinalResult+"^2";
                output.setText(FinalResult);
                output.setSelection(output.getText().length());
            }
        });
        pi.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FinalResult=FinalResult+"pi";
                output.setText(FinalResult);
                output.setSelection(output.getText().length());
            }
        });
        sqrt.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FinalResult=FinalResult+sqrt.getText().toString();
                output.setText(FinalResult);
                output.setSelection(output.getText().length());
            }
        });
        powern.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FinalResult=FinalResult+"^";
                output.setText(FinalResult);
                output.setSelection(output.getText().length());
            }
        });
        sin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FinalResult=FinalResult+"sin(";
                output.setText(FinalResult);
                output.setSelection(output.getText().length());
            }
        });
        cos.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FinalResult=FinalResult+"cos(";
                output.setText(FinalResult);
                output.setSelection(output.getText().length());
            }
        });
        tan.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FinalResult=FinalResult+"tan(";
                output.setText(FinalResult);
                output.setSelection(output.getText().length());
            }
        });
        left.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FinalResult=FinalResult+left.getText().toString();
                output.setText(FinalResult);
                output.setSelection(output.getText().length());
            }
        });
        right.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FinalResult=FinalResult+right.getText().toString();
                output.setText(FinalResult);
                output.setSelection(output.getText().length());
            }
        });
        clrScreen.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                FinalResult = "";
                output.setText(FinalResult);
                output.setSelection(output.getText().length());
            }
        });
        clr.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (FinalResult.length()>0) {
                    FinalResult = FinalResult.substring(0, FinalResult.length() - 1);
                }
                else{
                    FinalResult = "";
                }
                output.setText(FinalResult);
                output.setSelection(output.getText().length());
            }
        });
        output.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                output.setText(FinalResult);
                output.setSelection(output.getText().length());
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Expression e = new Expression(FinalResult);
                double FR =  e.calculate();
                if (String.valueOf(FR).equals("NaN")) {
                    output.setText("Syntax Error Or Infinity");
                }
                else {
                    dbHandler = new DBHandler(MainActivity.this);
                    dbHandler.saveExpression(FinalResult);
                    output.setText(String.valueOf(FR));
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.degree:
                mXparser.setDegreesMode();
                break;
            case R.id.radian:
                mXparser.setRadiansMode();
                break;
            case R.id.about:
                startActivity(new Intent(MainActivity.this, About.class));
                break;
            case R.id.hist:
                startActivity(new Intent(MainActivity.this, History.class));
                break;
            case R.id.exit:
                finish();
                break;
            default:
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}