package com.example.diucity.ImportantAddress;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.diucity.R;

public class community_health_center extends AppCompatActivity
{
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community_health_center);

        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null)
        {
            String title = "Hospitals";
            actionBar.setTitle(title);
        }

        final TextView textView1 = (TextView) findViewById(R.id.community_health_center_text1);
        Spannable text1 = new SpannableString("Community Health Center");
        text1.setSpan(new ForegroundColorSpan(Color.BLUE),0,text1.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView1.setText(text1);

        final TextView textView2 = (TextView) findViewById(R.id.community_health_center_text2);
        Spannable text2 = new SpannableString("Address: PXGM+HVV Ghoghla Fishing Jetty, Mithabava Rd, Saranagar, Ghoghola, 362540\n\nHours: Open 24 hours\n\nPhone: 02875 252 244\n\nRating: 4.0/5");
        text2.setSpan(new ForegroundColorSpan(Color.BLACK),0,text2.length(),Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView2.setText(text2);

        TextView textView3 = (TextView) findViewById(R.id.community_health_center_text3);
        textView3.setMovementMethod(LinkMovementMethod.getInstance());

        TextView textView4 = (TextView) findViewById(R.id.community_health_center_text4);
        textView4.setMovementMethod(LinkMovementMethod.getInstance());

        textView1.setTextIsSelectable(true);
        textView2.setTextIsSelectable(true);

        final ImageView imageView = (ImageView) findViewById(R.id.imageView4);
        imageView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                if(view.getScaleX()==1)
                {
                    view.setScaleX((float) 1.33);
                    view.setScaleY(2);
                }
                else
                {
                    view.setScaleX(1);
                    view.setScaleY(1);
                }
            }
        });
    }
}