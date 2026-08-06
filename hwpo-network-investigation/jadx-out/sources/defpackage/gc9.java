package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class gc9<T> {
    public final String a;
    public final ci4<T, T, T> b;
    public final boolean c;

    public gc9() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public gc9(String str, ci4<? super T, ? super T, ? extends T> ci4Var) {
        this.a = str;
        this.b = ci4Var;
    }

    public final String toString() {
        return "AccessibilityKey: " + this.a;
    }

    public /* synthetic */ gc9(String str) {
        this(str, fc9.u);
    }

    public gc9(String str, int i) {
        this(str);
        this.c = true;
    }

    public gc9(String str, boolean z, ci4 ci4Var) {
        this(str, ci4Var);
        this.c = z;
    }
}
