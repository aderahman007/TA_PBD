package com.example.tajwidpemula.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import com.example.tajwidpemula.R;

public class TentangIlmuTajwidActivity extends AppCompatActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang_ilmu_tajwid);

        WebView webView = findViewById(R.id.isi);
        String text;
        text = "The quick, brown fox jumps over a lazy dog. DJs flock by when MTV ax quiz prog. " +
                "Junk MTV quiz graced by fox whelps. Bawds jog, flick quartz, vex nymphs. Waltz, " +
                "bad nymph, for quick jigs vex! Fox nymphs grab quick-jived waltz. " +
                "Brick quiz whangs jumpy veldt fox. Bright vixens jump; dozy fowl quack. " +
                "Quick wafting zephyrs vex bold Jim. Quick zephyrs blow, vexing daft Jim. " +
                "Sex-charged fop blew my junk TV quiz. How quickly daft jumping zebras vex. " +
                "Two driven jocks help fax my big quiz. Quick, Baz, get my woven flax jodhpurs!" +
                "\"Now fax quiz Jack!\" my brave ghost pled. Five quacking zephyrs jolt my wax bed. " +
                "Flummoxed by job, kvetching W. zaps Iraq. Cozy sphinx waves quart jug of bad milk. " +
                "A very bad quack might jinx zippy fowls. Few quips galvanized the mock jury box." +
                "zaps Iraq. Cozy sphinx waves quart jug of bad milk. A very bad quack might jinx " +
                "zippy fowls. Few quips galvanized the mock jury box.";
        webView.loadData("<p style=\"text-align:justify\">"+ text +"</p", "text/html", "UTF-8");

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
