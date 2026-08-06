package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yq6<T> extends k27<T> {
    public final pz8<kb6<?>, a<?>> k;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a<V> implements qf7<V> {
        public final kb6<V> t;
        public final jva u;
        public int v = -1;

        public a(kb6 kb6Var, jva jvaVar) {
            this.t = kb6Var;
            this.u = jvaVar;
        }

        @Override // defpackage.qf7
        public final void a(V v) {
            int i = this.v;
            int i2 = this.t.g;
            if (i != i2) {
                this.v = i2;
                this.u.a(v);
            }
        }

        public final void b() {
            this.t.f(this);
        }
    }

    public yq6(T t) {
        super(t);
        this.k = new pz8<>();
    }

    @Override // defpackage.kb6
    public final void g() {
        Iterator<Map.Entry<kb6<?>, a<?>>> it = this.k.iterator();
        while (true) {
            pz8.e eVar = (pz8.e) it;
            if (!eVar.hasNext()) {
                return;
            } else {
                ((a) ((Map.Entry) eVar.next()).getValue()).b();
            }
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.kb6
    public final void h() {
        Iterator<Map.Entry<kb6<?>, a<?>>> it = this.k.iterator();
        while (true) {
            pz8.e eVar = (pz8.e) it;
            if (!eVar.hasNext()) {
                return;
            }
            a aVar = (a) ((Map.Entry) eVar.next()).getValue();
            aVar.t.i(aVar);
        }
    }

    public final void k(kb6 kb6Var, jva jvaVar) {
        a<?> aVar;
        if (kb6Var == null) {
            ac4.c("source cannot be null");
            return;
        }
        a aVar2 = new a(kb6Var, jvaVar);
        pz8<kb6<?>, a<?>> pz8Var = this.k;
        pz8.c<kb6<?>, a<?>> cVarD = pz8Var.d(kb6Var);
        if (cVarD != null) {
            aVar = cVarD.u;
        } else {
            pz8.c<K, V> cVar = new pz8.c<>(kb6Var, aVar2);
            pz8Var.w++;
            pz8.c cVar2 = pz8Var.u;
            if (cVar2 == null) {
                pz8Var.t = cVar;
                pz8Var.u = cVar;
            } else {
                cVar2.v = cVar;
                cVar.w = cVar2;
                pz8Var.u = cVar;
            }
            aVar = null;
        }
        a<?> aVar3 = aVar;
        if (aVar3 != null && aVar3.u != jvaVar) {
            z90.a("This source was already added with the different observer");
        } else if (aVar3 == null && this.c > 0) {
            aVar2.b();
        }
    }

    public yq6() {
        this.k = new pz8<>();
    }
}
