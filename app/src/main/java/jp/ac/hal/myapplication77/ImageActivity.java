package jp.ac.hal.myapplication77;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ImageActivity extends AppCompatActivity {

    private void changeActivity(int id){
        Intent intent = new Intent(ImageActivity.this,MainActivity.class);
        intent.putExtra("image", id);
        startActivity(intent);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        ImageView[] iv = new ImageView[3];
        iv[0] = findViewById(R.id.imageView1);
        iv[1] = findViewById(R.id.imageView2);
        iv[2] = findViewById(R.id.imageView3);

        for(int i=0;i<3;i++) {
            iv[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    switch(view.getId()) {
                        case R.id.imageView1:
                            changeActivity(R.drawable.nanohana);
                        case R.id.imageView2:
                            changeActivity(R.drawable.tubaki);
                        case R.id.imageView3:
                            changeActivity(R.drawable.tyurip);
                    }
                }
            });
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        ImageView[] iv = new ImageView[3];
        iv[0] = findViewById(R.id.imageView1);
        iv[1] = findViewById(R.id.imageView2);
        iv[2] = findViewById(R.id.imageView3);

        for(int i=0;i<3;i++) {
            iv[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    switch(view.getId()) {
                        case R.id.imageView1:
                            changeActivity(R.drawable.nanohana);
                            break;
                        case R.id.imageView2:
                            changeActivity(R.drawable.tubaki);
                            break;
                        case R.id.imageView3:
                            changeActivity(R.drawable.tyurip);
                            break;
                    }
                }
            });
        }

    }
}
