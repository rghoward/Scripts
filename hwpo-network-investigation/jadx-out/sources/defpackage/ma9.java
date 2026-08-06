package defpackage;

import com.google.android.material.card.MaterialCardView;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ma9 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ ma9(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                a58 a58Var = (a58) obj;
                if (((bz6) obj2).b(a58Var.c)) {
                    a58Var.a();
                }
                break;
            default:
                ya yaVar = (ya) obj;
                yaVar.getClass();
                MaterialCardView materialCardView = ((qa6) yaVar.u).a;
                materialCardView.getClass();
                xgb.a(materialCardView, new zab((rbb.b) obj2, yaVar, null));
                yaVar.s(new g06(1, yaVar));
                break;
        }
        return g2b.a;
    }
}
