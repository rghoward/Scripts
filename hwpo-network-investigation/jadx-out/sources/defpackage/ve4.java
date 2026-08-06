package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ve4 implements wfb {
    public final LinearLayoutCompat a;
    public final BottomNavigationView b;

    public ve4(LinearLayoutCompat linearLayoutCompat, BottomNavigationView bottomNavigationView) {
        this.a = linearLayoutCompat;
        this.b = bottomNavigationView;
    }

    public static ve4 bind(View view) {
        int i = R.id.bottomNavigation;
        BottomNavigationView bottomNavigationView = (BottomNavigationView) nt3.b(R.id.bottomNavigation, view);
        if (bottomNavigationView != null) {
            i = R.id.tabContainer;
            if (((FragmentContainerView) nt3.b(R.id.tabContainer, view)) != null) {
                return new ve4((LinearLayoutCompat) view, bottomNavigationView);
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static ve4 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_main, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static ve4 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
