package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/**
 * Created by Jerry on 30.11.2017.
 */

public class SettingsActivity extends AppCompatActivity {

    // Do step 2 in SettingsActivity
    // COMPLETED (2) Set setDisplayHomeAsUpEnabled to true on the support ActionBar


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        ActionBar actionBar = this.getSupportActionBar();

        if (null != actionBar) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (android.R.id.home == id) {
            onBackPressed();
        }

        return super.onOptionsItemSelected(item);
    }
}
