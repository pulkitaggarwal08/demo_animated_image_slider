package pulkit.demo_image_slider.com.demoimageslider;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import pulkit.demo_image_slider.com.demoimageslider.activities.ProductTourActivity;

public class MainActivity extends AppCompatActivity {

    Button btn_product_tour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findIds();
        init();

    }

    private void findIds() {

        btn_product_tour = (Button) findViewById(R.id.btn_product_tour);
    }

    private void init() {

        btn_product_tour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ProductTourActivity.class));
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            }
        });
    }


}
