package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class ze0 extends z0a {
    public final af0 a;
    public final cf0 b;
    public final bf0 c;

    public ze0(af0 af0Var, cf0 cf0Var, bf0 bf0Var) {
        this.a = af0Var;
        this.b = cf0Var;
        this.c = bf0Var;
    }

    @Override // defpackage.z0a
    public final z0a.a a() {
        return this.a;
    }

    @Override // defpackage.z0a
    public final z0a.b b() {
        return this.c;
    }

    @Override // defpackage.z0a
    public final z0a.c c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z0a)) {
            return false;
        }
        z0a z0aVar = (z0a) obj;
        return this.a.equals(z0aVar.a()) && this.b.equals(z0aVar.c()) && this.c.equals(z0aVar.b());
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.a + ", osData=" + this.b + ", deviceData=" + this.c + "}";
    }
}
