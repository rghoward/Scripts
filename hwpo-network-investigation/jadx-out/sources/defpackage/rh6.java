package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rh6<K, V> {
    public final a<K, V> a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a<K, V> {
        public final fob a;
        public final fob b;
        public final V c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(fob fobVar, fob fobVar2, Object obj) {
            this.a = fobVar;
            this.b = fobVar2;
            this.c = obj;
        }
    }

    public rh6(fob fobVar, fob fobVar2, y78 y78Var) {
        this.a = new a<>(fobVar, fobVar2, y78Var);
    }

    public static <K, V> int a(a<K, V> aVar, K k, V v) {
        return su3.b(aVar.b, 2, v) + su3.b(aVar.a, 1, k);
    }

    public static <K, V> void b(sg1 sg1Var, a<K, V> aVar, K k, V v) {
        su3.k(sg1Var, aVar.a, 1, k);
        su3.k(sg1Var, aVar.b, 2, v);
    }
}
