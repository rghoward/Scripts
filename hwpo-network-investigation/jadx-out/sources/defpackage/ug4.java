package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SimpleProgressBar;
import com.hwpo_training_app.core.widget.placeholder.PlaceHolder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ug4 implements wfb {
    public final RelativeLayout a;
    public final PlaceHolder b;
    public final SimpleProgressBar c;
    public final RecyclerView d;

    public ug4(RelativeLayout relativeLayout, PlaceHolder placeHolder, SimpleProgressBar simpleProgressBar, RecyclerView recyclerView) {
        this.a = relativeLayout;
        this.b = placeHolder;
        this.c = simpleProgressBar;
        this.d = recyclerView;
    }

    public static ug4 bind(View view) {
        int i = R.id.placeholder;
        PlaceHolder placeHolder = (PlaceHolder) nt3.b(R.id.placeholder, view);
        if (placeHolder != null) {
            i = R.id.progress;
            SimpleProgressBar simpleProgressBar = (SimpleProgressBar) nt3.b(R.id.progress, view);
            if (simpleProgressBar != null) {
                i = R.id.valuesRv;
                RecyclerView recyclerView = (RecyclerView) nt3.b(R.id.valuesRv, view);
                if (recyclerView != null) {
                    return new ug4((RelativeLayout) view, placeHolder, simpleProgressBar, recyclerView);
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static ug4 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_values_list, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static ug4 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
