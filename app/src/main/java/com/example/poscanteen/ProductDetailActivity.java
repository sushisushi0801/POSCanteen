package com.example.poscanteen;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProductDetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.productdetailactivity);

        // Retrieve the product ID passed through the intent
        String productId = getIntent().getStringExtra("productId");

        // Example: Display the product ID in a TextView (you can replace this with actual product detail fetching logic)
        TextView productIdTextView = findViewById(R.id.productIdTextView);
        productIdTextView.setText("Product ID: " + productId);

        // Use productId to fetch and display other product details from your data source
    }
}