package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wm4 implements ko5 {
    public final pu4 b;
    public final URL c;
    public final String d;
    public String e;
    public URL f;
    public volatile byte[] g;
    public int h;

    public wm4(String str) {
        ev5 ev5Var = pu4.a;
        this.c = null;
        if (TextUtils.isEmpty(str)) {
            z90.a("Must not be null or empty");
            throw null;
        }
        this.d = str;
        ov9.d(ev5Var, "Argument must not be null");
        this.b = ev5Var;
    }

    @Override // defpackage.ko5
    public final void b(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = c().getBytes(ko5.a);
        }
        messageDigest.update(this.g);
    }

    public final String c() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        URL url = this.c;
        ov9.d(url, "Argument must not be null");
        return url.toString();
    }

    public final URL d() {
        if (this.f == null) {
            if (TextUtils.isEmpty(this.e)) {
                String string = this.d;
                if (TextUtils.isEmpty(string)) {
                    URL url = this.c;
                    ov9.d(url, "Argument must not be null");
                    string = url.toString();
                }
                this.e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$[]");
            }
            this.f = new URL(this.e);
        }
        return this.f;
    }

    @Override // defpackage.ko5
    public final boolean equals(Object obj) {
        if (obj instanceof wm4) {
            wm4 wm4Var = (wm4) obj;
            if (c().equals(wm4Var.c()) && this.b.equals(wm4Var.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ko5
    public final int hashCode() {
        if (this.h == 0) {
            int iHashCode = c().hashCode();
            this.h = iHashCode;
            this.h = this.b.hashCode() + (iHashCode * 31);
        }
        return this.h;
    }

    public final String toString() {
        return c();
    }

    public wm4(URL url) {
        ev5 ev5Var = pu4.a;
        ov9.d(url, "Argument must not be null");
        this.c = url;
        this.d = null;
        ov9.d(ev5Var, "Argument must not be null");
        this.b = ev5Var;
    }
}
