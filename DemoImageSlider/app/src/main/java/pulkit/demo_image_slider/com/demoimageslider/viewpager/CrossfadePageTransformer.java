package pulkit.demo_image_slider.com.demoimageslider.viewpager;

import android.support.v4.view.ViewPager;
import android.view.View;

import pulkit.demo_image_slider.com.demoimageslider.R;
import pulkit.demo_image_slider.com.demoimageslider.view.ViewHelper;

/**
 * Created by pulkit on 13/12/17.
 */

public class CrossfadePageTransformer implements ViewPager.PageTransformer {


    @Override
    public void transformPage(View page, float position) {

        int pageWidth = page.getWidth();

        View backgroundView = page.findViewById(R.id.welcome_fragment);

        View text_head = page.findViewById(R.id.heading);
        View text_content = page.findViewById(R.id.content);
        View object1 = page.findViewById(R.id.a000);
        View object2 = page.findViewById(R.id.a001);
        View object3 = page.findViewById(R.id.a002);
        View object4 = page.findViewById(R.id.a003);
        View object5 = page.findViewById(R.id.a004);
        View object6 = page.findViewById(R.id.a005);
        View object7 = page.findViewById(R.id.a006);
        View object8 = page.findViewById(R.id.a008);
        View object9 = page.findViewById(R.id.a010);
        View object10 = page.findViewById(R.id.a011);
        View object11 = page.findViewById(R.id.a007);
        View object12 = page.findViewById(R.id.a012);
        View object13 = page.findViewById(R.id.a013);


        if (0 <= position && position < 1) {
            ViewHelper.setTranslationX(page, pageWidth * -position);
        }
        if (-1 < position && position < 0) {
            ViewHelper.setTranslationX(page, pageWidth * -position);
        }

        if (position <= -1.0f || position >= 1.0f) {
        } else if (position == 0.0f) {
        } else {
            if (backgroundView != null) {
                ViewHelper.setAlpha(backgroundView, 1.0f - Math.abs(position));

            }

            if (text_head != null) {
                ViewHelper.setTranslationX(text_head, pageWidth * position);
                ViewHelper.setAlpha(text_head, 1.0f - Math.abs(position));
            }

            if (text_content != null) {
                ViewHelper.setTranslationX(text_content, pageWidth * position);
                ViewHelper.setAlpha(text_content, 1.0f - Math.abs(position));
            }

            if (object1 != null) {
                ViewHelper.setTranslationX(object1, pageWidth * position);
            }

            // parallax effect
            if (object2 != null) {
                ViewHelper.setTranslationX(object2, pageWidth * position);
            }

            if (object4 != null) {
                ViewHelper.setTranslationX(object4, pageWidth / 2 * position);
            }
            if (object5 != null) {
                ViewHelper.setTranslationX(object5, pageWidth / 2 * position);
            }
            if (object6 != null) {
                ViewHelper.setTranslationX(object6, pageWidth / 2 * position);
            }
            if (object7 != null) {
                ViewHelper.setTranslationX(object7, pageWidth / 2 * position);
            }

            if (object8 != null) {
                ViewHelper.setTranslationX(object8, (float) (pageWidth / 1.5 * position));
            }

            if (object9 != null) {
                ViewHelper.setTranslationX(object9, (float) (pageWidth / 2 * position));
            }

            if (object10 != null) {
                ViewHelper.setTranslationX(object10, pageWidth / 2 * position);
            }

            if (object11 != null) {
                ViewHelper.setTranslationX(object11, (float) (pageWidth / 1.2 * position));
            }

            if (object12 != null) {
                ViewHelper.setTranslationX(object12, (float) (pageWidth / 1.3 * position));
            }

            if (object13 != null) {
                ViewHelper.setTranslationX(object13, (float) (pageWidth / 1.8 * position));
            }

            if (object3 != null) {
                ViewHelper.setTranslationX(object3, (float) (pageWidth / 1.2 * position));
            }
        }
    }


}
