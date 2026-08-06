package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hg6 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ hg6(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                ho5<Object>[] ho5VarArr = og6.F;
                Context contextRequireContext = ((og6) obj).requireContext();
                Context applicationContext = contextRequireContext.getApplicationContext();
                if (applicationContext != null) {
                    contextRequireContext = applicationContext;
                }
                return new gcc(new mkc(contextRequireContext));
            default:
                eda edaVar = (eda) obj;
                return edaVar.G ? uca.a(edaVar) : fca.b;
        }
    }
}
