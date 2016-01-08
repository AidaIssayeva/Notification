package org.turntotech.notification;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by AIDA on 12/6/15.
 */
public class Second extends Activity {

    @Override
    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        TextView myText=(TextView) findViewById(R.id.myText);
        myText.setText("This app was opened from a notification.");

    }
    public void Clicked(View v){
        Intent myIntent=new Intent(this,MainActivity.class);
        startActivity(myIntent);

    }
}
