package com.juangil.easyfood.views.homescreenview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.juangil.easyfood.R;

public class AdaptadorHome extends RecyclerView.Adapter<AdaptadorHome.ViewHolder> {

    Context context;
    String[] listaCategoria;


    public AdaptadorHome(Context context, String[] listaCategoria) {
        this.context = context;
        this.listaCategoria = listaCategoria;
    }

    @NonNull
    @Override
    public AdaptadorHome.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_categorias, null, false);
        return new ViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorHome.ViewHolder holder, int position) {
        String categorias = listaCategoria[position];

        Glide
                .with(context)
                .load(R.drawable.icon_falta_foto)
                .centerInside()
                .placeholder(context.getResources().getDrawable(R.drawable.icon_falta_foto))
                .into(holder.ivCategoria);
    }

    @Override
    public int getItemCount() {
        return listaCategoria.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CardView cvCategotia;
        TextView tvCategoria;
        ImageView ivCategoria;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            cvCategotia = itemView.findViewById(R.id.cvCategoria);
            tvCategoria = itemView.findViewById(R.id.tvCategoria);
            ivCategoria = itemView.findViewById(R.id.ivCategoria);
        }
    }


}


