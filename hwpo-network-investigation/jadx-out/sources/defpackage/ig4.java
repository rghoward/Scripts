package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Space;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ig4 implements wfb {
    public final LinearLayout a;
    public final ImageView b;
    public final ShapeableImageView c;
    public final MaterialTextView d;
    public final Group e;
    public final Space f;
    public final MaterialToolbar g;

    public ig4(LinearLayout linearLayout, ImageView imageView, ShapeableImageView shapeableImageView, MaterialTextView materialTextView, Group group, Space space, MaterialToolbar materialToolbar) {
        this.a = linearLayout;
        this.b = imageView;
        this.c = shapeableImageView;
        this.d = materialTextView;
        this.e = group;
        this.f = space;
        this.g = materialToolbar;
    }

    public static ig4 bind(View view) {
        int i = R.id.attachmentPlayBtn;
        ImageView imageView = (ImageView) nt3.b(R.id.attachmentPlayBtn, view);
        if (imageView != null) {
            i = R.id.attachmentPreview;
            ShapeableImageView shapeableImageView = (ShapeableImageView) nt3.b(R.id.attachmentPreview, view);
            if (shapeableImageView != null) {
                i = R.id.descriptionGroup;
                if (((Group) nt3.b(R.id.descriptionGroup, view)) != null) {
                    i = R.id.descriptionText;
                    MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.descriptionText, view);
                    if (materialTextView != null) {
                        i = R.id.previewGroup;
                        Group group = (Group) nt3.b(R.id.previewGroup, view);
                        if (group != null) {
                            i = R.id.scrollContainer;
                            if (((ScrollView) nt3.b(R.id.scrollContainer, view)) != null) {
                                i = R.id.space;
                                Space space = (Space) nt3.b(R.id.space, view);
                                if (space != null) {
                                    i = R.id.toolbar;
                                    MaterialToolbar materialToolbar = (MaterialToolbar) nt3.b(R.id.toolbar, view);
                                    if (materialToolbar != null) {
                                        return new ig4((LinearLayout) view, imageView, shapeableImageView, materialTextView, group, space, materialToolbar);
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

    public static ig4 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_today_tip_details, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static ig4 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
