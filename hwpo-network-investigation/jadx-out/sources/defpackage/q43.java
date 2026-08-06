package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class q43 {
    public static final e a;
    public static final c b;
    public static final d c;
    public static final f d;
    public static final d e;
    public static final mk7<q43> f;
    public static final boolean g;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class a extends q43 {
        @Override // defpackage.q43
        public final g a(int i, int i2, int i3, int i4) {
            return g.u;
        }

        @Override // defpackage.q43
        public final float b(int i, int i2, int i3, int i4) {
            int iMin = Math.min(i2 / i4, i / i3);
            if (iMin == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMin);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class b extends q43 {
        @Override // defpackage.q43
        public final g a(int i, int i2, int i3, int i4) {
            return g.t;
        }

        @Override // defpackage.q43
        public final float b(int i, int i2, int i3, int i4) {
            int iCeil = (int) Math.ceil(Math.max(i2 / i4, i / i3));
            int iMax = Math.max(1, Integer.highestOneBit(iCeil));
            return 1.0f / (iMax << (iMax >= iCeil ? 0 : 1));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class c extends q43 {
        @Override // defpackage.q43
        public final g a(int i, int i2, int i3, int i4) {
            return b(i, i2, i3, i4) == 1.0f ? g.u : q43.a.a(i, i2, i3, i4);
        }

        @Override // defpackage.q43
        public final float b(int i, int i2, int i3, int i4) {
            return Math.min(1.0f, q43.a.b(i, i2, i3, i4));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class d extends q43 {
        @Override // defpackage.q43
        public final g a(int i, int i2, int i3, int i4) {
            return g.u;
        }

        @Override // defpackage.q43
        public final float b(int i, int i2, int i3, int i4) {
            return Math.max(i3 / i, i4 / i2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class e extends q43 {
        @Override // defpackage.q43
        public final g a(int i, int i2, int i3, int i4) {
            return q43.g ? g.u : g.t;
        }

        @Override // defpackage.q43
        public final float b(int i, int i2, int i3, int i4) {
            if (q43.g) {
                return Math.min(i3 / i, i4 / i2);
            }
            int iMax = Math.max(i2 / i4, i / i3);
            if (iMax == 0) {
                return 1.0f;
            }
            return 1.0f / Integer.highestOneBit(iMax);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static class f extends q43 {
        @Override // defpackage.q43
        public final g a(int i, int i2, int i3, int i4) {
            return g.u;
        }

        @Override // defpackage.q43
        public final float b(int i, int i2, int i3, int i4) {
            return 1.0f;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class g {
        public static final g t;
        public static final g u;
        public static final /* synthetic */ g[] v;

        static {
            g gVar = new g("MEMORY", 0);
            t = gVar;
            g gVar2 = new g("QUALITY", 1);
            u = gVar2;
            v = new g[]{gVar, gVar2};
        }

        public g() {
            throw null;
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) v.clone();
        }
    }

    static {
        new a();
        new b();
        a = new e();
        b = new c();
        d dVar = new d();
        c = dVar;
        d = new f();
        e = dVar;
        f = mk7.a(dVar, "com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy");
        g = true;
    }

    public abstract g a(int i, int i2, int i3, int i4);

    public abstract float b(int i, int i2, int i3, int i4);
}
