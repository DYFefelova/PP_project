package com.example.myapplication;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CategoryRestActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        ListView listRest = getListView();
        ArrayAdapter<GoOutActivities> listAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, GoOutActivities.goOut);
        listRest.setAdapter(listAdapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        Intent intent = new Intent(CategoryRestActivity.this, RestActivity.class);
        intent.putExtra(RestActivity.EXTRA_REST, (int) id);
        startActivity(intent);
    }
}