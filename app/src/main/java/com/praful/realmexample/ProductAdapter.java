package com.praful.realmexample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Praful Dhabekar on 7/24/2017.
 */

public class ProductAdapter extends RecyclerView.Adapter {

    Context ctx;

    public ProductAdapter(Context ctx) {
        this.ctx = ctx;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v1 = LayoutInflater.from(ctx).inflate(R.layout.row,null,false);
        ProductViewHolder pvh = new ProductViewHolder(v1);
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }

    class ProductViewHolder extends RecyclerView.ViewHolder {
        TextView rv_name, rv_qty;
        public ProductViewHolder(View itemView) {
            super(itemView);

            rv_name = (TextView)itemView.findViewById(R.id.rv_product_name);
            rv_qty = (TextView)itemView.findViewById(R.id.rv_product_qty);
        }
    }
}
