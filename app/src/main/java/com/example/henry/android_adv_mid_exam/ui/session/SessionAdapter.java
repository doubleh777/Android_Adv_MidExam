package com.example.henry.android_adv_mid_exam.ui.session;

import android.app.ActionBar;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.AbsListView.LayoutParams;
import android.widget.TextView;

import com.example.henry.android_adv_mid_exam.R;
import com.example.henry.android_adv_mid_exam.db.DBSessionHelper;
import com.example.henry.android_adv_mid_exam.db.ObjSession;

/**
 * Created by Henry on 15. 8. 16..
 */
public class SessionAdapter extends BaseAdapter{
    private DBSessionHelper db;
    private LayoutInflater li;
    private int itemHeight;

    public SessionAdapter(Activity context){
        this.db = new DBSessionHelper(context);
        this.li = context.getLayoutInflater();
        this.itemHeight = context.getResources().getDisplayMetrics().heightPixels / 10;
    }

    @Override
    public int getCount() {
        return db.getSessionCount();
    }

    @Override
    public Object getItem(int position) {
        return db.getSession(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView == null){
            convertView = li.inflate(R.layout.item_session, null);
            LayoutParams params = new LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
            params.height = itemHeight;
            convertView.setLayoutParams(params);
        }

        ObjSession session = (ObjSession) getItem(position);

        ProfileView pv = (ProfileView) convertView.findViewById(R.id.pvInstructor);
        pv.ivPhoto.setImageResource(Integer.valueOf(session.photo));
        pv.tvName.setText(session.instructor);

        TextView tvTitle = (TextView) convertView.findViewById(R.id.tvTitle);
        tvTitle.setText(session.title);
        return convertView;
    }
}
