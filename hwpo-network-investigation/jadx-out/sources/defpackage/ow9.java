package defpackage;

import com.intercom.twig.BuildConfig;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class ow9 {
    public final String a;
    public int b;

    public ow9(String str) {
        this.a = str;
    }

    public final boolean a() {
        return this.b >= this.a.length();
    }

    public final void b() throws rt7 {
        if (c(')')) {
            return;
        }
        f("expected )");
        throw null;
    }

    public final boolean c(char c) {
        int i = this.b;
        String str = this.a;
        return i < str.length() && str.charAt(this.b) == c;
    }

    public final int d(String str) throws rt7 {
        Integer numF = v2a.f(e(str));
        if (numF != null) {
            return numF.intValue();
        }
        f("expected int");
        throw null;
    }

    public final String e(String str) {
        String str2;
        int i = this.b;
        while (true) {
            int i2 = this.b;
            str2 = this.a;
            if (i2 >= str2.length() || z2a.p(str, str2.charAt(this.b))) {
                break;
            }
            this.b++;
        }
        int i3 = this.b;
        return i3 > i ? str2.substring(i, i3) : BuildConfig.FLAVOR;
    }

    public final void f(String str) throws rt7 {
        int i = this.b;
        String str2 = this.a;
        int iMin = Math.min(i, str2.length());
        StringBuilder sbA = aa.a("Error while parsing source information: ", str, " at ");
        sbA.append(str2.substring(0, iMin));
        sbA.append('|');
        sbA.append(str2.substring(iMin));
        throw new rt7(sbA.toString());
    }
}
