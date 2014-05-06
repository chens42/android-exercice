package com.example.listview.app;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {
    ListView display=null;

    shopAdapter adapter = null;
    List<Info> list= new ArrayList<Info>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Info infoOne = new Info("GAME1","COMPANY1");
        Info infoTwo = new Info("GAME2","COMPANY2");
        Info infoThree = new Info("GAME3","COMPANY3");
        Info infoFour = new Info("GAME4","COMPANY4");
        Info infoFive = new Info("GAME5","COMPANY5");
        list.add(infoOne);
        list.add(infoTwo);
        list.add(infoThree);
        list.add(infoFour);
        list.add(infoFive);
        list.add(infoFive);
        list.add(infoFive);
        list.add(infoFive);
        list.add(infoFive);
        list.add(infoFive);
        list.add(infoFive);
        list.add(infoFive);
        list.add(infoFive);


        adapter=new shopAdapter();
        display= (ListView) this.findViewById(R.id.show);
        display.setAdapter(adapter);
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
    class shopAdapter extends ArrayAdapter<Info>{

        shopAdapter() {
            super(MainActivity.this,R.layout.row,list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View row = convertView;
            shopHolder holder= null;

            if(row==null){
                LayoutInflater inflater=getLayoutInflater();
                row =inflater.inflate(R.layout.row,parent,false);
                holder = new shopHolder(row);
                row.setTag(holder);

            }else{
                holder=(shopHolder)row.getTag();
            }
            row.setBackgroundResource(R.drawable.shadow);
            holder.putIn(list.get(position));
            return row;
        }

    }
    class shopHolder{
        private TextView title=null;
        private TextView company=null;
        private ImageView icon=null;

        public shopHolder(View row){
            row.setBackgroundColor(Color.WHITE);
            title= (TextView) row.findViewById(R.id.title);
            company=(TextView) row.findViewById(R.id.company);
            icon=(ImageView)row.findViewById(R.id.icon);
        }

        public void putIn(Info element){
            title.setText(element.getTitle());
            company.setText(element.getCompany());


            icon.setImageResource(R.drawable.images);

        }

    }


}
