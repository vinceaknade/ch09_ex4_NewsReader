package com.beech.newsreader;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.app.Activity;
import android.content.Intent;

/***********NOTE************/
//all functionality removed and inserted into ItemFragment class

public class ItemActivity extends Activity
/*implements OnClickListener*/ {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_item);

        /*
        setContentView(com.beech.newsreader.R.layout.activity_item);

        // get references to widgets
        TextView titleTextView = (TextView) findViewById(com.beech.newsreader.R.id.titleTextView);
        TextView pubDateTextView = (TextView) findViewById(com.beech.newsreader.R.id.pubDateTextView);
        TextView descriptionTextView = (TextView) findViewById(com.beech.newsreader.R.id.descriptionTextView);
        TextView linkTextView = (TextView) findViewById(com.beech.newsreader.R.id.linkTextView);
        
        // get the intent
        Intent intent = getIntent();
        
        // get data from the intent
        String pubDate = intent.getStringExtra("pubdate"); 
        String title = intent.getStringExtra("title");
        String description = intent.getStringExtra("description").replace('\n', ' '); 
        
        // display data on the widgets
        pubDateTextView.setText(pubDate); 
        titleTextView.setText(title);
        descriptionTextView.setText(description); 
        
        // set listener
        linkTextView.setOnClickListener(this);*/
    }

    /*
    @Override
    public void onClick(View v) {
        // get the intent
        Intent intent = getIntent();
        
        // get the Uri for the link
        String link = intent.getStringExtra("link");
        Uri viewUri = Uri.parse(link);
        
        // create the intent and start it
        Intent viewIntent = new Intent(Intent.ACTION_VIEW, viewUri); 
        startActivity(viewIntent);
    }*/
}