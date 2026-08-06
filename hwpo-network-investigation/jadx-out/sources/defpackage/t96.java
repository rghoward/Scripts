package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.AspectRatioFrameLayout;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class t96 implements wfb {
    public final AspectRatioFrameLayout a;
    public final AppCompatImageView b;
    public final MaterialTextView c;
    public final MaterialTextView d;
    public final MaterialTextView e;
    public final AppCompatImageView f;
    public final FrameLayout g;

    public t96(AspectRatioFrameLayout aspectRatioFrameLayout, AppCompatImageView appCompatImageView, MaterialTextView materialTextView, MaterialTextView materialTextView2, MaterialTextView materialTextView3, AppCompatImageView appCompatImageView2, FrameLayout frameLayout) {
        this.a = aspectRatioFrameLayout;
        this.b = appCompatImageView;
        this.c = materialTextView;
        this.d = materialTextView2;
        this.e = materialTextView3;
        this.f = appCompatImageView2;
        this.g = frameLayout;
    }

    public static t96 bind(View view) {
        int i = R.id.attachmentActionImg;
        AppCompatImageView appCompatImageView = (AppCompatImageView) nt3.b(R.id.attachmentActionImg, view);
        if (appCompatImageView != null) {
            i = R.id.attachmentImg;
            if (((AppCompatImageView) nt3.b(R.id.attachmentImg, view)) != null) {
                i = R.id.extensionText;
                MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.extensionText, view);
                if (materialTextView != null) {
                    i = R.id.mediaAttachmentItem;
                    if (((MaterialCardView) nt3.b(R.id.mediaAttachmentItem, view)) != null) {
                        i = R.id.nameText;
                        MaterialTextView materialTextView2 = (MaterialTextView) nt3.b(R.id.nameText, view);
                        if (materialTextView2 != null) {
                            i = R.id.sizeText;
                            MaterialTextView materialTextView3 = (MaterialTextView) nt3.b(R.id.sizeText, view);
                            if (materialTextView3 != null) {
                                i = R.id.uploadingActionImage;
                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) nt3.b(R.id.uploadingActionImage, view);
                                if (appCompatImageView2 != null) {
                                    i = R.id.uploadingActionLayout;
                                    FrameLayout frameLayout = (FrameLayout) nt3.b(R.id.uploadingActionLayout, view);
                                    if (frameLayout != null) {
                                        return new t96((AspectRatioFrameLayout) view, appCompatImageView, materialTextView, materialTextView2, materialTextView3, appCompatImageView2, frameLayout);
                                    }
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

    public static t96 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_edit_performance_file_attachment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static t96 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
