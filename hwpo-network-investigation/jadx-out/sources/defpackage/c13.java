package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public class c13 {
    public static final b t;
    public static final c u;
    public static final a v;
    public static final c13 w;
    public static final /* synthetic */ c13[] x;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends c13 {
        public a() {
            super("INITIAL", 2);
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "less_or_eq";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends c13 {
        public b() {
            super("LESS", 0);
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "less";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends c13 {
        public c() {
            super("MORE", 1);
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "more";
        }
    }

    static {
        b bVar = new b();
        t = bVar;
        c cVar = new c();
        u = cVar;
        a aVar = new a();
        v = aVar;
        c13 c13Var = new c13("REFRESH", 3);
        w = c13Var;
        x = new c13[]{bVar, cVar, aVar, c13Var};
    }

    public c13() {
        throw null;
    }

    public static c13 valueOf(String str) {
        return (c13) Enum.valueOf(c13.class, str);
    }

    public static c13[] values() {
        return (c13[]) x.clone();
    }
}
