package id.sch.smktelkom_mlg.project.xirpl305142332.myangkotroute;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class coba extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coba);
        Intent intent = getIntent();

        setTitle(intent.getStringExtra("angkot"));

    }
    
}
