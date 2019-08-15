package com.example.fiplus;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import java.util.Calendar;


public class MainActivity extends AppCompatActivity {

  private  TextView title;
  private Handler mHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // getTimeFromAndroid();
//        title = findViewById(R.id.item);
//
//        int cDay,cMonth,cYear,cHour,cMinute,cSecond;
//        Calendar calander = Calendar.getInstance();
//        cDay = calander.get(Calendar.DAY_OF_MONTH);
//        cMonth = calander.get(Calendar.MONTH);
//        cYear = calander.get(Calendar.YEAR);
//        cHour = calander.get(Calendar.HOUR);
//        cMinute = calander.get(Calendar.MINUTE);
//        cSecond = calander.get(Calendar.SECOND);
//
//        mHandler = new Handler();
//        if(calander.get(Calendar.AM_PM) == Calendar.AM){
//            //AM
//            title.setText(getResources().getString(R.string.morning));
//        }else{
//            // PM
//            if(cHour<=12 && cHour<=4){
//                title.setText(getResources().getString(R.string.afternoon));
//            }else if(cHour>=5 && cHour<=7){
//                title.setText(getResources().getString(R.string.evening));
//            }else if(cHour>=8 && cHour<=11){
//                title.setText(getResources().getString(R.string.night));
//            }
//        }
    }

    public void OnClickRegister(View view) {
        Intent intent = new Intent(this,Register.class);
        startActivity(intent);

    }
    public void OnClickLogin(View view) {

        Intent intent = new Intent(this,Login.class);
        startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }

    public void OnClickStaffRequest(View view) {

        Intent intent = new Intent(this, StaffRequest.class);
        startActivity(intent);
    }

//   private void getTimeFromAndroid (){
//
//       Calendar c = Calendar.getInstance();
//       int timeOfDay = c.get(Calendar.HOUR_OF_DAY);
//       item = findViewById(R.id.item1);
//       if(timeOfDay >= 0 && timeOfDay < 12){
//           item.setText("Good Morning");
//       }else if(timeOfDay >= 12 && timeOfDay < 16){
//           item.setText("Good Afternoon");
//       }else if(timeOfDay >= 16 && timeOfDay < 21){
//           item.setText("Good Evening");
//       }else if(timeOfDay >= 21 && timeOfDay < 24){
//           item.setText("Good Night");
//       }
//
//   }

    public void OnStaffInformation(View view) {

        Intent intent = new Intent(this, StaffInformation.class);
        startActivity(intent);
    }
}
