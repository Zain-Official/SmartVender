package excelsoft1.com.smartvender.Chat;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import excelsoft1.com.smartvender.PageAdapter;
import excelsoft1.com.smartvender.R;

public class ChatsFragment extends Fragment {
    ViewPager viewPager;
    TabLayout tabLayout;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.chats_xml, container, false);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ViewPager viewPager = view.findViewById(R.id.viewpager);
        final TabLayout tabLayout = view.findViewById(R.id.tabs);

        tabLayout.setupWithViewPager(viewPager);

        PagerAdapter adapter = new PageAdapter(getChildFragmentManager());

        ((PageAdapter) adapter).addFrag(new AllFragment(),"ALL");
        ((PageAdapter) adapter).addFrag(new BuyingFragment(),"BUYING");
        ((PageAdapter) adapter).addFrag(new SellingFragment(),"SELLING");

        viewPager.setAdapter(adapter);

    }
}


