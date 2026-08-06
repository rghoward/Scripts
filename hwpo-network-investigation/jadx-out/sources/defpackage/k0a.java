package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class k0a<T> extends o0a {
    public j2 c;
    public int d;
    public int e;

    public k0a(long j, j2 j2Var) {
        super(j);
        this.c = j2Var;
    }

    @Override // defpackage.o0a
    public final void a(o0a o0aVar) {
        synchronized (gv9.a) {
            o0aVar.getClass();
            this.c = ((k0a) o0aVar).c;
            this.d = ((k0a) o0aVar).d;
            this.e = ((k0a) o0aVar).e;
            g2b g2bVar = g2b.a;
        }
    }

    @Override // defpackage.o0a
    public final o0a b() {
        return c(qu9.j().g());
    }

    @Override // defpackage.o0a
    public final o0a c(long j) {
        return new k0a(j, this.c);
    }
}
