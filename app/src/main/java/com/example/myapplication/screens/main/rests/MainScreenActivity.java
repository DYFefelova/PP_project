package com.example.myapplication.screens.main.rests;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;
import com.example.myapplication.screens.main.registry.LoginActivity;
import com.google.firebase.auth.FirebaseAuth;

public class MainScreenActivity extends AppCompatActivity {
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainscreen);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent intent = new Intent(MainScreenActivity.this, CategoryRestActivity.class);
                    startActivity(intent);
                }
            }
        };

        ListView listView = findViewById(R.id.list_item);
        listView.setOnItemClickListener(itemClickListener);

        Button logout_button = findViewById(R.id.logout_button);
        mAuth = FirebaseAuth.getInstance();

        logout_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signOut();
                Intent intent = new Intent (MainScreenActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}