package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.AspectRatioCardView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ia6 implements wfb {
    public final AspectRatioCardView a;
    public final AppCompatImageView b;
    public final AppCompatImageView c;

    public ia6(AspectRatioCardView aspectRatioCardView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        this.a = aspectRatioCardView;
        this.b = appCompatImageView;
        this.c = appCompatImageView2;
    }

    public static ia6 bind(View view) {
        int i = R.id.isVideoImage;
        AppCompatImageView appCompatImageView = (AppCompatImageView) nt3.b(R.id.isVideoImage, view);
        if (appCompatImageView != null) {
            i = R.id.thumbnailImage;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) nt3.b(R.id.thumbnailImage, view);
            if (appCompatImageView2 != null) {
                return new ia6((AspectRatioCardView) view, appCompatImageView, appCompatImageView2);
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static ia6 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_performance_media_attachment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static ia6 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
