package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SimpleProgressBar;
import com.hwpo_training_app.core.widget.placeholder.PlaceHolder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ne4 implements wfb {
    public final SwipeRefreshLayout a;
    public final PlaceHolder b;
    public final RecyclerView c;
    public final SwipeRefreshLayout d;
    public final SimpleProgressBar e;

    public ne4(RecyclerView recyclerView, SwipeRefreshLayout swipeRefreshLayout, SwipeRefreshLayout swipeRefreshLayout2, SimpleProgressBar simpleProgressBar, PlaceHolder placeHolder) {
        this.a = swipeRefreshLayout;
        this.b = placeHolder;
        this.c = recyclerView;
        this.d = swipeRefreshLayout2;
        this.e = simpleProgressBar;
    }

    public static ne4 bind(View view) {
        int i = R.id.placeholder;
        PlaceHolder placeHolder = (PlaceHolder) nt3.b(R.id.placeholder, view);
        if (placeHolder != null) {
            i = R.id.programsList;
            RecyclerView recyclerView = (RecyclerView) nt3.b(R.id.programsList, view);
            if (recyclerView != null) {
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view;
                i = R.id.progress;
                SimpleProgressBar simpleProgressBar = (SimpleProgressBar) nt3.b(R.id.progress, view);
                if (simpleProgressBar != null) {
                    return new ne4(recyclerView, swipeRefreshLayout, swipeRefreshLayout, simpleProgressBar, placeHolder);
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static ne4 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_day_workouts, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static ne4 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
