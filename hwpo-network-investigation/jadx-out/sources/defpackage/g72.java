package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g72 implements ci4 {
    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        h72 h72Var = (h72) obj;
        h72.a aVar = (h72.a) obj2;
        h72Var.getClass();
        aVar.getClass();
        h72 h72VarN = h72Var.N(aVar.getKey());
        ff3 ff3Var = ff3.t;
        if (h72VarN == ff3Var) {
            return aVar;
        }
        v02.a aVar2 = v02.a.t;
        v02 v02Var = (v02) h72VarN.d0(aVar2);
        if (v02Var == null) {
            return new hj1(aVar, h72VarN);
        }
        h72 h72VarN2 = h72VarN.N(aVar2);
        return h72VarN2 == ff3Var ? new hj1(v02Var, aVar) : new hj1(v02Var, new hj1(aVar, h72VarN2));
    }
}
