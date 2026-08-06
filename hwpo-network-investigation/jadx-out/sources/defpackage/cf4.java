package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SimpleProgressBar;
import com.hwpo_training_app.core.widget.placeholder.PlaceHolder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class cf4 implements wfb {
    public final ConstraintLayout a;
    public final RecyclerView b;
    public final SwipeRefreshLayout c;
    public final PlaceHolder d;
    public final SimpleProgressBar e;

    public cf4(ConstraintLayout constraintLayout, RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, PlaceHolder placeHolder, SimpleProgressBar simpleProgressBar) {
        this.a = constraintLayout;
        this.b = recyclerView;
        this.c = swipeRefreshLayout;
        this.d = placeHolder;
        this.e = simpleProgressBar;
    }

    public static cf4 bind(View view) {
        int i = R.id.notificationsList;
        RecyclerView recyclerView = (RecyclerView) nt3.b(R.id.notificationsList, view);
        if (recyclerView != null) {
            i = R.id.notificationsSwipeToRefresh;
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) nt3.b(R.id.notificationsSwipeToRefresh, view);
            if (swipeRefreshLayout != null) {
                i = R.id.placeholder;
                PlaceHolder placeHolder = (PlaceHolder) nt3.b(R.id.placeholder, view);
                if (placeHolder != null) {
                    i = R.id.progress;
                    SimpleProgressBar simpleProgressBar = (SimpleProgressBar) nt3.b(R.id.progress, view);
                    if (simpleProgressBar != null) {
                        i = R.id.toolbar;
                        if (((MaterialToolbar) nt3.b(R.id.toolbar, view)) != null) {
                            return new cf4((ConstraintLayout) view, recyclerView, swipeRefreshLayout, placeHolder, simpleProgressBar);
                        }
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static cf4 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_notifications, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static cf4 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
