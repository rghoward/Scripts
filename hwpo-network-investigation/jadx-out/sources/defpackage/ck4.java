package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ck4 implements xt6 {
    public static final ck4 a = new ck4();

    @Override // defpackage.xt6
    public final vt6 a(Class<?> cls) {
        if (!fk4.class.isAssignableFrom(cls)) {
            z90.a("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (vt6) fk4.q(cls.asSubclass(fk4.class)).p(fk4.e.v);
        } catch (Exception e) {
            jl.a("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }

    @Override // defpackage.xt6
    public final boolean b(Class<?> cls) {
        return fk4.class.isAssignableFrom(cls);
    }
}
