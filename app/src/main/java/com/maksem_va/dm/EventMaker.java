package com.maksem_va.dm;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import com.maksem_va.dm.data.EventData;

public class EventMaker extends Activity {

    private EditText mNameEditText;
    private EditText mDescEditText;
    private EditText mDateEditText;

    private Spinner mPrioritySpinner;

    /**
     * Пол для гостя. Возможные варианты:
     * 0 для кошки, 1 для кота, 2 - не определен.
     */
    private int mPriority = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_maker);

        mNameEditText = (EditText) findViewById(R.id.edit_name);
        mDescEditText = (EditText) findViewById(R.id.edit_description);
        mDateEditText = (EditText) findViewById(R.id.edit_date);
        mPrioritySpinner = (Spinner) findViewById(R.id.spinner_priority);

        setupSpinner();
    }

    private void setupSpinner() {

        ArrayAdapter prioritySpinnerAdapter = ArrayAdapter.createFromResource(this,
                R.array.priority_options, android.R.layout.simple_spinner_item);

        prioritySpinnerAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);

        mPrioritySpinner.setAdapter(prioritySpinnerAdapter);
        mPrioritySpinner.setSelection(2);

        mPrioritySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selection = (String) parent.getItemAtPosition(position);
                if (!TextUtils.isEmpty(selection)) {
                    if (selection.equals(getString(R.string.priority_low))) {
                        mPriority = EventData.DataEntry.PRIORITY_LOW;
                    } else if (selection.equals(getString(R.string.priority_med))) {
                        mPriority = EventData.DataEntry.PRIORITY_MEDIUM; // Кот
                    } else {
                        mPriority = EventData.DataEntry.PRIORITY_HIGH; // Не определен
                    }
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                mPriority = 1; // Unknown
            }
        });
    }

}
