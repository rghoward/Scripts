package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class d4c implements a8c {
    public final a8c t;
    public final String u;

    public d4c(String str) {
        this.t = a8c.l;
        this.u = str;
    }

    @Override // defpackage.a8c
    public final String c() {
        throw new IllegalStateException("Control is not a String");
    }

    @Override // defpackage.a8c
    public final Double d() {
        throw new IllegalStateException("Control is not a double");
    }

    @Override // defpackage.a8c
    public final Boolean e() {
        throw new IllegalStateException("Control is not a boolean");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d4c)) {
            return false;
        }
        d4c d4cVar = (d4c) obj;
        return this.u.equals(d4cVar.u) && this.t.equals(d4cVar.t);
    }

    @Override // defpackage.a8c
    public final Iterator f() {
        return null;
    }

    public final int hashCode() {
        return this.t.hashCode() + (this.u.hashCode() * 31);
    }

    @Override // defpackage.a8c
    public final a8c j(String str, cgc cgcVar, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // defpackage.a8c
    public final a8c n() {
        return new d4c(this.u, this.t.n());
    }

    public d4c(String str, a8c a8cVar) {
        this.t = a8cVar;
        this.u = str;
    }
}
