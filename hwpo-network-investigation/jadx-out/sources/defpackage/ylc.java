package defpackage;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ylc implements Callable {
    public final /* synthetic */ zmc a;

    public ylc(zmc zmcVar, z9c z9cVar, String str) {
        this.a = zmcVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        zmc zmcVar = this.a;
        zmcVar.b.W();
        urc urcVar = zmcVar.b.h;
        lzc.U(urcVar);
        urcVar.g();
        throw new IllegalStateException("Unexpected call on client side");
    }
}
