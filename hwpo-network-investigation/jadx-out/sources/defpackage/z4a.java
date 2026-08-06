package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public interface z4a {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a {
        public static final C0290a a = new C0290a();

        /* JADX INFO: renamed from: z4a$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class C0290a implements a {
            @Override // z4a.a
            public final boolean f(id4 id4Var) {
                return false;
            }

            @Override // z4a.a
            public final z4a g(id4 id4Var) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }

            @Override // z4a.a
            public final int h(id4 id4Var) {
                return 1;
            }
        }

        boolean f(id4 id4Var);

        z4a g(id4 id4Var);

        int h(id4 id4Var);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b {
        public static final b c = new b(-9223372036854775807L, false);
        public final long a;
        public final boolean b;

        public b(long j, boolean z) {
            this.a = j;
            this.b = z;
        }
    }

    default r4a a(byte[] bArr, int i, int i2) {
        k95.b bVar = k95.u;
        final k95.a aVar = new k95.a();
        b(bArr, 0, i2, b.c, new ry1() { // from class: y4a
            @Override // defpackage.ry1
            public final void accept(Object obj) {
                aVar.c((mc2) obj);
            }
        });
        return new oc2(aVar.g());
    }

    void b(byte[] bArr, int i, int i2, b bVar, ry1<mc2> ry1Var);

    default void reset() {
    }
}
