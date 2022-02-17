package com.andc.tictactoe;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;

    String button1String;
    String button2String;
    String button3String;
    String button4String;
    String button5String;
    String button6String;
    String button7String;
    String button8String;
    String button9String;

    int flag = 0;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButtonAssign();
    }

    private void ButtonAssign() {
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
    }

    private void restart() {
        button9.setText("");
        button8.setText("");
        button7.setText("");
        button6.setText("");
        button5.setText("");
        button4.setText("");
        button3.setText("");
        button2.setText("");
        button1.setText("");
        count = 0;
        flag = 0;
    }

    public void Check(View view) {
        Button currentButton = (Button) view;

        if (currentButton.getText().toString().equals("")) {
            count++;
            if (flag == 0) {
                currentButton.setText("X");
                flag = 1;
            } else {
                currentButton.setText("O");
                flag = 0;
            }

            if (count > 4) {
                button1String = button1.getText().toString();
                button2String = button2.getText().toString();
                button3String = button3.getText().toString();
                button4String = button4.getText().toString();
                button5String = button5.getText().toString();
                button6String = button6.getText().toString();
                button7String = button7.getText().toString();
                button8String = button8.getText().toString();
                button9String = button9.getText().toString();

                if (button9.equals(button8) && button8.equals(button7) && !button9.equals("")) {
                    Toast.makeText(this, "Winner: " + button1, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (button6.equals(button5) && button5.equals(button4) && !button6.equals("")) {
                    Toast.makeText(this, "Winner: " + button6, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (button3.equals(button2) && button2.equals(button1) && !button3.equals("")) {
                    Toast.makeText(this, "Winner: " + button3, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (button9.equals(button6) && button6.equals(button3) && !button6.equals("")) {
                    Toast.makeText(this, "Winner: " + button9, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (button8.equals(button5) && button5.equals(button2) && !button8.equals("")) {
                    Toast.makeText(this, "Winner: " + button8, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (button7.equals(button4) && button4.equals(button1) && !button7.equals("")) {
                    Toast.makeText(this, "Winner: " + button7, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (button9.equals(button5) && button5.equals(button1) && !button9.equals("")) {
                    Toast.makeText(this, "Winner: " + button9, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (button7.equals(button5) && button5.equals(button3) && !button7.equals("")) {
                    Toast.makeText(this, "Winner: " + button7, Toast.LENGTH_SHORT).show();
                    restart();
                } else if (count == 9) {
                    Toast.makeText(this, "Draw", Toast.LENGTH_SHORT).show();
                    restart();
                }
            }
        }
    }
}