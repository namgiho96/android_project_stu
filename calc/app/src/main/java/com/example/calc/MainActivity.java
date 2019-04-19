package com.example.calc;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int num ,res = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Context ctx = MainActivity.this;
        TextView reslut = findViewById(R.id.text_result);

        class Calc {

            String op;

            public void execute() {

                switch (op) {

                    case "+":

                        break;
                    case "-":

                        break;
                    case "*":

                        break;
                    case "/":

                        break;
                }
            }
            int getNum() {
                return num;
            }
            void setNum() {

            }

        }

        findViewById(R.id.button_1).setOnClickListener((v)->{
           Toast.makeText(ctx,"1번버튼",Toast.LENGTH_LONG).show();
            reslut.setText("1");
        });
        findViewById(R.id.button_2).setOnClickListener((v)->{
            Toast.makeText(ctx,"2번버튼",Toast.LENGTH_LONG).show();
            reslut.setText("2");
        });
        findViewById(R.id.button_3).setOnClickListener((v)->{
            Toast.makeText(ctx,"3번버튼",Toast.LENGTH_LONG).show();
            reslut.setText("3");
        });
        findViewById(R.id.button_4).setOnClickListener((v)->{
            Toast.makeText(ctx,"4번버튼",Toast.LENGTH_LONG).show();
            reslut.setText("4");
        });
        findViewById(R.id.button_5).setOnClickListener((v)->{
            Toast.makeText(ctx,"5번버튼",Toast.LENGTH_LONG).show();
            reslut.setText("5");
        });
        findViewById(R.id.button_6).setOnClickListener((v)->{
            Toast.makeText(ctx,"6번버튼",Toast.LENGTH_LONG).show();
            reslut.setText("6");
        });
        findViewById(R.id.button_7).setOnClickListener((v)->{
            Toast.makeText(ctx,"7번버튼",Toast.LENGTH_LONG).show();
            reslut.setText("7");
        });
        findViewById(R.id.button_8).setOnClickListener((v)->{
            Toast.makeText(ctx,"8번버튼",Toast.LENGTH_LONG).show();
            reslut.setText("8");
        });
        findViewById(R.id.button_9).setOnClickListener((v)->{
            Toast.makeText(ctx,"9번버튼",Toast.LENGTH_LONG).show();
            reslut.setText("9");
        });

        findViewById(R.id.button_clear).setOnClickListener((v)->{
            Toast.makeText(ctx,"ac번버튼",Toast.LENGTH_LONG).show();
        });
        findViewById(R.id.button_back).setOnClickListener((v)->{
            Toast.makeText(ctx,"back번버튼",Toast.LENGTH_LONG).show();
        });
        findViewById(R.id.button_devide).setOnClickListener((v)->{
            Toast.makeText(ctx,"button_devide번버튼",Toast.LENGTH_LONG).show();
        });
        findViewById(R.id.button_plus).setOnClickListener((v)->{
            Toast.makeText(ctx,"button_plus번버튼",Toast.LENGTH_LONG).show();
        });
        findViewById(R.id.button_minus).setOnClickListener((v)->{
            Toast.makeText(ctx,"button_minus",Toast.LENGTH_LONG).show();
        });
        findViewById(R.id.button_multi).setOnClickListener((v)->{
            Toast.makeText(ctx,"button_multi번버튼",Toast.LENGTH_LONG).show();
        });
        findViewById(R.id.button_equal).setOnClickListener((v)->{
            Toast.makeText(ctx,"button_equal번버튼",Toast.LENGTH_LONG).show();
        });





    }
}
