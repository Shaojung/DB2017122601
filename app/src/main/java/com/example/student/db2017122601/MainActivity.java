package com.example.student.db2017122601;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click1(View v)
    {
        File f = getFilesDir();
        Log.d("FILE", f.getAbsolutePath());
        File myfile = new File(f, "myfile.txt");
        try {
            FileWriter fw = new FileWriter(myfile);
            fw.write("Hello World 123");
            fw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void click2(View v)
    {
        File f = getCacheDir();
        Log.d("FILE", f.getAbsolutePath());
    }
    public void click3(View v)
    {
        File f = getFilesDir();
        Log.d("FILE", f.getAbsolutePath());
        File myfile = new File(f, "myfile.txt");
        String str;
        try {
            FileReader fr = new FileReader(myfile);
            BufferedReader br = new BufferedReader(fr);
            str = br.readLine();
            Toast.makeText(MainActivity.this, str, Toast.LENGTH_SHORT).show();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
