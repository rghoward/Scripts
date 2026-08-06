package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ex0 implements el0 {
    public static final a Companion = new a();
    public static final ex0 b = new ex0(new vz7(0, false, false, null, null, null, 127));
    public final vz7 a;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
    }

    public ex0(vz7 vz7Var) {
        this.a = vz7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ex0) && this.a.equals(((ex0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "BrowserDialogViewState(placeholderState=" + this.a + ")";
    }
}
