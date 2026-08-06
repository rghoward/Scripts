package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class kv6 extends ox6.c implements ju1, lr5 {
    public LinkedHashMap H;

    @Override // defpackage.lr5
    public final gl6 e(hl6 hl6Var, cl6 cl6Var, long j) {
        float f = ((y43) ku1.a(this, tg5.c)).t;
        if (f < 0.0f) {
            f = 0.0f;
        }
        final jz7 jz7VarE = cl6Var.E(j);
        boolean z = this.G && !Float.isNaN(f) && y43.a(f, 0.0f) > 0;
        int iN1 = !Float.isNaN(f) ? hl6Var.n1(f) : 0;
        final int iMax = jz7VarE.t;
        if (z) {
            iMax = Math.max(iMax, iN1);
        }
        final int iMax2 = jz7VarE.u;
        if (z) {
            iMax2 = Math.max(iMax2, iN1);
        }
        if (z) {
            LinkedHashMap linkedHashMap = this.H;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.H = linkedHashMap;
            }
            deb debVar = tg5.b;
            int iRound = Math.round((iN1 - jz7VarE.t) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(debVar, Integer.valueOf(iRound));
            e15 e15Var = tg5.a;
            int iRound2 = Math.round((iN1 - jz7VarE.u) / 2.0f);
            linkedHashMap.put(e15Var, Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
        }
        Map<ei, Integer> map = this.H;
        if (map == null) {
            map = if3.t;
        }
        return hl6Var.y0(iMax, iMax2, map, new oh4() { // from class: jv6
            @Override // defpackage.oh4
            public final Object invoke(Object obj) {
                jz7 jz7Var = jz7VarE;
                ((jz7.a) obj).l(jz7Var, wk6.b((iMax - jz7Var.t) / 2.0f), wk6.b((iMax2 - jz7Var.u) / 2.0f), 0.0f);
                return g2b.a;
            }
        });
    }
}
