package com.example.henry.android_adv_mid_exam.ui.session;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.henry.android_adv_mid_exam.R;
import com.example.henry.android_adv_mid_exam.db.DBSessionHelper;
import com.example.henry.android_adv_mid_exam.db.ObjSession;

/**
 * Created by Henry on 15. 8. 16..
 */

public class SessionDetailFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View convertView = inflater.inflate(R.layout.fragment_session_detail, null);

        int position = 0;
        if(getActivity().getIntent() != null) {
            position = getActivity().getIntent().getIntExtra("position", 0);
        }
        DBSessionHelper db = new DBSessionHelper(getActivity());
        ObjSession session = db.getSession(position);

        ProfileView pv = (ProfileView) convertView.findViewById(R.id.pvInstructor);
        pv.ivPhoto.setImageResource(Integer.valueOf(session.photo));
        pv.tvName.setText(session.instructor);

        TextView tvTitle = (TextView) convertView.findViewById(R.id.tvTitle);
        tvTitle.setText(session.title);

        TextView tvDescription = (TextView) convertView.findViewById(R.id.tvDescription);
        tvDescription.setText(session.description);

        return convertView;
    }

}
