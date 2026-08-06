package defpackage;

import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pnb implements onb {
    public final ux2 b;

    public pnb() {
        this.b = Build.VERSION.SDK_INT >= 34 ? vx2.t : wx2.t;
        ws0.c(1, 2, 4, 8, 16, 32, 64, 128);
    }

    @Override // defpackage.onb
    public final nnb a(Context context) {
        qnb qnbVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            qnbVar = snb.a;
        } else {
            qnbVar = i >= 30 ? rnb.a : tnb.a;
        }
        return qnbVar.a(context, this.b);
    }
}
