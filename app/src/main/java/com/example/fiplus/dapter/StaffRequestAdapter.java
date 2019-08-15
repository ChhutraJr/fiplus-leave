package com.example.fiplus.dapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fiplus.R;
import com.example.fiplus.model.StaffRequestModel;

import java.util.ArrayList;

public class StaffRequestAdapter extends BaseAdapter {

    private ArrayList<StaffRequestModel> staffRequestModels;
    private LayoutInflater inflater;
    private Context context;


    public StaffRequestAdapter(Context context, ArrayList<StaffRequestModel> staffRequestModels) {
        this.staffRequestModels = staffRequestModels;
        this.context = context;
        inflater = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return staffRequestModels.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        View v = inflater.inflate(R.layout.staff_request_list_view, null);
        final TextView lbl_staff_name = v.findViewById(R.id.lbl_staff_name);
        TextView lbl_num_day_leave = v.findViewById(R.id.lbl_num_day_leave);
        TextView lbl_leave_period = v.findViewById(R.id.lbl_leave_period);
        TextView lbl_leave_hour = v.findViewById(R.id.lbl_leave_hour);
        final TextView lbl_booking_time = v.findViewById(R.id.lbl_booking_time);
        ImageView img_more = v.findViewById(R.id.more);

        StaffRequestModel staffRequestModel = staffRequestModels.get(i);
        lbl_staff_name.setText(staffRequestModel.getStaff_name());
        lbl_num_day_leave.setText(staffRequestModel.getNum_day_leave());
        lbl_leave_period.setText(staffRequestModel.getLeave_period());
        lbl_leave_hour.setText(staffRequestModel.getLeave_hour());
        lbl_booking_time.setText(staffRequestModel.getBooking_time());

        img_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popup = new PopupMenu(context, view);
                MenuInflater inflater = popup.getMenuInflater();
                inflater.inflate(R.menu.staff_request_content_menu, popup.getMenu());
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        int i = item.getItemId();
                        if (i == R.id.ct_approve) {
                            message(lbl_staff_name.getText().toString());
                            return true;
                        }
                        else if (i == R.id.ct_reject){
                            message(lbl_booking_time.getText().toString());
                            return true;
                        }
                        else if (i == R.id.ct_cancel) {
                            return false;
                        }
                        else {
                            return onMenuItemClick(item);
                        }
                    }

                });
                popup.show();
            }
        });
        return v;
    }


    public void message(String msg){
        Toast.makeText(context,msg,Toast.LENGTH_SHORT).show();
    }
}
