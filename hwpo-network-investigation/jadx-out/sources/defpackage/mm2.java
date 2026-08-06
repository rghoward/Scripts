package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mm2 extends wa implements ci4 {
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mm2(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.t = i3;
    }

    @Override // defpackage.ci4
    public final Object invoke(Object obj, Object obj2) {
        switch (this.t) {
            case 0:
                js7 js7Var = (js7) obj;
                cm2 cm2Var = (cm2) this.receiver;
                int i = cm2.I;
                cm2Var.getClass();
                List list = (List) js7Var.t;
                List list2 = (List) js7Var.u;
                if (list.isEmpty() && list2.isEmpty()) {
                    cm2Var.e(cm2.b.a.a);
                } else {
                    cm2Var.e(new cm2.b.c(th1.K(list, list2)));
                    bc8 bc8Var = (bc8) th1.A(list);
                    if (bc8Var != null) {
                        cm2Var.e(new cm2.b.d(bc8Var.A));
                    }
                }
                break;
            default:
                String str = (String) obj;
                ybb ybbVar = (ybb) this.receiver;
                ybb.a aVar = ybb.Companion;
                ybbVar.E = str;
                ybbVar.g(str);
                break;
        }
        return g2b.a;
    }
}
