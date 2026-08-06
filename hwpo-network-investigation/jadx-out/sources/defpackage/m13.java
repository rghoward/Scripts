package defpackage;

import java.io.IOException;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m13 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ m13(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                ((IOException) obj).getClass();
                TimeZone timeZone = ytb.a;
                ((u13) obj2).D = true;
                return g2b.a;
            default:
                txa txaVar = (txa) obj;
                txaVar.getClass();
                ((ae5) obj2).H = ((ae5) txaVar).I;
                return Boolean.FALSE;
        }
    }
}
