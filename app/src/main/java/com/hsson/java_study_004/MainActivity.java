package com.hsson.java_study_004;

import androidx.appcompat.app.AppCompatActivity;

import android.icu.text.Edits;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("abcde");
        arrayList.add("12345");
        arrayList.add("가나다라마");
        Iterator iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            Log.i("hssonhsson", "iterator.next() = " + iterator.next());
            // result : iterator.next() = abcde
            //          iterator.next() = 12345
            //          iterator.next() = 가나다라마
        }


    }
}