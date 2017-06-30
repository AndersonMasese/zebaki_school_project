package com.zpanel.anderson.zebaki;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Professionals extends AppCompatActivity implements View.OnClickListener {
public TextView highschools,universities,lawfirms,businesspeople,doctors,nurses,primaryscchoolteachers,highschoolteachers,musictechers,lawyers;
    public TextView developer,hotel,beautician,transport,retailer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professionals);
        highschools=(TextView)findViewById(R.id.highscool);
        universities=(TextView)findViewById(R.id.universities);
        lawfirms=(TextView)findViewById(R.id.lawfirms);
        businesspeople=(TextView)findViewById(R.id.businesspeople);
        doctors=(TextView)findViewById(R.id.doctors);
        nurses=(TextView)findViewById(R.id.nurses);
        primaryscchoolteachers=(TextView)findViewById(R.id.primaryschoolteachers);
        highschoolteachers=(TextView)findViewById(R.id.highschoolteachers);
        musictechers=(TextView)findViewById(R.id.musicteachers);
        lawyers=(TextView)findViewById(R.id.lawyers);
        developer=(TextView)findViewById(R.id.softwareDevelopers);hotel=(TextView)findViewById(R.id.hotelAccommodation);beautician=(TextView)findViewById(R.id.beauticians);transport=(TextView)findViewById(R.id.travelTransport);retailer=(TextView)findViewById(R.id.retailers);
        highschools.setOnClickListener(this);universities.setOnClickListener(this);lawfirms.setOnClickListener(this);businesspeople.setOnClickListener(this);doctors.setOnClickListener(this);
        nurses.setOnClickListener(this);primaryscchoolteachers.setOnClickListener(this);highschoolteachers.setOnClickListener(this);
        musictechers.setOnClickListener(this);lawyers.setOnClickListener(this);developer.setOnClickListener(this);hotel.setOnClickListener(this);beautician.setOnClickListener(this);transport.setOnClickListener(this);retailer.setOnClickListener(this);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }
    @Override
    public void onClick(View v)
    {

        if(v==highschools)
        {
            String highschools="highschools";
            Intent i=new Intent(this,Profile1.class);
            i.putExtra("universities",highschools);
            startActivity(i);

        }
       else
            if(v==universities)
            {
                String universities="universities";
                Intent i=new Intent(this,Profile1.class);
                i.putExtra("universities",universities);
                startActivity(i);



            }
        else
                if(v==lawfirms)
                {
                    String lawfirms="lawfirms";
                    Intent i=new Intent(this,Profile1.class);
                    i.putExtra("universities",lawfirms);
                    startActivity(i);

                }
        else
                    if(v==businesspeople)
                    {
                        String businesspeople="businesspeople";
                        Intent i=new Intent(this,Profile1.class);
                        i.putExtra("universities",businesspeople);
                        startActivity(i);

                    }
        else
                        if(v==doctors)
                        {
                            String doctors="doctors";
                            Intent i=new Intent(this,Profile1.class);
                            i.putExtra("universities",doctors);
                            startActivity(i);

                        }
        else
                            if(v==nurses)
                            {
                                String nurses="nurses";
                                Intent i=new Intent(this,Profile1.class);
                                i.putExtra("universities",nurses);
                                startActivity(i);

                            }
        else
                                if(v==primaryscchoolteachers)
                                {
                                    String primaryschoolteachers="primaryschoolteachers";
                                    Intent i=new Intent(this,Profile1.class);
                                    i.putExtra("universities",primaryschoolteachers);
                                    startActivity(i);

                                }
        else
                                    if(v==highschoolteachers)
                                    {
                                        String highschoolteachers="highschoolteachers";
                                        Intent i=new Intent(this,Profile1.class);
                                        i.putExtra("universities",highschoolteachers);
                                        startActivity(i);

                                    }
        else
                                        if(v==musictechers)
                                        {
                                            String musicteachers="musicteachers";
                                            Intent i=new Intent(this,Profile1.class);
                                            i.putExtra("universities",musicteachers);
                                            startActivity(i);

                                        }
        else
                                            if(v==lawyers)
                                            {
                                                String lawyers="lawyers";
                                                Intent i=new Intent(this,Profile1.class);
                                                i.putExtra("universities",lawyers);
                                                startActivity(i);

                                            }
        else
                                                if(v==developer)
                                                {
                                                    String developers="developers";
                                                    Intent i=new Intent(this,Profile1.class);
                                                    i.putExtra("universities",developers);
                                                    startActivity(i);
                                                }
        else
                                                    if(v==hotel)
                                                    {
                                                        String hotel="hotel";
                                                        Intent i=new Intent(this,Profile1.class);
                                                        i.putExtra("universities",hotel);
                                                        startActivity(i);

                                                    }
        else
                                                        if(v==beautician)
                                                        {
                                                            String beautician="beautician";
                                                            Intent i=new Intent(this,Profile1.class);
                                                            i.putExtra("universities",beautician);
                                                            startActivity(i);

                                                        }
        else
                                                            if(v==transport)
                                                            {
                                                                String transport="transport";
                                                                Intent i=new Intent(this,Profile1.class);
                                                                i.putExtra("universities",transport);
                                                                startActivity(i);

                                                            }
        else
                                                                if(v==retailer)
                                                                {
                                                                    String retailer="retailer";
                                                                    Intent i=new Intent(this,Profile1.class);
                                                                    i.putExtra("universities",retailer);
                                                                    startActivity(i);
                                                                }


    }


}
