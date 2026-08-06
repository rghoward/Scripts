package defpackage;

import java.io.FileInputStream;
import java.nio.channels.FileLock;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.datastore.core.MultiProcessCoordinator", f = "MultiProcessCoordinator.android.kt", l = {62, 92}, m = "tryLock", v = 1)
public final class u07<T> extends u02 {
    public a47 t;
    public FileInputStream u;
    public FileLock v;
    public boolean w;
    public /* synthetic */ Object x;
    public final /* synthetic */ q07 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u07(q07 q07Var, u02 u02Var) {
        super(u02Var);
        this.y = q07Var;
    }

    @Override // defpackage.ak0
    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= Integer.MIN_VALUE;
        return this.y.e(null, this);
    }
}
