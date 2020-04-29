package easter.george.bookie;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText password, username;
    TextView resetPassword;
    boolean isEmailValid, isPasswordValid;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        resetPassword=findViewById(R.id.reset_psswd_text_view);

        password= findViewById(R.id.lgnText_password);
        username = findViewById(R.id.lgnText_username);
        Button myBtn = findViewById(R.id.button_logging_in);
        final String name = username.getText().toString();
        final String passwords = password.getText().toString();

        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetValidation();
               /* if (name==""){
                    username.setError("Input email/username");
                }
                else if (passwords.isEmpty()){
                    password.setError("Input Password");
                } else{
                    Intent myNextPage= new Intent(LoginActivity.this, MyBookClubsActivity.class);
                    //Toast.makeText(LoginActivity.this, "Login Successful", Toast.LENGTH_LONG).show();
                    startActivity(myNextPage);
                }*/

            }
        });


        resetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                PopUpClass popUpClass = new PopUpClass();
                popUpClass.showPopupWindow(v);

            }
        });
    }

    public void login(View view) {

        password= findViewById(R.id.lgnText_password);
        username = findViewById(R.id.lgnText_username);
        final Button myBtn = findViewById(R.id.button_logging_in);

        myBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.toString().isEmpty()){
                 username.setError("Input username");

                }
                else if(password.toString().isEmpty()){
                    password.setError("Input Password");

                }
                else if (password.toString().isEmpty()== false && username.toString().isEmpty()== false){
                    Intent myNextPage= new Intent(LoginActivity.this, MyBookClubsActivity.class);
                    //Toast.makeText(LoginActivity.this, "Login Successful", Toast.LENGTH_LONG).show();
                    startActivity(myNextPage);
                }


            }
        });
    }

    public void back_sign(View view) {
        Intent i = new Intent(LoginActivity.this, SignUpActivity.class);
        startActivity(i);
    }

    public void mainPage(View view) {
        ImageView backImage;
        backImage= findViewById(R.id.back_imgView);
        backImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(m);
            }
        });
    }
    public boolean validation(String name, String password){
        boolean answer = false;
        if (name == "" )
        {
            //answer=
        }

        return answer ;
    }

    public void SetValidation() {
        EditText password= findViewById(R.id.lgnText_password);
        EditText email = findViewById(R.id.lgnText_username);
        // Check for a valid email address.
        if (email.getText().toString().isEmpty()) {
            email.setError(getResources().getString(R.string.email_error));
            isEmailValid = false;
        } else if (!Patterns.EMAIL_ADDRESS.matcher(email.getText().toString()).matches()) {
            email.setError(getResources().getString(R.string.error_invalid_email));
            isEmailValid = false;
        } else  {
            isEmailValid = true;
        }

        // Check for a valid password.
        if (password.getText().toString().isEmpty()) {
            password.setError(getResources().getString(R.string.password_error));
            isPasswordValid = false;
        } else if (password.getText().length() < 6) {
            password.setError(getResources().getString(R.string.error_invalid_password));
            isPasswordValid = false;
        } else  {
            isPasswordValid = true;
        }

        if (isEmailValid && isPasswordValid) {
            Toast.makeText(getApplicationContext(), "Login Successful", Toast.LENGTH_SHORT).show();
            Intent myNextPage= new Intent(LoginActivity.this, MyBookClubsActivity.class);
            //Toast.makeText(LoginActivity.this, "Login Successful", Toast.LENGTH_LONG).show();
            startActivity(myNextPage);
        }
    }
}
