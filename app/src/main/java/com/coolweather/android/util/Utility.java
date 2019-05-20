package com.coolweather.android.util;

import android.text.TextUtils;
import android.widget.TextView;

import com.coolweather.android.db.Province;

import org.json.JSONArray;
import org.json.JSONObject;

public class Utility {
    public static boolean handleProvinceResponse(String response)
    {
        if (!TextUtils.isEmpty(response))
        {
            try{
                JSONArray allProvinces = new JSONArray(response);
                for (int i = 0;i<allProvinces.length();i++){
                    JSONObject provinceObject = allProvinces.getJSONObject(i);
                    Province province = new Province();
                    Province.setProvinceName(provinceObject.getString("name"));
                    Province
                }

            }

        }
    }
}
