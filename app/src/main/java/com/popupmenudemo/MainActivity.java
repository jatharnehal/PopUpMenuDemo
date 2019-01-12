package com.popupmenudemo;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnPopUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPopUp=findViewById(R.id.btnPopUp);

        btnPopUp.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {

                PopupMenu popup=new PopupMenu(MainActivity.this,btnPopUp);
                popup.getMenuInflater().inflate(R.layout.popup_menu,popup.getMenu());

                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        Toast.makeText(getApplicationContext(),"you Clicked "+menuItem.getTitle(),Toast.LENGTH_LONG).show();
                        return false;
                    }
                });
                popup.show();
            }
        });
    }
}
