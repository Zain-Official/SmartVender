package excelsoft1.com.smartvender.Explore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

import java.util.ArrayList;

import excelsoft1.com.smartvender.R;

public class ExploreAdapter extends BaseAdapter {
        Context context;
        ArrayList<rowDesigns> rowDesignArrayList;

        public ExploreAdapter(Context context) {
            this.context = context;
            rowDesignArrayList = new ArrayList<rowDesigns>();
            String[] titleStr = {"Electronics", "Interior","Electric", "Tiles", "Sanitary",
                    "Paint","Wood Work","Door","Exterior","Marbal",
                    "Iron", "Bricks", "Cement", "Aluminium","Hardware",
                    "Sand","Grit","More Categories"};
            int[] images = {R.drawable.electronic,R.drawable.interior, R.drawable.elec, R.drawable.sand,R.drawable.til,
                    R.drawable.sanitary, R.drawable.pain, R.drawable.woodwork, R.drawable.door, R.drawable.exterior,
                    R.drawable.marble, R.drawable.bri, R.drawable.cemen, R.drawable.iron, R.drawable.hardwre,
                    R.drawable.sand, R.drawable.grit, R.drawable.ic_screen_lock_portrait_black_24dp};

            for (int i = 0; i < 18; i++) {

                rowDesignArrayList.add(new rowDesigns(titleStr[i], images[i]));

            }
        }


        @Override
        public int getCount() {
            return rowDesignArrayList.size();
        }

        @Override
        public Object getItem(int position) {
            return rowDesignArrayList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = convertView;

            if (view == null) {
                LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                view = inflater.inflate(R.layout.explore_item_category, parent, false);
            }

            TextView textVie = view.findViewById(R.id.textView);
            ImageView imageView = view.findViewById(R.id.imag);
            rowDesigns r = rowDesignArrayList.get(position);
            textVie.setText(r.title);
            imageView.setImageResource(r.images);

            return view;
        }
    }

    class rowDesigns
    {
        String title;
        int images;


        public rowDesigns(String title, int images) {
            this.title =title;
            this.images = images;

        }
    }

