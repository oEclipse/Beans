package com.cookandroid.beans;

import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {

    Toolbar mToolbar;
    ImageView mImage;
    TextView mTitle;
    TextView mCtgr;
    TextView mTerm;
    TextView mEnv1;
    TextView mEnv2;
    TextView mCult1;
    TextView mCult2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bean_detail1);

        mToolbar = findViewById(R.id.toolbar);
        mImage = findViewById(R.id.ivImage);
        mTitle = findViewById(R.id.tvTitle);
        mCtgr = findViewById(R.id.tvCtgr);
        mTerm = findViewById(R.id.tvTerm);
        mEnv1 = findViewById(R.id.tvEnv1);
        mEnv2 = findViewById(R.id.tvEnv2);
        mCult1 = findViewById(R.id.tvCult1);
        mCult2 = findViewById(R.id.tvCult2);

        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        Bundle mBundle = getIntent().getExtras();
        if (mBundle != null) {
            mToolbar.setTitle(mBundle.getString(""));
            mImage.setImageResource(mBundle.getInt("Image"));
            mTitle.setText(mBundle.getString("Title"));
            mCtgr.setText(mBundle.getString("Category"));
            mTerm.setText(mBundle.getString("Term"));
            mTitle.setText(mBundle.getString("Title"));
            mEnv1.setText(mBundle.getString("Environment1"));
            mEnv2.setText(mBundle.getString("Environment2"));
            mCult1.setText(mBundle.getString("Cultivate1"));
            mCult2.setText(mBundle.getString("Cultivate2"));
        }
    }
}