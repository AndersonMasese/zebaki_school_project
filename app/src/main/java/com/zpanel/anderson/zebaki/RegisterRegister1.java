package com.zpanel.anderson.zebaki;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Anderson on 11/14/2016.
 */

public  class RegisterRegister1 extends StringRequest {
    private static final String REGISTER_REQUEST_URL = "http://zebaki.co.ke/zebakiProRegUpload.php";
    private Map<String, String> params;

    public RegisterRegister1(String name,String country, String field, String description, String email,String reward, Response.Listener<String> listener) {
        super(Method.POST, REGISTER_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("name", name);
        params.put("country",country);
        params.put("field",field);
        params.put("description", description);
        params.put("email",email);
        params.put("reward",reward);


    }


    @Override
    public Map<String, String> getParams() {
        return params;
    }
}


