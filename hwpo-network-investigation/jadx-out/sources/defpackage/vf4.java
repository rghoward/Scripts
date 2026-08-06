package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.MaterialToolbar;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class vf4 implements wfb {
    public final FrameLayout a;
    public final MaterialToolbar b;
    public final ViewPager2 c;

    public vf4(FrameLayout frameLayout, MaterialToolbar materialToolbar, ViewPager2 viewPager2) {
        this.a = frameLayout;
        this.b = materialToolbar;
        this.c = viewPager2;
    }

    public static vf4 bind(View view) {
        int i = R.id.dummyToolbar;
        MaterialToolbar materialToolbar = (MaterialToolbar) nt3.b(R.id.dummyToolbar, view);
        if (materialToolbar != null) {
            i = R.id.rootPager;
            ViewPager2 viewPager2 = (ViewPager2) nt3.b(R.id.rootPager, view);
            if (viewPager2 != null) {
                return new vf4((FrameLayout) view, materialToolbar, viewPager2);
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static vf4 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_sessions_swipe_container, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static vf4 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
