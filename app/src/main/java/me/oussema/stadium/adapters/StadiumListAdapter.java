package me.oussema.stadium.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import me.oussema.stadium.R;
import me.oussema.stadium.data.Stadium;

/**
 * Created by root on 05/12/17.
 */

public class StadiumListAdapter extends BaseAdapter {


    private Context mContext;

    private ArrayList<Stadium> mList;

    private TextView mTvStadiumName;
    private TextView mTvStadiumLocation;


    public StadiumListAdapter(Context context, ArrayList<Stadium> list) {
        mContext = context;
        mList = list;

    }


    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(mContext).inflate(R.layout.list_stadium_item, null);

        mTvStadiumLocation = (TextView) convertView.findViewById(R.id.tv_item_stadium_locaiton);
        mTvStadiumName = (TextView) convertView.findViewById(R.id.tv_item_stadium_name);

        mTvStadiumLocation.setText(mList.get(position).getLocation());
        mTvStadiumName.setText(mList.get(position).getName());

        return convertView;
    }
}
