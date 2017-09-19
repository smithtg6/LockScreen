package vcu.edu.lockscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static TextView mTextView;
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.textview_lockscreen);
        mButton = (Button) findViewById(R.id.button_lockscreen);




    }

    public void goToAccessControl (View view) {
        Intent intent = new Intent(this, Accesscontrol.class);
        startActivity(intent);

    }
}
