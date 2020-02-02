package com.hack.debug;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.hack.debug.ui.home.HomeFragment;
import com.hack.debug.ui.home.HomeFragment;
import com.hack.debug.ui.login.LoginActivity;
public class Main2Activity extends AppCompatActivity{
    com.hack.debug.ui.home.HomeFragment newClass = new com.hack.debug.ui.home.HomeFragment();
    Button postBuuton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button postButton = (Button) findViewById(R.id.postButton);
        postButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                EditText postInput = findViewById(R.id.editText4);
                String postInputString = postInput.getText().toString();
                newClass.listAdd(postInputString);
                Intent intent = new Intent(v.getContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
