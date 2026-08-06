package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class mv {
    public static final mv t;
    public static final mv u;
    public static final /* synthetic */ mv[] v;

    static {
        mv mvVar = new mv("BoundReached", 0);
        t = mvVar;
        mv mvVar2 = new mv("Finished", 1);
        u = mvVar2;
        v = new mv[]{mvVar, mvVar2};
    }

    public mv() {
        throw null;
    }

    public static mv valueOf(String str) {
        return (mv) Enum.valueOf(mv.class, str);
    }

    public static mv[] values() {
        return (mv[]) v.clone();
    }
}
