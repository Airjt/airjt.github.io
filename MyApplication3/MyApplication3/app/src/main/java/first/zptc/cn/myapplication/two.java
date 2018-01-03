package first.zptc.cn.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by ydkf051 on 2017/12/27.
 */

public class two extends Activity{
    ImageView email;
    ImageView my;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        email = (ImageView) findViewById(R.id.email);
        my = (ImageView) findViewById(R.id.my);
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(two.this, three.class);
                startActivity(intent);
                finish();
            }
        });
        my.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(two.this, four.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
