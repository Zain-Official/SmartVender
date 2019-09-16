package excelsoft1.com.smartvender.Chat;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import excelsoft1.com.smartvender.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class SellingFragment extends Fragment {


    public SellingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_selling, container, false);
    }

}
