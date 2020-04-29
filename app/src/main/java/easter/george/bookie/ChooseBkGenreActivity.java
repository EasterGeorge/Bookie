package easter.george.bookie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseBkGenreActivity extends AppCompatActivity {
    Button myBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_bk_genre);
        myBtn = findViewById(R.id.button144);
       myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent that = new Intent(ChooseBkGenreActivity.this, BkClubsActivity.class);
                  startActivity(that);
            }
        });
    }


}
