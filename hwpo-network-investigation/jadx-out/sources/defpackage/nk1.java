package defpackage;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nk1 extends wp5 implements oh4 {
    public static final nk1 v;
    public static final nk1 w;
    public final /* synthetic */ int u;

    static {
        int i = 1;
        v = new nk1(i, 0);
        w = new nk1(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nk1(int i, int i2) {
        super(i);
        this.u = i2;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.u) {
            case 0:
                break;
        }
        return el.a((ViewGroup) obj);
    }
}
