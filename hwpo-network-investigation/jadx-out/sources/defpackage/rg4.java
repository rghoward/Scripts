package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class rg4 extends pwa {
    public final /* synthetic */ Object a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ qg4 e;

    public rg4(qg4 qg4Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.e = qg4Var;
        this.a = obj;
        this.b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
    }

    @Override // defpackage.pwa, wva.f
    public final void a(wva wvaVar) {
        wvaVar.B(this);
    }

    @Override // defpackage.pwa, wva.f
    public final void e(wva wvaVar) {
        qg4 qg4Var = this.e;
        Object obj = this.a;
        if (obj != null) {
            qg4Var.z(obj, this.b, null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            qg4Var.z(obj2, this.d, null);
        }
    }
}
