package defpackage;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e69 extends wp5 implements oh4 {
    public static final e69 v;
    public static final e69 w;
    public final /* synthetic */ int u;

    static {
        int i = 1;
        v = new e69(i, 0);
        w = new e69(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e69(int i, int i2) {
        super(i);
        this.u = i2;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.u) {
            case 0:
                return Integer.valueOf(((h69) obj).b);
            default:
                return el.a((ViewGroup) obj);
        }
    }
}
