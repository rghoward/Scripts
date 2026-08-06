package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fga implements oh4 {
    public final /* synthetic */ int t;

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                List list = (List) obj;
                Object obj2 = list.get(1);
                obj2.getClass();
                fl7 fl7Var = ((Boolean) obj2).booleanValue() ? fl7.t : fl7.u;
                Object obj3 = list.get(0);
                obj3.getClass();
                return new gga(fl7Var, ((Float) obj3).floatValue());
            default:
                return Integer.valueOf((int) ((bw) obj).a);
        }
    }
}
