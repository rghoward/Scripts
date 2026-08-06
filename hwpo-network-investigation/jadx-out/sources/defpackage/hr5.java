package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.AspectRatioCardView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hr5 implements wfb {
    public final AspectRatioCardView a;
    public final AppCompatImageView b;
    public final View c;
    public final ImageView d;
    public final ImageView e;

    public hr5(AspectRatioCardView aspectRatioCardView, AppCompatImageView appCompatImageView, View view, ImageView imageView, ImageView imageView2) {
        this.a = aspectRatioCardView;
        this.b = appCompatImageView;
        this.c = view;
        this.d = imageView;
        this.e = imageView2;
    }

    public static hr5 bind(View view) {
        int i = R.id.mediaPreviewImage;
        AppCompatImageView appCompatImageView = (AppCompatImageView) nt3.b(R.id.mediaPreviewImage, view);
        if (appCompatImageView != null) {
            i = R.id.selectedBg;
            View viewB = nt3.b(R.id.selectedBg, view);
            if (viewB != null) {
                i = R.id.selectedImage;
                ImageView imageView = (ImageView) nt3.b(R.id.selectedImage, view);
                if (imageView != null) {
                    i = R.id.videoBadgeIcon;
                    ImageView imageView2 = (ImageView) nt3.b(R.id.videoBadgeIcon, view);
                    if (imageView2 != null) {
                        return new hr5((AspectRatioCardView) view, appCompatImageView, viewB, imageView, imageView2);
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static hr5 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_media_file_preview, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static hr5 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
