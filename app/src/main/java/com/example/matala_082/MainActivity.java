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

//public class MainActivity extends AppCompatActivity {
public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener, AdapterView.OnItemClickListener {


    Spinner spin;
    ListView lv;
    int wArray,count=0,x;

    //tring [] medinot={"Afr","Amca","As","Ee"};
    //String [] medinot2={"f","A","s","e"};
    String [][] medinot={{"Congo","madagascar","morocco","nigeria","Tanazania","Uganda","sudan"}, {"Argentina", "canada","Brazil","colombia","Mexico","United States","Venezuela"},
            {"Chaina", "India","Israel","Japan","Russia","Turkey","Yemen"}, {"Bulgaria", "France","Germany","Hungary","Italy","Norway","Sweden"}};

    String [][] europe={{"fg","f","g","gf"},{"yu","yu","yu","yu"},{"","","",""},{"","","",""},{"","","",""},{"","","",""},{"","","",""}};
    String [] boo={"Africa","America","Asia","Europe"};
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
                R.layout.support_simple_spinner_dropdown_item,boo);
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

        //if(count==0)   {Toast.makeText(this,"Please choose a country", Toast.LENGTH_SHORT).show();}

            ArrayAdapter<String> adpl = new ArrayAdapter<String>(this,
                    R.layout.support_simple_spinner_dropdown_item, medinot[position]);
            lv.setAdapter(adpl);
            x=position;
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(x==0) {
            tv.setText("h " + europe[position][0]);
            tv2.setText("c " + europe[position][1]);
            tv3.setText("d " + europe[position][2]);
            tv4.setText("s " + europe[position][3]);
        }
        if(x==1) {
            tv.setText("h " + europe[position][0]);
            tv2.setText("c " + europe[position][1]);
            tv3.setText("d " + europe[position][2]);
            tv4.setText("s " + europe[position][3]);
        }

        if(x==2) {
            tv.setText("h " + europe[position][0]);
            tv2.setText("c " + europe[position][1]);
            tv3.setText("d " + europe[position][2]);
            tv4.setText("s " + europe[position][3]);
        }

        if(x==3) {
            tv.setText("h " + europe[position][0]);
            tv2.setText("c " + europe[position][1]);
            tv3.setText("d " + europe[position][2]);
            tv4.setText("s " + europe[position][3]);
        }
    }
}