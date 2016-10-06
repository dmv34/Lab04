package com.example.drew.lab04;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    // onCreate starts up the main activity
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //creates the menu in the action bar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    // method is run when an Item is selected in the menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Determines what item was selected
        switch (item.getItemId()) {
            case R.id.show_about:
                //opens the new activity (about page)
                Intent newIntent = new Intent(this, AboutActivity.class);
                startActivity(newIntent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}