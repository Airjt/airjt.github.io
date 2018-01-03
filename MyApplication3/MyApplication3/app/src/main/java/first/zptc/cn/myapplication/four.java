package first.zptc.cn.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by ydkf051 on 2017/12/27.
 */

public class four extends Activity {
    ImageView home;
    ImageView email;
    TextView txt;
    TextView text1;
    TextView text2;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity4);
        home= (ImageView) findViewById(R.id.home);
        email= (ImageView) findViewById(R.id.email);
        txt= (TextView) findViewById(R.id.txt);
        text1= (TextView) findViewById(R.id.text1);
        text2= (TextView) findViewById(R.id.text2);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(four.this,two.class);
                startActivity(intent);
                finish();
            }
        });
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(four.this,three.class);
                startActivity(intent);
                finish();
            }
        });
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                finish();
            }
        });
        text1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(four.this,five.class);
                startActivity(intent);
                finish();
            }
        });
        text2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(four.this,six.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
