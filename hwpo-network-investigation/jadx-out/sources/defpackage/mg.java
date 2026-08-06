package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mg implements oh4 {
    public final /* synthetic */ int t;

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.t) {
            case 0:
                pg.b bVar = pg.Companion;
                List<u23> list = ((eh) obj).a;
                if (list.isEmpty()) {
                    z = false;
                } else {
                    for (u23 u23Var : list) {
                        if ((u23Var instanceof fh) && ((fh) u23Var).d) {
                            z = true;
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                lj9.a aVar = lj9.Companion;
                return ((xj9) obj).g;
        }
    }
}
