package com.example.iteng;


import android.os.Bundle;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class WordsFragment extends Fragment {
    private static final String TAG ="WordsFragment";
    private ListView listView;


    public WordsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_words, container, false);
        listView= view.findViewById(R.id.listView);

        Words word1 = new Words("to back up (backup)","выполнять резервное копирование");
        Words word2 = new Words("to boot","загружать, загружаться (например, об устройстве или операционной системе)");
        Words word3 = new Words("to burn","записывать на оптический диск");
        Words word4 = new Words("to create","создавать");
        Words word5 = new Words("to compile","компилировать");
        Words word6 = new Words("to compress","сжимать (например, архиватором)");
        Words word7 = new Words("to connect","соединять, подключаться");
        Words word8 = new Words("to copy","копировать");
        Words word9 = new Words("to cut","вырезать в буфер обмена");
        Words word10 = new Words("to debug","отлаживать");
        Words word11 = new Words("to decrypt","расшифровывать");

        ArrayList<Words> wordList =new ArrayList<>();

        wordList.add(word1);
        wordList.add(word2);
        wordList.add(word3);
        wordList.add(word4);
        wordList.add(word5);
        wordList.add(word6);
        wordList.add(word7);
        wordList.add(word8);
        wordList.add(word9);
        wordList.add(word10);
        wordList.add(word11);




        //создаем свой адаптер потому что у нас лист вью разделен на две части, т.е. не обычный и создаем под него класс
        WordListAdapter adapter = new WordListAdapter(requireContext(),R.layout.adapter_view_layout,wordList);
        listView.setAdapter(adapter);


        return view;
    }




//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        Log.d(TAG,"onCreate: Started");
//         listView= listView.findViewById(R.id.listView);
//
//
//
//
//        Words word1 = new Words("to back up (backup)","выполнять резервное копирование");
//        Words word2 = new Words("to boot","загружать, загружаться (например, об устройстве или операционной системе)");
//        Words word3 = new Words("to burn","записывать на оптический диск");
//        Words word4 = new Words("to create","создавать");
//        Words word5 = new Words("to compile","компилировать");
//        Words word6 = new Words("to compress","сжимать (например, архиватором)");
//        Words word7 = new Words("to connect","соединять, подключаться");
//        Words word8 = new Words("to copy","копировать");
//        Words word9 = new Words("to cut","вырезать в буфер обмена");
//        Words word10 = new Words("to debug","отлаживать");
//        Words word11 = new Words("to decrypt","расшифровывать");
//
//        ArrayList<Words> wordList =new ArrayList<>();
//
//        wordList.add(word1);
//        wordList.add(word2);
//        wordList.add(word3);
//        wordList.add(word4);
//        wordList.add(word5);
//        wordList.add(word6);
//        wordList.add(word7);
//        wordList.add(word8);
//        wordList.add(word9);
//        wordList.add(word10);
//        wordList.add(word11);
//
//        //создаем свой адаптер потому что у нас лист вью разделен на две части, т.е. не обычный и создаем под него класс
//        WordListAdapter adapter = new WordListAdapter(requireContext(),R.layout.adapter_view_layout,wordList);
//        listView.setAdapter(adapter);
//}
}
