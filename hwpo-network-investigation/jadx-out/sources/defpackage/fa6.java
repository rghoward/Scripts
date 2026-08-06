package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.AspectRatioCardView;
import com.hwpo_training_app.core.widget.AspectRatioFrameLayout;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fa6 implements wfb {
    public final AspectRatioFrameLayout a;
    public final AppCompatImageView b;
    public final AppCompatImageView c;
    public final AppCompatImageView d;
    public final AppCompatImageView e;

    public fa6(AspectRatioFrameLayout aspectRatioFrameLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4) {
        this.a = aspectRatioFrameLayout;
        this.b = appCompatImageView;
        this.c = appCompatImageView2;
        this.d = appCompatImageView3;
        this.e = appCompatImageView4;
    }

    public static fa6 bind(View view) {
        int i = R.id.attachmentActionImg;
        AppCompatImageView appCompatImageView = (AppCompatImageView) nt3.b(R.id.attachmentActionImg, view);
        if (appCompatImageView != null) {
            i = R.id.isVideoImage;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) nt3.b(R.id.isVideoImage, view);
            if (appCompatImageView2 != null) {
                i = R.id.mediaAttachmentItem;
                if (((AspectRatioCardView) nt3.b(R.id.mediaAttachmentItem, view)) != null) {
                    i = R.id.thumbnailImage;
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) nt3.b(R.id.thumbnailImage, view);
                    if (appCompatImageView3 != null) {
                        i = R.id.uploadingActionImage;
                        AppCompatImageView appCompatImageView4 = (AppCompatImageView) nt3.b(R.id.uploadingActionImage, view);
                        if (appCompatImageView4 != null) {
                            return new fa6((AspectRatioFrameLayout) view, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4);
                        }
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static fa6 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_message_media_attachment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static fa6 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
