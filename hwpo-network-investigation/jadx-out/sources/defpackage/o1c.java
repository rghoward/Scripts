package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o1c implements e3c {
    public static final o1c a = new o1c();

    @Override // defpackage.e3c
    public final boolean a(Class cls) {
        return u1c.class.isAssignableFrom(cls);
    }

    @Override // defpackage.e3c
    public final z2c b(Class cls) {
        if (!u1c.class.isAssignableFrom(cls)) {
            z90.a("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (z2c) u1c.r(cls.asSubclass(u1c.class)).w(3);
        } catch (Exception e) {
            jl.a("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }
}
