package com.hwpo_training_app.core.widget.layout_manager;

import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class SquareRatioLayoutManager extends LinearLayoutManager {
    public final double E;

    public SquareRatioLayoutManager(Context context) {
        super(context, 0, false);
        this.E = 0.2d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public final boolean g(RecyclerView.p pVar) {
        if (pVar == null) {
            return false;
        }
        int i = (int) (((double) this.n) * this.E);
        ((ViewGroup.MarginLayoutParams) pVar).width = i;
        ((ViewGroup.MarginLayoutParams) pVar).height = i;
        return true;
    }
}
