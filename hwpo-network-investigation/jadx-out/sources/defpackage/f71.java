package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f71 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ f71(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                int i = w71.O;
                return ((y71) obj).b;
            default:
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                dka[] dkaVarArr = bka.b;
                oh4<Object, Object> oh4Var = t29.x.u;
                Boolean bool = Boolean.FALSE;
                xj5.a(obj2, bool);
                bka bkaVar = obj2 != null ? (bka) oh4Var.invoke(obj2) : null;
                bkaVar.getClass();
                long j = bkaVar.a;
                Object obj3 = list.get(1);
                xj5.a(obj3, bool);
                bka bkaVar2 = obj3 != null ? (bka) oh4Var.invoke(obj3) : null;
                bkaVar2.getClass();
                return new qha(j, bkaVar2.a);
        }
    }
}
