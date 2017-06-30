package com.zpanel.anderson.zebaki;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Anderson on 11/14/2016.
 */

public  class RegisterRequest extends StringRequest {
    private static final String REGISTER_REQUEST_URL = "http://zebaki.co.ke/zebakiAmbassadorUpload.php";
    private Map<String, String> params;

    public RegisterRequest(String telephone11,  String telephone22,String proId,  Response.Listener<String> listener) {
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("referee", telephone11);
        params.put("reference", telephone22);
        params.put("proID",proId);

    }


    @Override
    public Map<String, String> getParams() {
        return params;
    }
}


