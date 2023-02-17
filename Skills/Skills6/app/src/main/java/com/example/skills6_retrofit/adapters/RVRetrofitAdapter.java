package com.example.skills6_retrofit.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.skills6_retrofit.R;
import com.example.skills6_retrofit.networking.ProductResult;

import java.util.List;

public class RVRetrofitAdapter extends RecyclerView.Adapter<RVRetrofitAdapter.RVHolderRetrofit> {

    Context mCntext;
    List<ProductResult> productResults;

    public RVRetrofitAdapter(Context nContext, List<ProductResult> productResults){
        this.productResults = productResults;
        this.mCntext = mCntext;
    }
    @NonNull
    @Override
    public RVRetrofitAdapter.RVHolderRetrofit onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(mCntext).inflate((R.layout.rv_products_item,parent, false));

        return new RVHolderRetrofit(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RVRetrofitAdapter.RVHolderRetrofit holder, int position) {
        holder.tvTitle.setText(productResults.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class RVHolderRetrofit extends RecyclerView.ViewHolder {
        TextView tvTitle;
        ImageView ivImage;

        public RVHolderRetrofit(@NonNull View itemView){
            super(itemView);
            ivImage= itemView.findViewById(R.id.ivImage);
            tvTitle= itemView.findViewById(R.id.tvTitle);
        }
    }
}
