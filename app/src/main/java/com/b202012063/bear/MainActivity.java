package com.b202012063.bear;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edt1, edt2, edtResult;
    int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = findViewById(R.id.edtNum1);
        edt2 = findViewById(R.id.edtNum2);
        edtResult = findViewById(R.id.edtResult);
    }

    public void doPlus(View view) {

        InputMethodManager manager = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
        manager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);

        try {
            num1 = Integer.parseInt(edt1.getText().toString());
            num2 = Integer.parseInt(edt2.getText().toString());

            String strResult = String.valueOf(num1 + num2);
            edtResult.setText(strResult);

        } catch (Exception e) {
            Toast.makeText(MainActivity.this, "숫자를 입력해 주세요.", Toast.LENGTH_LONG).show();
        }

    }

    public void doMinus(View view) {

        InputMethodManager manager = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
        manager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);

        try {
            num1 = Integer.parseInt(edt1.getText().toString());
            num2 = Integer.parseInt(edt2.getText().toString());

            String strResult = String.valueOf(num1 - num2);
            edtResult.setText(strResult);

        } catch (Exception e) {
            Toast.makeText(MainActivity.this, "숫자를 입력해 주세요.", Toast.LENGTH_LONG).show();
        }
    }

    public void doMulti(View view) {

        InputMethodManager manager = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
        manager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);

        try {
            num1 = Integer.parseInt(edt1.getText().toString());
            num2 = Integer.parseInt(edt2.getText().toString());

            String strResult = String.valueOf(num1 * num2);
            edtResult.setText(strResult);

        } catch (Exception e) {
            Toast.makeText(MainActivity.this, "숫자를 입력해 주세요.", Toast.LENGTH_LONG).show();
        }
    }

    public void doDiv(View view) {

        InputMethodManager manager = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
        manager.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS);

        try {
            num1 = Integer.parseInt(edt1.getText().toString());
            num2 = Integer.parseInt(edt2.getText().toString());

            String strResult = String.valueOf(num1 / num2);
            edtResult.setText(strResult);


        } catch (Exception e) {
            if (num2 == 0) {
                Toast.makeText(MainActivity.this, "0으로 나눌 수 없습니다.", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(MainActivity.this, "숫자를 입력해 주세요.", Toast.LENGTH_LONG).show();
            }
        }
    }
}