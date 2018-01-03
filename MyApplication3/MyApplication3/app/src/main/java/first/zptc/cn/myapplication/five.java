package first.zptc.cn.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by ydkf051 on 2018/1/3.
 */

public class five extends Activity {
    TextView txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiet5);
        txt2= (TextView) findViewById(R.id.txt2);
        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(five.this,four.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
