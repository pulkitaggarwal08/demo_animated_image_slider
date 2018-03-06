package pulkit.demo_image_slider.com.demoimageslider.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import pulkit.demo_image_slider.com.demoimageslider.R;
import pulkit.demo_image_slider.com.demoimageslider.constant.Constant;
import pulkit.demo_image_slider.com.demoimageslider.fragment.ProductTourFragment;

/**
 * Created by pulkit on 13/12/17.
 */

public class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {

    public ScreenSlidePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        ProductTourFragment tp = null;
        switch (position) {

            case 0:
                tp = ProductTourFragment.newInstance(R.layout.welcome_fragment1);
                break;
            case 1:
                tp = ProductTourFragment.newInstance(R.layout.welcome_fragment2);
                break;
            case 2:
                tp = ProductTourFragment.newInstance(R.layout.welcome_fragment3);
                break;
            case 3:
                tp = ProductTourFragment.newInstance(R.layout.welcome_fragment4);
                break;
            case 4:
                tp = ProductTourFragment.newInstance(R.layout.welcome_fragment5);
                break;

        }
        return tp;
    }

    @Override
    public int getCount() {
        return Constant.NUM_PAGES;
    }


}
