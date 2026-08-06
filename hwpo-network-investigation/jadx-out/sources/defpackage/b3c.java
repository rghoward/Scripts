package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class b3c implements a8c {
    public final boolean t;

    public b3c(Boolean bool) {
        this.t = bool == null ? false : bool.booleanValue();
    }

    @Override // defpackage.a8c
    public final String c() {
        return Boolean.toString(this.t);
    }

    @Override // defpackage.a8c
    public final Double d() {
        return Double.valueOf(true != this.t ? 0.0d : 1.0d);
    }

    @Override // defpackage.a8c
    public final Boolean e() {
        return Boolean.valueOf(this.t);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b3c) && this.t == ((b3c) obj).t;
    }

    @Override // defpackage.a8c
    public final Iterator f() {
        return null;
    }

    public final int hashCode() {
        return Boolean.valueOf(this.t).hashCode();
    }

    @Override // defpackage.a8c
    public final a8c j(String str, cgc cgcVar, ArrayList arrayList) {
        boolean zEquals = "toString".equals(str);
        boolean z = this.t;
        if (zEquals) {
            return new i8c(Boolean.toString(z));
        }
        throw new IllegalArgumentException(Boolean.toString(z) + "." + str + " is not a function.");
    }

    @Override // defpackage.a8c
    public final a8c n() {
        return new b3c(Boolean.valueOf(this.t));
    }

    public final String toString() {
        return String.valueOf(this.t);
    }
}
