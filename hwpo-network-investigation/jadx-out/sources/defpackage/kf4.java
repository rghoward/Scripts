package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.button.MaterialButton;
import com.hwpo_training_app.R;
import com.jsibbold.zoomage.ZoomageView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kf4 implements wfb {
    public final FrameLayout a;
    public final MaterialButton b;
    public final ZoomageView c;

    public kf4(FrameLayout frameLayout, MaterialButton materialButton, ZoomageView zoomageView) {
        this.a = frameLayout;
        this.b = materialButton;
        this.c = zoomageView;
    }

    public static kf4 bind(View view) {
        int i = R.id.closeBtn;
        MaterialButton materialButton = (MaterialButton) nt3.b(R.id.closeBtn, view);
        if (materialButton != null) {
            i = R.id.photoImage;
            ZoomageView zoomageView = (ZoomageView) nt3.b(R.id.photoImage, view);
            if (zoomageView != null) {
                return new kf4((FrameLayout) view, materialButton, zoomageView);
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static kf4 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_photo_preview, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static kf4 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
