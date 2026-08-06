package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class y03 implements Executor {
    public static final y03 t;
    public static final /* synthetic */ y03[] u;

    static {
        y03 y03Var = new y03("INSTANCE", 0);
        t = y03Var;
        u = new y03[]{y03Var};
    }

    public y03() {
        throw null;
    }

    public static y03 valueOf(String str) {
        return (y03) Enum.valueOf(y03.class, str);
    }

    public static y03[] values() {
        return (y03[]) u.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
