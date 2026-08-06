package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.presentation.horizontal_calendar.WeeksCalendarView;
import com.hwpo_training_app.core.widget.SimpleProgressBar;
import com.hwpo_training_app.core.widget.placeholder.PlaceHolder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class xg4 implements wfb {
    public final RelativeLayout a;
    public final ViewPager2 b;
    public final SimpleProgressBar c;
    public final MaterialToolbar d;
    public final WeeksCalendarView e;

    public xg4(RelativeLayout relativeLayout, ViewPager2 viewPager2, SimpleProgressBar simpleProgressBar, MaterialToolbar materialToolbar, WeeksCalendarView weeksCalendarView) {
        this.a = relativeLayout;
        this.b = viewPager2;
        this.c = simpleProgressBar;
        this.d = materialToolbar;
        this.e = weeksCalendarView;
    }

    public static xg4 bind(View view) {
        int i = R.id.appBar;
        if (((AppBarLayout) nt3.b(R.id.appBar, view)) != null) {
            i = R.id.daysViewPager;
            ViewPager2 viewPager2 = (ViewPager2) nt3.b(R.id.daysViewPager, view);
            if (viewPager2 != null) {
                i = R.id.placeholder;
                if (((PlaceHolder) nt3.b(R.id.placeholder, view)) != null) {
                    i = R.id.progress;
                    SimpleProgressBar simpleProgressBar = (SimpleProgressBar) nt3.b(R.id.progress, view);
                    if (simpleProgressBar != null) {
                        i = R.id.toolbar;
                        MaterialToolbar materialToolbar = (MaterialToolbar) nt3.b(R.id.toolbar, view);
                        if (materialToolbar != null) {
                            i = R.id.weeksViewPager;
                            WeeksCalendarView weeksCalendarView = (WeeksCalendarView) nt3.b(R.id.weeksViewPager, view);
                            if (weeksCalendarView != null) {
                                return new xg4((RelativeLayout) view, viewPager2, simpleProgressBar, materialToolbar, weeksCalendarView);
                            }
                        }
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static xg4 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_workouts, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static xg4 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
