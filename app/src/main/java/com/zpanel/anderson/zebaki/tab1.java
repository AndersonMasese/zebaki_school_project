package com.zpanel.anderson.zebaki;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class tab1 extends Fragment {

    //public Button bLogin;public EditText telephone1;public EditText telephone2;
    //public ImageView img1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View myView= inflater.inflate(R.layout.fragment_tab1, container, false);
        Button img1 = (Button)myView.findViewById(R.id.imageView3);
        Button img2 = (Button)myView.findViewById(R.id.imageView4);
        Button img3 = (Button) myView.findViewById(R.id.imageView5);
        Button img4 = (Button)myView.findViewById(R.id.imageView7);
        Button img5 = (Button)myView.findViewById(R.id.imageView8);
        Button img6 = (Button)myView.findViewById(R.id.imageView10);
        img1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Money.class);
                startActivity(intent);
                // your code here
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),Help.class);
                startActivity(intent);
                //modification of courses to take up new rol
                // your code here
            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),About_agent.class);
                startActivity(intent);
                // your code here
                //handles become agent logic
            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),About_business.class);
                startActivity(intent);
                // your code here
            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),RegisterActivity.class);
                startActivity(intent);
                // your code here
            }
        });
        img6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(),RegisterActivity1.class);
                startActivity(intent);
                // your code here
            }
        });


        return myView;


    }

    public tab1() {
        // Required empty public constructor
    }






}
