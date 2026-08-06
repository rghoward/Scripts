package defpackage;

import java.io.FileOutputStream;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.datastore.core.MultiProcessCoordinator$Companion", f = "MultiProcessCoordinator.android.kt", l = {184}, m = "getExclusiveFileLockWithRetryIfDeadlock", v = 1)
public final class p07 extends u02 {
    public FileOutputStream t;
    public long u;
    public /* synthetic */ Object v;
    public int w;

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.w |= Integer.MIN_VALUE;
        return q07.a.a(null, this);
    }
}
