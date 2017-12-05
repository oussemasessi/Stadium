package me.oussema.stadium;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity implements View.OnClickListener {


    private Context mContext;

    private Button mBtnGoList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        mContext = Home.this;


        mBtnGoList = (Button) findViewById(R.id.btn_go_list);
        mBtnGoList.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_go_list:
                goToListActivity();
                return;
        }
    }

    private void goToListActivity() {
        startActivity(new Intent(mContext, StadiumListActivity.class));
    }
}
