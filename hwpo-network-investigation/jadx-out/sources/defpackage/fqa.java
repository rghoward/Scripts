package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fqa {
    public static final fqa t;
    public static final fqa u;
    public static final /* synthetic */ fqa[] v;

    static {
        fqa fqaVar = new fqa("On", 0);
        t = fqaVar;
        fqa fqaVar2 = new fqa("Off", 1);
        u = fqaVar2;
        v = new fqa[]{fqaVar, fqaVar2, new fqa("Indeterminate", 2)};
    }

    public fqa() {
        throw null;
    }

    public static fqa valueOf(String str) {
        return (fqa) Enum.valueOf(fqa.class, str);
    }

    public static fqa[] values() {
        return (fqa[]) v.clone();
    }
}
