package defpackage;

import io.ably.lib.util.Crypto;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;
import tu3.a;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class tu3<T extends a<T>> {
    public static final tu3 d = new tu3(0);
    public final fs9 a;
    public boolean b;
    public boolean c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a<T extends a<T>> extends Comparable<T> {
        hob q();
    }

    public tu3(int i) {
        int i2 = is9.z;
        this.a = new fs9(0);
        h();
        h();
    }

    public static int b(gob gobVar, int i, Object obj) {
        int size;
        int iL1;
        int iK1 = tg1.k1(i);
        if (gobVar == gob.x) {
            iK1 *= 2;
        }
        int iM1 = 1;
        switch (gobVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = tg1.y;
                iM1 = 8;
                break;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = tg1.y;
                iM1 = 4;
                break;
            case 2:
                iM1 = tg1.m1(((Long) obj).longValue());
                break;
            case 3:
                iM1 = tg1.m1(((Long) obj).longValue());
                break;
            case 4:
                iM1 = tg1.h1(((Integer) obj).intValue());
                break;
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = tg1.y;
                iM1 = 8;
                break;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = tg1.y;
                iM1 = 4;
                break;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = tg1.y;
                break;
            case 8:
                if (!(obj instanceof f01)) {
                    iM1 = tg1.j1((String) obj);
                } else {
                    Logger logger6 = tg1.y;
                    size = ((f01) obj).size();
                    iL1 = tg1.l1(size);
                    iM1 = iL1 + size;
                }
                break;
            case 9:
                Logger logger7 = tg1.y;
                iM1 = ((zt6) obj).b();
                break;
            case 10:
                if (!(obj instanceof at5)) {
                    Logger logger8 = tg1.y;
                    size = ((zt6) obj).b();
                    iL1 = tg1.l1(size);
                    iM1 = iL1 + size;
                } else {
                    iM1 = tg1.i1((at5) obj);
                }
                break;
            case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                if (obj instanceof f01) {
                    Logger logger9 = tg1.y;
                    size = ((f01) obj).size();
                    iL1 = tg1.l1(size);
                } else {
                    Logger logger10 = tg1.y;
                    size = ((byte[]) obj).length;
                    iL1 = tg1.l1(size);
                }
                iM1 = iL1 + size;
                break;
            case 12:
                iM1 = tg1.l1(((Integer) obj).intValue());
                break;
            case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                iM1 = !(obj instanceof zi5.a) ? tg1.h1(((Integer) obj).intValue()) : tg1.h1(((zi5.a) obj).a());
                break;
            case 14:
                ((Integer) obj).getClass();
                Logger logger11 = tg1.y;
                iM1 = 4;
                break;
            case h4c.e /* 15 */:
                ((Long) obj).getClass();
                Logger logger12 = tg1.y;
                iM1 = 8;
                break;
            case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                int iIntValue = ((Integer) obj).intValue();
                iM1 = tg1.l1((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iM1 = tg1.m1((jLongValue >> 63) ^ (jLongValue << 1));
                break;
            default:
                ru3.d("There is no way to get here, but the compiler thinks otherwise.");
                iM1 = 0;
                break;
        }
        return iM1 + iK1;
    }

    public static int c(a<?> aVar, Object obj) {
        aVar.getClass();
        return b(null, 0, obj);
    }

    public static int d(Map.Entry entry) {
        tg1.k1(1);
        a aVar = (a) entry.getKey();
        entry.getValue();
        aVar.q();
        throw null;
    }

    public static <T extends a<T>> boolean f(Map.Entry<T, Object> entry) {
        entry.getKey().q();
        throw null;
    }

    public static void k(tg1 tg1Var, gob gobVar, int i, Object obj) {
        if (gobVar == gob.x) {
            tg1Var.E1(i, 3);
            ((zt6) obj).e(tg1Var);
            tg1Var.E1(i, 4);
        }
        tg1Var.E1(i, gobVar.u);
        switch (gobVar.ordinal()) {
            case 0:
                tg1Var.v1(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                tg1Var.t1(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                tg1Var.I1(((Long) obj).longValue());
                break;
            case 3:
                tg1Var.I1(((Long) obj).longValue());
                break;
            case 4:
                tg1Var.x1(((Integer) obj).intValue());
                break;
            case 5:
                tg1Var.v1(((Long) obj).longValue());
                break;
            case 6:
                tg1Var.t1(((Integer) obj).intValue());
                break;
            case 7:
                tg1Var.n1(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof f01)) {
                    tg1Var.D1((String) obj);
                } else {
                    tg1Var.r1((f01) obj);
                }
                break;
            case 9:
                ((zt6) obj).e(tg1Var);
                break;
            case 10:
                tg1Var.z1((zt6) obj);
                break;
            case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                if (!(obj instanceof f01)) {
                    byte[] bArr = (byte[]) obj;
                    tg1Var.p1(bArr, bArr.length);
                } else {
                    tg1Var.r1((f01) obj);
                }
                break;
            case 12:
                tg1Var.G1(((Integer) obj).intValue());
                break;
            case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                if (!(obj instanceof zi5.a)) {
                    tg1Var.x1(((Integer) obj).intValue());
                } else {
                    tg1Var.x1(((zi5.a) obj).a());
                }
                break;
            case 14:
                tg1Var.t1(((Integer) obj).intValue());
                break;
            case h4c.e /* 15 */:
                tg1Var.v1(((Long) obj).longValue());
                break;
            case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                int iIntValue = ((Integer) obj).intValue();
                tg1Var.G1((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                tg1Var.I1((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final tu3<T> clone() {
        tu3<T> tu3Var = new tu3<>();
        fs9 fs9Var = this.a;
        if (fs9Var.u.size() > 0) {
            Map.Entry<Object, Object> entryC = fs9Var.c(0);
            tu3Var.j((a) entryC.getKey(), entryC.getValue());
            throw null;
        }
        Iterator<Map.Entry<Object, Object>> it = fs9Var.d().iterator();
        if (!it.hasNext()) {
            tu3Var.c = this.c;
            return tu3Var;
        }
        Map.Entry<Object, Object> next = it.next();
        tu3Var.j((a) next.getKey(), next.getValue());
        throw null;
    }

    public final boolean e() {
        fs9 fs9Var = this.a;
        if (fs9Var.u.size() > 0) {
            f(fs9Var.c(0));
            throw null;
        }
        Iterator<Map.Entry<Object, Object>> it = fs9Var.d().iterator();
        if (!it.hasNext()) {
            return true;
        }
        f(it.next());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tu3) {
            return this.a.equals(((tu3) obj).a);
        }
        return false;
    }

    public final Iterator<Map.Entry<T, Object>> g() {
        boolean z = this.c;
        fs9 fs9Var = this.a;
        if (!z) {
            return ((is9.d) fs9Var.entrySet()).iterator();
        }
        Iterator<Map.Entry<K, Object>> it = ((is9.d) fs9Var.entrySet()).iterator();
        at5.b bVar = new at5.b();
        bVar.t = it;
        return bVar;
    }

    public final void h() {
        if (this.b) {
            return;
        }
        int i = 0;
        while (true) {
            fs9 fs9Var = this.a;
            if (i >= fs9Var.u.size()) {
                fs9Var.f();
                this.b = true;
                return;
            }
            Map.Entry<Object, Object> entryC = fs9Var.c(i);
            if (entryC.getValue() instanceof fk4) {
                fk4 fk4Var = (fk4) entryC.getValue();
                fk4Var.getClass();
                xe8 xe8Var = xe8.c;
                xe8Var.getClass();
                xe8Var.a(fk4Var.getClass()).b(fk4Var);
                fk4Var.t();
            }
            i++;
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void i(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof at5) {
            ((at5) value).a(null);
        }
        key.getClass();
        key.q();
        throw null;
    }

    public final void j(T t, Object obj) {
        t.getClass();
        t.getClass();
        Charset charset = zi5.a;
        obj.getClass();
        throw null;
    }

    public tu3() {
        this.a = new fs9(16);
    }
}
