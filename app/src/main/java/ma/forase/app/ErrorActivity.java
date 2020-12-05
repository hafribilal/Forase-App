package ma.forase.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ErrorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_error);
        getSupportActionBar().hide();
    }

    @Override
    public void onBackPressed() {
        finish();
    }

    public void retry(View v)
    {
        Intent splash = new Intent(getApplicationContext(), SplashActivity.class);
        startActivity(splash);
        finish();
    }
}
