package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l24 implements mh4 {
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;

    public /* synthetic */ l24(int i, Object obj) {
        this.t = i;
        this.u = obj;
    }

    @Override // defpackage.mh4
    public final Object invoke() throws IOException {
        int i = this.t;
        Object obj = this.u;
        switch (i) {
            case 0:
                File fileB = s.b((Context) obj, "firebaseSessions/sessionConfigsDataStore.data");
                n24.b(fileB);
                return fileB;
            default:
                qq5 qq5Var = (qq5) ((xf6) obj).T.getValue();
                return new vf7(qq5Var != null ? qq5Var.a0(0L) : 9205357640488583168L);
        }
    }
}
