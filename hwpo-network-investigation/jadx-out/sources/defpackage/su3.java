package defpackage;

import io.ably.lib.util.Crypto;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;
import su3.a;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class su3<T extends a<T>> {
    public static final su3<?> d = new su3<>(0);
    public final gs9 a;
    public boolean b;
    public boolean c;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface a<T extends a<T>> extends Comparable<T> {
        iob q();
    }

    public su3(int i) {
        int i2 = hs9.y;
        this.a = new gs9();
        h();
        h();
    }

    public static int b(fob fobVar, int i, Object obj) {
        int size;
        int iN1;
        int iM1 = sg1.m1(i);
        if (fobVar == fob.w) {
            iM1 *= 2;
        }
        int iO1 = 4;
        switch (fobVar.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = sg1.y;
                iO1 = 8;
                break;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = sg1.y;
                break;
            case 2:
                iO1 = sg1.o1(((Long) obj).longValue());
                break;
            case 3:
                iO1 = sg1.o1(((Long) obj).longValue());
                break;
            case 4:
                iO1 = sg1.o1(((Integer) obj).intValue());
                break;
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = sg1.y;
                iO1 = 8;
                break;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = sg1.y;
                break;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = sg1.y;
                iO1 = 1;
                break;
            case 8:
                if (!(obj instanceof e01)) {
                    iO1 = sg1.l1((String) obj);
                } else {
                    Logger logger6 = sg1.y;
                    size = ((e01) obj).size();
                    iN1 = sg1.n1(size);
                    iO1 = iN1 + size;
                }
                break;
            case 9:
                Logger logger7 = sg1.y;
                iO1 = ((au6) obj).b();
                break;
            case 10:
                if (!(obj instanceof zs5)) {
                    Logger logger8 = sg1.y;
                    size = ((au6) obj).b();
                    iN1 = sg1.n1(size);
                    iO1 = iN1 + size;
                } else {
                    iO1 = sg1.i1((zs5) obj);
                }
                break;
            case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                if (obj instanceof e01) {
                    Logger logger9 = sg1.y;
                    size = ((e01) obj).size();
                    iN1 = sg1.n1(size);
                } else {
                    Logger logger10 = sg1.y;
                    size = ((byte[]) obj).length;
                    iN1 = sg1.n1(size);
                }
                iO1 = iN1 + size;
                break;
            case 12:
                iO1 = sg1.n1(((Integer) obj).intValue());
                break;
            case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                iO1 = !(obj instanceof xi5.a) ? sg1.o1(((Integer) obj).intValue()) : sg1.o1(((xi5.a) obj).a());
                break;
            case 14:
                ((Integer) obj).getClass();
                Logger logger11 = sg1.y;
                break;
            case h4c.e /* 15 */:
                ((Long) obj).getClass();
                Logger logger12 = sg1.y;
                iO1 = 8;
                break;
            case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                iO1 = sg1.j1(((Integer) obj).intValue());
                break;
            case 17:
                iO1 = sg1.k1(((Long) obj).longValue());
                break;
            default:
                ru3.d("There is no way to get here, but the compiler thinks otherwise.");
                iO1 = 0;
                break;
        }
        return iO1 + iM1;
    }

    public static int c(a<?> aVar, Object obj) {
        aVar.getClass();
        return b(null, 0, obj);
    }

    public static int d(Map.Entry entry) {
        a aVar = (a) entry.getKey();
        entry.getValue();
        aVar.q();
        throw null;
    }

    public static <T extends a<T>> boolean f(Map.Entry<T, Object> entry) {
        entry.getKey().q();
        throw null;
    }

    public static void k(sg1 sg1Var, fob fobVar, int i, Object obj) {
        if (fobVar == fob.w) {
            sg1Var.H1(i, 3);
            ((au6) obj).d(sg1Var);
            sg1Var.H1(i, 4);
        }
        sg1Var.H1(i, fobVar.u);
        switch (fobVar.ordinal()) {
            case 0:
                sg1Var.y1(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                sg1Var.w1(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                sg1Var.L1(((Long) obj).longValue());
                break;
            case 3:
                sg1Var.L1(((Long) obj).longValue());
                break;
            case 4:
                sg1Var.A1(((Integer) obj).intValue());
                break;
            case 5:
                sg1Var.y1(((Long) obj).longValue());
                break;
            case 6:
                sg1Var.w1(((Integer) obj).intValue());
                break;
            case 7:
                sg1Var.q1(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof e01)) {
                    sg1Var.G1((String) obj);
                } else {
                    sg1Var.u1((e01) obj);
                }
                break;
            case 9:
                ((au6) obj).d(sg1Var);
                break;
            case 10:
                sg1Var.C1((au6) obj);
                break;
            case z97.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                if (!(obj instanceof e01)) {
                    byte[] bArr = (byte[]) obj;
                    sg1Var.s1(bArr, bArr.length);
                } else {
                    sg1Var.u1((e01) obj);
                }
                break;
            case 12:
                sg1Var.J1(((Integer) obj).intValue());
                break;
            case z97.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                if (!(obj instanceof xi5.a)) {
                    sg1Var.A1(((Integer) obj).intValue());
                } else {
                    sg1Var.A1(((xi5.a) obj).a());
                }
                break;
            case 14:
                sg1Var.w1(((Integer) obj).intValue());
                break;
            case h4c.e /* 15 */:
                sg1Var.y1(((Long) obj).longValue());
                break;
            case Crypto.DEFAULT_BLOCKLENGTH /* 16 */:
                int iIntValue = ((Integer) obj).intValue();
                sg1Var.J1((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                sg1Var.L1((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final su3<T> clone() {
        su3<T> su3Var = new su3<>();
        gs9 gs9Var = this.a;
        if (gs9Var.t.size() > 0) {
            Map.Entry<a<Object>, Object> entryC = gs9Var.c(0);
            su3Var.j(entryC.getKey(), entryC.getValue());
            throw null;
        }
        Iterator it = gs9Var.d().iterator();
        if (!it.hasNext()) {
            su3Var.c = this.c;
            return su3Var;
        }
        Map.Entry entry = (Map.Entry) it.next();
        su3Var.j((a) entry.getKey(), entry.getValue());
        throw null;
    }

    public final boolean e() {
        gs9 gs9Var = this.a;
        if (gs9Var.t.size() > 0) {
            f(gs9Var.c(0));
            throw null;
        }
        Iterator it = gs9Var.d().iterator();
        if (!it.hasNext()) {
            return true;
        }
        f((Map.Entry) it.next());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof su3) {
            return this.a.equals(((su3) obj).a);
        }
        return false;
    }

    public final Iterator<Map.Entry<T, Object>> g() {
        gs9 gs9Var = this.a;
        if (gs9Var.isEmpty()) {
            return Collections.emptyIterator();
        }
        if (!this.c) {
            return ((hs9.c) gs9Var.entrySet()).iterator();
        }
        Iterator<Map.Entry<K, Object>> it = ((hs9.c) gs9Var.entrySet()).iterator();
        zs5.b bVar = new zs5.b();
        bVar.t = it;
        return bVar;
    }

    public final void h() {
        if (this.b) {
            return;
        }
        gs9 gs9Var = this.a;
        int size = gs9Var.t.size();
        for (int i = 0; i < size; i++) {
            Map.Entry<a<Object>, Object> entryC = gs9Var.c(i);
            if (entryC.getValue() instanceof ek4) {
                ek4 ek4Var = (ek4) entryC.getValue();
                ek4Var.getClass();
                ye8 ye8Var = ye8.c;
                ye8Var.getClass();
                ye8Var.a(ek4Var.getClass()).b(ek4Var);
                ek4Var.m();
            }
        }
        gs9Var.f();
        this.b = true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void i(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        entry.getValue();
        key.getClass();
        key.q();
        throw null;
    }

    public final void j(T t, Object obj) {
        t.getClass();
        t.getClass();
        Charset charset = xi5.a;
        obj.getClass();
        throw null;
    }

    public su3() {
        int i = hs9.y;
        this.a = new gs9();
    }
}
