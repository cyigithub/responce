package com.cyiboy.dispatch.landing;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.cyiboy.dispatch.R;

public class CustomListAdapter extends ArrayAdapter<String> {
 
 private final Activity context;
 private final String[] itemname;
 private final Integer[] imgid;
 
 public CustomListAdapter(Activity context, String[] itemname, Integer[] imgid) {
 super(context, R.layout.mylist, itemname);
 // TODO Auto-generated constructor stub
 
 this.context=context;
 this.itemname=itemname;
 this.imgid=imgid;
 }
 
 public View getView(int position,View view,ViewGroup parent) {
 LayoutInflater inflater=context.getLayoutInflater();
 View rowView=inflater.inflate(R.layout.mylist, null,true);
 
 TextView txtTitle = (TextView) rowView.findViewById(R.id.listtext);
 ImageView imageView = (ImageView) rowView.findViewById(R.id.imagje);

 
 txtTitle.setText(itemname[position]);
 imageView.setImageResource(imgid[position]);

 return rowView;
 
 };
}