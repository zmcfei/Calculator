package com.example.zmc.calculator;

import android.app.AlertDialog;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;
import android.widget.Button;
import android.widget.EditText;


public class Calculator extends ActionBarActivity  {

    String outs = "";
    Button numb;
    EditText outEidt;
    private View.OnClickListener litener1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            numb = (Button) v;
            switch (numb.getId()){
                case R.id.button1:
                    outs += 1;
                    outEidt.setText(outs);
                    break;
                case R.id.button2:
                    outs += 2;
                    outEidt.setText(outs);
                    break;
                case R.id.button3:
                    outs += 3;
                    outEidt.setText(outs);
                    break;
                case R.id.button4:
                    outs += 4;
                    outEidt.setText(outs);
                    break;
                case R.id.button5:
                    outs += 5;
                    outEidt.setText(outs);
                    break;
                case R.id.button6:
                    outs += 6;
                    outEidt.setText(outs);
                    break;
                case R.id.button7:
                    outs += 7;
                    outEidt.setText(outs);
                    break;
                case R.id.button8:
                    outs += 8;
                    outEidt.setText(outs);
                    break;
                case R.id.button9:
                    outs += 9;
                    outEidt.setText(outs);
                    break;
                case R.id.button0:
                    outs += 0;
                    outEidt.setText(outs);
                    break;
                case R.id.button11:
                    outs += '+';
                    outEidt.setText(outs);
                    break;
                case R.id.button12:
                    outs += '=';
                    outEidt.setText(outs);
                    break;
                default:
                    outs="";
                    outEidt.setText("0");

            }
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        outEidt = (EditText) findViewById(R.id.result);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
        numb= (Button) findViewById(R.id.button1);
        numb.setOnClickListener(litener1);
        numb= (Button) findViewById(R.id.button2);
        numb.setOnClickListener(litener1);
        numb= (Button) findViewById(R.id.button3);
        numb.setOnClickListener(litener1);
        numb= (Button) findViewById(R.id.button4);
        numb.setOnClickListener(litener1);
        numb= (Button) findViewById(R.id.button5);
        numb.setOnClickListener(litener1);
        numb= (Button) findViewById(R.id.button6);
        numb.setOnClickListener(litener1);
        numb= (Button) findViewById(R.id.button7);
        numb.setOnClickListener(litener1);
        numb= (Button) findViewById(R.id.button8);
        numb.setOnClickListener(litener1);
        numb= (Button) findViewById(R.id.button9);
        numb.setOnClickListener(litener1);
        numb= (Button) findViewById(R.id.button0);
        numb.setOnClickListener(litener1);
        numb= (Button) findViewById(R.id.button11);
        numb.setOnClickListener(litener1);
        numb= (Button) findViewById(R.id.button12);
        numb.setOnClickListener(litener1);
        numb= (Button) findViewById(R.id.button);
        numb.setOnClickListener(litener1);
    }

    public void test(View v){
        System.out.println("out");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculator, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_calculator, container, false);
            return rootView;
        }
    }
}
