package a07580542.poker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity_Home extends AppCompatActivity {

    TextView play;
    TextView how;
    TextView high;
    TextView quit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__home);
        play = findViewById(R.id.playgame);
        how = findViewById(R.id.howtoplay);
        high = findViewById(R.id.highscore);
        quit = findViewById(R.id.quit);

        how.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity_Home.this, a07580542.poker.HowtoPlay_Activity.class);
                startActivity(intent);
            }
        });

        high.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity_Home.this, a07580542.poker.HighScore_Activity.class);
                startActivity(intent);
            }
        });

        quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
