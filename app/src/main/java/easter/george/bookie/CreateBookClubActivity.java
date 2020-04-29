package easter.george.bookie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class CreateBookClubActivity extends AppCompatActivity {
    ImageView myHome;
Button myBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_book_club);
        myHome=findViewById(R.id.getHome);
        myHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CreateBookClubActivity.this, MyBookClubsActivity.class);
                startActivity(i);
            }
        });
        myBtn= findViewById(R.id.button_create);
        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CreateBookClubActivity.this, "Book Club created", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
