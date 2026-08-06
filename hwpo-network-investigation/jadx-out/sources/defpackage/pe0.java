package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pe0 extends gw7 {
    public final long a;
    public final exa b;
    public final mm3 c;

    public pe0(long j, exa exaVar, mm3 mm3Var) {
        this.a = j;
        if (exaVar == null) {
            ac4.c("Null transportContext");
            throw null;
        }
        this.b = exaVar;
        if (mm3Var != null) {
            this.c = mm3Var;
        } else {
            ac4.c("Null event");
            throw null;
        }
    }

    @Override // defpackage.gw7
    public final mm3 a() {
        return this.c;
    }

    @Override // defpackage.gw7
    public final long b() {
        return this.a;
    }

    @Override // defpackage.gw7
    public final exa c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gw7)) {
            return false;
        }
        gw7 gw7Var = (gw7) obj;
        return this.a == gw7Var.b() && this.b.equals(gw7Var.c()) && this.c.equals(gw7Var.a());
    }

    public final int hashCode() {
        long j = this.a;
        return this.c.hashCode() ^ ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
