package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u24 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ u24(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() throws InterruptedException {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                ((v24.a) obj).a.await();
                return g2b.a;
            default:
                q07 q07Var = (q07) obj;
                File file = new File(q07Var.b.getAbsolutePath() + q07Var.d);
                q07.f(file);
                return file;
        }
    }
}
