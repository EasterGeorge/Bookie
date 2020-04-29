package easter.george.bookie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GenresActivity extends AppCompatActivity {
    Button thyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_choose_bk_genre);
       thyButton=findViewById(R.id.button144);
        thyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thatPage = new Intent(GenresActivity.this, SuggestedBookClubsActivity.class);
                startActivity(thatPage);
            }
        });
    }
}
