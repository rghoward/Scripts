package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class su9 extends n0a implements g27, uu9<Integer> {
    public a u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends o0a {
        public int c;

        public a(int i, long j) {
            super(j);
            this.c = i;
        }

        @Override // defpackage.o0a
        public final void a(o0a o0aVar) {
            o0aVar.getClass();
            this.c = ((a) o0aVar).c;
        }

        @Override // defpackage.o0a
        public final o0a b() {
            return c(qu9.j().g());
        }

        @Override // defpackage.o0a
        public final o0a c(long j) {
            return new a(this.c, j);
        }
    }

    @Override // defpackage.uu9
    public final wu9<Integer> a() {
        return d3a.u;
    }

    @Override // defpackage.m0a
    public final o0a d() {
        return this.u;
    }

    @Override // defpackage.m0a
    public final o0a f(o0a o0aVar, o0a o0aVar2, o0a o0aVar3) {
        if (((a) o0aVar2).c == ((a) o0aVar3).c) {
            return o0aVar2;
        }
        return null;
    }

    @Override // defpackage.g27
    public final void j(int i) {
        hu9 hu9VarJ;
        a aVar = (a) qu9.h(this.u);
        if (aVar.c != i) {
            a aVar2 = this.u;
            synchronized (qu9.c) {
                hu9VarJ = qu9.j();
                ((a) qu9.o(aVar2, this, hu9VarJ, aVar)).c = i;
                g2b g2bVar = g2b.a;
            }
            qu9.n(hu9VarJ, this);
        }
    }

    @Override // defpackage.g27
    public final int k() {
        return ((a) qu9.t(this.u, this)).c;
    }

    @Override // defpackage.m0a
    public final void q(o0a o0aVar) {
        o0aVar.getClass();
        this.u = (a) o0aVar;
    }

    public final String toString() {
        return "MutableIntState(value=" + ((a) qu9.h(this.u)).c + ")@" + hashCode();
    }
}
