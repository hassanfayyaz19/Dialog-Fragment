package com.example.hassan.fragmentdialog;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class DialogFragment extends android.support.v4.app.DialogFragment {

    private static final String TAG = "MyCustomDialog";

    EditText t1, t2;
    TextView ok, canccel;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dialog_activty, container, false);
        t1 = view.findViewById(R.id.editText);
        t2 = view.findViewById(R.id.editText2);
        ok = view.findViewById(R.id.textView5);
        canccel = view.findViewById(R.id.textView4);

        canccel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getDialog().dismiss();
            }
        });


        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name=t1.getText().toString();
                String section=t2.getText().toString();

                //Easy way to set text value

                ((MainActivity)getActivity()).DisplayTxt.setText("Name :"+name+ "\n"+"Section :"+ section);
           getDialog().dismiss(); }

        });
        return view;
    }
}
