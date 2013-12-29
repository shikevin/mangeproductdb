package com.example.mangeproductdb;

import java.util.ArrayList;
import java.util.HashMap;

import org.json.JSONArray;

import android.app.ListActivity;
import android.app.ProgressDialog;
import android.os.Bundle;

public class AllProductsActivity extends ListActivity {

		private ProgressDialog pDialog;

		//create JSON parser object
		JSONParser jParser = new JSONParser();
		ArrayList<HashMap<String,String>> productsList;
		
		private static String url_all_products = "http://54.200.84.125/get_all_products.php";
		
		//JSON Node names
		private static final String TAG_SUCCESS = "success";
		private static final String TAG_PRODUCTS= "products";
		private static final String TAG_PID = "pid";
		private static final String TAG_NAME="name";

		JSONArray products = null;
		
		@Override
		public void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.all_products);
			
			productsList = new ArrayList <HasMap<String,String>>();
			
		}
}
