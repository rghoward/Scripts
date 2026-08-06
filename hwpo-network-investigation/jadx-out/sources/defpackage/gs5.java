package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gs5 implements wfb {
    public final View a;
    public final RecyclerView b;
    public final RecyclerView c;
    public final MaterialTextView d;
    public final MaterialTextView e;
    public final LinearLayoutCompat f;
    public final LinearLayoutCompat g;
    public final MaterialTextView h;

    public gs5(View view, RecyclerView recyclerView, RecyclerView recyclerView2, MaterialTextView materialTextView, MaterialTextView materialTextView2, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, MaterialTextView materialTextView3) {
        this.a = view;
        this.b = recyclerView;
        this.c = recyclerView2;
        this.d = materialTextView;
        this.e = materialTextView2;
        this.f = linearLayoutCompat;
        this.g = linearLayoutCompat2;
        this.h = materialTextView3;
    }

    public static gs5 bind(View view) {
        int i = R.id.fileAttachmentsList;
        RecyclerView recyclerView = (RecyclerView) nt3.b(R.id.fileAttachmentsList, view);
        if (recyclerView != null) {
            i = R.id.mediaAttachmentsList;
            RecyclerView recyclerView2 = (RecyclerView) nt3.b(R.id.mediaAttachmentsList, view);
            if (recyclerView2 != null) {
                i = R.id.myResultText;
                MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.myResultText, view);
                if (materialTextView != null) {
                    i = R.id.performanceText;
                    MaterialTextView materialTextView2 = (MaterialTextView) nt3.b(R.id.performanceText, view);
                    if (materialTextView2 != null) {
                        i = R.id.scoreDescriptionLayout;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) nt3.b(R.id.scoreDescriptionLayout, view);
                        if (linearLayoutCompat != null) {
                            i = R.id.scoreValueLayout;
                            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) nt3.b(R.id.scoreValueLayout, view);
                            if (linearLayoutCompat2 != null) {
                                i = R.id.scoringDetailsTitle;
                                MaterialTextView materialTextView3 = (MaterialTextView) nt3.b(R.id.scoringDetailsTitle, view);
                                if (materialTextView3 != null) {
                                    return new gs5(view, recyclerView, recyclerView2, materialTextView, materialTextView2, linearLayoutCompat, linearLayoutCompat2, materialTextView3);
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

    public static gs5 inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.layout_performance_view, viewGroup);
            return bind(viewGroup);
        }
        ac4.c("parent");
        return null;
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }
}
