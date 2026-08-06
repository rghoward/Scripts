package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kl3 implements jac, om8 {
    public static final /* synthetic */ kl3 t = new kl3();
    public static final /* synthetic */ kl3 u = new kl3();

    public static Object b(Class cls, Object obj) {
        if (obj instanceof zj4) {
            return cls.cast(obj);
        }
        if (obj instanceof ak4) {
            return b(cls, ((ak4) obj).a());
        }
        throw new IllegalStateException("Given component holder " + obj.getClass() + " does not implement " + zj4.class + " or " + ak4.class);
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Long.valueOf(u4c.u.get().Q());
    }

    @Override // defpackage.om8
    public /* synthetic */ void accept(Object obj, Object obj2) {
        int i = kpc.k;
    }
}
