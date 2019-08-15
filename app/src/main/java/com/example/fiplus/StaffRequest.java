package com.example.fiplus;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.example.fiplus.dapter.StaffRequestAdapter;
import com.example.fiplus.model.StaffRequestModel;

import java.util.ArrayList;

public class StaffRequest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staff_request);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Staff Request");

        GridView gridView = findViewById(R.id.list_staff_requests);
        final ArrayList<StaffRequestModel> staffRequestModelArrayList = new ArrayList<>();
        staffRequestModelArrayList.add(new StaffRequestModel("SOY HUNRIDOLLA","1 Day(s)","From Jul 20, 2019 - Jul 20, 2019","08:00 AM - 05:00 PM","Jul 20, 2019 | 07:30 AM"));
        staffRequestModelArrayList.add(new StaffRequestModel("SEN CHHUTRA","1 Day(s)","From Jul 20, 2019 - Jul 20, 2019","08:00 AM - 05:00 PM","Jul 20, 2019 | 07:30 AM"));
        staffRequestModelArrayList.add(new StaffRequestModel("KIM CHAN SOPHEAVY","2 Day(s)","From Jul 20, 2019 - Jul 21, 2019","08:00 AM - 05:00 PM","Jul 20, 2019 | 07:30 AM"));

        final  StaffRequestAdapter staffRequestAdapter = new StaffRequestAdapter(this,staffRequestModelArrayList);
        gridView.setAdapter(staffRequestAdapter);

    }
}
