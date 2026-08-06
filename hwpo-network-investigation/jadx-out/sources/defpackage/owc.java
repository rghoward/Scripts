package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class owc extends b1d {
    public final evc a;
    public final e1d b;

    public owc(evc evcVar, e1d e1dVar) {
        this.a = evcVar;
        this.b = e1dVar;
    }

    @Override // defpackage.b1d
    public final evc a() {
        return this.a;
    }

    @Override // defpackage.b1d
    public final e1d b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b1d)) {
            return false;
        }
        b1d b1dVar = (b1d) obj;
        evc evcVar = this.a;
        if (evcVar == null) {
            if (b1dVar.a() != null) {
                return false;
            }
        } else if (evcVar != b1dVar.a()) {
            return false;
        }
        return this.b.equals(b1dVar.b());
    }

    public final int hashCode() {
        evc evcVar = this.a;
        return this.b.hashCode() ^ (((evcVar == null ? 0 : evcVar.hashCode()) ^ 1000003) * 1000003);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.a);
        String string = this.b.toString();
        StringBuilder sb = new StringBuilder(strValueOf.length() + 52 + string.length() + 1);
        ux1.b(sb, "SnapshotBlobAndResult{snapshotBlob=", strValueOf, ", snapshotResult=", string);
        sb.append("}");
        return sb.toString();
    }
}
