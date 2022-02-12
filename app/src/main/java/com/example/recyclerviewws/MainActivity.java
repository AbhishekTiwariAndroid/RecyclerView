package com.example.recyclerviewws;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<ContactModel> arrContacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerContact);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrContacts.add(new ContactModel(R.drawable.reicon1, "A", "9876543210"));
        arrContacts.add(new ContactModel(R.drawable.reicon2, "B", "9834543210"));
        arrContacts.add(new ContactModel(R.drawable.reicon3, "C", "9812543210"));
        arrContacts.add(new ContactModel(R.drawable.reicon4, "D", "9976543210"));
        arrContacts.add(new ContactModel(R.drawable.reicon5, "E", "9376543210"));
        arrContacts.add(new ContactModel(R.drawable.reicon6, "F", "9176543210"));
        arrContacts.add(new ContactModel(R.drawable.reicon7, "G", "9974543210"));
        arrContacts.add(new ContactModel(R.drawable.reicon8, "H", "9111543210"));
        arrContacts.add(new ContactModel(R.drawable.reicon9, "I", "9000543210"));
        arrContacts.add(new ContactModel(R.drawable.reicon10, "J", "9800003210"));
        arrContacts.add(new ContactModel(R.drawable.reicon11, "K", "9876549999"));
        arrContacts.add(new ContactModel(R.drawable.reicon12, "L", "9876511111"));
        arrContacts.add(new ContactModel(R.drawable.reicon13, "M", "9999543210"));
        arrContacts.add(new ContactModel(R.drawable.reicon14, "N", "8888543210"));
        arrContacts.add(new ContactModel(R.drawable.reicon15, "O", "7776543210"));
        arrContacts.add(new ContactModel(R.drawable.reicon16, "P", "7506543210"));

        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this, arrContacts);
        recyclerView.setAdapter(adapter);


    }
}