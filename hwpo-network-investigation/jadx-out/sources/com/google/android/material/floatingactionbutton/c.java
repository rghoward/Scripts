package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ d.InterfaceC0054d b;
    public final /* synthetic */ d c;

    public c(d dVar, boolean z, a aVar) {
        this.c = dVar;
        this.a = z;
        this.b = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        d dVar = this.c;
        dVar.r = 0;
        dVar.m = null;
        d.InterfaceC0054d interfaceC0054d = this.b;
        if (interfaceC0054d != null) {
            ((a) interfaceC0054d).a.b();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        d dVar = this.c;
        dVar.v.b(0, this.a);
        dVar.r = 2;
        dVar.m = animator;
    }
}
