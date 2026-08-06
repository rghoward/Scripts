package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class zn7 implements qd1 {
    public final Class<?> t;

    public zn7(Class cls) {
        cls.getClass();
        this.t = cls;
    }

    @Override // defpackage.qd1
    public final Class<?> a() {
        return this.t;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zn7) {
            return xj5.a(this.t, ((zn7) obj).t);
        }
        return false;
    }

    public final int hashCode() {
        return this.t.hashCode();
    }

    public final String toString() {
        return this.t.toString() + " (Kotlin reflection is not available)";
    }
}
