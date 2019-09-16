package excelsoft1.com.smartvender.Explore;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.Toast;

import excelsoft1.com.smartvender.InfoFragment;
import excelsoft1.com.smartvender.R;


public class ExploreFragment extends Fragment implements View.OnClickListener {
    LinearLayout aluminium;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.explore_r_home_xml,container,false);

        aluminium =(LinearLayout) view.findViewById(R.id.aluminium);
        aluminium.setOnClickListener(this);
/*



*/

        return view;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        /*toolbar = view.findViewById(R.id.toolbar);
        ((AppCompatActivity) getActivity()).setSupportActionBar(toolbar);*/





    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {

        inflater.inflate(R.menu.search_bar, menu);

        super.onCreateOptionsMenu(menu, inflater);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

        }

        return false;
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.aluminium)
        {
            Toast.makeText(getContext(), "Aluminium", Toast.LENGTH_SHORT).show();
            FragmentTransaction t = this.getFragmentManager().beginTransaction();
            Fragment mFrag = new InfoFragment();
            t.replace(R.id.fragment_container, mFrag);
            t.commit();
        }
    }
}


