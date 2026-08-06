package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class fl7 {
    public static final fl7 t;
    public static final fl7 u;
    public static final /* synthetic */ fl7[] v;

    static {
        fl7 fl7Var = new fl7("Vertical", 0);
        t = fl7Var;
        fl7 fl7Var2 = new fl7("Horizontal", 1);
        u = fl7Var2;
        v = new fl7[]{fl7Var, fl7Var2};
    }

    public fl7() {
        throw null;
    }

    public static fl7 valueOf(String str) {
        return (fl7) Enum.valueOf(fl7.class, str);
    }

    public static fl7[] values() {
        return (fl7[]) v.clone();
    }
}
