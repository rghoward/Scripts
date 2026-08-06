package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 zqb[], still in use, count: 1, list:
  (r0v1 zqb[]) from 0x0038: CONSTRUCTOR (r0v1 zqb[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:57) call: pl3.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class zqb {
    OBJ('{', '}'),
    LIST('[', ']'),
    MAP('{', '}'),
    POLY_OBJ('[', ']');

    public static final /* synthetic */ pl3 A;
    public final char t;
    public final char u;

    static {
        A = new pl3(zqbVarArr);
    }

    public zqb(char c, char c2) {
        super(str, i);
        this.t = c;
        this.u = c2;
    }

    public static zqb valueOf(String str) {
        return (zqb) Enum.valueOf(zqb.class, str);
    }

    public static zqb[] values() {
        return (zqb[]) z.clone();
    }
}
