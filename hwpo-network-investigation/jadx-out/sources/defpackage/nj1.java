package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nj1 implements q87 {
    public y10 a;
    public final ArrayList b = new ArrayList();
    public final Handler c = new Handler(Looper.getMainLooper());

    @Override // defpackage.q87
    public final void a() {
        this.a = null;
    }

    @Override // defpackage.q87
    public final void b(y10 y10Var) {
        y10Var.getClass();
        this.a = y10Var;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            y10Var.b((lj1[]) obj);
        }
        arrayList.clear();
    }
}
