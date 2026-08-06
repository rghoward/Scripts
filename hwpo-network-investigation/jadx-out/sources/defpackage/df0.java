package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class df0 extends gqa {
    public final String a;
    public final long b;
    public final gqa.a c;

    public df0(String str, long j, gqa.a aVar) {
        this.a = str;
        this.b = j;
        this.c = aVar;
    }

    @Override // defpackage.gqa
    public final gqa.a a() {
        return this.c;
    }

    @Override // defpackage.gqa
    public final String b() {
        return this.a;
    }

    @Override // defpackage.gqa
    public final long c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gqa)) {
            return false;
        }
        gqa gqaVar = (gqa) obj;
        String str = this.a;
        if (str == null) {
            if (gqaVar.b() != null) {
                return false;
            }
        } else if (!str.equals(gqaVar.b())) {
            return false;
        }
        if (this.b != gqaVar.c()) {
            return false;
        }
        gqa.a aVar = this.c;
        if (aVar == null) {
            return gqaVar.a() == null;
        }
        return aVar.equals(gqaVar.a());
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        gqa.a aVar = this.c;
        return i ^ (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "TokenResult{token=" + this.a + ", tokenExpirationTimestamp=" + this.b + ", responseCode=" + this.c + "}";
    }
}
