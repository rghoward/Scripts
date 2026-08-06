package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class nsc {
    public static final void a(Level level, Executor executor, Exception exc, String str, Object... objArr) {
        lsc lscVar = new lsc(level, exc, str, objArr);
        int i = v7d.a;
        executor.execute(new n7d(new gl8(), m6d.a(), lscVar));
    }
}
