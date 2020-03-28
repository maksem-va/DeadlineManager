package com.maksem_va.dm;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class EventMaker extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_maker);
//        Button button = (Button) findViewById(R.id.btnCreate);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(v.getContext(), EventMaker.class);
//                startActivityForResult(intent, 0);
//            }
//        });
    }
}
