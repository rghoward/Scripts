package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class u5d extends v5d {
    public final g3c a;
    public final f1c b;

    public u5d(g3c g3cVar, f1c f1cVar) {
        this.a = g3cVar;
        if (f1cVar != null) {
            this.b = f1cVar;
        } else {
            ac4.c("Null extensionRegistryLite");
            throw null;
        }
    }

    @Override // defpackage.v5d
    public final g3c a() {
        return this.a;
    }

    @Override // defpackage.v5d
    public final f1c b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v5d)) {
            return false;
        }
        v5d v5dVar = (v5d) obj;
        return this.a.equals(v5dVar.a()) && this.b.equals(v5dVar.b());
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        String string = this.a.toString();
        int length = string.length();
        String string2 = this.b.toString();
        StringBuilder sb = new StringBuilder(length + 53 + string2.length() + 1);
        ux1.b(sb, "ProtoSerializer{defaultValue=", string, ", extensionRegistryLite=", string2);
        sb.append("}");
        return sb.toString();
    }
}
