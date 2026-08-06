package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class hrb extends bh0 {
    public int F;
    public a G;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final a t;
        public static final a u;
        public static final a v;
        public static final a w;
        public static final a x;
        public static final /* synthetic */ a[] y;

        static {
            a aVar = new a("TOP", 0);
            t = aVar;
            a aVar2 = new a("BOTTOM", 1);
            u = aVar2;
            a aVar3 = new a("BOTH_SIDED", 2);
            v = aVar3;
            a aVar4 = new a("TOP_INSIDE", 3);
            w = aVar4;
            a aVar5 = new a("BOTTOM_INSIDE", 4);
            x = aVar5;
            y = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) y.clone();
        }
    }
}
