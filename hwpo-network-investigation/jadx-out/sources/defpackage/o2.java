package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.ably.lib.transport.Defaults;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o2<V> implements ListenableFuture<V> {
    public static final boolean w = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger x = Logger.getLogger(o2.class.getName());
    public static final a y;
    public static final Object z;
    public volatile Object t;
    public volatile d u;
    public volatile h v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class a {
        public abstract boolean a(o2<?> o2Var, d dVar, d dVar2);

        public abstract boolean b(o2<?> o2Var, Object obj, Object obj2);

        public abstract boolean c(o2<?> o2Var, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public static final b c;
        public static final b d;
        public final boolean a;
        public final Throwable b;

        static {
            if (o2.w) {
                d = null;
                c = null;
            } else {
                d = new b(null, false);
                c = new b(null, true);
            }
        }

        public b(Throwable th, boolean z) {
            this.a = z;
            this.b = th;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c {
        public final Throwable a;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        static {
            new c(new a("Failure occurred while trying to finish a future."));
        }

        public c(Throwable th) {
            boolean z = o2.w;
            th.getClass();
            this.a = th;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d {
        public static final d d = new d(null, null);
        public final Runnable a;
        public final Executor b;
        public d c;

        public d(Runnable runnable, Executor executor) {
            this.a = runnable;
            this.b = executor;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e extends a {
        public final AtomicReferenceFieldUpdater<h, Thread> a;
        public final AtomicReferenceFieldUpdater<h, h> b;
        public final AtomicReferenceFieldUpdater<o2, h> c;
        public final AtomicReferenceFieldUpdater<o2, d> d;
        public final AtomicReferenceFieldUpdater<o2, Object> e;

        public e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<o2, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<o2, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<o2, Object> atomicReferenceFieldUpdater5) {
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // o2.a
        public final boolean a(o2<?> o2Var, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<o2, d> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.d;
                if (atomicReferenceFieldUpdater.compareAndSet(o2Var, dVar, dVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(o2Var) == dVar);
            return false;
        }

        @Override // o2.a
        public final boolean b(o2<?> o2Var, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<o2, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.e;
                if (atomicReferenceFieldUpdater.compareAndSet(o2Var, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(o2Var) == obj);
            return false;
        }

        @Override // o2.a
        public final boolean c(o2<?> o2Var, h hVar, h hVar2) {
            AtomicReferenceFieldUpdater<o2, h> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.c;
                if (atomicReferenceFieldUpdater.compareAndSet(o2Var, hVar, hVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(o2Var) == hVar);
            return false;
        }

        @Override // o2.a
        public final void d(h hVar, h hVar2) {
            this.b.lazySet(hVar, hVar2);
        }

        @Override // o2.a
        public final void e(h hVar, Thread thread) {
            this.a.lazySet(hVar, thread);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f<V> implements Runnable {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class g extends a {
        @Override // o2.a
        public final boolean a(o2<?> o2Var, d dVar, d dVar2) {
            synchronized (o2Var) {
                try {
                    if (o2Var.u != dVar) {
                        return false;
                    }
                    o2Var.u = dVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // o2.a
        public final boolean b(o2<?> o2Var, Object obj, Object obj2) {
            synchronized (o2Var) {
                try {
                    if (o2Var.t != obj) {
                        return false;
                    }
                    o2Var.t = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // o2.a
        public final boolean c(o2<?> o2Var, h hVar, h hVar2) {
            synchronized (o2Var) {
                try {
                    if (o2Var.v != hVar) {
                        return false;
                    }
                    o2Var.v = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // o2.a
        public final void d(h hVar, h hVar2) {
            hVar.b = hVar2;
        }

        @Override // o2.a
        public final void e(h hVar, Thread thread) {
            hVar.a = thread;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class h {
        public static final h c = new h();
        public volatile Thread a;
        public volatile h b;

        public h() {
            o2.y.e(this, Thread.currentThread());
        }
    }

    static {
        a gVar;
        try {
            gVar = new e(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(o2.class, h.class, Defaults.ABLY_PROTOCOL_VERSION_PARAM), AtomicReferenceFieldUpdater.newUpdater(o2.class, d.class, "u"), AtomicReferenceFieldUpdater.newUpdater(o2.class, Object.class, "t"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        y = gVar;
        if (th != null) {
            x.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        z = new Object();
    }

    public static void f(o2<?> o2Var) {
        h hVar;
        d dVar;
        do {
            hVar = o2Var.v;
        } while (!y.c(o2Var, hVar, h.c));
        while (hVar != null) {
            Thread thread = hVar.a;
            if (thread != null) {
                hVar.a = null;
                LockSupport.unpark(thread);
            }
            hVar = hVar.b;
        }
        o2Var.e();
        do {
            dVar = o2Var.u;
        } while (!y.a(o2Var, dVar, d.d));
        d dVar2 = null;
        while (dVar != null) {
            d dVar3 = dVar.c;
            dVar.c = dVar2;
            dVar2 = dVar;
            dVar = dVar3;
        }
        while (dVar2 != null) {
            d dVar4 = dVar2.c;
            Runnable runnable = dVar2.a;
            if (runnable instanceof f) {
                throw null;
            }
            g(runnable, dVar2.b);
            dVar2 = dVar4;
        }
    }

    public static void g(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            x.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object h(Object obj) throws ExecutionException {
        if (obj instanceof b) {
            Throwable th = ((b) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof c) {
            throw new ExecutionException(((c) obj).a);
        }
        if (obj == z) {
            return null;
        }
        return obj;
    }

    public static Object i(o2 o2Var) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = o2Var.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void Q(Runnable runnable, Executor executor) {
        executor.getClass();
        d dVar = this.u;
        d dVar2 = d.d;
        if (dVar != dVar2) {
            d dVar3 = new d(runnable, executor);
            do {
                dVar3.c = dVar;
                if (y.a(this, dVar, dVar3)) {
                    return;
                } else {
                    dVar = this.u;
                }
            } while (dVar != dVar2);
        }
        g(runnable, executor);
    }

    public final void a(StringBuilder sb) {
        try {
            Object objI = i(this);
            sb.append("SUCCESS, result=[");
            sb.append(objI == this ? "this future" : String.valueOf(objI));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        b bVar;
        Object obj = this.t;
        if ((obj == null) | (obj instanceof f)) {
            if (w) {
                bVar = new b(new CancellationException("Future.cancel() was called."), z2);
            } else {
                bVar = z2 ? b.c : b.d;
            }
            while (!y.b(this, obj, bVar)) {
                obj = this.t;
                if (!(obj instanceof f)) {
                }
            }
            f(this);
            if (obj instanceof f) {
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z2;
        h hVar = h.c;
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.t;
        if ((obj != null) && (!(obj instanceof f))) {
            return (V) h(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar2 = this.v;
            if (hVar2 != hVar) {
                h hVar3 = new h();
                z2 = true;
                while (true) {
                    a aVar = y;
                    aVar.d(hVar3, hVar2);
                    if (aVar.c(this, hVar2, hVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                k(hVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.t;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return (V) h(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        k(hVar3);
                        break;
                    }
                    hVar2 = this.v;
                    if (hVar2 == hVar) {
                    }
                }
            }
            return (V) h(this.t);
        }
        z2 = true;
        while (nanos > 0) {
            Object obj3 = this.t;
            if ((obj3 != null ? z2 : false) && (!(obj3 instanceof f))) {
                return (V) h(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbB = ao3.b("Waited ", j, " ");
        sbB.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbB.toString();
        if (nanos + 1000 < 0) {
            String strConcat = string3.concat(" (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z3 = (jConvert == 0 || nanos2 > 1000) ? z2 : false;
            if (jConvert > 0) {
                String strConcat2 = strConcat + jConvert + " " + lowerCase;
                if (z3) {
                    strConcat2 = strConcat2.concat(",");
                }
                strConcat = strConcat2.concat(" ");
            }
            if (z3) {
                strConcat = strConcat + nanos2 + " nanoseconds ";
            }
            string3 = strConcat.concat("delay)");
        }
        if (isDone()) {
            throw new TimeoutException(string3.concat(" but future completed as timeout expired"));
        }
        throw new TimeoutException(cj2.a(string3, " for ", string));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.t instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        Object obj = this.t;
        return (!(obj instanceof f)) & (obj != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String j() {
        if (this.t instanceof f) {
            return sk0.c("setFuture=[", "null", "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void k(h hVar) {
        hVar.a = null;
        while (true) {
            h hVar2 = this.v;
            if (hVar2 == h.c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.b;
                if (hVar2.a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.b = hVar4;
                    if (hVar3.a == null) {
                    }
                } else if (!y.c(this, hVar2, hVar4)) {
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public boolean l(V v) {
        if (v == null) {
            v = (V) z;
        }
        if (!y.b(this, null, v)) {
            return false;
        }
        f(this);
        return true;
    }

    public boolean m(Throwable th) {
        th.getClass();
        if (!y.b(this, null, new c(th))) {
            return false;
        }
        f(this);
        return true;
    }

    public final String toString() {
        String strJ;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.t instanceof b) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                strJ = j();
            } catch (RuntimeException e2) {
                strJ = "Exception thrown from implementation: " + e2.getClass();
            }
            if (strJ != null && !strJ.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strJ);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void e() {
    }

    @Override // java.util.concurrent.Future
    public final V get() throws InterruptedException {
        Object obj;
        h hVar = h.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.t;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return (V) h(obj2);
            }
            h hVar2 = this.v;
            if (hVar2 != hVar) {
                h hVar3 = new h();
                do {
                    a aVar = y;
                    aVar.d(hVar3, hVar2);
                    if (aVar.c(this, hVar2, hVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.t;
                            } else {
                                k(hVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return (V) h(obj);
                    }
                    hVar2 = this.v;
                } while (hVar2 != hVar);
            }
            return (V) h(this.t);
        }
        throw new InterruptedException();
    }
}
