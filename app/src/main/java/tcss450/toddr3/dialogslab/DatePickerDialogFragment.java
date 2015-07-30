package tcss450.toddr3.dialogslab;


import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;


/**
 * A simple {@link Fragment} subclass.
 */
public class DatePickerDialogFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {


    public DatePickerDialogFragment() {
        // Required empty public constructor
    }


    @Override

    public Dialog onCreateDialog(Bundle savedInstanceState) {

        // Use the current date as the default date in the picker

        final Calendar c = Calendar.getInstance();

        int year = c.get(Calendar.YEAR);

        int month = c.get(Calendar.MONTH);

        int day = c.get(Calendar.DAY_OF_MONTH);
        // Create a new instance of DatePickerDialog and return it
        return new DatePickerDialog(getActivity(), this, year, month, day);

    }
    public void onDateSet(DatePicker view, int year, int month, int day) {
        // Warning - month is 0 based.
        Toast.makeText(getActivity(), "You picked " + (month + 1) + "/" + day + "/" + year,
                Toast.LENGTH_LONG)
                .show();
    } 

}
