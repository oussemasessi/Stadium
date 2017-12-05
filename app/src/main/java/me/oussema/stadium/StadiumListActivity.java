package me.oussema.stadium;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;

import java.util.ArrayList;

import me.oussema.stadium.adapters.StadiumListAdapter;
import me.oussema.stadium.data.Stadium;

public class StadiumListActivity extends AppCompatActivity implements View.OnClickListener {


    private Context mContext;


    private ListView mLvStadiumList;
    private EditText mEtSearchStadium;
    private ImageButton mIbtnSearchStadium;


    private StadiumListAdapter mStadiumListAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stadium_list);

        mContext = StadiumListActivity.this;

        // generate random list
        ArrayList<Stadium> randomList = new ArrayList<Stadium>();
        for (int i = 0; i < 50; i++) {
            randomList.add(new Stadium(i));
        }

        // set list view
        mLvStadiumList = (ListView) findViewById(R.id.lv_stadium_list);
        mStadiumListAdapter = new StadiumListAdapter(mContext, randomList);


        mEtSearchStadium = (EditText) findViewById(R.id.et_search);
        mIbtnSearchStadium = (ImageButton) findViewById(R.id.ibtn_search);
        mIbtnSearchStadium.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.ibtn_search:
                // call method of search
                return;
            default:
                return;
        }
    }



}
