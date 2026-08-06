package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uca {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class a extends pi4 implements oh4<oh4<? super dca, ? extends Boolean>, g2b> {
        @Override // defpackage.oh4
        public final g2b invoke(oh4<? super dca, ? extends Boolean> oh4Var) {
            ((cca) this.receiver).b.g(oh4Var);
            return g2b.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final fca a(dw2 dw2Var) {
        zca zcaVar;
        cca ccaVar = new cca();
        yx.e(dw2Var, hca.a, new st9(1, new a(1, ccaVar, cca.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0), new g32(1, ccaVar)));
        t27 t27Var = new t27((Object) null);
        t27<dca> t27Var2 = ccaVar.a;
        Object[] objArr = t27Var2.a;
        int i = t27Var2.b;
        dca dcaVar = null;
        boolean z = true;
        int i2 = 0;
        while (true) {
            zcaVar = zca.b;
            if (i2 >= i) {
                break;
            }
            dca dcaVar2 = (dca) objArr[i2];
            if (!z || dcaVar2 != zcaVar) {
                if (dcaVar2 == zcaVar && dcaVar == zcaVar) {
                    z = false;
                } else {
                    if (dcaVar2 != zcaVar) {
                        t27<oh4<dca, Boolean>> t27Var3 = ccaVar.b;
                        Object[] objArr2 = t27Var3.a;
                        int i3 = t27Var3.b;
                        int i4 = 0;
                        while (true) {
                            if (i4 < i3) {
                                if (((Boolean) ((oh4) objArr2[i4]).invoke(dcaVar2)).booleanValue()) {
                                    i4++;
                                } else {
                                    z = false;
                                }
                            }
                        }
                    }
                    t27Var.g(dcaVar2);
                    z = false;
                    dcaVar = dcaVar2;
                }
            }
            i2++;
        }
        if (((dca) (t27Var.d() ? null : t27Var.a[t27Var.b - 1])) == zcaVar) {
            t27Var.l(t27Var.b - 1);
        }
        t27.b bVar = t27Var.c;
        t27.b bVar2 = bVar;
        if (bVar == null) {
            t27.b bVar3 = new t27.b(t27Var);
            t27Var.c = bVar3;
            bVar2 = bVar3;
        }
        return new fca(bVar2);
    }
}
