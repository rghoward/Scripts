package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class x96 implements wfb {
    public final FrameLayout a;
    public final MaterialRadioButton b;

    public x96(FrameLayout frameLayout, MaterialRadioButton materialRadioButton) {
        this.a = frameLayout;
        this.b = materialRadioButton;
    }

    public static x96 bind(View view) {
        MaterialRadioButton materialRadioButton = (MaterialRadioButton) nt3.b(R.id.name, view);
        if (materialRadioButton != null) {
            return new x96((FrameLayout) view, materialRadioButton);
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.name)));
        return null;
    }

    public static x96 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_gym_filter_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static x96 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
