package com.beech.newsreader;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

public class ItemFragment extends Fragment implements OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //layout functionality moved to onCreateView()
        /*
        setContentView(R.layout.activity_item);

        // get references to widgets
        TextView titleTextView = (TextView) findViewById(R.id.titleTextView);
        TextView pubDateTextView = (TextView) findViewById(R.id.pubDateTextView);
        TextView descriptionTextView = (TextView) findViewById(R.id.descriptionTextView);
        TextView linkTextView = (TextView) findViewById(R.id.linkTextView);
        
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

    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //inflate layout for this fragment
        View view = inflater.inflate(R.layout.fragment_item,container,false);
        //setContentView(R.layout.activity_item);

        // get references to widgets
        TextView titleTextView = (TextView) view.findViewById(R.id.titleTextView);
        TextView pubDateTextView = (TextView) view.findViewById(R.id.pubDateTextView);
        TextView descriptionTextView = (TextView) view.findViewById(R.id.descriptionTextView);
        TextView linkTextView = (TextView) view.findViewById(R.id.linkTextView);

        // get the intent
        Intent intent = getActivity().getIntent();

        // get data from the intent
        String pubDate = intent.getStringExtra("pubdate");
        String title = intent.getStringExtra("title");
        String description = intent.getStringExtra("description").replace('\n', ' ');

        // display data on the widgets
        pubDateTextView.setText(pubDate);
        titleTextView.setText(title);
        descriptionTextView.setText(description);

        // set listener
        linkTextView.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        // get the intent
        Intent intent = getActivity().getIntent();
        
        // get the Uri for the link
        String link = intent.getStringExtra("link");
        Uri viewUri = Uri.parse(link);
        
        // create the intent and start it
        Intent viewIntent = new Intent(Intent.ACTION_VIEW, viewUri); 
        startActivity(viewIntent);
    }
}