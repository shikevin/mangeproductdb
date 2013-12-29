package com.example.mangeproductdb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainScreenActivity extends Activity {

	Button btnViewProducts;
	Button btnNewProduct;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_screen);

		btnViewProducts=(Button) findViewById(R.id.btnViewProducts);
		btnNewProduct=(Button) findViewById(R.id.btnCreateProduct);

		btnViewProducts.setOnClickListener(new View.OnClickListener() {
			public void onClick (View view) {
				Intent i = new Intent(getApplicationContext(), AllProductsActivity.class);
				startActivity(i);
			}
		});
	}
}
