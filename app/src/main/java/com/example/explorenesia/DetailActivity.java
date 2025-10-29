package com.example.explorenesia;

import android.net.Uri;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    private TextView name, location, desc;
    private RatingBar rating;
    private ImageView pict;
    private Button btnBack, btnMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        name = findViewById(R.id.tvName);
        location = findViewById(R.id.tvLocation);
        rating = findViewById(R.id.tvRating);
        desc = findViewById(R.id.tvDesc);
        pict = findViewById(R.id.ivPict);
        btnBack = findViewById(R.id.btnBack);
        btnMap = findViewById(R.id.btnMap);

        String nameTourist = getIntent().getStringExtra("name");
        String locationTourist = getIntent().getStringExtra("location");
        float ratingTourist = getIntent().getFloatExtra("rating", 0f);
        String descTourist = getIntent().getStringExtra("description");
        int pictTourist = getIntent().getIntExtra("pict", 0);

        name.setText(nameTourist);
        location.setText(locationTourist);
        rating.setRating(ratingTourist);
        desc.setText(descTourist);
        pict.setImageResource(pictTourist);

        Toast.makeText(this, "Detail show " + nameTourist, Toast.LENGTH_SHORT).show();

        btnBack.setOnClickListener(v -> {
            finish();
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        });

        btnMap.setOnClickListener(v -> {
            String maps = getIntent().getStringExtra("maps");

            if (maps != null && !maps.isEmpty()) {
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(maps));
                try {
                    startActivity(mapIntent);
                } catch (Exception e) {
                    Toast.makeText(DetailActivity.this,
                            "Cannot open Maps. Please install a map application.",
                            Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(DetailActivity.this,
                        "Maps link not available for this place.",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
