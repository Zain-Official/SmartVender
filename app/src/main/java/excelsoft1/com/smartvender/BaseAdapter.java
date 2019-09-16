package excelsoft1.com.smartvender;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

class myAdapter extends BaseAdapter {
    Context context;
    ArrayList<rowDesign> rowDesignArrayList;

    public myAdapter(Context context) {
        this.context = context;
        rowDesignArrayList = new ArrayList<rowDesign>();
        String[] titleStr = {"Aluminium", "Bricks", "Cement", "Door", "Electric",
                "Electronics", "Exterior", "Grit", "Hardware", "Iron", "Interior", "Marbal", "Paint", "Sanitary",
                "Sand", "Tiles", "Wood Work", "More Categories"};
        int[] images = {R.drawable.aloy_black, R.drawable.brick_black, R.drawable.cement_black, R.drawable.door_black, R.drawable.electric_black,
                R.drawable.electronics_black,
                R.drawable.exterior_black, R.drawable.grit_black, R.drawable.hardware_black, R.drawable.aloy_black,
                R.drawable.interior_black, R.drawable.marble_black,
                R.drawable.paint_black, R.drawable.sand_black, R.drawable.basin_black, R.drawable.tile_black,
                R.drawable.wood_work_black,
                R.drawable.ic_screen_lock_portrait_black_24dp};

        for (int i = 0; i < 18; i++) {

            rowDesignArrayList.add(new rowDesign(titleStr[i], images[i]));

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
            view = inflater.inflate(R.layout.sell_item_layout, parent, false);
        }

        TextView textVie = view.findViewById(R.id.textView);
        ImageView imageView = view.findViewById(R.id.imag);
        rowDesign r = rowDesignArrayList.get(position);
        textVie.setText(r.title);
        imageView.setImageResource(r.images);

        return view;
    }
}

class rowDesign {
    String title;
    int images;


    public rowDesign(String title, int images) {
        this.title = title;
        this.images = images;

    }
}