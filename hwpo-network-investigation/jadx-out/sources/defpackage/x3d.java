package defpackage;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class x3d extends h4d {
    public final Uri a;
    public final mwc b;
    public final sk7 c;
    public final k95 d;
    public final zf7 e = zf7.a;
    public final boolean f = true;

    public /* synthetic */ x3d(Uri uri, mwc mwcVar, sk7 sk7Var, k95 k95Var) {
        this.a = uri;
        this.b = mwcVar;
        this.c = sk7Var;
        this.d = k95Var;
    }

    @Override // defpackage.h4d
    public final Uri a() {
        return this.a;
    }

    @Override // defpackage.h4d
    public final g3c b() {
        return this.b;
    }

    @Override // defpackage.h4d
    public final sk7 c() {
        return this.c;
    }

    @Override // defpackage.h4d
    public final k95 d() {
        return this.d;
    }

    @Override // defpackage.h4d
    public final zf7 e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h4d)) {
            return false;
        }
        h4d h4dVar = (h4d) obj;
        return this.a.equals(h4dVar.a()) && this.b.equals(h4dVar.b()) && this.c.equals(h4dVar.c()) && this.d.equals(h4dVar.d()) && this.e.equals(h4dVar.e()) && this.f == h4dVar.f();
    }

    @Override // defpackage.h4d
    public final boolean f() {
        return this.f;
    }

    public final int hashCode() {
        return (((true != this.f ? 1237 : 1231) ^ ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003)) * 1000003) ^ 1237;
    }

    public final String toString() {
        String string = this.a.toString();
        int length = string.length();
        String string2 = this.b.toString();
        int length2 = string2.length();
        String strValueOf = String.valueOf(this.c);
        String strValueOf2 = String.valueOf(this.d);
        String string3 = this.e.toString();
        int length3 = strValueOf.length();
        int length4 = strValueOf2.length();
        int length5 = string3.length();
        boolean z = this.f;
        StringBuilder sb = new StringBuilder(length + 34 + length2 + 10 + length3 + 13 + length4 + 16 + length5 + 32 + String.valueOf(z).length() + 22);
        ux1.b(sb, "ProtoDataStoreConfig{uri=", string, ", schema=", string2);
        ux1.b(sb, ", handler=", strValueOf, ", migrations=", strValueOf2);
        sb.append(", variantConfig=");
        sb.append(string3);
        sb.append(", useGeneratedExtensionRegistry=");
        sb.append(z);
        sb.append(", enableTracing=false}");
        return sb.toString();
    }
}
