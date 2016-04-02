package com.colt.android014_intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Catz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catz);

        Bundle dogzData = getIntent().getExtras(); //Receive message from Dogz clan.
        if (dogzData == null)
            return;
        String dogzMessage = dogzData.getString("dogzMessage");
        final TextView catzOutput = (TextView) findViewById(R.id.catzOutput);
        catzOutput.setText(dogzMessage); //Shoot pidgeon and read message from Dogz clan.
    }

    public void onClick(View view) {
        Intent intent = new Intent(this, Dogz.class);
        final EditText catzInput = (EditText) findViewById(R.id.catzInput);
        String catzMessage = catzInput.getText().toString();
        intent.putExtra("catzMessage", catzMessage); //Send message to ugly Dogz clan.
        startActivity(intent);
    }

}