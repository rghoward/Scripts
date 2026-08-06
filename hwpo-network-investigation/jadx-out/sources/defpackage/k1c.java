package defpackage;

import io.ably.lib.util.Crypto;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class k1c {
    public static final k1c d = new k1c(0);
    public final v3c a = new v3c();
    public boolean b;
    public boolean c;

    public k1c(int i) {
        a();
        a();
    }

    public static void d(b1c b1cVar, p4c p4cVar, int i, Object obj) {
        if (p4cVar == p4c.w) {
            b1cVar.f(i, 3);
            ((g3c) obj).b(b1cVar);
            b1cVar.f(i, 4);
            return;
        }
        b1cVar.f(i, p4cVar.u);
        q4c q4cVar = q4c.t;
        switch (p4cVar.ordinal()) {
            case 0:
                b1cVar.y(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                b1cVar.w(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                b1cVar.x(((Long) obj).longValue());
                break;
            case 3:
                b1cVar.x(((Long) obj).longValue());
                break;
            case 4:
                b1cVar.u(((Integer) obj).intValue());
                break;
            case 5:
                b1cVar.y(((Long) obj).longValue());
                break;
            case 6:
                b1cVar.w(((Integer) obj).intValue());
                break;
            case 7:
                b1cVar.t(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof p0c)) {
                    b1cVar.z((String) obj);
                } else {
                    b1cVar.o((p0c) obj);
                }
                break;
            case 9:
                ((g3c) obj).b(b1cVar);
                break;
            case 10:
                b1cVar.s((g3c) obj);
                break;
            case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                if (!(obj instanceof p0c)) {
                    byte[] bArr = (byte[]) obj;
                    b1cVar.p(bArr, bArr.length);
                } else {
                    b1cVar.o((p0c) obj);
                }
                break;
            case 12:
                b1cVar.v(((Integer) obj).intValue());
                break;
            case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                if (!(obj instanceof w1c)) {
                    b1cVar.u(((Integer) obj).intValue());
                } else {
                    b1cVar.u(((w1c) obj).a());
                }
                break;
            case 14:
                b1cVar.w(((Integer) obj).intValue());
                break;
            case h4c.e /* 15 */:
                b1cVar.y(((Long) obj).longValue());
                break;
            case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                int iIntValue = ((Integer) obj).intValue();
                b1cVar.v((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                b1cVar.x((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
        }
    }

    public static int e(p4c p4cVar, int i, Object obj) {
        int iB;
        int iA;
        int iA2 = b1c.a(i << 3);
        if (p4cVar == p4c.w) {
            iA2 += iA2;
        }
        p4c p4cVar2 = p4c.v;
        q4c q4cVar = q4c.t;
        int iB2 = 4;
        switch (p4cVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                boolean z = b1c.b;
                iB2 = 8;
                break;
            case 1:
                ((Float) obj).getClass();
                boolean z2 = b1c.b;
                break;
            case 2:
                iB2 = b1c.b(((Long) obj).longValue());
                break;
            case 3:
                iB2 = b1c.b(((Long) obj).longValue());
                break;
            case 4:
                iB2 = b1c.b(((Integer) obj).intValue());
                break;
            case 5:
                ((Long) obj).getClass();
                boolean z3 = b1c.b;
                iB2 = 8;
                break;
            case 6:
                ((Integer) obj).getClass();
                boolean z4 = b1c.b;
                break;
            case 7:
                ((Boolean) obj).getClass();
                boolean z5 = b1c.b;
                iB2 = 1;
                break;
            case 8:
                if (obj instanceof p0c) {
                    boolean z6 = b1c.b;
                    iB = ((p0c) obj).e();
                    iA = b1c.a(iB);
                } else {
                    boolean z7 = b1c.b;
                    iB = o4c.b((String) obj);
                    iA = b1c.a(iB);
                }
                iB2 = iA + iB;
                break;
            case 9:
                iB2 = ((g3c) obj).f();
                break;
            case 10:
                if (!(obj instanceof o2c)) {
                    iB2 = b1c.c((g3c) obj);
                } else {
                    iB = ((o2c) obj).a();
                    iA = b1c.a(iB);
                    iB2 = iA + iB;
                }
                break;
            case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                if (obj instanceof p0c) {
                    boolean z8 = b1c.b;
                    iB = ((p0c) obj).e();
                    iA = b1c.a(iB);
                } else {
                    boolean z9 = b1c.b;
                    iB = ((byte[]) obj).length;
                    iA = b1c.a(iB);
                }
                iB2 = iA + iB;
                break;
            case 12:
                iB2 = b1c.a(((Integer) obj).intValue());
                break;
            case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                iB2 = !(obj instanceof w1c) ? b1c.b(((Integer) obj).intValue()) : b1c.b(((w1c) obj).a());
                break;
            case 14:
                ((Integer) obj).getClass();
                boolean z10 = b1c.b;
                break;
            case h4c.e /* 15 */:
                ((Long) obj).getClass();
                boolean z11 = b1c.b;
                iB2 = 8;
                break;
            case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                int iIntValue = ((Integer) obj).intValue();
                iB2 = b1c.a((iIntValue >> 31) ^ (iIntValue + iIntValue));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iB2 = b1c.b((jLongValue >> 63) ^ (jLongValue + jLongValue));
                break;
            default:
                ru3.d("There is no way to get here, but the compiler thinks otherwise.");
                iB2 = 0;
                break;
        }
        return iB2 + iA2;
    }

    public static boolean f(Map.Entry entry) {
        ((j1c) entry.getKey()).c();
        throw null;
    }

    public static final int g(Map.Entry entry) {
        j1c j1cVar = (j1c) entry.getKey();
        entry.getValue();
        j1cVar.c();
        throw null;
    }

    public final void a() {
        if (this.b) {
            return;
        }
        v3c v3cVar = this.a;
        int i = v3cVar.u;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = v3cVar.b(i2).u;
            if (obj instanceof u1c) {
                ((u1c) obj).n();
            }
        }
        Iterator it = v3cVar.c().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof u1c) {
                ((u1c) value).n();
            }
        }
        v3cVar.a();
        this.b = true;
    }

    public final Iterator b() {
        v3c v3cVar = this.a;
        if (v3cVar.isEmpty()) {
            return Collections.emptyIterator();
        }
        return this.c ? new n2c(((y3c) v3cVar.entrySet()).iterator()) : ((y3c) v3cVar.entrySet()).iterator();
    }

    public final boolean c() {
        v3c v3cVar = this.a;
        if (v3cVar.u > 0) {
            f(v3cVar.b(0));
            throw null;
        }
        Iterator it = v3cVar.c().iterator();
        if (!it.hasNext()) {
            return true;
        }
        f((Map.Entry) it.next());
        throw null;
    }

    public final Object clone() {
        k1c k1cVar = new k1c();
        v3c v3cVar = this.a;
        if (v3cVar.u > 0) {
            ((j1c) v3cVar.b(0).t).d();
            throw null;
        }
        Iterator it = v3cVar.c().iterator();
        if (!it.hasNext()) {
            k1cVar.c = this.c;
            return k1cVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        j1c j1cVar = (j1c) entry.getKey();
        entry.getValue();
        j1cVar.d();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k1c) {
            return this.a.equals(((k1c) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public k1c() {
    }
}
