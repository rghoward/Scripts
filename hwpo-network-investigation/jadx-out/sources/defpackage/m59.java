package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class m59 {
    public static final m59 t;
    public static final m59 u;
    public static final m59 v;
    public static final m59 w;
    public static final /* synthetic */ m59[] x;

    static {
        m59 m59Var = new m59("EXPANDED", 0);
        t = m59Var;
        m59 m59Var2 = new m59("COLLAPSED", 1);
        u = m59Var2;
        m59 m59Var3 = new m59("EXPANDED_NO_ANIM", 2);
        v = m59Var3;
        m59 m59Var4 = new m59("COLLAPSED_NO_ANIM", 3);
        w = m59Var4;
        x = new m59[]{m59Var, m59Var2, m59Var3, m59Var4};
    }

    public m59() {
        throw null;
    }

    public static m59 valueOf(String str) {
        return (m59) Enum.valueOf(m59.class, str);
    }

    public static m59[] values() {
        return (m59[]) x.clone();
    }
}
