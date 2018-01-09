package com.koreanair.samplemobilequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Quiz3SendIntentActivity extends AppCompatActivity implements View.OnClickListener {

    Button button6;
    EditText editText1;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3_send_intent);

        button6 = (Button)findViewById(R.id.button_6);
        editText1 = (EditText)findViewById(R.id.username);
        editText2 = (EditText)findViewById(R.id.password);

        //두번째 방법
        button6.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        //TODO: Quiz3. 사용자의 입력을 다음 창으로 전달하기

        String userName = editText1.getText().toString();
        String passWord = editText2.getText().toString();

        Intent intent = new Intent(this, Quiz3ReceiveIntentActivity.class);
        intent.putExtra("username",userName);
        intent.putExtra("password",passWord);
        startActivity(intent);
    }
}
