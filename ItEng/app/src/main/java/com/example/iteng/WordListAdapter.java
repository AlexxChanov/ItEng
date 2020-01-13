package com.example.iteng;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class WordListAdapter extends ArrayAdapter<Words> {
    private static final String TAG = "WordsListAdapter";
    private Context mContext;
    int mResource;


    public WordListAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Words> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        //get the words info
        String word = getItem(position).getWord();
        String translation = getItem(position).getTranslation();


        //Create the person object with the info
        Words words = new Words(word,translation);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource,parent,false);

        TextView tvWord = convertView.findViewById(R.id.word);
        TextView tvTranslation = convertView.findViewById(R.id.translation);

        tvWord.setText(word);
        tvTranslation.setText(translation);
        return convertView;

    }}
