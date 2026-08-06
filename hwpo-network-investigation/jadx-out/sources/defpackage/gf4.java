package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.tabs.TabLayout;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class gf4 implements wfb {
    public final LinearLayoutCompat a;
    public final MaterialButton b;
    public final MaterialButton c;
    public final MaterialButton d;
    public final TabLayout e;
    public final ViewPager2 f;

    public gf4(LinearLayoutCompat linearLayoutCompat, MaterialButton materialButton, MaterialButton materialButton2, MaterialButton materialButton3, TabLayout tabLayout, ViewPager2 viewPager2) {
        this.a = linearLayoutCompat;
        this.b = materialButton;
        this.c = materialButton2;
        this.d = materialButton3;
        this.e = tabLayout;
        this.f = viewPager2;
    }

    public static gf4 bind(View view) {
        int i = R.id.backBtn;
        MaterialButton materialButton = (MaterialButton) nt3.b(R.id.backBtn, view);
        if (materialButton != null) {
            i = R.id.backToLoginBtn;
            MaterialButton materialButton2 = (MaterialButton) nt3.b(R.id.backToLoginBtn, view);
            if (materialButton2 != null) {
                i = R.id.signUpBtn;
                MaterialButton materialButton3 = (MaterialButton) nt3.b(R.id.signUpBtn, view);
                if (materialButton3 != null) {
                    i = R.id.slidesTabLayout;
                    TabLayout tabLayout = (TabLayout) nt3.b(R.id.slidesTabLayout, view);
                    if (tabLayout != null) {
                        i = R.id.slidesViewPager;
                        ViewPager2 viewPager2 = (ViewPager2) nt3.b(R.id.slidesViewPager, view);
                        if (viewPager2 != null) {
                            return new gf4((LinearLayoutCompat) view, materialButton, materialButton2, materialButton3, tabLayout, viewPager2);
                        }
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static gf4 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_onboarding_tutorial_pager, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static gf4 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
