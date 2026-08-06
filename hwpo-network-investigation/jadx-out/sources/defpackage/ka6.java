package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ka6 implements wfb {
    public final FrameLayout a;
    public final cib b;

    public ka6(FrameLayout frameLayout, cib cibVar) {
        this.a = frameLayout;
        this.b = cibVar;
    }

    public static ka6 bind(View view) {
        View viewB = nt3.b(R.id.programHeader, view);
        if (viewB != null) {
            return new ka6((FrameLayout) view, cib.bind(viewB));
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.programHeader)));
        return null;
    }

    public static ka6 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_program_header, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static ka6 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
