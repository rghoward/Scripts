package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class l04 implements Executor {
    public static final l04 t;
    public static final /* synthetic */ l04[] u;

    static {
        l04 l04Var = new l04("INSTANCE", 0);
        t = l04Var;
        u = new l04[]{l04Var};
    }

    public l04() {
        throw null;
    }

    public static l04 valueOf(String str) {
        return (l04) Enum.valueOf(l04.class, str);
    }

    public static l04[] values() {
        return (l04[]) u.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
