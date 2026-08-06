package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fxc {
    public static final fxc t;
    public static final fxc u;
    public static final /* synthetic */ fxc[] v;

    static {
        fxc fxcVar = new fxc("CONSENT", 0);
        t = fxcVar;
        fxc fxcVar2 = new fxc("LEGITIMATE_INTEREST", 1);
        fxc fxcVar3 = new fxc("FLEXIBLE_CONSENT", 2);
        fxc fxcVar4 = new fxc("FLEXIBLE_LEGITIMATE_INTEREST", 3);
        u = fxcVar4;
        v = new fxc[]{fxcVar, fxcVar2, fxcVar3, fxcVar4};
    }

    public static fxc[] values() {
        return (fxc[]) v.clone();
    }
}
