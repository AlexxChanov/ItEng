package com.example.iteng.NavView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.iteng.R;
import com.example.iteng.Words;
import com.example.iteng.WordsFragment;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class TestFragment extends Fragment {

    private TextInputLayout textInputLayout ;
    private Button testButtonYes;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.test_fragment,container,false);

        textInputLayout=view.findViewById(R.id.inputAnswer);
        testButtonYes=view.findViewById(R.id.buttonTestYes);

        testButtonYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                confirmInput(v);
            }
        });

       return view;
    }


    private boolean validateAnswer(){
        String wordInput = textInputLayout.getEditText().getText().toString().trim();
        if(wordInput.isEmpty()){

            textInputLayout.setError("Ответ не введен");
            return false;

        } else {
            textInputLayout.setError(null);

            return true;
        }
    }

    public void confirmInput(View v){
        if (!validateAnswer()){
            return;
        }
        String input ="Answer:"+textInputLayout.getEditText().getText().toString();
        Toast.makeText(requireContext(),input,Toast.LENGTH_SHORT).show();
    }
}
