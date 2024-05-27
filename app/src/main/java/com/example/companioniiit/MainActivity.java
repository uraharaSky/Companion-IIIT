package com.example.companioniiit;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private int Selectedtab = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout homelayout = findViewById(R.id.home_layout);
        final LinearLayout societieslayout = findViewById(R.id.societies_layout);
        final LinearLayout studylayout = findViewById(R.id.study_layout);
        final LinearLayout profilelayout = findViewById(R.id.profile_layout);

        final ImageView homeimage = findViewById(R.id.home_icon);
        final ImageView societiesimage = findViewById(R.id.societies_icon);
        final ImageView studyimage = findViewById(R.id.study_icon);
        final ImageView profileimage = findViewById(R.id.profile_icon);

        final TextView hometext = findViewById(R.id.home_text);
        final TextView societiestext = findViewById(R.id.attendance_text);
        final TextView studytext = findViewById(R.id.study_text);
        final TextView profiletext = findViewById(R.id.profile_text);

        // Set home fragment
        getSupportFragmentManager().beginTransaction()
                .setReorderingAllowed(true)
                .replace(R.id.fragmentContainer, HomeFragment.class, null)
                .commit();

        homelayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Selectedtab != 1) {
                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragmentContainer, HomeFragment.class, null)
                            .commit();

                    societiestext.setVisibility(View.GONE);
                    studytext.setVisibility(View.GONE);
                    profiletext.setVisibility(View.GONE);

                    societiesimage.setImageResource(R.drawable.societies_icon_navbar);
                    studyimage.setImageResource(R.drawable.study_icon_navbar);
                    profileimage.setImageResource(R.drawable.profile_icon_navbar);

                    societieslayout.setBackgroundColor(getResources().getColor(R.color.colorUnselected));
                    studylayout.setBackgroundColor(getResources().getColor(R.color.colorUnselected));
                    profilelayout.setBackgroundColor(getResources().getColor(R.color.colorUnselected));

                    hometext.setVisibility(View.VISIBLE);
                    homeimage.setImageResource(R.drawable.home_icon_navbar);
                    homelayout.setBackgroundResource(R.drawable.bottom_nav_bg);

                    Selectedtab = 1;
                }
            }
        });

        societieslayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Selectedtab != 2) {
                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragmentContainer, SocietyFragment.class, null)
                            .commit();

                    hometext.setVisibility(View.GONE);
                    studytext.setVisibility(View.GONE);
                    profiletext.setVisibility(View.GONE);

                    homeimage.setImageResource(R.drawable.home_icon_navbar);
                    studyimage.setImageResource(R.drawable.study_icon_navbar);
                    profileimage.setImageResource(R.drawable.profile_icon_navbar);

                    homelayout.setBackgroundColor(getResources().getColor(R.color.colorUnselected));
                    studylayout.setBackgroundColor(getResources().getColor(R.color.colorUnselected));
                    profilelayout.setBackgroundColor(getResources().getColor(R.color.colorUnselected));

                    societiestext.setVisibility(View.VISIBLE);
                    societiesimage.setImageResource(R.drawable.societies_icon_navbar);
                    societieslayout.setBackgroundResource(R.drawable.bottom_nav_bg);

                    Selectedtab = 2;
                }
            }
        });

        studylayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Selectedtab != 3) { // Changed from 2 to 3
                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragmentContainer, StudyFragment.class, null)
                            .commit();

                    hometext.setVisibility(View.GONE);
                    societiestext.setVisibility(View.GONE); // Hide the societies text
                    profiletext.setVisibility(View.GONE);

                    homeimage.setImageResource(R.drawable.home_icon_navbar);
                    societiesimage.setImageResource(R.drawable.societies_icon_navbar);
                    profileimage.setImageResource(R.drawable.profile_icon_navbar);

                    homelayout.setBackgroundColor(getResources().getColor(R.color.colorUnselected));
                    societieslayout.setBackgroundColor(getResources().getColor(R.color.colorUnselected)); // Change to societies layout
                    profilelayout.setBackgroundColor(getResources().getColor(R.color.colorUnselected));

                    studytext.setVisibility(View.VISIBLE);
                    studyimage.setImageResource(R.drawable.study_icon_navbar);
                    studylayout.setBackgroundResource(R.drawable.bottom_nav_bg);

                    Selectedtab = 3; // Changed from 2 to 3
                }
            }
        });

        profilelayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Selectedtab != 4) {
                    getSupportFragmentManager().beginTransaction()
                            .setReorderingAllowed(true)
                            .replace(R.id.fragmentContainer, ProfileFragment.class, null)
                            .commit();

                    hometext.setVisibility(View.GONE);
                    societiestext.setVisibility(View.GONE); // Corrected typo
                    studytext.setVisibility(View.GONE);

                    homeimage.setImageResource(R.drawable.home_icon_navbar); // Correct icon
                    societiesimage.setImageResource(R.drawable.societies_icon_navbar); // Correct icon
                    studyimage.setImageResource(R.drawable.study_icon_navbar); // Correct icon

                    homelayout.setBackgroundColor(getResources().getColor(R.color.colorUnselected));
                    societieslayout.setBackgroundColor(getResources().getColor(R.color.colorUnselected));
                    studylayout.setBackgroundColor(getResources().getColor(R.color.colorUnselected));

                    profiletext.setVisibility(View.VISIBLE);
                    profileimage.setImageResource(R.drawable.profile_icon_navbar);
                    profilelayout.setBackgroundResource(R.drawable.bottom_nav_bg);

                    Selectedtab = 4;
                }
            }
        });
    }
}
