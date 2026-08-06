package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s9a<A, ResultT> {
    public final fu3[] a;
    public final boolean b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a<A, ResultT> {
        public om8 a;
        public boolean b;
        public fu3[] c;

        public final mvb a() {
            a78.a("execute parameter required", this.a != null);
            return new mvb(this, this.c, this.b);
        }
    }

    public s9a(fu3[] fu3VarArr, boolean z) {
        this.a = fu3VarArr;
        boolean z2 = false;
        if (fu3VarArr != null && z) {
            z2 = true;
        }
        this.b = z2;
    }

    public static <A, ResultT> a<A, ResultT> a() {
        a<A, ResultT> aVar = new a<>();
        aVar.b = true;
        return aVar;
    }
}
