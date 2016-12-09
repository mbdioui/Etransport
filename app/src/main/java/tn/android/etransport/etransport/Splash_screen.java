package tn.android.etransport.etransport;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;

public class Splash_screen extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_splash_screen);

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.none);
//        ImageView img= (ImageView) findViewById(R.id.Splash_logo);
        FrameLayout framescroll= (FrameLayout) findViewById(R.id.scrolling_image);
        framescroll.startAnimation(animation);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
            Splash_screen.this.finish();
            Intent intent= new Intent(getApplicationContext(),LoginActivity.class);
            startActivity(intent);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }

}
