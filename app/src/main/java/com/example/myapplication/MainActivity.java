package com.example.myapplication;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvProducts;
    ProductAdapter productAdapter;
    ArrayList<Product> products;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvProducts = (ListView) findViewById(R.id.listViewProduct);
        products = new ArrayList<>();

        products.add(new Product("Ca nấu lẩu, nấu mì","Devang",R.drawable.ca_nau_lau));
        products.add(new Product("1KG KHÔ GÀ BƠ TỎI","LDT FOOD",R.drawable.ga_bo_toi));
        products.add(new Product("Xe cần cẩu đa năng","Thế giới đồ chơi",R.drawable.xa_can_cau));
        products.add(new Product("ĐỒ chơi dạng mô hình","Thế giới đồ chơi",R.drawable.do_choi_dang_mo_hinh));
        products.add(new Product("Lãnh đạo đơn giản","Minh long Book",R.drawable.lanh_dao_gian_don));
        products.add(new Product("Hiểu lòng con trẻ","Minh long Book",R.drawable.hieu_long_con_tre));

        productAdapter = new ProductAdapter(this,R.layout.mot_dong_sp,products);
        lvProducts.setAdapter(productAdapter);
    }
}