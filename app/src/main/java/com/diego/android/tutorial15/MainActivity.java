package com.diego.android.tutorial15;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView list_view_android_versions;
    ArrayList<String> android_versions = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list_view_android_versions = (ListView)findViewById(R.id.list_view);
        ArrayAdapter<String> adapter_android_versions;
        String[] string_android_versions = {   "cupcake",
                "doughnut",
                "eclair",
                "froyo",
                "gingerbread",
                "honeycomb",
                "ice creame sandwich",
                "jellybean",
                "kitkat",
                "lollipop",
                "marshmellow"};

        for( String element: string_android_versions){
            android_versions.add(element);
        }

        adapter_android_versions= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,android_versions);
        list_view_android_versions.setAdapter(adapter_android_versions);


        list_view_android_versions.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast is not
                Toast.makeText(list_view_android_versions.getContext(), (String) parent.getItemAtPosition(position) + " clicked", Toast.LENGTH_SHORT).show();
            }
        });



    }


}
