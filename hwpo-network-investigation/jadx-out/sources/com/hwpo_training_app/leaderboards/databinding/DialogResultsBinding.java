package com.hwpo_training_app.leaderboards.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textview.MaterialTextView;
import com.hwpo_training_app.R;
import defpackage.ac4;
import defpackage.nt3;
import defpackage.wfb;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogResultsBinding implements wfb {
    public final ConstraintLayout a;
    public final ImageView b;
    public final View c;
    public final MaterialTextView d;
    public final RecyclerView e;

    public DialogResultsBinding(ConstraintLayout constraintLayout, ImageView imageView, View view, MaterialTextView materialTextView, RecyclerView recyclerView) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = view;
        this.d = materialTextView;
        this.e = recyclerView;
    }

    public static DialogResultsBinding bind(View view) {
        int i = R.id.btnClose;
        ImageView imageView = (ImageView) nt3.b(R.id.btnClose, view);
        if (imageView != null) {
            i = R.id.divider;
            View viewB = nt3.b(R.id.divider, view);
            if (viewB != null) {
                i = R.id.primaryResultText;
                MaterialTextView materialTextView = (MaterialTextView) nt3.b(R.id.primaryResultText, view);
                if (materialTextView != null) {
                    i = R.id.resultsRecycler;
                    RecyclerView recyclerView = (RecyclerView) nt3.b(R.id.resultsRecycler, view);
                    if (recyclerView != null) {
                        i = R.id.resultsText;
                        if (((MaterialTextView) nt3.b(R.id.resultsText, view)) != null) {
                            return new DialogResultsBinding((ConstraintLayout) view, imageView, viewB, materialTextView, recyclerView);
                        }
                    }
                }
            }
        }
        ac4.c("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    public static DialogResultsBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_results, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // defpackage.wfb
    public final View getRoot() {
        return this.a;
    }

    public static DialogResultsBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }
}
