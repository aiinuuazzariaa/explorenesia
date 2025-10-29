package com.example.explorenesia;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class TouristItem extends RecyclerView.Adapter<TouristItem.ViewHolder> implements Filterable  {
    private Context context;
    private List<Tourist> touristList;
    private List<Tourist> touristListFull;

    public TouristItem(Context context, List<Tourist> touristList) {
        this.context = context;
        this.touristList = touristList;
        this.touristListFull = new ArrayList<>(touristList);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_tourist_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Tourist tourist = touristList.get(position);

        holder.name.setText(tourist.getName());
        holder.location.setText(tourist.getLocation());
        holder.desc.setText(tourist.getDesc());
        holder.pict.setImageResource(tourist.getPict());
        holder.rating.setRating(tourist.getRating());
        holder.rating_value.setText(String.valueOf(tourist.getRating()));

        holder.btn_detail.setOnClickListener(v -> {
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("name", tourist.getName());
            intent.putExtra("location", tourist.getLocation());
            intent.putExtra("description", tourist.getDesc());
            intent.putExtra("pict", tourist.getPict());
            intent.putExtra("maps", tourist.getMaps());
            intent.putExtra("rating", tourist.getRating());
            intent.putExtra("rating_value", tourist.getRating());
            holder.itemView.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return touristList.size();
    }

    @Override
    public Filter getFilter() {
        return filterTourist;
    }

    private Filter filterTourist = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            List<Tourist> filteredList = new ArrayList<>();

            if (constraint == null || constraint.length() == 0) {
                filteredList.addAll(touristListFull);
            } else {
                String filterPattern = constraint.toString().toLowerCase().trim();
                for (Tourist item : touristListFull) {
                    if (item.getName().toLowerCase().contains(filterPattern)) {
                        filteredList.add(item);
                    }
                }
            }

            FilterResults results = new FilterResults();
            results.values = filteredList;
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            touristList.clear();
            touristList.addAll((List<Tourist>) results.values);
            notifyDataSetChanged();
        }
    };

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView name, location, desc, rating_value;
        RatingBar rating;
        ImageView pict;
        Button btn_detail, btn_map;

        public ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tourist_name);
            location = itemView.findViewById(R.id.tourist_location);
            desc = itemView.findViewById(R.id.tourist_desc);
            pict = itemView.findViewById(R.id.tourist_pict);
            btn_detail = itemView.findViewById(R.id.btnDetail);
            btn_map = itemView.findViewById(R.id.btnMap);
            rating = itemView.findViewById(R.id.tourist_rating);
            rating_value = itemView.findViewById(R.id.tourist_rating_value);
        }
    }
}
