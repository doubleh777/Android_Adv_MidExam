package com.example.henry.android_adv_mid_exam.ui.session;

/**
 * Created by Henry on 15. 8. 16..
 */
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;

import com.example.henry.android_adv_mid_exam.R;

public class SessionDetailActivity extends ActionBarActivity {

    private ActionBar mActionbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_session_detail);

        mActionbar = getSupportActionBar();
        mActionbar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

}