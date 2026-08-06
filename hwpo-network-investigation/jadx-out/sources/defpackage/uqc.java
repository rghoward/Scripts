package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class uqc extends csc {
    public final Context a;
    public final l5a b;

    public uqc(Context context, l5a l5aVar) {
        this.a = context;
        this.b = l5aVar;
    }

    @Override // defpackage.csc
    public final Context a() {
        return this.a;
    }

    @Override // defpackage.csc
    public final l5a b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof csc)) {
            return false;
        }
        csc cscVar = (csc) obj;
        if (!this.a.equals(cscVar.a())) {
            return false;
        }
        l5a l5aVar = this.b;
        if (l5aVar == null) {
            return cscVar.b() == null;
        }
        return l5aVar.equals(cscVar.b());
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() ^ 1000003;
        l5a l5aVar = this.b;
        return (l5aVar == null ? 0 : l5aVar.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        String string = this.a.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(length + 45 + strValueOf.length() + 1);
        ux1.b(sb, "FlagsContext{context=", string, ", hermeticFileOverrides=", strValueOf);
        sb.append("}");
        return sb.toString();
    }
}
