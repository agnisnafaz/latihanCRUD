package com.example.latihancrud.user;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.latihancrud.Mahasiswa;
import com.example.latihancrud.R;
import com.example.latihancrud.RecyclerAdapter;

import java.util.List;

public class RecyclerAdapterUser extends RecyclerView.Adapter<RecyclerAdapterUser.MyViewHolder> {
    private List<Mahasiswa> mList;
    @NonNull
    @Override
    public RecyclerAdapterUser.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.layout_item_user, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapterUser.MyViewHolder holder, int position) {
        Mahasiswa msiswa = mList.get(position);
        holder.tv_nama.setText("Nama : "+msiswa.getNama());
        holder.tv_fakultas.setText("Fakultas : "+msiswa.getFakultas());
        holder.tv_jurusan.setText("Jurusan : "+msiswa.getJurusan());
        holder.tv_semester.setText("Semester : "+msiswa.getSemester());

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv_nama;
        TextView tv_fakultas;
        TextView tv_jurusan;
        TextView tv_semester;
        CardView card_view;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_nama = itemView.findViewById(R.id.tv_nama);
            tv_fakultas = itemView.findViewById(R.id.tv_fakultas);
            tv_jurusan = itemView.findViewById(R.id.tv_jurusan);
            tv_semester = itemView.findViewById(R.id.tv_semester);
            card_view = itemView.findViewById(R.id.card_view);
        }
    }
}
