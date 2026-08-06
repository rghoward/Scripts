package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SearchEditText;
import com.hwpo_training_app.core.widget.tabs.CustomTabLayout;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class jg4 implements wfb {
    public final RelativeLayout a;
    public final ImageView b;
    public final CustomTabLayout c;
    public final SearchEditText d;
    public final MaterialToolbar e;
    public final ViewPager2 f;

    public jg4(RelativeLayout relativeLayout, ImageView imageView, CustomTabLayout customTabLayout, SearchEditText searchEditText, MaterialToolbar materialToolbar, ViewPager2 viewPager2) {
        this.a = relativeLayout;
        this.b = imageView;
        this.c = customTabLayout;
        this.d = searchEditText;
        this.e = materialToolbar;
        this.f = viewPager2;
    }

    public static jg4 bind(View view) {
        int i = R.id.appBar;
        if (((AppBarLayout) nt3.b(R.id.appBar, view)) != null) {
            i = R.id.buttonAddValue;
            ImageView imageView = (ImageView) nt3.b(R.id.buttonAddValue, view);
            if (imageView != null) {
                i = R.id.inboxTabLayout;
                CustomTabLayout customTabLayout = (CustomTabLayout) nt3.b(R.id.inboxTabLayout, view);
                if (customTabLayout != null) {
                    i = R.id.searchFieldEditText;
                    SearchEditText searchEditText = (SearchEditText) nt3.b(R.id.searchFieldEditText, view);
                    if (searchEditText != null) {
                        i = R.id.toolbar;
                        MaterialToolbar materialToolbar = (MaterialToolbar) nt3.b(R.id.toolbar, view);
                        if (materialToolbar != null) {
                            i = R.id.trackingViewPager;
                            ViewPager2 viewPager2 = (ViewPager2) nt3.b(R.id.trackingViewPager, view);
                            if (viewPager2 != null) {
                                return new jg4((RelativeLayout) view, imageView, customTabLayout, searchEditText, materialToolbar, viewPager2);
                            }
                        }
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static jg4 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_tracking, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static jg4 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
