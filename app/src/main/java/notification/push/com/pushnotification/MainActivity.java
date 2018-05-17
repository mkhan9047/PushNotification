package notification.push.com.pushnotification;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String extra = getIntent().getStringExtra("extra");
        Toast.makeText(this, extra,Toast.LENGTH_LONG).show();
    }
}
