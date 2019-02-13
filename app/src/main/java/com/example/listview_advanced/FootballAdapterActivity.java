package com.example.listview_advanced;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FootballAdapterActivity extends BaseAdapter {

    private Context context;
    private int layout;
    private List<FootballPlayerActivity.FootballPlayer> footballPlayerList;

    public FootballAdapterActivity(Context context, int layout, List<FootballPlayerActivity.FootballPlayer> footballPlayerList) {
        this.context = context;
        this.layout = layout;
        this.footballPlayerList = footballPlayerList;
    }

    @Override
    public int getCount() {
        return footballPlayerList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder {
        ImageView imgPictures;
        TextView txtName;
        TextView txtDescription;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;

        if (convertView == null) {

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout, null);

            holder = new ViewHolder();

            holder.txtName = (TextView) convertView.findViewById(R.id.textViewName);
            holder.txtDescription = (TextView) convertView.findViewById(R.id.textViewDescription);
            holder.imgPictures = (ImageView) convertView.findViewById(R.id.imageView1);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }


        FootballPlayerActivity.FootballPlayer footballPlayer = footballPlayerList.get(position);
        holder.txtName.setText(footballPlayer.getName());
        holder.txtDescription.setText(footballPlayer.getDiscription());
        holder.imgPictures.setImageResource(footballPlayer.getPicture());
        return convertView;
    }
}
