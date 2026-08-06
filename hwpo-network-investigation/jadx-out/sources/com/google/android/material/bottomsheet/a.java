package com.google.android.material.bottomsheet;

import android.view.View;
import android.widget.FrameLayout;
import defpackage.pg7;
import defpackage.umb;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements pg7 {
    public final /* synthetic */ b t;

    public a(b bVar) {
        this.t = bVar;
    }

    @Override // defpackage.pg7
    public final umb b(View view, umb umbVar) {
        b bVar = this.t;
        b.C0051b c0051b = bVar.G;
        if (c0051b != null) {
            bVar.z.t0.remove(c0051b);
        }
        b.C0051b c0051b2 = new b.C0051b(bVar.C, umbVar);
        bVar.G = c0051b2;
        c0051b2.e(bVar.getWindow());
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = bVar.z;
        b.C0051b c0051b3 = bVar.G;
        ArrayList<BottomSheetBehavior.d> arrayList = bottomSheetBehavior.t0;
        if (!arrayList.contains(c0051b3)) {
            arrayList.add(c0051b3);
        }
        return umbVar;
    }
}
