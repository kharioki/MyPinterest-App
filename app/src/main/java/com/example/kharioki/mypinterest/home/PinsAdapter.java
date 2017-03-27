package com.example.kharioki.mypinterest.home;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kharioki.mypinterest.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by peter on 3/27/17.
 */

public class PinsAdapter extends RecyclerView.Adapter<PinsAdapter.PinViewHolder> {

    private final Context context;
    private List<Pin> pins = new ArrayList<>();

    public PinsAdapter(Context context, List<Pin> pins) {
        this.context = context;
        this.pins = pins;
    }

    @Override
    public PinViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.pin_item, parent, false);
        return new PinViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PinViewHolder holder, int position) {
        final Pin pin = pins.get(position);

        Picasso.with(context)
                .load(pin.photoUrl)
                .placeholder(R.drawable.ic_pinterest)
                .into(holder.pinImageView);

        holder.summaryTextView.setText(pin.summary);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, pin.summary, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return pins.size();
    }


    public class PinViewHolder extends RecyclerView.ViewHolder {

        View itemView;
        private final ImageView pinImageView;
        private final TextView summaryTextView;

        public PinViewHolder(View itemView) {
            super(itemView);
            this.itemView = itemView;
            pinImageView = (ImageView) itemView.findViewById(R.id.pin_image_view);
            summaryTextView = (TextView) itemView.findViewById(R.id.summary_text_view);
        }
    }
}
