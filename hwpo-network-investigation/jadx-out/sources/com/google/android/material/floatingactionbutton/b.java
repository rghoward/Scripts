package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {
    public boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ d.InterfaceC0054d c;
    public final /* synthetic */ d d;

    public b(d dVar, boolean z, a aVar) {
        this.d = dVar;
        this.b = z;
        this.c = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        d dVar = this.d;
        dVar.r = 0;
        dVar.m = null;
        if (this.a) {
            return;
        }
        FloatingActionButton floatingActionButton = dVar.v;
        boolean z = this.b;
        floatingActionButton.b(z ? 8 : 4, z);
        d.InterfaceC0054d interfaceC0054d = this.c;
        if (interfaceC0054d != null) {
            a aVar = (a) interfaceC0054d;
            aVar.a.a(aVar.b);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        d dVar = this.d;
        dVar.v.b(0, this.b);
        dVar.r = 1;
        dVar.m = animator;
        this.a = false;
    }
}
