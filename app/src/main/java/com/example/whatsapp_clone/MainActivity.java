package com.example.whatsapp_clone;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




            recyclerView = findViewById(R.id.contactList);

            ArrayList<contact> list = new ArrayList<contact>();
            list.add(new contact("Ali","ali@gmail.com","src/main/res/drawable/ic_baseline_chat_bubble_24.xml"));
            list.add(new contact("Waqar","waqar@gmail.com","testUrl"));
            list.add(new contact("Sameer","sameer@gmail.com","testUrl"));
            list.add(new contact("Sohaib","sohaib@gmail.com","testUrl"));

            ContactRecyclerViewAdapter adapter = new ContactRecyclerViewAdapter();
            adapter.setContacts(list);

            recyclerView.setAdapter(adapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false));


        }

    }
