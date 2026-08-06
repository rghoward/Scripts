package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public class vu9<T> extends n0a implements uu9<T> {
    public final wu9<T> u;
    public a<T> v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> extends o0a {
        public T c;

        public a(long j, T t) {
            super(j);
            this.c = t;
        }

        @Override // defpackage.o0a
        public final void a(o0a o0aVar) {
            o0aVar.getClass();
            this.c = ((a) o0aVar).c;
        }

        @Override // defpackage.o0a
        public final o0a b() {
            return new a(qu9.j().g(), this.c);
        }

        @Override // defpackage.o0a
        public final o0a c(long j) {
            return new a(qu9.j().g(), this.c);
        }
    }

    public vu9(T t, wu9<T> wu9Var) {
        this.u = wu9Var;
        hu9 hu9VarJ = qu9.j();
        a<T> aVar = new a<>(hu9VarJ.g(), t);
        if (!(hu9VarJ instanceof fn4)) {
            aVar.b = new a(1L, t);
        }
        this.v = aVar;
    }

    @Override // defpackage.uu9
    public final wu9<T> a() {
        return this.u;
    }

    @Override // defpackage.m0a
    public final o0a d() {
        return this.v;
    }

    @Override // defpackage.m0a
    public final o0a f(o0a o0aVar, o0a o0aVar2, o0a o0aVar3) {
        if (this.u.b(((a) o0aVar2).c, ((a) o0aVar3).c)) {
            return o0aVar2;
        }
        return null;
    }

    @Override // defpackage.yz9
    public final T getValue() {
        return ((a) qu9.t(this.v, this)).c;
    }

    @Override // defpackage.m0a
    public final void q(o0a o0aVar) {
        o0aVar.getClass();
        this.v = (a) o0aVar;
    }

    @Override // defpackage.h37
    public final void setValue(T t) {
        hu9 hu9VarJ;
        a aVar = (a) qu9.h(this.v);
        if (this.u.b(aVar.c, t)) {
            return;
        }
        a<T> aVar2 = this.v;
        synchronized (qu9.c) {
            hu9VarJ = qu9.j();
            ((a) qu9.o(aVar2, this, hu9VarJ, aVar)).c = t;
            g2b g2bVar = g2b.a;
        }
        qu9.n(hu9VarJ, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((a) qu9.h(this.v)).c + ")@" + hashCode();
    }
}
