package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class boc extends v8c {
    public final /* synthetic */ hrc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public boc(hrc hrcVar, enc encVar) {
        super(encVar);
        Objects.requireNonNull(hrcVar);
        this.e = hrcVar;
    }

    @Override // defpackage.v8c
    public final void a() {
        final hrc hrcVar = this.e.a.m;
        tkc.l(hrcVar);
        new Thread(new Runnable() { // from class: znc
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                hrcVar.D();
            }
        }).start();
    }
}
