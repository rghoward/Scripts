package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ki7 {
    public static final ki7 t;
    public static final ki7 u;
    public static final /* synthetic */ ki7[] v;

    static {
        ki7 ki7Var = new ki7("PAGE_ONE", 0);
        t = ki7Var;
        ki7 ki7Var2 = new ki7("PAGE_TWO", 1);
        u = ki7Var2;
        v = new ki7[]{ki7Var, ki7Var2};
    }

    public ki7() {
        throw null;
    }

    public static ki7 valueOf(String str) {
        return (ki7) Enum.valueOf(ki7.class, str);
    }

    public static ki7[] values() {
        return (ki7[]) v.clone();
    }
}
