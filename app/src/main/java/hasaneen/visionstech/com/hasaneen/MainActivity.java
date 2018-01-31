package hasaneen.visionstech.com.hasaneen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.jaeger.library.StatusBarUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StatusBarUtil.setTransparent(MainActivity.this);
        Toolbar customToolbar = findViewById(R.id.c_toolbar);
        setSupportActionBar(customToolbar);
        TextView tv_appBarTitl = findViewById(R.id.appBarTitle);
        tv_appBarTitl.setText(R.string.add_new_address);
        Intent intent = new Intent(getApplicationContext(), MediaPlayerService.class);
        intent.setAction(MediaPlayerService.ACTION_PLAY);
        startService(intent);

    }

}
