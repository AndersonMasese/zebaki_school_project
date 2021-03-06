package com.zpanel.anderson.zebaki;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Profile extends AppCompatActivity implements View.OnClickListener {

    private TextView textViewJSON;
   // private Button buttonGet;
    private Button buttonParse;

    public static final String MY_JSON ="MY_JSON";





    //public final String JSON_URL = "http://www.zebaki.co.ke/iatFetchJson.php";
    //make the class pick the intent telephone sent from tab3


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ////////////////////
        Intent intent = getIntent();
        String telephone=intent.getStringExtra("telephone");//takinng the telephone string intent
        final String JSON_URL = "http://www.zebaki.co.ke/zebakiFetchJson.php/query?telephone="+telephone;
        //make the class pick the intent telephone sent from tab3



        textViewJSON = (TextView) findViewById(R.id.textViewJSON);
        textViewJSON.setMovementMethod(new ScrollingMovementMethod());
       // buttonGet = (Button) findViewById(R.id.buttonGet);
        buttonParse = (Button) findViewById(R.id.buttonParse);
       // buttonGet.setOnClickListener(this);
        buttonParse.setOnClickListener(this);



        getJSON(JSON_URL);
    }

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    */

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

    @Override
    public void onClick(View v) {

        if(v==buttonParse){
            //getJSON(JSON_URL);

            showParseActivity();
        }
    }

    public void showParseActivity() {
        Intent intent = new Intent(this, ParseJSON.class);
        intent.putExtra(MY_JSON,textViewJSON.getText().toString());
        startActivity(intent);
    }


    private void getJSON(String url) {
        class GetJSON extends AsyncTask<String, Void, String> {
            ProgressDialog loading;

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(Profile.this, "Please Wait...",null,true,true);
            }

            @Override
            protected String doInBackground(String... params) {


                String uri = params[0];

                BufferedReader bufferedReader =null;
                try {
                    URL url = new URL(uri);
                    HttpURLConnection con = (HttpURLConnection) url.openConnection();
                    StringBuilder sb = new StringBuilder();
                    bufferedReader = new BufferedReader(new InputStreamReader(con.getInputStream()));

                    String json;
                    while((json = bufferedReader.readLine())!= null){
                        sb.append(json+"\n");
                    }

                    return sb.toString().trim();

                }catch(Exception e){
                    return null;
                }

            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
                textViewJSON.setText(s);
            }
        }
        GetJSON gj = new GetJSON();
        gj.execute(url);
    }
}