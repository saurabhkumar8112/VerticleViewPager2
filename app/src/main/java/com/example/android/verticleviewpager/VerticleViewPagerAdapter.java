package com.example.android.verticleviewpager;

import com.example.android.verticleviewpager.R;
import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;


public class VerticleViewPagerAdapter  extends PagerAdapter {

    String mResources[] = {"The Islamic State has declared war on Taliban militants in Afghanistan and called the Taliban \"hypocrites and stooges of the unbelievers\". \"Taliban militants are betraying Islam and that they should be killed everywhere and their properties should be seized,\" an ISIS commander said.","The Korean War began on this day in 1950 when North Korea invaded South Korea. It was the first war in which the UN played a role. The US, under the auspices of the United Nations, came to the defence of South Korea and fought against North Korea, which was being assisted by China, for the next years."};

    Context mContext;
    LayoutInflater mLayoutInflater;

    public VerticleViewPagerAdapter (Context context) {
        mContext = context;
        mLayoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return mResources.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View itemView = mLayoutInflater.inflate(R.layout.activity_verticle_view_pager, container, false);
        TextView label = (TextView) itemView.findViewById(R.id.textView);
        label.setText(mResources[position]);
        container.addView(itemView);

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }
}