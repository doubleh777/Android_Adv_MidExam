package com.example.henry.android_adv_mid_exam.ui.session;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.support.v4.app.Fragment;

import com.example.henry.android_adv_mid_exam.R;

/**
 * Created by Henry on 15. 8. 16..
*/
public class SessionFragment extends Fragment {

    SessionAdapter mAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_session, null);

        mAdapter = new SessionAdapter(getActivity());
        ((ListView)v).setAdapter(mAdapter);
        ((ListView)v).setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getActivity(), SessionDetailActivity.class);
                intent.putExtra("position", position);
                startActivity(intent);
            }
        });

        return v;
    }

}