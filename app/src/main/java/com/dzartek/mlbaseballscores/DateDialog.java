package com.dzartek.mlbaseballscores;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.widget.DatePicker;

import java.util.Calendar;

/**
 * Created by dzarrillo on 8/30/2015.
 */
public class DateDialog extends DialogFragment implements DatePickerDialog.OnDateSetListener{

    public interface OnFragmentDialogDateSet{
        void  onDialogDateSet(int year, int month, int day);
    }
    private OnFragmentDialogDateSet mCallBackDateSet;

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the current date as the default date in the picker
        final Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);
        // Create a new instance of DatePicker dialog and return it
        return new DatePickerDialog(getActivity(), this, year, month, day);
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);

        /*  Make sure the host implements the methods
         *
         */

        try {
            mCallBackDateSet = (OnFragmentDialogDateSet) activity;
        } catch (Exception e) {
            throw new ClassCastException(activity.toString() +
                    " must implement OnFragmentDialogDateSet");
        }
    }

    @Override
    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
        //Toast.makeText(getActivity(), "Selected date: " + monthOfYear + "/" + dayOfMonth + "/" + year, Toast.LENGTH_LONG).show();

        //Send the event back to the host
        mCallBackDateSet.onDialogDateSet(year,monthOfYear,dayOfMonth);
    }
}
