package defpackage;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class eg8 {
    public static final eg8 t;
    public static final /* synthetic */ eg8[] u;

    static {
        eg8 eg8Var = new eg8("DEFAULT", 0);
        t = eg8Var;
        eg8 eg8Var2 = new eg8("UNMETERED_ONLY", 1);
        eg8 eg8Var3 = new eg8("UNMETERED_OR_DAILY", 2);
        eg8 eg8Var4 = new eg8("FAST_IF_RADIO_AWAKE", 3);
        eg8 eg8Var5 = new eg8("NEVER", 4);
        eg8 eg8Var6 = new eg8("UNRECOGNIZED", 5);
        u = new eg8[]{eg8Var, eg8Var2, eg8Var3, eg8Var4, eg8Var5, eg8Var6};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, eg8Var);
        sparseArray.put(1, eg8Var2);
        sparseArray.put(2, eg8Var3);
        sparseArray.put(3, eg8Var4);
        sparseArray.put(4, eg8Var5);
        sparseArray.put(-1, eg8Var6);
    }

    public eg8() {
        throw null;
    }

    public static eg8 valueOf(String str) {
        return (eg8) Enum.valueOf(eg8.class, str);
    }

    public static eg8[] values() {
        return (eg8[]) u.clone();
    }
}
