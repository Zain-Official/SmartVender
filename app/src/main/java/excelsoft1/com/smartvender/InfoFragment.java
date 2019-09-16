package excelsoft1.com.smartvender;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class InfoFragment extends Fragment {
    ListView listView;
    String[] brandNames = new String[]{"A", "B", "C", "D", "E", "F", "I", "J", "k", "L",};
    BrandAdapter brandAdapter;


    public InfoFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_info, container, false);
        listView = (ListView) view.findViewById(R.id.listView);
        brandAdapter = new BrandAdapter(getContext(), brandNames);

        listView.setAdapter(brandAdapter);


        return view;

    }

}
