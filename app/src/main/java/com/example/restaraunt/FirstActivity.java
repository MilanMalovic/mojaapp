package com.example.restaraunt;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class FirstActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);


        Toast toast = Toast.makeText(getBaseContext(), "FirstActivity.onCreate()", Toast.LENGTH_SHORT);
        toast.show();




    }

    protected void onStart() {

        super.onStart();

        // Shows a toast message (a pop-up message)
        Toast toast = Toast.makeText(getBaseContext(), "FirstActivity.onStart()", Toast.LENGTH_SHORT);
        toast.show();
    }


    @Override
    protected void onRestart() {

        super.onRestart();

        // Shows a toast message (a pop-up message)
        Toast toast = Toast.makeText(getBaseContext(), "FirstActivity.onRestart()", Toast.LENGTH_SHORT);
        toast.show();
    }



    @Override
    protected void onResume() {

        super.onResume();

        // Shows a toast message (a pop-up message)
        Toast toast = Toast.makeText(getBaseContext(), "FirstActivity.onResume()", Toast.LENGTH_SHORT);
        toast.show();
    }



    @Override
    protected void onPause() {

        super.onPause();

        // Shows a toast message (a pop-up message)
        Toast toast = Toast.makeText(getBaseContext(), "FirstActivity.onPause()", Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    protected void onStop() {

        super.onStop();

        // Shows a toast message (a pop-up message)
        Toast toast = Toast.makeText(getBaseContext(), "FirstActivity.onStop()", Toast.LENGTH_SHORT);
        toast.show();
    }

    // onDestroy method is a lifecycle method that perform any final cleanup before an activity is destroyed
    @Override
    protected void onDestroy() {

        super.onDestroy();

        // Shows a toast message (a pop-up message)
        Toast toast = Toast.makeText(getBaseContext(), "FirstActivity.onDestroy()", Toast.LENGTH_SHORT);
        toast.show();
    }
}
