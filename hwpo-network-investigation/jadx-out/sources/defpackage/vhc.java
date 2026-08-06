package defpackage;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class vhc {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final Bundle e;

    public vhc(long j, long j2, Bundle bundle, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.e = bundle;
        this.c = j;
        this.d = j2;
    }

    public static vhc a(z9c z9cVar) {
        String str = z9cVar.t;
        String str2 = z9cVar.v;
        return new vhc(z9cVar.w, z9cVar.x, z9cVar.u.v(), str, str2);
    }

    public final z9c b() {
        v9c v9cVar = new v9c(new Bundle(this.e));
        return new z9c(this.a, v9cVar, this.b, this.c, this.d);
    }

    public final String toString() {
        String string = this.e.toString();
        String str = this.b;
        int length = String.valueOf(str).length();
        String str2 = this.a;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + string.length());
        ux1.b(sb, "origin=", str, ",name=", str2);
        return av.a(sb, ",params=", string);
    }
}
