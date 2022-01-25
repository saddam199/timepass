package code.route.timepass;


import androidx.appcompat.app.AppCompatActivity;
import in.aabhasjindal.otptextview.OTPListener;
import in.aabhasjindal.otptextview.OtpTextView;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private OtpTextView otpTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        otpTextView = findViewById(R.id.otp_view);
        otpTextView.setOtpListener(new OTPListener() {
            @Override
            public void onInteractionListener() {

            }

            @Override
            public void onOTPComplete(String otp) {
                if (otp.equals("12345")){
                    otpTextView.showSuccess();
                    Toast.makeText(MainActivity.this,"الرمز صحيح"+ otp, Toast.LENGTH_LONG).show();
                }
                else{
                    otpTextView.showError();
                    Toast.makeText(MainActivity.this,"الرمز خاطىء", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
