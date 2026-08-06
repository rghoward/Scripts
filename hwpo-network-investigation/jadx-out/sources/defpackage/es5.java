package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class es5 implements wfb {
    public final ProgressBar a;

    public es5(ProgressBar progressBar) {
        this.a = progressBar;
    }

    public static es5 bind(View view) {
        if (view != null) {
            return new es5((ProgressBar) view);
        }
        ac4.c("rootView");
        return null;
    }

    public static es5 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_pagination_progress, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static es5 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
