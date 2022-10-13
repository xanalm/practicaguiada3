package org.fp.dam.pmdm.practicaguiada3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NombresAdapter extends RecyclerView.Adapter<NombresAdapter.Holder> {

    static class Holder extends RecyclerView.ViewHolder{
        final TextView nombre;

        public Holder(@NonNull View itemView) {
            super(itemView);
            nombre = itemView.findViewById(R.id.textView);
        }
    }

    List<String> nombres;

    public NombresAdapter(List<String> nombres) {
        this.nombres = nombres;
    }


    @NonNull
    @Override
    public NombresAdapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.fila, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull NombresAdapter.Holder holder, int position) {
    holder.nombre.setText(nombres.get(position));
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
