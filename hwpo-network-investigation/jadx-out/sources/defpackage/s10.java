package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 s10[], still in use, count: 1, list:
  (r0v1 s10[]) from 0x002c: CONSTRUCTOR (r0v1 s10[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:45) call: pl3.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class s10 {
    ENGLISH("en"),
    FRANCAIS("fr"),
    ESPANOL("es");

    public static final a Companion = new a();
    public static final /* synthetic */ pl3 y;
    public final String t;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    static {
        y = new pl3(new s10[]{r0, r1, r2});
    }

    public s10(String str) {
        super(str, i);
        this.t = str;
    }

    public static s10 valueOf(String str) {
        return (s10) Enum.valueOf(s10.class, str);
    }

    public static s10[] values() {
        return (s10[]) x.clone();
    }
}
