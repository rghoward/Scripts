package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ea6 implements wfb {
    public final FrameLayout a;
    public final AppCompatImageView b;
    public final AppCompatImageView c;
    public final MaterialTextView d;
    public final MaterialTextView e;
    public final AppCompatImageView f;
    public final Group g;
    public final ImageButton h;
    public final View i;
    public final MaterialTextView j;

    public ea6(FrameLayout frameLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, MaterialTextView materialTextView, MaterialTextView materialTextView2, AppCompatImageView appCompatImageView3, Group group, ImageButton imageButton, View view, MaterialTextView materialTextView3) {
        this.a = frameLayout;
        this.b = appCompatImageView;
        this.c = appCompatImageView2;
        this.d = materialTextView;
        this.e = materialTextView2;
        this.f = appCompatImageView3;
        this.g = group;
        this.h = imageButton;
        this.i = view;
        this.j = materialTextView3;
    }

    public static ea6 bind(View view) {
        int i = R.id.attachmentImg;
        AppCompatImageView appCompatImageView = (AppCompatImageView) nt3.b(R.id.attachmentImg, view);
        if (appCompatImageView != null) {
            i = R.id.downloadingActionImage;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) nt3.b(R.id.downloadingActionImage, view);
            if (appCompatImageView2 != null) {
                i = R.id.extensionText;
                MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.extensionText, view);
                if (materialTextView != null) {
                    i = R.id.nameText;
                    MaterialTextView materialTextView2 = (MaterialTextView) nt3.b(R.id.nameText, view);
                    if (materialTextView2 != null) {
                        i = R.id.sendingActionImage;
                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) nt3.b(R.id.sendingActionImage, view);
                        if (appCompatImageView3 != null) {
                            i = R.id.sendingPlaceholder;
                            Group group = (Group) nt3.b(R.id.sendingPlaceholder, view);
                            if (group != null) {
                                i = R.id.sendingPlaceholderActionButton;
                                ImageButton imageButton = (ImageButton) nt3.b(R.id.sendingPlaceholderActionButton, view);
                                if (imageButton != null) {
                                    i = R.id.sendingPlaceholderFadeout;
                                    View viewB = nt3.b(R.id.sendingPlaceholderFadeout, view);
                                    if (viewB != null) {
                                        i = R.id.sizeText;
                                        MaterialTextView materialTextView3 = (MaterialTextView) nt3.b(R.id.sizeText, view);
                                        if (materialTextView3 != null) {
                                            return new ea6((FrameLayout) view, appCompatImageView, appCompatImageView2, materialTextView, materialTextView2, appCompatImageView3, group, imageButton, viewB, materialTextView3);
                                        }
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

    public static ea6 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.list_item_message_file_attachment, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static ea6 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
