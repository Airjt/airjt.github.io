package first.zptc.cn.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by ydkf051 on 2017/12/27.
 */

public class three extends Activity{
    ImageView home;
    ImageView my;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);
        home= (ImageView) findViewById(R.id.home);
        my= (ImageView) findViewById(R.id.my);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(three.this,two.class);
                startActivity(intent);
                finish();
            }
        });
        my.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(three.this,four.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
