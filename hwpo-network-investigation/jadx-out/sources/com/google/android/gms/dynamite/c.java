package com.google.android.gms.dynamite;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements DynamiteModule.b {
    /* JADX WARN: Code duplicated, block: B:7:0x001b A[DONT_INVERT, PHI: r3
      0x001b: PHI (r3v2 int) = (r3v1 int), (r3v3 int) binds: [B:3:0x0014, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    @Override // com.google.android.gms.dynamite.DynamiteModule.b
    public final DynamiteModule.b.C0049b a(Context context, String str, DynamiteModule.b.a aVar) {
        DynamiteModule.b.C0049b c0049b = new DynamiteModule.b.C0049b();
        c0049b.a = aVar.b(context, str);
        int i = 1;
        int iA = aVar.a(context, str, true);
        c0049b.b = iA;
        int i2 = c0049b.a;
        if (i2 == 0) {
            i2 = 0;
            if (iA == 0) {
                i = 0;
            } else if (i2 >= iA) {
                i = -1;
            }
        } else if (i2 >= iA) {
            i = -1;
        }
        c0049b.c = i;
        return c0049b;
    }
}
