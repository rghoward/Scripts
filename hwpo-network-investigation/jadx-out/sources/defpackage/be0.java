package defpackage;

import com.intercom.twig.BuildConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class be0 extends mm3 {
    public final String a;
    public final Integer b;
    public final vf3 c;
    public final long d;
    public final long e;
    public final Map<String, String> f;
    public final Integer g;
    public final String h;
    public final byte[] i;
    public final byte[] j;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a extends mm3.a {
        public String a;
        public Integer b;
        public vf3 c;
        public Long d;
        public Long e;
        public HashMap f;
        public Integer g;
        public String h;
        public byte[] i;
        public byte[] j;

        public final be0 b() {
            String strConcat = this.a == null ? " transportName" : BuildConfig.FLAVOR;
            if (this.c == null) {
                strConcat = strConcat.concat(" encodedPayload");
            }
            if (this.d == null) {
                strConcat = strConcat.concat(" eventMillis");
            }
            if (this.e == null) {
                strConcat = strConcat.concat(" uptimeMillis");
            }
            if (this.f == null) {
                strConcat = strConcat.concat(" autoMetadata");
            }
            if (strConcat.isEmpty()) {
                return new be0(this.a, this.b, this.c, this.d.longValue(), this.e.longValue(), this.f, this.g, this.h, this.i, this.j);
            }
            aa0.c("Missing required properties:".concat(strConcat));
            return null;
        }
    }

    public be0(String str, Integer num, vf3 vf3Var, long j, long j2, HashMap map, Integer num2, String str2, byte[] bArr, byte[] bArr2) {
        this.a = str;
        this.b = num;
        this.c = vf3Var;
        this.d = j;
        this.e = j2;
        this.f = map;
        this.g = num2;
        this.h = str2;
        this.i = bArr;
        this.j = bArr2;
    }

    @Override // defpackage.mm3
    public final Map<String, String> b() {
        return this.f;
    }

    @Override // defpackage.mm3
    public final Integer c() {
        return this.b;
    }

    @Override // defpackage.mm3
    public final vf3 d() {
        return this.c;
    }

    @Override // defpackage.mm3
    public final long e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mm3)) {
            return false;
        }
        mm3 mm3Var = (mm3) obj;
        if (!this.a.equals(mm3Var.k())) {
            return false;
        }
        Integer num = this.b;
        if (num == null) {
            if (mm3Var.c() != null) {
                return false;
            }
        } else if (!num.equals(mm3Var.c())) {
            return false;
        }
        if (!this.c.equals(mm3Var.d()) || this.d != mm3Var.e() || this.e != mm3Var.l() || !this.f.equals(mm3Var.b())) {
            return false;
        }
        Integer num2 = this.g;
        if (num2 == null) {
            if (mm3Var.i() != null) {
                return false;
            }
        } else if (!num2.equals(mm3Var.i())) {
            return false;
        }
        String str = this.h;
        if (str == null) {
            if (mm3Var.j() != null) {
                return false;
            }
        } else if (!str.equals(mm3Var.j())) {
            return false;
        }
        boolean z = mm3Var instanceof be0;
        if (Arrays.equals(this.i, z ? ((be0) mm3Var).i : mm3Var.f())) {
            return Arrays.equals(this.j, z ? ((be0) mm3Var).j : mm3Var.g());
        }
        return false;
    }

    @Override // defpackage.mm3
    public final byte[] f() {
        return this.i;
    }

    @Override // defpackage.mm3
    public final byte[] g() {
        return this.j;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        int iHashCode3 = (((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f.hashCode()) * 1000003;
        Integer num2 = this.g;
        int iHashCode4 = (iHashCode3 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        String str = this.h;
        return Arrays.hashCode(this.j) ^ ((((iHashCode4 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ Arrays.hashCode(this.i)) * 1000003);
    }

    @Override // defpackage.mm3
    public final Integer i() {
        return this.g;
    }

    @Override // defpackage.mm3
    public final String j() {
        return this.h;
    }

    @Override // defpackage.mm3
    public final String k() {
        return this.a;
    }

    @Override // defpackage.mm3
    public final long l() {
        return this.e;
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + ", productId=" + this.g + ", pseudonymousId=" + this.h + ", experimentIdsClear=" + Arrays.toString(this.i) + ", experimentIdsEncrypted=" + Arrays.toString(this.j) + "}";
    }
}
