package com.colt.android014_intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Dogz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dogz);

        Bundle catzData = getIntent().getExtras(); //Receive message from Catz clan.
        if (catzData == null)
            return;
        String catzMessage = catzData.getString("catzMessage");
        final TextView dogzOutput = (TextView) findViewById(R.id.dogzOutput);
        dogzOutput.setText(catzMessage); //Kill pidgeon and read message from Catz clan.
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, Catz.class);
        final EditText dogzInput = (EditText) findViewById(R.id.dogzInput);
        String dogzMessage = dogzInput.getText().toString();
        intent.putExtra("dogzMessage", dogzMessage); //Send message to stupid Catz clan.
        startActivity(intent);
    }

}