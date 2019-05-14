package sg.edu.rp.c346.checkboxexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    CheckBox cbEnabled;
    Button btnCheck;
    TextView tvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cbEnabled =findViewById(R.id.checkBoxDiscount);
        btnCheck = findViewById(R.id.buttonCheck);
        tvShow = findViewById(R.id.textViewDisplay);


        btnCheck.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.i("" +
                        "MyActivity", "Inside onClick()");
                if(cbEnabled.isChecked()){
                    double pay = calcPay(100, 20);
                    tvShow.setText("The discount is given. You need to pay " + pay);

//                    //tvShow.setText("The discount is given");
//                    Toast.makeText(MainActivity.this,"The discount is given"
//                            ,Toast.LENGTH_LONG).show();
                }
                else{
                    double pay = calcPay(100, 0);
                    tvShow.setText("The discount is not given. You need to pay " + pay);

                    //tvShow.setText("The discount is not given");
//                    Toast.makeText(MainActivity.this,"The discount is not given"
//                            ,Toast.LENGTH_LONG).show();
                }
            }

        });
    }
    private double calcPay(double price, double discount){
        double pay = price * (1 - discount/100);
        return pay;
    }
}
