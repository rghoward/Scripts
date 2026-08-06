package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q78 implements oh4 {
    public final /* synthetic */ int t;

    public /* synthetic */ q78(int i) {
        this.t = i;
    }

    @Override // defpackage.oh4
    public final Object invoke(Object obj) {
        switch (this.t) {
            case 0:
                ((Context) obj).getClass();
                return hf3.t;
            default:
                ufa ufaVar = (ufa) obj;
                Integer numD = ufaVar.d();
                if (numD == null) {
                    return null;
                }
                int iIntValue = numD.intValue();
                long j = ufaVar.f;
                int i = lja.c;
                return new lx2(((int) (j & 4294967295L)) - iIntValue, 0);
        }
    }
}
