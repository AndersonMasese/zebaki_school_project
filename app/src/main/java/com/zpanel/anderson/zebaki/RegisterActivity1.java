package com.zpanel.anderson.zebaki;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Timer;
import java.util.TimerTask;

public class RegisterActivity1 extends AppCompatActivity implements  View.OnClickListener{
    public EditText name,email,description,reward;
    Spinner country,field;
    Button bRegister;
    //what the fuck!!I wrote namee intentionally and it is not like it is some error which is being correctd.

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register1);

        name = (EditText) findViewById(R.id.editText5);
        description= (EditText) findViewById(R.id.editText8);
        email=(EditText)findViewById(R.id.editTextEmail);
        country=(Spinner)findViewById(R.id.editText2);
        reward=(EditText)findViewById(R.id.editTextReward);
        field=(Spinner)findViewById(R.id.spinner2);
        bRegister = (Button) findViewById(R.id.button2);
        bRegister.setOnClickListener(this);
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
    public void onClick(View v) {
        if(v==bRegister){
            getJSON();
        }
    }
///////////////////////////////////////////////////////////////////////////



    public void getJSON() {
        class GetJSON extends AsyncTask<String, Void, String> {
            ProgressDialog loading;


            final String name1 = name.getText().toString();
            final String description1 = description.getText().toString();
            final String email1=email.getText().toString();
            final String country1=country.getSelectedItem().toString();
            final String field1=field.getSelectedItem().toString();
            final String reward1=reward.getText().toString();








            // final String email=email.getText().toString();

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(RegisterActivity1.this, "Uploading details to Zebaki...",null,true,true);
                //how to properly show progress in the activity mini activity fragmet without having to destroy the
                //other activities

            }

            @Override
            protected String doInBackground(String... params) {

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");
                            if (success) {
                               // Intent intent = new Intent(RegisterActivity1.this,About_agent.class);
                                //startActivity(intent);
                                AlertDialog.Builder builder = new AlertDialog.Builder(RegisterActivity1.this);
                                builder.setMessage("Successfully uploaded data to zebaki")
                                        .setNegativeButton("OK", null)
                                        .create()
                                        .show();
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(RegisterActivity1.this);
                                builder.setMessage("Could not Upload details to Zebaki. Please check data connection")
                                        .setNegativeButton("Retry", null)
                                        .create()
                                        .show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                };
                RegisterRegister1 registerRequest = new RegisterRegister1(name1,country1,field1,description1,email1,reward1,responseListener);
                RequestQueue queue = Volley.newRequestQueue(RegisterActivity1.this);
                queue.add(registerRequest);
                return null;


            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                long delayInMillis = 5000;
                Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        loading.dismiss();
                    }
                }, delayInMillis);
                //loading.dismiss();
                //lptextViewJSON.setText(s);

            }


        }

        GetJSON gj = new GetJSON();
        gj.execute();




    }






}