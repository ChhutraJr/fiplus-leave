package com.example.fiplus;

import android.app.AlertDialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.BottomSheetDialog;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.fiplus.data.Data;
import com.shawnlin.numberpicker.NumberPicker;


public class Register_Form extends Fragment {

    com.shawnlin.numberpicker.NumberPicker picker,picker1,picker2,picker3;
    private Data dt;
    private EditText gender;
    private BottomSheetDialog dialog;
    private  View view;
    String value="",value1="",value2="",value3="";
    int id;

    LinearLayout  layout;
    Fragment fragment;
    LayoutInflater inflater1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        inflater1 =inflater;

        gender = view.findViewById(R.id.gender);

           gender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnClickGender();
            }
        });

        return view;
    }

    public  void  OnClickGender(){
        dialog = new BottomSheetDialog(getActivity());
        view= getActivity().getLayoutInflater().inflate(R.layout.selection_dialog_1picker,null);
        dialog.setContentView(view);
        dialog.show();
        picker =(com.shawnlin.numberpicker.NumberPicker)view.findViewById(R.id.spicker);

        final String[] str_value = { getResources().getString(R.string.Male),getResources().getString(R.string.Female)};
        picker.setMinValue(0);
        picker.setMaxValue(str_value.length-1);
        picker.setDisplayedValues(str_value);
        picker.setWrapSelectorWheel(true);
        picker.setValue(id);

        int pos = picker.getValue();
        value = str_value[pos];

        picker.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                value = "" + str_value[newVal];
                id = newVal;
            }
        });

        TextView title = view.findViewById(R.id.title);
        title.setText(getResources().getString(R.string.gender));
        Button ok = view.findViewById(R.id.btdone);
        Button cancel = view.findViewById(R.id.btcancel);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gender.setText(value);
                dialog.dismiss();
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

    }
}
