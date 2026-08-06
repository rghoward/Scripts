package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class c8c implements a8c {
    public final String t;
    public final ArrayList u;

    public c8c(String str, ArrayList arrayList) {
        this.t = str;
        ArrayList arrayList2 = new ArrayList();
        this.u = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // defpackage.a8c
    public final String c() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    @Override // defpackage.a8c
    public final Double d() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    @Override // defpackage.a8c
    public final Boolean e() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8c)) {
            return false;
        }
        c8c c8cVar = (c8c) obj;
        String str = c8cVar.t;
        String str2 = this.t;
        if (str2 == null ? str == null : str2.equals(str)) {
            return this.u.equals(c8cVar.u);
        }
        return false;
    }

    @Override // defpackage.a8c
    public final Iterator f() {
        return null;
    }

    public final int hashCode() {
        String str = this.t;
        return this.u.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    @Override // defpackage.a8c
    public final a8c j(String str, cgc cgcVar, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // defpackage.a8c
    public final a8c n() {
        return this;
    }
}
