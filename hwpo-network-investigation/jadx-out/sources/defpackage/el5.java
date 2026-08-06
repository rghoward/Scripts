package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public interface el5 extends h72.a {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a implements h72.b<el5> {
        public static final /* synthetic */ a t = new a();
    }

    e33 E(boolean z, boolean z2, jl5 jl5Var);

    CancellationException H();

    boolean h();

    boolean isCancelled();

    e33 j0(oh4<? super Throwable, g2b> oh4Var);

    void k(CancellationException cancellationException);

    Object p0(u02 u02Var);

    boolean start();

    ac1 y(ll5 ll5Var);
}
