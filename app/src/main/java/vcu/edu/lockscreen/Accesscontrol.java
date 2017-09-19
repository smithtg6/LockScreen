package vcu.edu.lockscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Accesscontrol extends AppCompatActivity {

    TextView acTextView;
    Button mButton1;
    Button mButton2;
    Button mButton3;
    Button mButton4;
    Button mButtonSubmit;
    private final int keypadCorrect = 1234;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keypadscreen);

        acTextView = (TextView) findViewById(R.id.passwordLine);
        mButton1 = (Button) findViewById(R.id.button1);
        mButton2 = (Button) findViewById(R.id.button2);
        mButton3 = (Button) findViewById(R.id.button3);
        mButton4 = (Button) findViewById(R.id.button4);
        mButtonSubmit = (Button) findViewById(R.id.button_submit);

        mButton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                acTextView.setText(acTextView.getText() + "1");

            }
        });

        mButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                acTextView.setText(acTextView.getText() + "2");
            }
        });

        mButton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                acTextView.setText(acTextView.getText() + "3");
            }
        });

        mButton4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                acTextView.setText(acTextView.getText() + "4");
            }
        });


    }

    public void goToMainActivity(View view)
    {
        int number = Integer.parseInt(acTextView.getText().toString());
        Intent intent = new Intent(this, MainActivity.class);


//        switch(number)
//        {
//            case 1234: MainActivity.mTextView.setText("The App is unlocked");
//            startActivity(intent);
//                break;
//            default: MainActivity.mTextView.setText("Welcome Back");
//                startActivity(intent);
//                break;
//        }
      if(number == 1234)
      {

          MainActivity.mTextView.setText("The App is Unlocked");
          //startActivityForResult(intent, keypadCorrect);
          finish();
      }
      else
      {

          MainActivity.mTextView.setText("Welcome to the App! The App is LOCKED!");
          //startActivity(intent);
          finish();
      }

    }
}