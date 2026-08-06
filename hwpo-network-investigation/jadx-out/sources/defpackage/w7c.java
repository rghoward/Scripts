package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class w7c implements a8c {
    @Override // defpackage.a8c
    public final String c() {
        return "null";
    }

    @Override // defpackage.a8c
    public final Double d() {
        return Double.valueOf(0.0d);
    }

    @Override // defpackage.a8c
    public final Boolean e() {
        return Boolean.FALSE;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof w7c;
    }

    @Override // defpackage.a8c
    public final Iterator f() {
        return null;
    }

    public final int hashCode() {
        return 1;
    }

    @Override // defpackage.a8c
    public final a8c j(String str, cgc cgcVar, ArrayList arrayList) {
        throw new IllegalStateException("null has no function ".concat(str));
    }

    @Override // defpackage.a8c
    public final a8c n() {
        return a8c.m;
    }
}
