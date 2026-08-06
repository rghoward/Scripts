package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class sh6<K, V> {
    public final a<K, V> a;
    public final V b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a<K, V> {
        public final gob a;
        public final gob b;
        public final V c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(gob gobVar, gob gobVar2, Object obj) {
            this.a = gobVar;
            this.b = gobVar2;
            this.c = obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public sh6(gob gobVar, gob gobVar2, Object obj) {
        this.a = new a<>(gobVar, gobVar2, obj);
        this.b = obj;
    }

    public static <K, V> int a(a<K, V> aVar, K k, V v) {
        return tu3.b(aVar.b, 2, v) + tu3.b(aVar.a, 1, k);
    }
}
