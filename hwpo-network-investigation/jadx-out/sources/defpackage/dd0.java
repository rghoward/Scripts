package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dd0 extends u92.d {
    public final List<u92.d.a> a;
    public final String b;

    public dd0() {
        throw null;
    }

    public dd0(List list, String str) {
        this.a = list;
        this.b = str;
    }

    @Override // u92.d
    public final List<u92.d.a> a() {
        return this.a;
    }

    @Override // u92.d
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u92.d)) {
            return false;
        }
        u92.d dVar = (u92.d) obj;
        if (!this.a.equals(dVar.a())) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            return dVar.b() == null;
        }
        return str.equals(dVar.b());
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        return (str == null ? 0 : str.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilesPayload{files=");
        sb.append(this.a);
        sb.append(", orgId=");
        return av.a(sb, this.b, "}");
    }
}
