package easter.george.bookie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class BkClubsActivity extends AppCompatActivity {
    Button skipBtn, sbmitBtn;
    ImageView myImg1, myImg2, myImg3, myImg4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bk_clubs);
        skipBtn =findViewById(R.id.buttonSkip);
        sbmitBtn =findViewById(R.id.buttonSubmit);
        myImg1= findViewById(R.id.imageView1);
        myImg2=findViewById(R.id.imageView2);
        myImg3= findViewById(R.id.imageView3);
        myImg4 = findViewById(R.id.imageView4);
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
        myImg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                infoPopup(v);
            }
        });
        myImg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                infoPopup(v);
            }
        });
        myImg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                infoPopup(v);
            }
        });
        myImg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                infoPopup(v);
            }
        });
    }

    private void infoPopup(View v) {
        BookInfoPopup popUpClass = new BookInfoPopup();
        popUpClass.showPopupWindow(v);
    }

    private void newPage() {
        Intent i = new Intent(BkClubsActivity.this, MyBookClubsActivity.class);
        startActivity(i);
    }

    @Override
    protected void onStart() {
        Toast.makeText(BkClubsActivity.this, "Sign Up Successful",Toast.LENGTH_LONG).show();
        super.onStart();
    }
}
