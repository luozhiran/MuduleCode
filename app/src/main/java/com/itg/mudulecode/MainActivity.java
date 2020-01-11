package com.itg.mudulecode;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Person;
import android.os.Build;
import android.os.Bundle;

import com.itg.annotionlib.SPI;
import com.itg.module_main.SplashActivity;
import com.itg.mudulecode.test.Persion;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @RequiresApi(api = Build.VERSION_CODES.P)
    private void progressAnnotation(){
        Class<Person> clzss = Person.class;
        if (clzss.isAnnotationPresent(SPI.class)){
        }
    }
}
