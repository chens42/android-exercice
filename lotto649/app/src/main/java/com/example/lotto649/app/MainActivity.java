package com.example.lotto649.app;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    public int lengthOfSquare =7;
    GridView numberLayout=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numberLayout = (GridView) findViewById(R.id.display);

        for(int i=0;i<lengthOfSquare;i++){
            for(int j=0;j<lengthOfSquare;j++){
                int value= i*7+j+1;
                TextView element = new TextView(this);
                element.setText(""+value);
                numberLayout.addView(element);
            }
        }

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
