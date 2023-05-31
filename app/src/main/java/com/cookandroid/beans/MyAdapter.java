package com.cookandroid.beans;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<BeanViewHolder> {

    private Context mContext;
    private List<BeanData> mBeanList;

    MyAdapter(Context mContext, List<BeanData> mBeanList) {
        this.mContext = mContext;
        this.mBeanList = mBeanList;
    }

    @Override
    public BeanViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_item_row, parent, false);
        return new BeanViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(final BeanViewHolder holder, int position) {
        holder.mImage.setImageResource(mBeanList.get(position).getBeanImage());
        holder.mTitle.setText(mBeanList.get(position).getBeanTitle());

        holder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(mContext, DetailActivity.class);
                mIntent.putExtra("Image", mBeanList.get(holder.getAdapterPosition()).getBeanImage());
                mIntent.putExtra("Title", mBeanList.get(holder.getAdapterPosition()).getBeanTitle());
                mIntent.putExtra("Category", mBeanList.get(holder.getAdapterPosition()).getCategory());
                mIntent.putExtra("Term", mBeanList.get(holder.getAdapterPosition()).getBeanTerm());
                mIntent.putExtra("Environment1", mBeanList.get(holder.getAdapterPosition()).getBeanEnv1());
                mIntent.putExtra("Environment2", mBeanList.get(holder.getAdapterPosition()).getBeanEnv2());
                mContext.startActivity(mIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mBeanList.size();
    }
}

class BeanViewHolder extends RecyclerView.ViewHolder {

    ImageView mImage;
    TextView mTitle;
    TextView mCtgr;
    TextView mTerm;
    TextView mEnv1;
    TextView mEnv2;
    CardView mCardView;

    BeanViewHolder(View itemView) {
        super(itemView);

        mImage = itemView.findViewById(R.id.ivImage);
        mTitle = itemView.findViewById(R.id.tvTitle);
        mCtgr = itemView.findViewById(R.id.tvCtgr);
        mTerm = itemView.findViewById(R.id.tvTerm);
        mEnv1 = itemView.findViewById(R.id.tvEnv1);
        mEnv2 = itemView.findViewById(R.id.tvEnv2);
        mCardView = itemView.findViewById(R.id.cardview);
    }
}