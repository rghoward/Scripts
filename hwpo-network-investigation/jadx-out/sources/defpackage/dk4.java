package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dk4 implements yt6 {
    public static final dk4 a = new dk4();

    @Override // defpackage.yt6
    public final wt6 a(Class<?> cls) {
        if (!ek4.class.isAssignableFrom(cls)) {
            z90.a("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (wt6) ek4.i(cls.asSubclass(ek4.class)).h(ek4.f.v);
        } catch (Exception e) {
            jl.a("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }

    @Override // defpackage.yt6
    public final boolean b(Class<?> cls) {
        return ek4.class.isAssignableFrom(cls);
    }
}
