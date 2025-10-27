package com.example.explorenesia;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.explorenesia.databinding.ActivityDetailBinding;

public class DetailActivity extends AppCompatActivity {
    private TextView name, location, desc;
    private ImageView pict;
    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        name = findViewById(R.id.tvName);
        location = findViewById(R.id.tvLocation);
        desc = findViewById(R.id.tvDesc);
        pict = findViewById(R.id.ivPict);
        btnBack = findViewById(R.id.btnBack);

        String nameTourist = getIntent().getStringExtra("name");
        String locationTourist = getIntent().getStringExtra("location");
        String descTourist = getIntent().getStringExtra("description");
        int pictTourist = getIntent().getIntExtra("pict", 0);

        name.setText(nameTourist);
        location.setText(locationTourist);
        desc.setText(descTourist);
        pict.setImageResource(pictTourist);

        Toast.makeText(this, "Detail show " + nameTourist, Toast.LENGTH_SHORT).show();

        btnBack.setOnClickListener(v -> {
            finish();
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        });
    }
}
