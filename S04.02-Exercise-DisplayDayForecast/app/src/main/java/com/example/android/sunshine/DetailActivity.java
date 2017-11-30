package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    private TextView mWeatherDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mWeatherDisplay = (TextView) findViewById(R.id.tv_display_weather);

        // TODO (2) Display the weather forecast that was passed from MainActivity
        Intent startedByIntent = getIntent();

        if (startedByIntent.hasExtra(Intent.EXTRA_TEXT)) {
            String sentText = startedByIntent.getStringExtra(Intent.EXTRA_TEXT);
            mWeatherDisplay.setText(sentText);
        }

    }
}