package excelsoft1.com.smartvender;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class BrandAdapter extends BaseAdapter {
    Context context;
    String[] brand_names;
    LayoutInflater xmlInflater = null;


    public BrandAdapter(Context context, String[] brandNames)
    {
        this.brand_names=brandNames;
        this.context=context;
        xmlInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return brand_names.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View countryItem = xmlInflater.inflate(R.layout.info_fragment, null);
        TextView details_brnd = countryItem.findViewById(R.id.text_info);
       details_brnd.setText(brand_names[position]);
        return countryItem;
    }
}


