package defpackage;

import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class um5 extends JsonPrimitive {
    public final boolean t;
    public final String u;

    public um5(Object obj, boolean z) {
        obj.getClass();
        this.t = z;
        this.u = obj.toString();
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final String d() {
        return this.u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || um5.class != obj.getClass()) {
            return false;
        }
        um5 um5Var = (um5) obj;
        return this.t == um5Var.t && xj5.a(this.u, um5Var.u);
    }

    public final int hashCode() {
        return this.u.hashCode() + (Boolean.hashCode(this.t) * 31);
    }

    @Override // kotlinx.serialization.json.JsonPrimitive
    public final String toString() {
        boolean z = this.t;
        String str = this.u;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        m2a.a(str, sb);
        return sb.toString();
    }
}
