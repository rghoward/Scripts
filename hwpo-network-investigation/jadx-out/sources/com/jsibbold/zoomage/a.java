package com.jsibbold.zoomage;

import android.animation.Animator;
import android.graphics.Matrix;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends ZoomageView.c {
    public final /* synthetic */ Matrix a;
    public final /* synthetic */ ZoomageView b;

    public a(ZoomageView zoomageView, Matrix matrix) {
        this.b = zoomageView;
        this.a = matrix;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.setImageMatrix(this.a);
    }
}
