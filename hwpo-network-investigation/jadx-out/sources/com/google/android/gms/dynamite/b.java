package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements DynamiteModule.b {
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0049b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0049b c0049b = new DynamiteModule.b.C0049b();
        int iB = aVar.b(context, str);
        c0049b.a = iB;
        if (iB != 0) {
            c0049b.c = -1;
            return c0049b;
        }
        int iA = aVar.a(context, str, true);
        c0049b.b = iA;
        if (iA != 0) {
            c0049b.c = 1;
        }
        return c0049b;
    }
}
