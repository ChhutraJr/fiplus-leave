package com.example.fiplus.data;

import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.StrictMode;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import com.example.fiplus.R;

public class Data extends ContextWrapper {

    Context mContext;

    public Data(Context context) {
        super(context);


        StrictMode.ThreadPolicy policy=new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        this.mContext =context;
        ConnectivityManager connManager;
        WifiManager wifiManager;
        WifiInfo wifiInfo;
        connManager=(ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
        wifiManager=(WifiManager)context.getSystemService(Context.WIFI_SERVICE);
        wifiInfo=wifiManager.getConnectionInfo();
    }

    private  void  setMessage(String title,String msg,LayoutInflater inflater){
        final AlertDialog dialog;
        View mView;
        Button bt;
        AlertDialog.Builder mBuilder;
        mBuilder= new AlertDialog.Builder(this);
        mView= layoutInflater(inflater).inflate(R.layout.message, null);
        bt=mView.findViewById(R.id.bt);
        mBuilder.setView(mView);
        ((TextView)mView.findViewById(R.id.tv)).setText(title);
        ((TextView)mView.findViewById(R.id.tv1)).setText(msg);
        dialog=mBuilder.create();
        dialog.show();
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });

    }

    private LayoutInflater layoutInflater (LayoutInflater inflater){

        LayoutInflater l = inflater;

        return l;
    }

    private  void  dialog(String msg ,LayoutInflater inflater){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        View view = layoutInflater(inflater).inflate(R.layout.dialog_message,null);

        TextView mg = view.findViewById(R.id.messages);
        mg.setText(msg);
        builder.setView(view);
        final  AlertDialog  dialog  = builder.create();

        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        dialog.setCanceledOnTouchOutside(false);
        Window window = dialog.getWindow();
        window.setGravity(Gravity.CENTER_HORIZONTAL);
        Button ok = (Button)view.findViewById(R.id.button);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.cancel();
            }
        });
    }

}


