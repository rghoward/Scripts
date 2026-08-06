package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Placeholder;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import com.hwpo_training_app.core.widget.placeholder.PlaceHolder;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class re4 implements wfb {
    public final ConstraintLayout a;
    public final ImageView b;
    public final RecyclerView c;
    public final RecyclerView d;
    public final MaterialTextView e;
    public final PlaceHolder f;
    public final Placeholder g;
    public final MaterialToolbar h;

    public re4(ConstraintLayout constraintLayout, ImageView imageView, RecyclerView recyclerView, RecyclerView recyclerView2, MaterialTextView materialTextView, PlaceHolder placeHolder, Placeholder placeholder, MaterialToolbar materialToolbar) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = recyclerView;
        this.d = recyclerView2;
        this.e = materialTextView;
        this.f = placeHolder;
        this.g = placeholder;
        this.h = materialToolbar;
    }

    public static re4 bind(View view) {
        int i = R.id.buttonEditEntry;
        ImageView imageView = (ImageView) nt3.b(R.id.buttonEditEntry, view);
        if (imageView != null) {
            i = R.id.fileAttachmentsList;
            RecyclerView recyclerView = (RecyclerView) nt3.b(R.id.fileAttachmentsList, view);
            if (recyclerView != null) {
                i = R.id.mediaAttachmentsList;
                RecyclerView recyclerView2 = (RecyclerView) nt3.b(R.id.mediaAttachmentsList, view);
                if (recyclerView2 != null) {
                    i = R.id.note;
                    MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.note, view);
                    if (materialTextView != null) {
                        i = R.id.placeholder;
                        PlaceHolder placeHolder = (PlaceHolder) nt3.b(R.id.placeholder, view);
                        if (placeHolder != null) {
                            i = R.id.progress;
                            Placeholder placeholder = (Placeholder) nt3.b(R.id.progress, view);
                            if (placeholder != null) {
                                i = R.id.toolbar;
                                MaterialToolbar materialToolbar = (MaterialToolbar) nt3.b(R.id.toolbar, view);
                                if (materialToolbar != null) {
                                    return new re4((ConstraintLayout) view, imageView, recyclerView, recyclerView2, materialTextView, placeHolder, placeholder, materialToolbar);
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

    public static re4 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_entry_details, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static re4 inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
