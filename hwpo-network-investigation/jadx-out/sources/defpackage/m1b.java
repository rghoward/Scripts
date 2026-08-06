package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class m1b implements Executor {
    public static final m1b t;
    public static final Handler u;
    public static final /* synthetic */ m1b[] v;

    static {
        m1b m1bVar = new m1b("INSTANCE", 0);
        t = m1bVar;
        v = new m1b[]{m1bVar};
        u = new Handler(Looper.getMainLooper());
    }

    public m1b() {
        throw null;
    }

    public static m1b valueOf(String str) {
        return (m1b) Enum.valueOf(m1b.class, str);
    }

    public static m1b[] values() {
        return (m1b[]) v.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        u.post(runnable);
    }
}
