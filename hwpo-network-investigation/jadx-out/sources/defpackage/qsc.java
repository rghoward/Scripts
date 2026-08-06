package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class qsc extends g6c {
    public final /* synthetic */ kjc v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qsc(uuc uucVar, kjc kjcVar) {
        super("getValue");
        this.v = kjcVar;
    }

    @Override // defpackage.g6c
    public final a8c a(cgc cgcVar, List list) {
        gic.a(2, "getValue", list);
        a8c a8cVarB = cgcVar.b.b(cgcVar, (a8c) list.get(0));
        a8c a8cVarB2 = cgcVar.b.b(cgcVar, (a8c) list.get(1));
        String strC = a8cVarB.c();
        kjc kjcVar = this.v;
        Map map = (Map) kjcVar.b.d.get(kjcVar.a);
        String str = (map == null || !map.containsKey(strC)) ? null : (String) map.get(strC);
        return str != null ? new i8c(str) : a8cVarB2;
    }
}
