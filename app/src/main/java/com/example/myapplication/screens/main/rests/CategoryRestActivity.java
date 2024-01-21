package com.example.myapplication.screens.main.rests;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.myapplication.screens.main.notes.Spisok;

public class CategoryRestActivity extends ListActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        ListView listRest = getListView();
        ArrayAdapter<GoOutActivities> listAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, GoOutActivities.goOut);
        listRest.setAdapter(listAdapter);
        listRest.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0) {
                    startActivity(new Intent(CategoryRestActivity.this, Spisok.class));
                }
                else if(position==1){
                    startActivity(new Intent(CategoryRestActivity.this, Spisok.class));
                }
            }
        });

    }


    /*protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = new Intent(CategoryRestActivity.this, Spisok.class);
        startActivity(intent);
    }*/

}