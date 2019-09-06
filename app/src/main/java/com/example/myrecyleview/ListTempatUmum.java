package com.example.myrecyleview;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myrecyleview.adapter.AdapterActivity;
import com.example.myrecyleview.model.TempatUmum;

import java.util.ArrayList;

public class ListTempatUmum extends AppCompatActivity implements AdapterView.OnItemClickListener, View.OnClickListener {
    private RecyclerView listTempats;
    private ArrayList<TempatUmum>list=new ArrayList<>();
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }
    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.action_list:
                break;
            case R.id.action_grid:
                break;
            case R.id.action_cardview:
                break;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_tempat_umum);

        listTempats = findViewById(R.id.list_tempat_umum);
        listTempats.setHasFixedSize(true);
        list.addAll(DataTempatUmum.getListData());
        showRecycleList();
    }

    private void showRecycleList() {
        listTempats.setLayoutManager(new LinearLayoutManager(this));
        AdapterActivity listtempat=new AdapterActivity(list);
        listTempats.setAdapter(listtempat);

    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
        // TODO Auto-generated method stub

    }
}
