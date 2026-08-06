package defpackage;

import androidx.fragment.app.g;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ew6 implements oh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ ew6(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        int i = this.t;
        Object obj2 = this.u;
        switch (i) {
            case 0:
                ((mh4) obj2).invoke();
                break;
            case 1:
                pi7 pi7Var = (pi7) obj2;
                gm3 gm3Var = (gm3) obj;
                pi7.a aVar = pi7.Companion;
                gm3Var.getClass();
                if (gm3Var instanceof ni7.b) {
                    pi7Var.m(((ni7.b) gm3Var).b);
                } else if (gm3Var instanceof ni7.a) {
                    g gVarRequireActivity = pi7Var.requireActivity();
                    gVarRequireActivity.getClass();
                    nr1.d(gVarRequireActivity, ((ni7.a) gm3Var).b);
                }
                break;
            default:
                sq9 sq9Var = (sq9) obj2;
                sc9<? super g2b> sc9Var = sq9Var.f;
                sc9Var.getClass();
                if (!xj5.a(sq9Var.f, sc9Var)) {
                    c78.b("Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions");
                }
                d37<Object> d37Var = sq9Var.e;
                Object obj3 = sq9Var.c;
                if (d37Var != null) {
                    if (obj3 != null) {
                        c78.b("workingSoleWatchedObject must be null when workingWatchSet is non-null");
                    }
                    d37Var.a(obj);
                } else if (obj3 == null) {
                    sq9Var.c = obj;
                } else {
                    d37<Object> d37VarA = a49.a();
                    d37VarA.a(obj3);
                    d37VarA.a(obj);
                    sq9Var.e = d37VarA;
                    sq9Var.c = null;
                }
                break;
        }
        return g2b.a;
    }
}
