package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class zg1 implements jac {
    public static final /* synthetic */ zg1 t = new zg1();

    public static void b(int i, String str) {
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i);
    }

    @Override // defpackage.jac
    public Object a() {
        return new Boolean(((o5c) n5c.u.t.t).b());
    }
}
