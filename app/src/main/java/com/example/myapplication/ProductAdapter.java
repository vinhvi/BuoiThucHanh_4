package com.example.myapplication;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.List;

public class ProductAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Product> products;
    private int positionSelected = -1;

    public ProductAdapter(Context context, int layout, List<Product> products) {
        this.context = context;
        this.layout = layout;
        this.products = products;
    }

    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);

        TextView txtName = (TextView) view.findViewById(R.id.txtName);
        TextView txtDescrip = (TextView) view.findViewById(R.id.txtDescrip);
        Button btnChat = (Button) view.findViewById(R.id.btnChat);
        ImageView imgPicture = (ImageView) view.findViewById(R.id.imgPicture);

        Product product = products.get(i);
        txtName.setText(product.getName());
        txtDescrip.setText(product.getName());
        imgPicture.setImageResource(product.getPicture());

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "" + product.getName(), Toast.LENGTH_SHORT).show();
                positionSelected = i;
                notifyDataSetChanged();
            }
        });
        final ConstraintLayout layout01 = (ConstraintLayout) view.findViewById(R.id.linear01);
        if(positionSelected == i){
            layout01.setBackgroundColor(Color.BLUE);
        }
        else
            layout01.setBackgroundColor(Color.WHITE);


        return view;
    }
}
