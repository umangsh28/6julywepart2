package com.example.a6julywepart2;

import android.content.Context;
import android.content.SharedPreferences;

public class preferencehelper {

    private static final String db_name="small_db";

    public static SharedPreferences getInstance(Context context){
        return  context.getSharedPreferences(db_name,Context.MODE_PRIVATE);
    }

    public static  void writeString(Context context,String key,String Value){
        SharedPreferences.Editor editor=getInstance(context).edit();
        editor.putString(key,Value);
        editor.apply();
    }
    public static String getstring(Context context,String key){
       String name= getInstance(context).getString("key","");
       return name;
    }


}
