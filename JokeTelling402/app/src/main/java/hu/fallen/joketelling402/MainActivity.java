package hu.fallen.joketelling402;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import hu.fallen.jokeactivity404.JokeActivity;
import hu.fallen.jokesmith.JokeSmith;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startJokeActivity(View view) {
        Intent intent = new Intent(this, JokeActivity.class);
        intent.putExtra(JokeActivity.JOKE_EXTRA, JokeSmith.getJoke());
        startActivity(intent);
    }
}
