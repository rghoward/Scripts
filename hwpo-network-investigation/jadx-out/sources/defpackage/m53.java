package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m53 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends m53 {
        public EnumC0198a a = EnumC0198a.v;
        public boolean b = false;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: m53$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public static final class EnumC0198a {
            public static final EnumC0198a t;
            public static final EnumC0198a u;
            public static final EnumC0198a v;
            public static final /* synthetic */ EnumC0198a[] w;

            static {
                EnumC0198a enumC0198a = new EnumC0198a("Yes", 0);
                t = enumC0198a;
                EnumC0198a enumC0198a2 = new EnumC0198a("No", 1);
                u = enumC0198a2;
                EnumC0198a enumC0198a3 = new EnumC0198a("NotInitialized", 2);
                v = enumC0198a3;
                w = new EnumC0198a[]{enumC0198a, enumC0198a2, enumC0198a3};
            }

            public EnumC0198a() {
                throw null;
            }

            public static EnumC0198a valueOf(String str) {
                return (EnumC0198a) Enum.valueOf(EnumC0198a.class, str);
            }

            public static EnumC0198a[] values() {
                return (EnumC0198a[]) w.clone();
            }
        }

        public a(int i) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b extends m53 {
        public a58 a;
        public long b;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c extends m53 {
        public a58 a;
        public long b;
        public boolean c;
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d extends m53 {
        public long a;
    }
}
