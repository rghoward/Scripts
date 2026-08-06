package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class lqa {
    public static final lqa t;
    public static final lqa u;
    public static final lqa v;
    public static final /* synthetic */ lqa[] w;

    static {
        lqa lqaVar = new lqa("Uninitialized", 0);
        t = lqaVar;
        lqa lqaVar2 = new lqa("Detached", 1);
        u = lqaVar2;
        lqa lqaVar3 = new lqa("Attached", 2);
        v = lqaVar3;
        w = new lqa[]{lqaVar, lqaVar2, lqaVar3};
    }

    public lqa() {
        throw null;
    }

    public static lqa valueOf(String str) {
        return (lqa) Enum.valueOf(lqa.class, str);
    }

    public static lqa[] values() {
        return (lqa[]) w.clone();
    }
}
