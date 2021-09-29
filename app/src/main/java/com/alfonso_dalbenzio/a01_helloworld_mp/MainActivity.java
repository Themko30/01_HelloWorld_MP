package com.alfonso_dalbenzio.a01_helloworld_mp;

import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
  TextView tv;
  Random rg = new Random();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    tv = findViewById(R.id.tv);
  }

  public void changeColor(View v){
    int r = rg.nextInt(255) + 1;
    int b = rg.nextInt(255) + 1;
    int g = rg.nextInt(255) + 1;
    tv.setBackgroundColor(Color.rgb(r, g, b));
  }
}