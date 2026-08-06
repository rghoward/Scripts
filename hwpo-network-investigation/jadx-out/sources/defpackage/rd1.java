package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class rd1 {
    public static final rd1 t;
    public static final rd1 u;
    public static final rd1 v;
    public static final /* synthetic */ rd1[] w;

    static {
        rd1 rd1Var = new rd1("NONE", 0);
        t = rd1Var;
        rd1 rd1Var2 = new rd1("ALL_JSON_OBJECTS", 1);
        u = rd1Var2;
        rd1 rd1Var3 = new rd1("POLYMORPHIC", 2);
        v = rd1Var3;
        w = new rd1[]{rd1Var, rd1Var2, rd1Var3};
    }

    public rd1() {
        throw null;
    }

    public static rd1 valueOf(String str) {
        return (rd1) Enum.valueOf(rd1.class, str);
    }

    public static rd1[] values() {
        return (rd1[]) w.clone();
    }
}
