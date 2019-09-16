package excelsoft1.com.smartvender;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import excelsoft1.com.smartvender.Ads.ADSFragment;
import excelsoft1.com.smartvender.Ads.FavouriteFragment;

public class AdsFragment extends Fragment {
    ViewPager viewPager;
    TabLayout tabLayout;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.my_ads_xml, container, false);
       return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ViewPager viewPager = view.findViewById(R.id.viewpager);
        TabLayout tabLayout = view.findViewById(R.id.tabs);

        tabLayout.setupWithViewPager(viewPager);

        PagerAdapter adapter = new PageAdapter(getChildFragmentManager());

        ((PageAdapter) adapter).addFrag(new ADSFragment(),"ADS");
        ((PageAdapter) adapter).addFrag(new FavouriteFragment(),"FAVOURITES");


        viewPager.setAdapter(adapter);

    }
}
