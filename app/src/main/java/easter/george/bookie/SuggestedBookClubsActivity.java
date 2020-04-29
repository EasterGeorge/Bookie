package easter.george.bookie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SuggestedBookClubsActivity extends AppCompatActivity {
    Button skipBtn, sbmitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggested_book_clubs);
        //skipBtn =findViewById(R.id.buttonSkip);
        //sbmitBtn =findViewById(R.id.buttonSubmit);
        skipBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newPage();
            }
        });
        sbmitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newPage();
            }
        });
    }

    private void newPage() {
        Intent i = new Intent(SuggestedBookClubsActivity.this, MyBookClubsActivity.class);
        startActivity(i);
    }
}
