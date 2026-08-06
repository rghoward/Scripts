package defpackage;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p8d implements b9d {
    public static final String h = new String();
    public final Level a;
    public final long b;
    public o8d c;
    public x8d d;
    public i9d e;
    public gyb f;
    public Object[] g;

    public p8d(Level level) {
        dyb.a.getClass();
        long nanos = TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        qzb.a(level, "level");
        this.a = level;
        this.b = nanos;
    }

    @Override // defpackage.b9d
    public final void a(String str, Object[] objArr) {
        o8d o8dVar;
        if (this.d == null) {
            dyb.a.a().getClass();
            this.d = x8d.a;
        }
        y8d y8dVarB = this.d;
        if (y8dVarB != x8d.a) {
            o8d o8dVar2 = this.c;
            if (o8dVar2 != null && o8dVar2.y > 0) {
                qzb.a(y8dVarB, "logSiteKey");
                int i = o8dVar2.y;
                for (int i2 = 0; i2 < i; i2++) {
                    if (n8d.f.equals(o8dVar2.d1(i2))) {
                        Object objE1 = o8dVar2.e1(i2);
                        y8dVarB = objE1 instanceof c9d ? ((c9d) objE1).b() : new m9d(y8dVarB, objE1);
                    }
                }
            }
        } else {
            y8dVarB = null;
        }
        boolean zD = d(y8dVarB);
        i9d i9dVar = this.e;
        if (i9dVar != null) {
            h9d h9dVar = (h9d) h9d.c.k(y8dVarB, this.c);
            AtomicInteger atomicInteger = h9dVar.b;
            AtomicBoolean atomicBoolean = h9dVar.a;
            int iIncrementAndGet = atomicInteger.incrementAndGet();
            int i3 = -1;
            if (i9dVar != i9d.a && atomicBoolean.compareAndSet(false, true)) {
                try {
                    i9dVar.a();
                    atomicBoolean.set(false);
                    atomicInteger.addAndGet(-iIncrementAndGet);
                    i3 = (-1) + iIncrementAndGet;
                } catch (Throwable th) {
                    atomicBoolean.set(false);
                    throw th;
                }
            }
            if (zD && i3 > 0 && (o8dVar = this.c) != null) {
                o8dVar.h1(n8d.e, Integer.valueOf(i3));
            }
            zD &= i3 >= 0;
        }
        if (zD) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            this.g = objArrCopyOf;
            for (int i4 = 0; i4 < objArrCopyOf.length; i4++) {
                Object obj = objArrCopyOf[i4];
                if (obj instanceof k8d) {
                    objArrCopyOf[i4] = ((k8d) obj).a();
                }
            }
            if (str != h) {
                this.f = new gyb(c(), str);
            }
            gzb gzbVarB = dyb.a.c().b();
            if (!gzbVarB.a.isEmpty()) {
                ln4 ln4VarG = g();
                d9d d9dVar = n8d.h;
                gzb gzbVar = (gzb) ln4VarG.g1(d9dVar);
                if (gzbVar != null) {
                    ezb ezbVar = gzbVar.a;
                    if (!ezbVar.isEmpty()) {
                        ezb ezbVar2 = gzbVarB.a;
                        if (!ezbVar2.isEmpty()) {
                            gzbVar = new gzb(new ezb(ezbVar2, ezbVar));
                        }
                        gzbVarB = gzbVar;
                    }
                }
                h(d9dVar, gzbVarB);
            }
            l4c l4cVar = e().a;
            try {
                szb szbVar = (szb) szb.u.get();
                int i5 = szbVar.t + 1;
                szbVar.t = i5;
                if (i5 == 0) {
                    throw new AssertionError("Overflow of RecursionDepth (possible error in core library)");
                }
                try {
                    if (i5 <= 100) {
                        l4cVar.o(this);
                    } else {
                        a8d.a("unbounded recursion in log statement", this);
                    }
                    szbVar.close();
                } catch (Throwable th2) {
                    try {
                        szbVar.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (RuntimeException e) {
                try {
                    l4cVar.q(e, this);
                } catch (RuntimeException e2) {
                    String name = e2.getClass().getName();
                    String message = e2.getMessage();
                    StringBuilder sb = new StringBuilder(name.length() + 2 + String.valueOf(message).length());
                    sb.append(name);
                    sb.append(": ");
                    sb.append(message);
                    a8d.a(sb.toString(), this);
                    try {
                        e2.printStackTrace(System.err);
                    } catch (RuntimeException unused) {
                    }
                }
            }
        }
    }

    @Override // defpackage.b9d
    public final b9d b(Throwable th) {
        d9d d9dVar = n8d.a;
        qzb.a(d9dVar, "metadata key");
        if (th != null) {
            h(d9dVar, th);
        }
        return f();
    }

    public abstract mzb c();

    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [i9d] */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [i9d] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r12v0, types: [p8d] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [i9d] */
    /* JADX WARN: Type inference failed for: r13v8, types: [l9d] */
    /* JADX WARN: Type inference failed for: r13v9 */
    public boolean d(y8d y8dVar) {
        int iI1;
        int i;
        f8d f8dVar;
        c8d c8dVar;
        i9d i9dVar;
        ?? r13;
        o8d o8dVar = this.c;
        if (o8dVar != null) {
            if (y8dVar != null) {
                d8d d8dVar = f8d.d;
                if (((e8d) o8dVar.g1(n8d.d)) == null) {
                    f8dVar = null;
                } else {
                    f8d f8dVar2 = (f8d) f8d.d.k(y8dVar, o8dVar);
                    long j = this.b;
                    if (!(j >= 0)) {
                        z90.a("timestamp cannot be negative");
                        return false;
                    }
                    AtomicLong atomicLong = f8dVar2.c;
                    long j2 = atomicLong.get();
                    if (j2 >= 0) {
                        throw null;
                    }
                    atomicLong.compareAndSet(j2, -j);
                    f8dVar = f8dVar2;
                }
                o8d o8dVar2 = this.c;
                b8d b8dVar = c8d.d;
                Integer num = (Integer) o8dVar2.g1(n8d.b);
                e9d e9dVar = i9d.a;
                if (num == null) {
                    i9dVar = null;
                } else {
                    c8dVar = (c8d) c8d.d.k(y8dVar, o8dVar2);
                    if (c8dVar.c.incrementAndGet() < num.intValue()) {
                        i9dVar = c8dVar;
                        i9dVar = e9dVar;
                    }
                }
                i9dVar = c8dVar;
                e9d e9dVar2 = i9d.b;
                ?? f9dVar = f8dVar;
                f9dVar = f8dVar;
                f9dVar = f8dVar;
                if (f8dVar == null) {
                    f9dVar = i9dVar;
                } else if (i9dVar != null && f8dVar != e9dVar && i9dVar != e9dVar2) {
                    if (i9dVar == e9dVar || f8dVar == e9dVar2) {
                        f9dVar = i9dVar;
                    } else {
                        f9dVar = new f9d(f8dVar, i9dVar);
                    }
                }
                o8d o8dVar3 = this.c;
                j9d j9dVar = l9d.d;
                Integer num2 = (Integer) o8dVar3.g1(n8d.c);
                if (num2 == null || num2.intValue() <= 0) {
                    r13 = 0;
                } else {
                    r13 = (l9d) l9d.d.k(y8dVar, o8dVar3);
                    int iNextInt = ((Random) l9d.e.get()).nextInt(num2.intValue());
                    AtomicInteger atomicInteger = r13.c;
                    if ((iNextInt == 0 ? atomicInteger.incrementAndGet() : atomicInteger.get()) <= 0) {
                        r13 = e9dVar;
                    }
                }
                if (f9dVar == 0) {
                    f9dVar = r13;
                } else if (r13 != 0 && f9dVar != e9dVar && r13 != e9dVar2) {
                    if (r13 == e9dVar || f9dVar == e9dVar2) {
                        f9dVar = r13;
                    } else {
                        f9dVar = new f9d(f9dVar, r13);
                    }
                }
                this.e = f9dVar;
                if (f9dVar == e9dVar) {
                    return false;
                }
            }
            o8d o8dVar4 = this.c;
            d9d d9dVar = n8d.i;
            n9d n9dVar = (n9d) o8dVar4.g1(d9dVar);
            if (n9dVar != null) {
                o8d o8dVar5 = this.c;
                if (o8dVar5 != null && (iI1 = o8dVar5.i1(d9dVar)) >= 0) {
                    int i2 = iI1 + iI1;
                    int i3 = i2 + 2;
                    while (true) {
                        i = o8dVar5.y;
                        if (i3 >= i + i) {
                            break;
                        }
                        Object obj = o8dVar5.x[i3];
                        if (!obj.equals(d9dVar)) {
                            Object[] objArr = o8dVar5.x;
                            objArr[i2] = obj;
                            objArr[i2 + 1] = objArr[i3 + 1];
                            i2 += 2;
                        }
                        i3 += 2;
                    }
                    o8dVar5.y = i - ((i3 - i2) >> 1);
                    while (i2 < i3) {
                        o8dVar5.x[i2] = null;
                        i2++;
                    }
                }
                ln4 ln4VarG = g();
                d9d d9dVar2 = n8d.a;
                Throwable th = (Throwable) ln4VarG.g1(d9dVar2);
                int i4 = n9dVar.t;
                String[] strArr = pzb.a;
                if (i4 <= 0 && i4 != -1) {
                    z90.a("invalid maximum depth: 0");
                    return false;
                }
                StackTraceElement[] stackTraceElementArrA = pzb.b.a(i4);
                a9d a9dVar = new a9d(n9dVar.toString(), th);
                a9dVar.setStackTrace(stackTraceElementArrA);
                h(d9dVar2, a9dVar);
            }
        }
        return true;
    }

    public abstract j8d e();

    public abstract h8d f();

    public final ln4 g() {
        o8d o8dVar = this.c;
        return o8dVar != null ? o8dVar : aad.x;
    }

    public final void h(d9d d9dVar, Object obj) {
        if (this.c == null) {
            o8d o8dVar = new o8d(28);
            o8dVar.x = new Object[8];
            o8dVar.y = 0;
            this.c = o8dVar;
        }
        this.c.h1(d9dVar, obj);
    }

    @Override // defpackage.b9d
    public final b9d k() {
        v8d v8dVar = x8d.a;
        w8d w8dVar = new w8d();
        if (this.d == null) {
            this.d = w8dVar;
        }
        return f();
    }
}
