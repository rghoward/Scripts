package defpackage;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sp implements fi4 {
    public final /* synthetic */ tp t;

    @Override // defpackage.fi4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        tp tpVar = this.t;
        yza yzaVarA = tpVar.e.a((qa4) obj, (ob4) obj2, ((mb4) obj3).a, ((nb4) obj4).a);
        if (yzaVarA instanceof yza.a) {
            Object obj5 = ((yza.a) yzaVarA).t;
            obj5.getClass();
            return (Typeface) obj5;
        }
        tza tzaVar = new tza(yzaVarA, tpVar.j);
        tpVar.j = tzaVar;
        Object obj6 = tzaVar.c;
        obj6.getClass();
        return (Typeface) obj6;
    }
}
