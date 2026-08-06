package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class s5c implements r5c {

    @Deprecated
    public static final rwc a;

    @Deprecated
    public static final rwc b;

    static {
        jxc jxcVar = t4c.c;
        a = jxcVar.a("measurement.service.store_null_safelist", true);
        b = jxcVar.a("measurement.service.store_safelist", true);
    }

    @Override // defpackage.r5c
    public final boolean b() {
        return ((Boolean) a.get()).booleanValue();
    }

    @Override // defpackage.r5c
    public final boolean c() {
        return ((Boolean) b.get()).booleanValue();
    }
}
