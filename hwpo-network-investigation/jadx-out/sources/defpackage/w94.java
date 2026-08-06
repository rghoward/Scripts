package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class w94 implements v94 {
    public static final w94 t;
    public static final w94 u;
    public static final w94 v;
    public static final w94 w;
    public static final /* synthetic */ w94[] x;

    static {
        w94 w94Var = new w94("Active", 0);
        t = w94Var;
        w94 w94Var2 = new w94("ActiveParent", 1);
        u = w94Var2;
        w94 w94Var3 = new w94("Captured", 2);
        v = w94Var3;
        w94 w94Var4 = new w94("Inactive", 3);
        w = w94Var4;
        x = new w94[]{w94Var, w94Var2, w94Var3, w94Var4};
    }

    public w94() {
        throw null;
    }

    public static w94 valueOf(String str) {
        return (w94) Enum.valueOf(w94.class, str);
    }

    public static w94[] values() {
        return (w94[]) x.clone();
    }

    @Override // defpackage.v94
    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        u.b();
        return false;
    }

    @Override // defpackage.v94
    public final boolean e() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                u.b();
                return false;
            }
        }
        return true;
    }
}
