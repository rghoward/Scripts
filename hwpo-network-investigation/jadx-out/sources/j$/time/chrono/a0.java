package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes2.dex */
public final class a0 implements j {
    public static final a0 BEFORE_ROC;
    public static final a0 ROC;
    public static final /* synthetic */ a0[] a;

    static {
        a0 a0Var = new a0("BEFORE_ROC", 0);
        BEFORE_ROC = a0Var;
        a0 a0Var2 = new a0("ROC", 1);
        ROC = a0Var2;
        a = new a0[]{a0Var, a0Var2};
    }

    public static a0 valueOf(String str) {
        return (a0) Enum.valueOf(a0.class, str);
    }

    public static a0[] values() {
        return (a0[]) a.clone();
    }

    @Override // j$.time.chrono.j
    public final int getValue() {
        return ordinal();
    }
}
