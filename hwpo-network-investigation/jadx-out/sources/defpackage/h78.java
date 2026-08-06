package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h78 implements f78<Object> {
    public static final a t;
    public static final /* synthetic */ h78[] u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final enum a extends h78 {
        public a() {
            super("ALWAYS_TRUE", 0);
        }

        @Override // defpackage.f78
        public final boolean apply(Object obj) {
            return true;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return "Predicates.alwaysTrue()";
        }
    }

    static {
        a aVar = new a();
        t = aVar;
        u = new h78[]{aVar, new h78() { // from class: h78.b
            @Override // defpackage.f78
            public final boolean apply(Object obj) {
                return false;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.alwaysFalse()";
            }
        }, new h78() { // from class: h78.c
            @Override // defpackage.f78
            public final boolean apply(Object obj) {
                return obj == null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.isNull()";
            }
        }, new h78() { // from class: h78.d
            @Override // defpackage.f78
            public final boolean apply(Object obj) {
                return obj != null;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "Predicates.notNull()";
            }
        }};
    }

    public h78() {
        throw null;
    }

    public static h78 valueOf(String str) {
        return (h78) Enum.valueOf(h78.class, str);
    }

    public static h78[] values() {
        return (h78[]) u.clone();
    }
}
