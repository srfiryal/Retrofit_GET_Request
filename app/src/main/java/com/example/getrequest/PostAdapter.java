package com.example.getrequest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ListViewHolder> {
    private List<PostModel> dataList;

    public PostAdapter(List<PostModel> dataList) {
        this.dataList = dataList;
    }

    @Override
    public ListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.rv_list, parent, false);
        return new ListViewHolder(view  );
    }

    @Override
    public void onBindViewHolder(ListViewHolder holder, int position) {
        holder.tv_title.setText(dataList.get(position).getTitle());
        holder.tv_userId.setText("User ID: " + dataList.get(position).getUserId());
        holder.tv_id.setText("ID: " + dataList.get(position).getId());
        holder.tv_body.setText(dataList.get(position).getBody());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }

    public class ListViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_title, tv_userId, tv_id, tv_body;
        private LinearLayout linearLayout;

        public ListViewHolder(View itemView) {
            super(itemView);

            tv_title = itemView.findViewById(R.id.tv_title_list);
            tv_userId = itemView.findViewById(R.id.tv_userId_list);
            tv_id = itemView.findViewById(R.id.tv_id_list);
            tv_body = itemView.findViewById(R.id.tv_body_list);
            linearLayout = itemView.findViewById(R.id.rv_layout_list);
        }
    }
}