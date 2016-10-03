package tn.android.etransport.etransport;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.IdRes;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

public class MainClient extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main_client);
        BottomBar BB =(BottomBar) findViewById(R.id.Bottbar);
        BB.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                switch(tabId){
                case R.id.tab_action_settings :


                    Form_Settings_Client newFragment = new Form_Settings_Client();
                    FragmentTransaction transaction = getFragmentManager().beginTransaction();

                    transaction.replace(R.id.framefragment, newFragment);
                    transaction.addToBackStack(null);

                    transaction.commit();
                        break;
                case R.id.tab_home_client:

                    Form_Home_Client f = new Form_Home_Client();
                    FragmentTransaction FT = getFragmentManager().beginTransaction();
                    FT.replace(R.id.framefragment, f);
                    FT.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                    FT.addToBackStack(null);
                    FT.commit();
                    break;
                case R.id.tab_Paths :
                    Form_Paths_Client fp = new Form_Paths_Client();
                    FragmentTransaction FT2 = getFragmentManager().beginTransaction();
                    FT2.replace(R.id.framefragment, fp);
                    FT2.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                    FT2.addToBackStack(null);
                    FT2.commit();
                    break;
                }
            }
        });

    }
}
