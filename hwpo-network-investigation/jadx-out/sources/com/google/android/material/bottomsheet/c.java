package com.google.android.material.bottomsheet;

import android.app.Dialog;
import defpackage.sz;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class c extends sz {
    @Override // androidx.fragment.app.e
    public void i() {
        Dialog dialog = this.E;
        if (dialog instanceof b) {
            b bVar = (b) dialog;
            if (bVar.z == null) {
                bVar.f();
            }
            boolean z = bVar.z.c0;
        }
        k(false, false);
    }

    @Override // androidx.fragment.app.e
    public final void j() {
        Dialog dialog = this.E;
        if (dialog instanceof b) {
            b bVar = (b) dialog;
            if (bVar.z == null) {
                bVar.f();
            }
            boolean z = bVar.z.c0;
        }
        super.j();
    }

    @Override // defpackage.sz, androidx.fragment.app.e
    public Dialog m() {
        return new b(getContext(), l());
    }
}
