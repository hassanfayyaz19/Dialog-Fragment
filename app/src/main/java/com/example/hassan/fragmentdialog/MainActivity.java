package com.example.hassan.fragmentdialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG="MainActivty";

    TextView DisplayTxt;

    public String mInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DisplayTxt=findViewById(R.id.textView2);
    }

    public void DisplayValue(View  view)
    {
        DialogFragment dialogFragment=new DialogFragment();
        dialogFragment.show(getSupportFragmentManager(),"MyCustomDialog");

    }
}
