package com.example.home.my_calc;



        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.text.TextUtils;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    String TAG = "NUM";


    EditText Num1;
    EditText Num2;

    Button btnAdd;
    Button btnSub;
    Button btnMult;
    Button btnDiv;
    Button btnPerc;
    Button btnClear;

    TextView tvResult;

    String oper = "";


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Num1 = (EditText) findViewById(R.id.etNum1);
        Num2 = (EditText) findViewById(R.id.etNum2);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMult = (Button) findViewById(R.id.btnMult);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnPerc = (Button) findViewById(R.id.btnPerc);
        btnClear = (Button) findViewById(R.id.btnClear);

        tvResult = (TextView) findViewById(R.id.tvResult);


        btnAdd.setOnClickListener(this);
        btnSub.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnPerc.setOnClickListener(this);
        btnClear.setOnClickListener(this);

    }


    public void onClick(View v) {
        float num1;
        float num2;
        float result = 0;


        if (TextUtils.isEmpty(Num1.getText().toString())
                || TextUtils.isEmpty(Num2.getText().toString())) {
            return;
        }


        num1 = Float.parseFloat(Num1.getText().toString());
        num2 = Float.parseFloat(Num2.getText().toString());


        switch (v.getId()) {
            case R.id.btnAdd:
                oper = "+";
                result = num1 + num2;
                break;
            case R.id.btnSub:
                oper = "-";
                result = num1 - num2;
                break;
            case R.id.btnMult:
                oper = "*";
                result = num1 * num2;
                break;
            case R.id.btnDiv:
                oper = "/";
                result = num1 / num2;
                break;
            case R.id.btnPerc:
                oper = "%";
                result = num1/100*num2;
                break;
            case R.id.btnClear;


                break;
            default:
                break;
        }


        tvResult.setText(num1 + " " + oper + " " + num2 + " = " + result);
        Log.d(TAG,":" +num1);
    }


}
