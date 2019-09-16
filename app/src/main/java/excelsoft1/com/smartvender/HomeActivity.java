package excelsoft1.com.smartvender;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import excelsoft1.com.smartvender.Chat.ChatsFragment;
import excelsoft1.com.smartvender.Explore.ExploreFragment;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout sell;

    Fragment selectedFragment = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        HomeActivity.this.overridePendingTransition(R.anim.right_to_left, R.anim.right_to_left);


        //Click on Sell Button

        sell = (LinearLayout) findViewById(R.id.sell_id);
        sell.setOnClickListener(this);


        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        BottomNavigationView bottomright = findViewById(R.id.bottom_navgations);
        bottomNav.setOnNavigationItemSelectedListener(navListeners);
        bottomright.setOnNavigationItemSelectedListener(navListener);

        //I added this if statement to keep the selected fragment when rotating the device

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new ExploreFragment()).commit();
        }
    }

    //Right bottom navigation


    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()) {

                        case R.id.my_Ads:
                            selectedFragment = new AdsFragment();
                            break;
                        case R.id.my_Account:
                            selectedFragment = new AccountFragment();
                            break;
                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();

                    return true;
                }
            };

    //bottom navigation lft

    private BottomNavigationView.OnNavigationItemSelectedListener navListeners =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment selectedFragment = null;

                    switch (item.getItemId()) {
                        case R.id.explore:
                            selectedFragment = new ExploreFragment();
                            break;
                        case R.id.chat:
                            selectedFragment = new ChatsFragment();
                            break;

                    }

                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                            selectedFragment).commit();

                    return true;
                }
            };

    @Override
    public void onClick(View v) {
        //sell fragment
        final AlertDialog alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setTitle("FINISH YOUR AD POSTING");
        alertDialog.setMessage("You were trying to post an ad previously,do you want to continue?");


        alertDialog.setButton("CONTINUE", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {

                Fragment fragment = new SellFragment();
                overridePendingTransition(R.anim.right_to_left,0);
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, fragment, fragment.getClass().getSimpleName()).addToBackStack(null).commit();
            }
        });


        alertDialog.setButton2("POST NEW AD", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Fragment fragment = new SellFragment();
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container, fragment, fragment.getClass().getSimpleName()).addToBackStack(null).commit();
            }

        });
        // Set the Icon for the Dialog
        alertDialog.show();
        // see http://androidsnippets.com/simple-alert-dialog-popup-with-title-message-icon-and-button

    }

    private AlertDialog AskOption() {
        AlertDialog myQuittingDialogBox = new AlertDialog.Builder(this)
                .setTitle("Exit")
                .setMessage("Are you sure you want to exit?")

                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .create();
        return myQuittingDialogBox;

    }


}



