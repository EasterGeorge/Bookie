package easter.george.bookie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {
    EditText pswd1, pswd2, name, email;
    boolean isEmailValid, isPasswordValid,isUsernameValid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void back(View view)
    {
        Intent i = new Intent(SignUpActivity.this, LoginActivity.class);
        startActivity(i);
    }

    public void the_signup(View view)
    {
        Button sigup=findViewById(R.id.btn_sign_up);
        name= findViewById(R.id.username_editText);
        email = findViewById(R.id.email_Edittext);
        pswd1 = findViewById(R.id.psswd_EditText);

        final String myname, myemail, mypswd1, mypswd2;
        myname =name.getText().toString();
        myemail = email.getText().toString();
        mypswd1= pswd1.getText().toString();




        sigup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetValidation();

            }
        });

    }
    public void mainPage(View view) {
        ImageView backImage;
        backImage= findViewById(R.id.back_imgView);
        backImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m = new Intent(SignUpActivity.this, MainActivity.class);
                startActivity(m);
            }
        });
    }

    public void SetValidation() {
        EditText password= findViewById(R.id.psswd_EditText);
        //EditText password2 = findViewById(R.id.rpt_psswd_Edittext);
        EditText username= findViewById(R.id.username_editText);
        EditText email = findViewById(R.id.email_Edittext);

        //check for username
        if (username.getText().toString().isEmpty()) {
            username.setError(getResources().getString(R.string.username_error));
            isUsernameValid = false;
        } else {isUsernameValid= true;}
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
        }
        else  {
            isPasswordValid = true;
        }

        if (isEmailValid && isPasswordValid && isUsernameValid) {
            Intent i = new Intent(SignUpActivity.this,ChooseBkGenreActivity.class);
            // Toast.makeText(SignUpActivity.this, "Sign Up Successful",Toast.LENGTH_LONG).show();
            startActivity(i);
            Toast.makeText(SignUpActivity.this, "Sign Up Successful",Toast.LENGTH_LONG).show();
        }
    }
}
