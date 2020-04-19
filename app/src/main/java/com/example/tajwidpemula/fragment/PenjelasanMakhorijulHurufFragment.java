package com.example.tajwidpemula.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.tajwidpemula.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PenjelasanMakhorijulHurufFragment extends Fragment {

    public PenjelasanMakhorijulHurufFragment() {
        // Required empty public constructor
    }



    public static PenjelasanMakhorijulHurufFragment newInstance() {

        Bundle args = new Bundle();

        PenjelasanMakhorijulHurufFragment fragment = new PenjelasanMakhorijulHurufFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_penjelasan_makhorijul_huruf, container, false);

        WebView webView = v.findViewById(R.id.isi);
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

        return v;
    }
}
