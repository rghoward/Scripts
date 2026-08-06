package defpackage;

import java.util.regex.Matcher;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class t2 implements jac {
    public static final r02[] t = new r02[0];
    public static final /* synthetic */ t2 u = new t2();

    public static final aj6 b(Matcher matcher, int i, CharSequence charSequence) {
        if (matcher.find(i)) {
            return new aj6(matcher, charSequence);
        }
        return null;
    }

    public static final int c(int i, int i2) {
        return (i >> i2) & 31;
    }

    @Override // defpackage.jac
    public Object a() {
        return new Boolean(((b5c) a5c.u.t.t).a());
    }
}
