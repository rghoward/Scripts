package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class sz9 implements um9, jac {
    public static final /* synthetic */ sz9 u = new sz9(1);
    public final /* synthetic */ int t;

    public /* synthetic */ sz9(int i) {
        this.t = i;
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Integer.valueOf((int) u4c.u.get().X());
    }

    @Override // defpackage.um9
    public r54 b(zz9 zz9Var) {
        return new d64(sm9.t);
    }

    public String toString() {
        switch (this.t) {
            case 0:
                return "SharingStarted.Eagerly";
            default:
                return super.toString();
        }
    }
}
