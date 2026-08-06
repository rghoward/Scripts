package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.SimpleProgressBar;
import com.hwpo_training_app.core.widget.placeholder.PlaceHolder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class uf4 implements wfb {
    public final RelativeLayout a;
    public final MaterialButton b;
    public final PlaceHolder c;
    public final MaterialButton d;
    public final SimpleProgressBar e;
    public final MaterialButton f;
    public final RecyclerView g;
    public final MaterialToolbar h;

    public uf4(RelativeLayout relativeLayout, MaterialButton materialButton, PlaceHolder placeHolder, MaterialButton materialButton2, SimpleProgressBar simpleProgressBar, MaterialButton materialButton3, RecyclerView recyclerView, MaterialToolbar materialToolbar) {
        this.a = relativeLayout;
        this.b = materialButton;
        this.c = placeHolder;
        this.d = materialButton2;
        this.e = simpleProgressBar;
        this.f = materialButton3;
        this.g = recyclerView;
        this.h = materialToolbar;
    }

    public static uf4 bind(View view) {
        int i = R.id.nextDayButton;
        MaterialButton materialButton = (MaterialButton) nt3.b(R.id.nextDayButton, view);
        if (materialButton != null) {
            i = R.id.placeholder;
            PlaceHolder placeHolder = (PlaceHolder) nt3.b(R.id.placeholder, view);
            if (placeHolder != null) {
                i = R.id.prevDayButton;
                MaterialButton materialButton2 = (MaterialButton) nt3.b(R.id.prevDayButton, view);
                if (materialButton2 != null) {
                    i = R.id.progress;
                    SimpleProgressBar simpleProgressBar = (SimpleProgressBar) nt3.b(R.id.progress, view);
                    if (simpleProgressBar != null) {
                        i = R.id.rescheduleButton;
                        MaterialButton materialButton3 = (MaterialButton) nt3.b(R.id.rescheduleButton, view);
                        if (materialButton3 != null) {
                            i = R.id.sessionsList;
                            RecyclerView recyclerView = (RecyclerView) nt3.b(R.id.sessionsList, view);
                            if (recyclerView != null) {
                                i = R.id.toolbar;
                                MaterialToolbar materialToolbar = (MaterialToolbar) nt3.b(R.id.toolbar, view);
                                if (materialToolbar != null) {
                                    return new uf4((RelativeLayout) view, materialButton, placeHolder, materialButton2, simpleProgressBar, materialButton3, recyclerView, materialToolbar);
                                }
                            }
                        }
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static uf4 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_sessions, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static uf4 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
