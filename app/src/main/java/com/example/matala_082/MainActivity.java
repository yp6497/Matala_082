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
    int wArray,count=0;

    //tring [] medinot={"Afr","Amca","As","Ee"};
    //String [] medinot2={"f","A","s","e"};
    String medinot[][]={{"Congo","madagascar","morocco","nigeria","Tanazania","Uganda","sudan"}, {"", "","","","","",""},{"", "","","","","",""},
            {"", "","","","","",""}};

    String [] boo={"Africa","America","Asia","Europe"};
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spin=findViewById(R.id.sp);
        lv=findViewById(R.id.lv);
        tv=findViewById(R.id.tv);

        spin.setOnItemSelectedListener(this);

        ArrayAdapter<String> adp = new ArrayAdapter<String>(this,
                R.layout.support_simple_spinner_dropdown_item,boo);
        spin.setAdapter(adp);

        lv.setOnItemClickListener(this);
        lv.setChoiceMode(ListView.CHOICE_MODE_SINGLE);



    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        tv.setText("position: "+position);
        count++;
        /*
          if(position==0) {
            //ArrayAdapter<String> adpl = new ArrayAdapter<String>(this,
              //      R.layout.support_simple_spinner_dropdown_item,medinot);
            //lv.setAdapter(adpl);
             wArray=0;
         }
        if(position==1) {
            wArray=1;

        }

         */
        if(count==1)   Toast.makeText(this,"Please choose a country", Toast.LENGTH_SHORT).show();
        //if(position==0) Toast.makeText(this,"Please choose a country", Toast.LENGTH_SHORT).show();
        else {
            ArrayAdapter<String> adpl = new ArrayAdapter<String>(this,
                    R.layout.support_simple_spinner_dropdown_item, medinot[position]);
            lv.setAdapter(adpl);
        }




    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}