/*this code has to be put in MainActivity.java file 
then only run it*/

package com.app.add;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1, et2;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 =  findViewById(R.id.editText1);
        et2 =  findViewById(R.id.editText2);
        b1 =findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=et1.getText().toString();
                String s2=et2.getText().toString();
                int a= Integer.parseInt(s1);
                int b= Integer.parseInt(s2);
                int s=a+b;
                Toast.makeText(getApplicationContext(), String.valueOf(s), Toast.LENGTH_LONG).show();
            }
        });
    }

}
