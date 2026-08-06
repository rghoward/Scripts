package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class pa8 implements oh4<Throwable, g2b> {
    public final /* synthetic */ e41 t;

    public pa8(e41 e41Var) {
        this.t = e41Var;
    }

    @Override // defpackage.oh4
    public final g2b invoke(Throwable th) {
        g2b g2bVar = g2b.a;
        this.t.resumeWith(g2bVar);
        return g2bVar;
    }
}
