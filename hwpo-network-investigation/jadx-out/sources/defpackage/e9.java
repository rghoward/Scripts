package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class e9 implements jac {
    public static final /* synthetic */ e9 t = new e9();

    public static final boolean b(hjb hjbVar, hjb hjbVar2, wb6 wb6Var) {
        hjbVar.getClass();
        if (hjbVar2 == null) {
            return true;
        }
        if ((hjbVar2 instanceof hjb.b) && (hjbVar instanceof hjb.a)) {
            return true;
        }
        if ((hjbVar instanceof hjb.b) && (hjbVar2 instanceof hjb.a)) {
            return false;
        }
        return (hjbVar.c == hjbVar2.c && hjbVar.d == hjbVar2.d && hjbVar2.a(wb6Var) <= hjbVar.a(wb6Var)) ? false : true;
    }

    @Override // defpackage.jac
    public Object a() {
        List list = wfc.a;
        return Long.valueOf(u4c.u.get().u());
    }
}
