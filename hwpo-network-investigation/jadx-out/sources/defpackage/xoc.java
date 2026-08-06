package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class xoc implements Runnable {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ hrc B;
    public final /* synthetic */ String t;
    public final /* synthetic */ String u;
    public final /* synthetic */ long v;
    public final /* synthetic */ long w;
    public final /* synthetic */ Bundle x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ boolean z;

    public xoc(hrc hrcVar, String str, String str2, long j, long j2, Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.t = str;
        this.u = str2;
        this.v = j;
        this.w = j2;
        this.x = bundle;
        this.y = z;
        this.z = z2;
        this.A = z3;
        this.B = hrcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.B.p(this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A);
    }
}
