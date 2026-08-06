package defpackage;

import android.view.DragEvent;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.io.Serializable;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class yk2 {
    public static final ji8 a(f37 f37Var) {
        return new ji8(f37Var, null);
    }

    public static final li8 b(a0a a0aVar) {
        return new li8(a0aVar, null);
    }

    public static r54 c(r54 r54Var, int i) {
        xx0 xx0Var;
        if (i < 0 && i != -2 && i != -1) {
            ca0.a(pp2.a(i, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        if (i == -1) {
            i = 0;
            xx0Var = xx0.u;
        } else {
            xx0Var = xx0.t;
        }
        int i2 = i;
        xx0 xx0Var2 = xx0Var;
        return r54Var instanceof ri4 ? ri4.e((ri4) r54Var, null, i2, xx0Var2, 1) : new aa1(r54Var, null, i2, xx0Var2, 2);
    }

    public static final x21 d(ci4 ci4Var) {
        return new x21(ci4Var, ff3.t, -2, xx0.t);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Serializable e(r54 r54Var, s54 s54Var, u02 u02Var) throws Throwable {
        p64 p64Var;
        gl8 gl8Var;
        el5 el5Var;
        CancellationException cancellationExceptionH;
        if (u02Var instanceof p64) {
            p64Var = (p64) u02Var;
            int i = p64Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                p64Var.v = i - Integer.MIN_VALUE;
            } else {
                p64Var = new p64(u02Var);
            }
        } else {
            p64Var = new p64(u02Var);
        }
        Object obj = p64Var.u;
        int i2 = p64Var.v;
        if (i2 == 0) {
            dv8.b(obj);
            gl8 gl8Var2 = new gl8();
            try {
                q64 q64Var = new q64(s54Var, gl8Var2);
                p64Var.t = gl8Var2;
                p64Var.v = 1;
                Object objCollect = r54Var.collect(q64Var, p64Var);
                v72 v72Var = v72.t;
                if (objCollect == v72Var) {
                    return v72Var;
                }
                return null;
            } catch (Throwable th) {
                th = th;
                gl8Var = gl8Var2;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gl8Var = p64Var.t;
            try {
                dv8.b(obj);
                return null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        Throwable th3 = (Throwable) gl8Var.t;
        if ((th3 != null && th3.equals(th)) || ((el5Var = (el5) p64Var.getContext().d0(el5.a.t)) != null && el5Var.isCancelled() && (cancellationExceptionH = el5Var.H()) != null && cancellationExceptionH.equals(th))) {
            throw th;
        }
        if (th3 == null) {
            return th;
        }
        if (th instanceof CancellationException) {
            fn3.b(th3, th);
            throw th3;
        }
        fn3.b(th, th3);
        throw th;
    }

    public static final Object f(r54 r54Var, ci4 ci4Var, r02 r02Var) {
        int i = a74.a;
        Object objCollect = c(new ba1(new z64(ci4Var, null), r54Var, ff3.t, -2, xx0.t), 0).collect(jc7.t, r02Var);
        v72 v72Var = v72.t;
        if (objCollect != v72Var) {
            objCollect = g2b.a;
        }
        return objCollect == v72Var ? objCollect : g2b.a;
    }

    public static final q91 g(zx0 zx0Var) {
        return new q91(zx0Var, true);
    }

    public static final r54 h(r54 r54Var, final long j) {
        if (j >= 0) {
            return j == 0 ? r54Var : new v54(new h64(new oh4() { // from class: g64
                @Override // defpackage.oh4
                public final Object invoke(Object obj) {
                    return Long.valueOf(j);
                }
            }, r54Var, null));
        }
        z90.a("Debounce timeout should not be negative");
        return null;
    }

    public static final r54 i(r54 r54Var) {
        return ((r54Var instanceof zz9) || (r54Var instanceof p33)) ? r54Var : new p33(r54Var);
    }

    public static final t64 j(r54 r54Var, int i) {
        if (i >= 0) {
            return new t64(r54Var, i);
        }
        ca0.a(pp2.a(i, "Drop count should be non-negative, but had "));
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x006c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, k7a] */
    public static final Object k(r54 r54Var, r02 r02Var) {
        d74 d74Var;
        gl8 gl8Var;
        b0 e;
        b74 b74Var;
        if (r02Var instanceof d74) {
            d74Var = (d74) r02Var;
            int i = d74Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                d74Var.w = i - Integer.MIN_VALUE;
            } else {
                d74Var = new d74(r02Var);
            }
        } else {
            d74Var = new d74(r02Var);
        }
        Object obj = d74Var.v;
        int i2 = d74Var.w;
        ?? r3 = rd7.a;
        if (i2 == 0) {
            dv8.b(obj);
            gl8Var = new gl8();
            gl8Var.t = r3;
            b74 b74Var2 = new b74(gl8Var);
            try {
                d74Var.t = gl8Var;
                d74Var.u = b74Var2;
                d74Var.w = 1;
                Object objCollect = r54Var.collect(b74Var2, d74Var);
                Object obj2 = v72.t;
                if (objCollect == obj2) {
                    return obj2;
                }
            } catch (b0 e2) {
                e = e2;
                b74Var = b74Var2;
                if (e.t == b74Var) {
                    throw e;
                }
                sd.d(d74Var.getContext());
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b74Var = d74Var.u;
            gl8Var = d74Var.t;
            try {
                dv8.b(obj);
            } catch (b0 e3) {
                e = e3;
                if (e.t == b74Var) {
                    throw e;
                }
                sd.d(d74Var.getContext());
            }
        }
        T t = gl8Var.t;
        if (t != r3) {
            return t;
        }
        px1.b("Expected at least one element");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x006e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, k7a] */
    public static final Object l(r54 r54Var, ci4 ci4Var, u02 u02Var) throws Throwable {
        e74 e74Var;
        gl8 gl8Var;
        b0 e;
        c74 c74Var;
        if (u02Var instanceof e74) {
            e74Var = (e74) u02Var;
            int i = e74Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                e74Var.w = i - Integer.MIN_VALUE;
            } else {
                e74Var = new e74(u02Var);
            }
        } else {
            e74Var = new e74(u02Var);
        }
        Object obj = e74Var.v;
        int i2 = e74Var.w;
        ?? r3 = rd7.a;
        if (i2 == 0) {
            dv8.b(obj);
            gl8 gl8Var2 = new gl8();
            gl8Var2.t = r3;
            c74 c74Var2 = new c74(ci4Var, gl8Var2);
            try {
                e74Var.t = gl8Var2;
                e74Var.u = c74Var2;
                e74Var.w = 1;
                Object objCollect = r54Var.collect(c74Var2, e74Var);
                Object obj2 = v72.t;
                if (objCollect == obj2) {
                    return obj2;
                }
                gl8Var = gl8Var2;
            } catch (b0 e2) {
                gl8Var = gl8Var2;
                e = e2;
                c74Var = c74Var2;
                if (e.t == c74Var) {
                    throw e;
                }
                sd.d(e74Var.getContext());
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            c74Var = e74Var.u;
            gl8Var = e74Var.t;
            try {
                dv8.b(obj);
            } catch (b0 e3) {
                e = e3;
                if (e.t == c74Var) {
                    throw e;
                }
                sd.d(e74Var.getContext());
            }
        }
        T t = gl8Var.t;
        if (t != r3) {
            return t;
        }
        px1.b("Expected at least one element matching the predicate");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x0060  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object m(r54 r54Var, u02 u02Var) throws Throwable {
        g74 g74Var;
        gl8 gl8Var;
        b0 e;
        f74 f74Var;
        if (u02Var instanceof g74) {
            g74Var = (g74) u02Var;
            int i = g74Var.w;
            if ((i & Integer.MIN_VALUE) != 0) {
                g74Var.w = i - Integer.MIN_VALUE;
            } else {
                g74Var = new g74(u02Var);
            }
        } else {
            g74Var = new g74(u02Var);
        }
        Object obj = g74Var.v;
        int i2 = g74Var.w;
        if (i2 == 0) {
            dv8.b(obj);
            gl8Var = new gl8();
            f74 f74Var2 = new f74(gl8Var);
            try {
                g74Var.t = gl8Var;
                g74Var.u = f74Var2;
                g74Var.w = 1;
                Object objCollect = r54Var.collect(f74Var2, g74Var);
                Object obj2 = v72.t;
                if (objCollect == obj2) {
                    return obj2;
                }
            } catch (b0 e2) {
                e = e2;
                f74Var = f74Var2;
                if (e.t == f74Var) {
                    throw e;
                }
                sd.d(g74Var.getContext());
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f74Var = g74Var.u;
            gl8Var = g74Var.t;
            try {
                dv8.b(obj);
            } catch (b0 e3) {
                e = e3;
                if (e.t == f74Var) {
                    throw e;
                }
                sd.d(g74Var.getContext());
            }
        }
        return gl8Var.t;
    }

    public static final long n(e53 e53Var) {
        DragEvent dragEvent = e53Var.a;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (((long) Float.floatToRawIntBits(x)) << 32) | (((long) Float.floatToRawIntBits(y)) & 4294967295L);
    }

    public static final dz9 o(r54 r54Var, eg1 eg1Var) {
        return oy0.d(eg1Var, null, null, new f64(r54Var, null), 3);
    }

    public static LocalDate p(long j) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        zoneIdSystemDefault.getClass();
        return Instant.ofEpochSecond(j).atZone(zoneIdSystemDefault).m();
    }

    public static LocalDateTime q(long j) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        zoneIdSystemDefault.getClass();
        return Instant.ofEpochSecond(j).atZone(zoneIdSystemDefault).A();
    }

    public static s64 r(r54 r54Var, ci4 ci4Var) {
        return new s64(r54Var, new r64(ci4Var, null));
    }

    public static final ji8 s(r54 r54Var, t72 t72Var, um9 um9Var, int i) {
        tm9 tm9VarA = i74.a(r54Var, i);
        am9 am9VarA = ty1.a(i, tm9VarA.b, tm9VarA.c);
        return new ji8(am9VarA, oy0.c(t72Var, tm9VarA.d, um9Var.equals(um9.a.a) ? x72.t : x72.w, new h74(um9Var, tm9VarA.a, am9VarA, ty1.d, null)));
    }

    public static final li8 u(r54 r54Var, t72 t72Var, um9 um9Var, Object obj) {
        tm9 tm9VarA = i74.a(r54Var, 1);
        a0a a0aVarB = b0a.b(obj);
        return new li8(a0aVarB, oy0.c(t72Var, tm9VarA.d, um9Var.equals(um9.a.a) ? x72.t : x72.w, new h74(um9Var, tm9VarA.a, a0aVarB, obj, null)));
    }

    public static long v(LocalDate localDate) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        zoneIdSystemDefault.getClass();
        localDate.getClass();
        return localDate.atStartOfDay(zoneIdSystemDefault).toInstant().toEpochMilli();
    }

    public static long w(LocalDateTime localDateTime) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        zoneIdSystemDefault.getClass();
        localDateTime.getClass();
        return localDateTime.K(zoneIdSystemDefault).toInstant().toEpochMilli();
    }

    public static long x(LocalDate localDate) {
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        zoneOffset.getClass();
        localDate.getClass();
        return localDate.atStartOfDay(zoneOffset).toInstant().toEpochMilli();
    }

    public static long y(LocalDate localDate) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        zoneIdSystemDefault.getClass();
        localDate.getClass();
        return localDate.atStartOfDay(zoneIdSystemDefault).toInstant().toEpochMilli() / 1000;
    }

    public static long z(LocalDateTime localDateTime) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        zoneIdSystemDefault.getClass();
        return localDateTime.K(zoneIdSystemDefault).toInstant().toEpochMilli() / 1000;
    }
}
