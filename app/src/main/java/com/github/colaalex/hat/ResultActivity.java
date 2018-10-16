package com.github.colaalex.hat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;


public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Button newGameButton = findViewById(R.id.btn_new);
        newGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                restartGame();
            }
        });

        Intent intent = getIntent();

        //String textResult = intent.getStringExtra(MainActivity.RESULT_KEY);
        //String textResult = getResultText();
        //textResultView.setText(textResult);
        ArrayList<Team> teams = (ArrayList<Team>) intent.getSerializableExtra(MainActivity.RESULT_KEY);
        RecyclerView recyclerView = findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter adapter = new MyAdapter(teams);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();







        // get text from intent here and paste it to textResult
    }

    void restartGame() {
        Intent restartIntent = new Intent(this, MainActivity.class);
        startActivity(restartIntent);
        finish();
    }

}
