package com.rezaduty.chdev.ks.tahririye_man.ui.adapters;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.rezaduty.chdev.ks.tahririye_man.R;
import com.rezaduty.chdev.ks.tahririye_man.models.CategoryItem;
import com.rezaduty.chdev.ks.tahririye_man.models.SettingsPreferences;

import java.util.List;

/**
 * Created by Kartik_ch on 11/11/2015.
 */
public class CategoryListAdapter extends BaseAdapter {

    private Context mContext;
    private List<CategoryItem> mCategoryItems;

    public CategoryListAdapter(Context mContext, List<CategoryItem> mCategoryItems) {
        this.mContext = mContext;
        this.mCategoryItems = mCategoryItems;
    }

    @Override
    public int getCount() {
        return mCategoryItems.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_category, viewGroup, false);
        TextView txtCategoryName = (TextView) itemView.findViewById(R.id.text_view_category);
        ImageView imgCategory = (ImageView) itemView.findViewById(R.id.image_view_category);

        txtCategoryName.setText(mCategoryItems.get(i).getCategoryName());
        imgCategory.setImageDrawable(mCategoryItems.get(i).getCategoryImg());

        //add a white color filter to the images if dark theme is selected
        if (!SettingsPreferences.THEME) {
            txtCategoryName.setTextColor(ContextCompat.getColor(viewGroup.getContext(), R.color.md_black_1000));
            imgCategory.setColorFilter(ContextCompat.getColor(viewGroup.getContext(), R.color.md_black_1000));
        }

        return itemView;
    }
}
