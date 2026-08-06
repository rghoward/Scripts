package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nlc implements Callable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ zmc d;

    public nlc(zmc zmcVar, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = zmcVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        zmc zmcVar = this.d;
        zmcVar.b.W();
        p8c p8cVar = zmcVar.b.c;
        lzc.U(p8cVar);
        return p8cVar.i0(this.a, this.b, this.c);
    }
}
