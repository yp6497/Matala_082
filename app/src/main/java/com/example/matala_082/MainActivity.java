package com.example.matala_082;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, AdapterView.OnItemClickListener {

    Spinner spin;
    ListView lv;
    int count=0,x;

    String [][] medinot={{"Congo","madagascar","morocco","nigeria","Tanazania","Uganda","sudan"}, {"Argentina", "canada","Brazil","colombia","Mexico","United States","Venezuela"},
            {"Chaina", "India","Israel","Japan","Russia","Turkey","Yemen"}, {"Bulgaria", "France","Germany","Hungary","Italy","Norway","Sweden"}};
    String [][] m=new String[7][4];
    String [][] africaMI={{"fg","f","g","gf"},{"yu","yu","yu","yu"},{"","","",""},{"","","",""},{"","","",""},{"","","",""},{"","","",""}};
    String [][] americaMI={{"fg","f","g","gf"},{"yu","yu","yu","yu"},{"","","k",""},{"","","",""},{"","","",""},{"","","",""},{"","","",""}};
    String [][] asiaMI={{"fg","f","g","gf"},{"yu","yu","yu","yu"},{"","","",""},{"","","",""},{"","","",""},{"","","",""},{"","","",""}};
    String [][] europeMI={{"fg","f","g","gf"},{"yu","yu","yu","yu"},{"","","u",""},{"","","",""},{"","","",""},{"","","",""},{"","","",""}};
    String [] ibeshet={"Choose country","Africa","America","Asia","Europe"};
    TextView tv,tv2,tv3,tv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spin=findViewById(R.id.sp);
        lv=findViewById(R.id.lv);
        tv=findViewById(R.id.tv);
        tv2=findViewById(R.id.tv2);
        tv3=findViewById(R.id.tv3);
        tv4=findViewById(R.id.tv4);

        spin.setOnItemSelectedListener(this);
        ArrayAdapter<String> adp = new ArrayAdapter<String>(this,
                R.layout.support_simple_spinner_dropdown_item,ibeshet);
        spin.setAdapter(adp);

        lv.setOnItemClickListener(this);
        lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        tv.setText("");
        tv2.setText("");
        tv3.setText("");
        tv4.setText("");
        if(position==0) {
            Toast.makeText(this,"Please choose a country", Toast.LENGTH_SHORT).show();
        }

        else {
            ArrayAdapter<String> adpl = new ArrayAdapter<String>(this,
                    R.layout.support_simple_spinner_dropdown_item, medinot[position-1]);
            lv.setAdapter(adpl);
            x = position-1;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(x==0) {
            m=africaMI;
        }
        else if(x==1) {
            m=americaMI;
        }
        else if(x==2) {
            m=asiaMI;
        }
        else if(x==3) {
            m=europeMI;
        }
        tv.setText("h " + m[position][0]);
        tv2.setText("c " + m[position][1]);
        tv3.setText("d " + m[position][2]);
        tv4.setText("s " + m[position][3]);
    }
}