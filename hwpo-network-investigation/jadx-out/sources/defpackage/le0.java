package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class le0 extends od6 {
    public final long a;
    public final Integer b;
    public final np1 c;
    public final long d;
    public final byte[] e;
    public final String f;
    public final long g;
    public final q97 h;
    public final pq3 i;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends od6.a {
        public Long a;
        public Integer b;
        public wc0 c;
        public Long d;
        public byte[] e;
        public String f;
        public Long g;
        public oe0 h;
        public de0 i;
    }

    public le0(long j, Integer num, np1 np1Var, long j2, byte[] bArr, String str, long j3, q97 q97Var, pq3 pq3Var) {
        this.a = j;
        this.b = num;
        this.c = np1Var;
        this.d = j2;
        this.e = bArr;
        this.f = str;
        this.g = j3;
        this.h = q97Var;
        this.i = pq3Var;
    }

    @Override // defpackage.od6
    public final np1 a() {
        return this.c;
    }

    @Override // defpackage.od6
    public final Integer b() {
        return this.b;
    }

    @Override // defpackage.od6
    public final long c() {
        return this.a;
    }

    @Override // defpackage.od6
    public final long d() {
        return this.d;
    }

    @Override // defpackage.od6
    public final pq3 e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof od6)) {
            return false;
        }
        od6 od6Var = (od6) obj;
        if (this.a != od6Var.c()) {
            return false;
        }
        Integer num = this.b;
        if (num == null) {
            if (od6Var.b() != null) {
                return false;
            }
        } else if (!num.equals(od6Var.b())) {
            return false;
        }
        np1 np1Var = this.c;
        if (np1Var == null) {
            if (od6Var.a() != null) {
                return false;
            }
        } else if (!np1Var.equals(od6Var.a())) {
            return false;
        }
        if (this.d != od6Var.d()) {
            return false;
        }
        if (!Arrays.equals(this.e, od6Var instanceof le0 ? ((le0) od6Var).e : od6Var.g())) {
            return false;
        }
        String str = this.f;
        if (str == null) {
            if (od6Var.h() != null) {
                return false;
            }
        } else if (!str.equals(od6Var.h())) {
            return false;
        }
        if (this.g != od6Var.i()) {
            return false;
        }
        q97 q97Var = this.h;
        if (q97Var == null) {
            if (od6Var.f() != null) {
                return false;
            }
        } else if (!q97Var.equals(od6Var.f())) {
            return false;
        }
        pq3 pq3Var = this.i;
        if (pq3Var == null) {
            return od6Var.e() == null;
        }
        return pq3Var.equals(od6Var.e());
    }

    @Override // defpackage.od6
    public final q97 f() {
        return this.h;
    }

    @Override // defpackage.od6
    public final byte[] g() {
        return this.e;
    }

    @Override // defpackage.od6
    public final String h() {
        return this.f;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        np1 np1Var = this.c;
        int iHashCode2 = (iHashCode ^ (np1Var == null ? 0 : np1Var.hashCode())) * 1000003;
        long j2 = this.d;
        int iHashCode3 = (((iHashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.e)) * 1000003;
        String str = this.f;
        int iHashCode4 = (iHashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.g;
        int i2 = (iHashCode4 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        q97 q97Var = this.h;
        int iHashCode5 = (i2 ^ (q97Var == null ? 0 : q97Var.hashCode())) * 1000003;
        pq3 pq3Var = this.i;
        return iHashCode5 ^ (pq3Var != null ? pq3Var.hashCode() : 0);
    }

    @Override // defpackage.od6
    public final long i() {
        return this.g;
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", complianceData=" + this.c + ", eventUptimeMs=" + this.d + ", sourceExtension=" + Arrays.toString(this.e) + ", sourceExtensionJsonProto3=" + this.f + ", timezoneOffsetSeconds=" + this.g + ", networkConnectionInfo=" + this.h + ", experimentIds=" + this.i + "}";
    }
}
