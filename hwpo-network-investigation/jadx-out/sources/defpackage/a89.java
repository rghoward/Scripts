package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class a89 {
    public static final a89 b;
    public final q95<Integer> a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public q95<Integer> a;
    }

    static {
        a aVar = new a();
        aVar.a = q95.o(2, 1, 5);
        b = new a89(aVar);
    }

    public a89(a aVar) {
        this.a = aVar.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a89) && this.a.equals(((a89) obj).a);
    }

    public final int hashCode() {
        Boolean bool = Boolean.TRUE;
        return Objects.hash(this.a, null, null, bool, bool, bool, bool, bool);
    }
}
