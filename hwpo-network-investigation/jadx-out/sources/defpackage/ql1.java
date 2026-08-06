package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ql1 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ ql1(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                am1.a aVar = am1.Companion;
                qn1 qn1VarS = ((am1) obj).s();
                Long l = qn1VarS.S;
                if (l != null) {
                    oy0.d(rhb.b(qn1VarS), null, null, new tn1(l.longValue(), qn1VarS, null), 3);
                }
                qn1VarS.S = null;
                return g2b.a;
            case 1:
                return new y43(vk6.c(24.0f, 16.0f, ((yea.b) obj).invoke()));
            default:
                return ((ia9) obj).w.a;
        }
    }
}
