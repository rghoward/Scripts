package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class me0 extends td6 {
    public final long a;
    public final long b;
    public final vc0 c;
    public final Integer d;
    public final String e;
    public final ArrayList f;
    public final eg8 g;

    public me0() {
        throw null;
    }

    public me0(long j, long j2, vc0 vc0Var, Integer num, String str, ArrayList arrayList) {
        eg8 eg8Var = eg8.t;
        this.a = j;
        this.b = j2;
        this.c = vc0Var;
        this.d = num;
        this.e = str;
        this.f = arrayList;
        this.g = eg8Var;
    }

    @Override // defpackage.td6
    public final lf1 a() {
        return this.c;
    }

    @Override // defpackage.td6
    public final List<od6> b() {
        return this.f;
    }

    @Override // defpackage.td6
    public final Integer c() {
        return this.d;
    }

    @Override // defpackage.td6
    public final String d() {
        return this.e;
    }

    @Override // defpackage.td6
    public final eg8 e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof td6)) {
            return false;
        }
        td6 td6Var = (td6) obj;
        if (this.a != td6Var.f() || this.b != td6Var.g()) {
            return false;
        }
        vc0 vc0Var = this.c;
        if (vc0Var == null) {
            if (td6Var.a() != null) {
                return false;
            }
        } else if (!vc0Var.equals(td6Var.a())) {
            return false;
        }
        Integer num = this.d;
        if (num == null) {
            if (td6Var.c() != null) {
                return false;
            }
        } else if (!num.equals(td6Var.c())) {
            return false;
        }
        String str = this.e;
        if (str == null) {
            if (td6Var.d() != null) {
                return false;
            }
        } else if (!str.equals(td6Var.d())) {
            return false;
        }
        ArrayList arrayList = this.f;
        if (arrayList == null) {
            if (td6Var.b() != null) {
                return false;
            }
        } else if (!arrayList.equals(td6Var.b())) {
            return false;
        }
        eg8 eg8Var = this.g;
        if (eg8Var == null) {
            return td6Var.e() == null;
        }
        return eg8Var.equals(td6Var.e());
    }

    @Override // defpackage.td6
    public final long f() {
        return this.a;
    }

    @Override // defpackage.td6
    public final long g() {
        return this.b;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = (((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003;
        vc0 vc0Var = this.c;
        int iHashCode = (i ^ (vc0Var == null ? 0 : vc0Var.hashCode())) * 1000003;
        Integer num = this.d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        ArrayList arrayList = this.f;
        int iHashCode4 = (iHashCode3 ^ (arrayList == null ? 0 : arrayList.hashCode())) * 1000003;
        eg8 eg8Var = this.g;
        return iHashCode4 ^ (eg8Var != null ? eg8Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.a + ", requestUptimeMs=" + this.b + ", clientInfo=" + this.c + ", logSource=" + this.d + ", logSourceName=" + this.e + ", logEvents=" + this.f + ", qosTier=" + this.g + "}";
    }
}
