package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z20 implements c30.i, cv2.g.a, pf4 {
    public final /* synthetic */ Object t;

    public /* synthetic */ z20(Object obj) {
        this.t = obj;
    }

    @Override // c30.i
    public int a(int i, tq5 tq5Var) {
        return ((sp0.b) this.t).a(0, i);
    }

    @Override // cv2.g.a
    public ul8 b(int i, esa esaVar, int[] iArr) {
        cv2.d dVar = (cv2.d) this.t;
        k95.b bVar = k95.u;
        k95.a aVar = new k95.a();
        for (int i2 = 0; i2 < esaVar.a; i2++) {
            aVar.c(new cv2.b(i, esaVar, i2, dVar, iArr[i2]));
        }
        return aVar.g();
    }

    @Override // defpackage.pf4
    public void d(Bundle bundle, String str) {
        fi3.p((fi3) this.t, str, bundle);
    }
}
