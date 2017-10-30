package norwicak88.gmail.com.aplikasibiodata;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Biodata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);
        getSupportActionBar().setHomeButtonEnabled(true);
    }
}
