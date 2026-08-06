package defpackage;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vkc implements Callable {
    public final /* synthetic */ String a;
    public final /* synthetic */ zmc b;

    public vkc(zmc zmcVar, String str) {
        this.a = str;
        Objects.requireNonNull(zmcVar);
        this.b = zmcVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        zmc zmcVar = this.b;
        zmcVar.b.W();
        p8c p8cVar = zmcVar.b.c;
        lzc.U(p8cVar);
        return p8cVar.d0(this.a);
    }
}
