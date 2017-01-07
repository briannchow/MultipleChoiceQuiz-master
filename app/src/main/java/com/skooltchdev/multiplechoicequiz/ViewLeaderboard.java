package com.skooltchdev.multiplechoicequiz;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ViewLeaderboard extends AppCompatActivity {

    DatabaseHelper LeaderboardDb;
    ArrayList<User> userList;
    ListView listView;
    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewcontents_layout);

        //ListView listView = (ListView) findViewById(R.id.LeaderboardList);
        LeaderboardDb = new DatabaseHelper(this);
        userList = new ArrayList<>();

        //ArrayList<String> theLeaderboard = new ArrayList<>();
        Cursor data = LeaderboardDb.getAllData();
        int numRows = data.getCount();
        if (numRows == 0) {
            Toast.makeText(ViewLeaderboard.this, "No scores were recorded!", Toast.LENGTH_LONG).show();
        } else {
            int i =0;
            while(data.moveToNext()) {
                user = new User(data.getInt(0)  ,data.getString(1), data.getInt(2));
                userList.add(i,user);
                System.out.println(data.getInt(0) + " " + data.getString(1) + " " + data.getInt(2));
                System.out.println(userList.get(i).getUsername());
                i++;
            }
            TwoColumn_ListAdapter adapter = new TwoColumn_ListAdapter(this, R.layout.activity_view_leaderboard, userList);
            listView = (ListView) findViewById(R.id.listView);
            listView.setAdapter(adapter);
        }
    }
}
