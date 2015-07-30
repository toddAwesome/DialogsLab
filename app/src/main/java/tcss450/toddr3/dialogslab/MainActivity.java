package tcss450.toddr3.dialogslab;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button simpleDialogButton = (Button) findViewById(R.id.simple_button);
        simpleDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FireMissleDialogFragment fireMissilesDialogFragment = new FireMissleDialogFragment();
                fireMissilesDialogFragment.show(getFragmentManager(), "missiles");
            }
        });
        final Button listDialogButton = (Button) findViewById(R.id.list_button);
        listDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ListDialogFragment listDialogFragment = new ListDialogFragment();
                listDialogFragment.show(getFragmentManager(), "colors");
            }
        });
        final Button multiListDialogButton = (Button) findViewById(R.id.multi_list_button);
        multiListDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MultiListDialogFragment listDialogFragment = new MultiListDialogFragment();
                listDialogFragment.show(getFragmentManager(), "toppings");
            }
        });
        final Button customDialogButton = (Button) findViewById(R.id.custom_dialog_button);
        customDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CustomDialogFragment customDialogFragment = new CustomDialogFragment();
                customDialogFragment.show(getFragmentManager(), "custom");
            }
        });
        final Button showTimePickerButton = (Button) findViewById(R.id.time_picker_dialog_button);
        showTimePickerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TimePickerDialogFragment timePickerDialogFragment = new TimePickerDialogFragment();
                timePickerDialogFragment.show(getFragmentManager(), "time");
            }
        });
        final Button showDatePickerButton = (Button) findViewById(R.id.date_picker_dialog_button);
        showDatePickerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialogFragment datePickerDialogFragment = new DatePickerDialogFragment();
                datePickerDialogFragment.show(getFragmentManager(), "date");
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
