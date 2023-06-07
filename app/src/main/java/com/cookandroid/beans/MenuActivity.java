package com.cookandroid.beans;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;

import android.os.Bundle;
import java.util.List;
import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {

    Toolbar mToolbar;
    RecyclerView mRecyclerView;
    List< BeanData > mBeanList;
    BeanData mBeanData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bean_main);

        mToolbar = findViewById(R.id.toolbar);
        mToolbar.setTitle(getResources().getString(R.string.app_name));
        mRecyclerView = findViewById(R.id.recyclerview);
        GridLayoutManager mGridLayoutManager = new GridLayoutManager(MenuActivity.this, 2);
        mRecyclerView.setLayoutManager(mGridLayoutManager);

        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mBeanList = new ArrayList<>();
        mBeanData = new BeanData("강낭콩", getString(R.string.category), getString(R.string.term_kidneybeans), getString(R.string.title_environment), getString(R.string.description_environment_kidneybeans), getString(R.string.title_cultivate), getString(R.string.description_cultivate_kidneybeans),
                R.drawable.kidneybeans);
        mBeanList.add(mBeanData);
        mBeanData = new BeanData("팥", getString(R.string.category), getString(R.string.term_redbeans), getString(R.string.title_environment), getString(R.string.description_environment_redbeans), getString(R.string.title_cultivate), getString(R.string.description_cultivate_redbeans),
                R.drawable.redbeans);
        mBeanList.add(mBeanData);
        mBeanData = new BeanData("녹두", getString(R.string.category), getString(R.string.term_mungbeans), getString(R.string.title_environment), getString(R.string.description_environment_mungbeans), getString(R.string.title_cultivate), getString(R.string.description_cultivate_mungbeans),
                R.drawable.mungbeans);
        mBeanList.add(mBeanData);
        mBeanData = new BeanData("완두", getString(R.string.category), getString(R.string.term_peas), getString(R.string.title_environment), getString(R.string.description_environment_peas), getString(R.string.title_cultivate), getString(R.string.description_cultivate_peas),
                R.drawable.peas);
        mBeanList.add(mBeanData);

        MyAdapter myAdapter = new MyAdapter(MenuActivity.this, mBeanList);
        mRecyclerView.setAdapter(myAdapter);
    }
}
