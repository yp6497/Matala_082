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
    TextView tv,tv2,tv3,tv4;
    int x;

    String [][] medinot={{"Congo","madagascar","morocco","nigeria","Tanzania","Uganda","sudan"}, {"Argentina", "canada","Brazil","colombia","Mexico","United States","Venezuela"},
            {"Chaina", "India","Israel","Japan","Russia","Turkey","Yemen"}, {"Bulgaria", "France","Germany","Hungary","Italy","Norway","Sweden"}};
    String [][] africaMI={{"Debout Congolais","Kinshasa","French","101,780,263"},{"Ry Tanindrazanay malala ô!","Antananarivo","French","26,262,313"},{"Cherifian Anthem","Rabat","Arabic","36,472,000"},{"Arise, O Compatriots","Abuja","English","206,630,269["},
            {"God Bless Africa","Dodoma","English","56,313,438"},{"Oh Uganda, Land of Beauty","Kampala","English","42,729,036"},{"We are the Soldiers of God, the Soldiers of the Nation","Khartoum","Arabic","41,592,539"}};
    String [][] americaMI={{"Argentine National Anthem","Buenos Aries","Spanish","44,938,712"},{"O Canada","Ottawa","English","38,005,238"},{"Brazilian National Anthem","Brazilia","Portuguese","210,147,125"}, {"National Anthem of the Republic of Colombia","Bogota","Spanish","50,372,424"},
            {"Mexican National Anthem","Mexico city","Spanish","128,649,565"},{"The Star-Spangled Banner","Washington","English","328,239,523"},{"Glory to the Brave People","Caracas","spanish","28,887,118"}};
    String [][] asiaMI={{"March of the Volunteers","Beijing","Chinese","1,400,050,000"},{"Thou Art the Ruler of the Minds of All People","New delhi","English","1,352,642,280"},{"The Hope","Jerusalem","Hebrew","9,258,200"}, {"His Imperial Majesty's Reign","Tokyo","Japanese","125,960,000"},
            {"State Anthem of the Russian Federation","Moscow","Russian","146,748,590"}, {"The Independence March","Ankara","Turkish","83,154,997"},{"United Republic","Sanaa","Arabic","28,498,683"}};
    String [][] europeMI={{"","","",""},{"","","",""},{"","","",""},{"","","",""},{"","","",""},{"","","",""},{"","","",""}};
    String [] ibashot={"Choose country","Africa","America","Asia","Europe"};
    String [][] arrayS=new String[7][4];

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
                R.layout.support_simple_spinner_dropdown_item,ibashot);
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
            arrayS=africaMI;
        }
        else if(x==1) {
            arrayS=americaMI;
        }
        else if(x==2) {
            arrayS=asiaMI;
        }
        else if(x==3) {
            arrayS=europeMI;
        }
        tv.setText("h " + arrayS[position][0]);
        tv2.setText("c " + arrayS[position][1]);
        tv3.setText("d " + arrayS[position][2]);
        tv4.setText("s " + arrayS[position][3]);
    }
}