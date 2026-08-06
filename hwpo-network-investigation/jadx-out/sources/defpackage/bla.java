package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bla implements ci4 {
    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        hla hlaVar = (hla) obj;
        h72.a aVar = (h72.a) obj2;
        if (aVar instanceof zka) {
            zka<Object> zkaVar = (zka) aVar;
            h72 h72Var = hlaVar.a;
            g2b g2bVarT = zkaVar.T();
            Object[] objArr = hlaVar.b;
            int i = hlaVar.d;
            objArr[i] = g2bVarT;
            zka<Object>[] zkaVarArr = hlaVar.c;
            hlaVar.d = i + 1;
            zkaVarArr[i] = zkaVar;
        }
        return hlaVar;
    }
}
