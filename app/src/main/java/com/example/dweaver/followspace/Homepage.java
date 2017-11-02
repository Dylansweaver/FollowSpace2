package com.example.dweaver.followspace;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

/**
 * Created by dweaver on 11/2/17.
 */

public class Homepage extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
        String username = getIntent().getStringExtra("username");

        TextView uname = findViewById(R.id.TV_username);
        uname.setText(username);
    }
}
