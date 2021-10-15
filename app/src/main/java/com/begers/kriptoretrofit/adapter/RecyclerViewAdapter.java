package com.begers.kriptoretrofit.adapter;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.begers.kriptoretrofit.R;
import com.begers.kriptoretrofit.model.CryptoModel;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RowHolder> {

    private List<CryptoModel> cryptoModels;
    private String[] colors = {"#fc4c68", "#a4dab7", "#008000", "#7fffd4", "#daa4ac", "#f44336"};

    public RecyclerViewAdapter(List<CryptoModel> cryptoModels) {
        this.cryptoModels = cryptoModels;
    }

    @NonNull
    @Override
    public RowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row_layoult, parent, false);
        return new RowHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RowHolder holder, int position) {
        holder.bind(cryptoModels.get(position), colors, position);
    }

    @Override
    public int getItemCount() {
        return cryptoModels.size();
    }

    public class RowHolder extends RecyclerView.ViewHolder{
        TextView textName;
        TextView textPrice;

        public RowHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void bind(CryptoModel cryptoModel, String[] colors, Integer position){
            itemView.setBackgroundColor(Color.parseColor(colors[position % 6]));
            textName = itemView.findViewById(R.id.rowNameText);
            textPrice = itemView.findViewById(R.id.rowPriceText);
            textName.setText(cryptoModel.getCuuency());
            textPrice.setText(cryptoModel.getPrice());
        }
    }
}
