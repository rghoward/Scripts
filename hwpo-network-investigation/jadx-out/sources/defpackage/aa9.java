package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class aa9 {
    public static final aa9 t;
    public static final /* synthetic */ aa9[] u;

    static {
        aa9 aa9Var = new aa9("EditableText", 0);
        t = aa9Var;
        u = new aa9[]{aa9Var, new aa9("StaticText", 1)};
    }

    public aa9() {
        throw null;
    }

    public static aa9 valueOf(String str) {
        return (aa9) Enum.valueOf(aa9.class, str);
    }

    public static aa9[] values() {
        return (aa9[]) u.clone();
    }
}
