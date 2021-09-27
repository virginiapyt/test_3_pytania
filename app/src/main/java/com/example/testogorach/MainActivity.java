package com.example.testogorach;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int currentIndex = 0;
    private QustionRepository all = new QustionRepository();
    private TextView textView;
    private CheckBox checkboxes[] = new CheckBox[3];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView1);
        checkboxes[0] = (CheckBox) findViewById(R.id.checkBox);
        checkboxes[1] = (CheckBox) findViewById(R.id.checkBox2);
        checkboxes[2] = (CheckBox) findViewById(R.id.checkBox3);

        show(currentIndex);

    }

    private void show(int i){
        Question currentQuestion = all.allQuestion[i];
        textView.setText(currentQuestion.getTextQuestion());
        int k =0;
        for(CheckBox check:checkboxes){
            check.setText(currentQuestion.getAnswer(k));
            check.setChecked(false);
            k++;
        }
    }
    private boolean checkAnswer(int i){
        Question currentQuestion = all.allQuestion[i];
        int k=0;
       for(CheckBox check:checkboxes){
           if(check.isChecked() != currentQuestion.getAnswerOk(k) )
               return false;
           k++;
       }
        return true;
    }
    public void next(View view) {
        if(checkAnswer(currentIndex)){
            Toast.makeText(this,"Dobra odpowiedź",Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this,"Zła odpowiedź",Toast.LENGTH_SHORT).show();
        }
        currentIndex++;
        if(currentIndex == all.allQuestion.length)
        {
            Toast
                    .makeText(this,"to już jest koniec",Toast.LENGTH_SHORT)
                    .show();
            return;
        }
        show(currentIndex);
    }
}