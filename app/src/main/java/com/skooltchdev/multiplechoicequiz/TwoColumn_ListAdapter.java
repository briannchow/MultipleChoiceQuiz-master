package com.skooltchdev.multiplechoicequiz;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by Admin on 6/1/2017.
 */

public class TwoColumn_ListAdapter extends ArrayAdapter<User> {

    private LayoutInflater mInflater;
    private ArrayList<User> users;
    private int mViewResourceId;

    public TwoColumn_ListAdapter(Context context, int textViewResourceId, ArrayList<User> users) {
        super(context, textViewResourceId, users);
        this.users = users;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        mViewResourceId = textViewResourceId;

    }

    public View getView(int position, View convertView, ViewGroup parents) {
        convertView = mInflater.inflate(mViewResourceId, null);

        User user = users.get(position);

        if (user != null) {
            TextView ID = (TextView) convertView.findViewById(R.id.textID);
            TextView Username = (TextView) convertView.findViewById(R.id.textName);
            TextView Score = (TextView) convertView.findViewById(R.id.textScore);


            if (Username != null) {
                Username.setText(user.getUsername());
            }
            if (ID != null) {
                ID.setText(user.getID());
            }
            if (Username != null) {
                Score.setText(user.getScore());
            }



        }
        return convertView;
    }
}



