package hu.fallen.jokeactivity404;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    public static final String JOKE_EXTRA = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        Intent intent = getIntent();
        if (intent.hasExtra(JOKE_EXTRA)) {
            ((TextView) findViewById(R.id.tv_joke)).setText(intent.getStringExtra(JOKE_EXTRA));
        }
    }
}
