package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class j24 implements i24 {
    public final String a;
    public final int b;

    public j24(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.i24
    public final int a() {
        return this.b;
    }

    @Override // defpackage.i24
    public final long e() {
        if (this.b == 0) {
            return 0L;
        }
        String strTrim = g().trim();
        try {
            return Long.valueOf(strTrim).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(sk0.c("[Value: ", strTrim, "] cannot be converted to a long."), e);
        }
    }

    @Override // defpackage.i24
    public final double f() {
        if (this.b == 0) {
            return 0.0d;
        }
        String strTrim = g().trim();
        try {
            return Double.valueOf(strTrim).doubleValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(sk0.c("[Value: ", strTrim, "] cannot be converted to a double."), e);
        }
    }

    @Override // defpackage.i24
    public final String g() {
        return this.b == 0 ? BuildConfig.FLAVOR : this.a;
    }

    @Override // defpackage.i24
    public final boolean h() {
        if (this.b != 0) {
            String strTrim = g().trim();
            if (nv1.e.matcher(strTrim).matches()) {
                return true;
            }
            if (!nv1.f.matcher(strTrim).matches()) {
                z90.a(sk0.c("[Value: ", strTrim, "] cannot be converted to a boolean."));
                return false;
            }
        }
        return false;
    }
}
