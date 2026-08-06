package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.ably.lib.transport.Defaults;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
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
import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b1<V> extends fj5 implements ListenableFuture<V> {
    public static final boolean w;
    public static final rz5 x;
    public static final a y;
    public static final Object z;
    public volatile Object t;
    public volatile d u;
    public volatile k v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class a {
        public abstract boolean a(b1<?> b1Var, d dVar, d dVar2);

        public abstract boolean b(b1<?> b1Var, Object obj, Object obj2);

        public abstract boolean c(b1<?> b1Var, k kVar, k kVar2);

        public abstract d d(b1<?> b1Var, d dVar);

        public abstract k e(b1 b1Var);

        public abstract void f(k kVar, k kVar2);

        public abstract void g(k kVar, Thread thread);
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class b {
        public static final b c;
        public static final b d;
        public final boolean a;
        public final Throwable b;

        static {
            if (b1.w) {
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
        public static final c b = new c(new a("Failure occurred while trying to finish a future."));
        public final Throwable a;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a extends Throwable {
            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public c(Throwable th) {
            th.getClass();
            this.a = th;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class e extends a {
        public final AtomicReferenceFieldUpdater<k, Thread> a;
        public final AtomicReferenceFieldUpdater<k, k> b;
        public final AtomicReferenceFieldUpdater<? super b1<?>, k> c;
        public final AtomicReferenceFieldUpdater<? super b1<?>, d> d;
        public final AtomicReferenceFieldUpdater<? super b1<?>, Object> e;

        public e(AtomicReferenceFieldUpdater<k, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<k, k> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<? super b1<?>, k> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<? super b1<?>, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<? super b1<?>, Object> atomicReferenceFieldUpdater5) {
            this.a = atomicReferenceFieldUpdater;
            this.b = atomicReferenceFieldUpdater2;
            this.c = atomicReferenceFieldUpdater3;
            this.d = atomicReferenceFieldUpdater4;
            this.e = atomicReferenceFieldUpdater5;
        }

        @Override // b1.a
        public final boolean a(b1<?> b1Var, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<? super b1<?>, d> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.d;
                if (atomicReferenceFieldUpdater.compareAndSet(b1Var, dVar, dVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(b1Var) == dVar);
            return false;
        }

        @Override // b1.a
        public final boolean b(b1<?> b1Var, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater<? super b1<?>, Object> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.e;
                if (atomicReferenceFieldUpdater.compareAndSet(b1Var, obj, obj2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(b1Var) == obj);
            return false;
        }

        @Override // b1.a
        public final boolean c(b1<?> b1Var, k kVar, k kVar2) {
            AtomicReferenceFieldUpdater<? super b1<?>, k> atomicReferenceFieldUpdater;
            do {
                atomicReferenceFieldUpdater = this.c;
                if (atomicReferenceFieldUpdater.compareAndSet(b1Var, kVar, kVar2)) {
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(b1Var) == kVar);
            return false;
        }

        @Override // b1.a
        public final d d(b1<?> b1Var, d dVar) {
            return this.d.getAndSet(b1Var, dVar);
        }

        @Override // b1.a
        public final k e(b1 b1Var) {
            return this.c.getAndSet(b1Var, k.c);
        }

        @Override // b1.a
        public final void f(k kVar, k kVar2) {
            this.b.lazySet(kVar, kVar2);
        }

        @Override // b1.a
        public final void g(k kVar, Thread thread) {
            this.a.lazySet(kVar, thread);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class f<V> implements Runnable {
        public final b1<V> t;
        public final ListenableFuture<? extends V> u;

        public f(b1<V> b1Var, ListenableFuture<? extends V> listenableFuture) {
            this.t = b1Var;
            this.u = listenableFuture;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.t.t != this) {
                return;
            }
            if (b1.y.b(this.t, this, b1.h(this.u))) {
                b1.e(this.t, false);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class g extends a {
        @Override // b1.a
        public final boolean a(b1<?> b1Var, d dVar, d dVar2) {
            synchronized (b1Var) {
                try {
                    if (b1Var.u != dVar) {
                        return false;
                    }
                    b1Var.u = dVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // b1.a
        public final boolean b(b1<?> b1Var, Object obj, Object obj2) {
            synchronized (b1Var) {
                try {
                    if (b1Var.t != obj) {
                        return false;
                    }
                    b1Var.t = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // b1.a
        public final boolean c(b1<?> b1Var, k kVar, k kVar2) {
            synchronized (b1Var) {
                try {
                    if (b1Var.v != kVar) {
                        return false;
                    }
                    b1Var.v = kVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // b1.a
        public final d d(b1<?> b1Var, d dVar) {
            d dVar2;
            synchronized (b1Var) {
                try {
                    dVar2 = b1Var.u;
                    if (dVar2 != dVar) {
                        b1Var.u = dVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return dVar2;
        }

        @Override // b1.a
        public final k e(b1 b1Var) {
            k kVar;
            k kVar2 = k.c;
            synchronized (b1Var) {
                try {
                    kVar = b1Var.v;
                    if (kVar != kVar2) {
                        b1Var.v = kVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return kVar;
        }

        @Override // b1.a
        public final void f(k kVar, k kVar2) {
            kVar.b = kVar2;
        }

        @Override // b1.a
        public final void g(k kVar, Thread thread) {
            kVar.a = thread;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public interface h<V> extends ListenableFuture<V> {
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static abstract class i<V> extends b1<V> implements h<V> {
        @Override // defpackage.b1, java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.t instanceof b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class j extends a {
        public static final Unsafe a;
        public static final long b;
        public static final long c;
        public static final long d;
        public static final long e;
        public static final long f;

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        public class a implements PrivilegedExceptionAction<Unsafe> {
            public static Unsafe a() throws IllegalAccessException {
                for (Field field : Unsafe.class.getDeclaredFields()) {
                    field.setAccessible(true);
                    Object obj = field.get(null);
                    if (Unsafe.class.isInstance(obj)) {
                        return (Unsafe) Unsafe.class.cast(obj);
                    }
                }
                throw new NoSuchFieldError("the Unsafe");
            }

            @Override // java.security.PrivilegedExceptionAction
            public final /* bridge */ /* synthetic */ Unsafe run() {
                return a();
            }
        }

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new a());
                }
                try {
                    c = unsafe.objectFieldOffset(b1.class.getDeclaredField(Defaults.ABLY_PROTOCOL_VERSION_PARAM));
                    b = unsafe.objectFieldOffset(b1.class.getDeclaredField("u"));
                    d = unsafe.objectFieldOffset(b1.class.getDeclaredField("t"));
                    e = unsafe.objectFieldOffset(k.class.getDeclaredField("a"));
                    f = unsafe.objectFieldOffset(k.class.getDeclaredField("b"));
                    a = unsafe;
                } catch (NoSuchFieldException e2) {
                    d55.a(e2);
                }
            } catch (PrivilegedActionException e3) {
                jl.a("Could not initialize intrinsics", e3.getCause());
            }
        }

        @Override // b1.a
        public final boolean a(b1<?> b1Var, d dVar, d dVar2) {
            return d1.a(a, b1Var, b, dVar, dVar2);
        }

        @Override // b1.a
        public final boolean b(b1<?> b1Var, Object obj, Object obj2) {
            return e1.a(a, b1Var, d, obj, obj2);
        }

        @Override // b1.a
        public final boolean c(b1<?> b1Var, k kVar, k kVar2) {
            return c1.a(a, b1Var, c, kVar, kVar2);
        }

        @Override // b1.a
        public final d d(b1<?> b1Var, d dVar) {
            d dVar2;
            do {
                dVar2 = b1Var.u;
                if (dVar == dVar2) {
                    break;
                }
            } while (!a(b1Var, dVar2, dVar));
            return dVar2;
        }

        @Override // b1.a
        public final k e(b1 b1Var) {
            k kVar;
            k kVar2 = k.c;
            do {
                kVar = b1Var.v;
                if (kVar2 == kVar) {
                    break;
                }
            } while (!c(b1Var, kVar, kVar2));
            return kVar;
        }

        @Override // b1.a
        public final void f(k kVar, k kVar2) {
            a.putObject(kVar, f, kVar2);
        }

        @Override // b1.a
        public final void g(k kVar, Thread thread) {
            a.putObject(kVar, e, thread);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class k {
        public static final k c = new k();
        public volatile Thread a;
        public volatile k b;

        public k() {
            b1.y.g(this, Thread.currentThread());
        }
    }

    static {
        boolean z2;
        Throwable th;
        a gVar;
        try {
            z2 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z2 = false;
        }
        w = z2;
        x = new rz5(b1.class);
        Throwable th2 = null;
        try {
            gVar = new j();
            th = null;
        } catch (Error | Exception e2) {
            th = e2;
            try {
                gVar = new e(AtomicReferenceFieldUpdater.newUpdater(k.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(k.class, k.class, "b"), AtomicReferenceFieldUpdater.newUpdater(b1.class, k.class, Defaults.ABLY_PROTOCOL_VERSION_PARAM), AtomicReferenceFieldUpdater.newUpdater(b1.class, d.class, "u"), AtomicReferenceFieldUpdater.newUpdater(b1.class, Object.class, "t"));
            } catch (Error | Exception e3) {
                th2 = e3;
                gVar = new g();
            }
        }
        y = gVar;
        if (th2 != null) {
            rz5 rz5Var = x;
            Logger loggerA = rz5Var.a();
            Level level = Level.SEVERE;
            loggerA.log(level, "UnsafeAtomicHelper is broken!", th);
            rz5Var.a().log(level, "SafeAtomicHelper is broken!", th2);
        }
        z = new Object();
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
    public static void e(b1<?> b1Var, boolean z2) {
        d dVar = null;
        while (true) {
            for (k kVarE = y.e(b1Var); kVarE != null; kVarE = kVarE.b) {
                Thread thread = kVarE.a;
                if (thread != null) {
                    kVarE.a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z2) {
                b1Var.i();
                z2 = false;
            }
            b1Var.c();
            d dVar2 = dVar;
            d dVarD = y.d(b1Var, d.d);
            d dVar3 = dVar2;
            while (dVarD != null) {
                d dVar4 = dVarD.c;
                dVarD.c = dVar3;
                dVar3 = dVarD;
                dVarD = dVar4;
            }
            while (dVar3 != null) {
                dVar = dVar3.c;
                Runnable runnable = dVar3.a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof f) {
                    f fVar = (f) runnable;
                    b1Var = fVar.t;
                    if (b1Var.t == fVar) {
                        if (y.b(b1Var, fVar, h(fVar.u))) {
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = dVar3.b;
                    Objects.requireNonNull(executor);
                    f(runnable, executor);
                }
                dVar3 = dVar;
            }
            return;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            x.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    public static Object g(Object obj) throws ExecutionException {
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

    /* JADX WARN: Multi-variable type inference failed */
    public static Object h(ListenableFuture<?> listenableFuture) {
        Object obj;
        Throwable thA;
        if (listenableFuture instanceof h) {
            Object bVar = ((b1) listenableFuture).t;
            if (bVar instanceof b) {
                b bVar2 = (b) bVar;
                if (bVar2.a) {
                    bVar = bVar2.b != null ? new b(bVar2.b, false) : b.d;
                }
            }
            Objects.requireNonNull(bVar);
            return bVar;
        }
        if ((listenableFuture instanceof fj5) && (thA = ((fj5) listenableFuture).a()) != null) {
            return new c(thA);
        }
        boolean zIsCancelled = listenableFuture.isCancelled();
        boolean z2 = true;
        if ((!w) && zIsCancelled) {
            b bVar3 = b.d;
            Objects.requireNonNull(bVar3);
            return bVar3;
        }
        boolean z3 = false;
        while (true) {
            try {
                try {
                    try {
                        obj = listenableFuture.get();
                        break;
                    } catch (Error e2) {
                        e = e2;
                        return new c(e);
                    }
                } catch (InterruptedException unused) {
                    z3 = z2;
                } catch (Throwable th) {
                    if (z3) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (Error | Exception e3) {
                e = e3;
                return new c(e);
            } catch (CancellationException e4) {
                if (zIsCancelled) {
                    return new b(e4, false);
                }
                return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + listenableFuture, e4));
            } catch (ExecutionException e5) {
                if (!zIsCancelled) {
                    return new c(e5.getCause());
                }
                return new b(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture, e5), false);
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        if (!zIsCancelled) {
            return obj == null ? z : obj;
        }
        return new b(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + listenableFuture), false);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void Q(Runnable runnable, Executor executor) {
        d dVar;
        xl7.n(executor, "Executor was null.");
        if (!isDone() && (dVar = this.u) != d.d) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.c = dVar;
                if (y.a(this, dVar, dVar2)) {
                    return;
                } else {
                    dVar = this.u;
                }
            } while (dVar != d.d);
        }
        f(runnable, executor);
    }

    @Override // defpackage.fj5
    public final Throwable a() {
        if (!(this instanceof h)) {
            return null;
        }
        Object obj = this.t;
        if (obj instanceof c) {
            return ((c) obj).a;
        }
        return null;
    }

    public final void b(StringBuilder sb) {
        V v;
        boolean z2 = false;
        while (true) {
            try {
                try {
                    v = get();
                    break;
                } catch (InterruptedException unused) {
                    z2 = true;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (ExecutionException e2) {
                sb.append("FAILURE, cause=[");
                sb.append(e2.getCause());
                sb.append("]");
                return;
            } catch (Exception e3) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e3.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        d(sb, v);
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z2) {
        b bVar;
        Object obj = this.t;
        if (!(obj == null) && !(obj instanceof f)) {
            return false;
        }
        if (w) {
            bVar = new b(new CancellationException("Future.cancel() was called."), z2);
        } else {
            bVar = z2 ? b.c : b.d;
            Objects.requireNonNull(bVar);
        }
        boolean z3 = false;
        while (true) {
            if (y.b(this, obj, bVar)) {
                e(this, z2);
                if (obj instanceof f) {
                    ListenableFuture<? extends V> listenableFuture = ((f) obj).u;
                    if (listenableFuture instanceof h) {
                        this = (b1) listenableFuture;
                        obj = this.t;
                        if ((obj == null) | (obj instanceof f)) {
                            z3 = true;
                        }
                    } else {
                        listenableFuture.cancel(z2);
                    }
                }
                return true;
            }
            obj = this.t;
            if (!(obj instanceof f)) {
                return z3;
            }
        }
    }

    public final void d(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public V get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        boolean z2;
        long j3;
        k kVar = k.c;
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.t;
        if ((obj != null) && (!(obj instanceof f))) {
            return (V) g(obj);
        }
        long j4 = 0;
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            k kVar2 = this.v;
            if (kVar2 != kVar) {
                k kVar3 = new k();
                z2 = true;
                while (true) {
                    a aVar = y;
                    aVar.f(kVar3, kVar2);
                    if (aVar.c(this, kVar2, kVar3)) {
                        j3 = j4;
                        do {
                            LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                            if (Thread.interrupted()) {
                                k(kVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.t;
                            if ((obj2 != null) && (!(obj2 instanceof f))) {
                                return (V) g(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        k(kVar3);
                        break;
                    }
                    long j5 = j4;
                    kVar2 = this.v;
                    if (kVar2 != kVar) {
                        j4 = j5;
                    }
                }
            }
            Object obj3 = this.t;
            Objects.requireNonNull(obj3);
            return (V) g(obj3);
        }
        z2 = true;
        j3 = 0;
        while (nanos > j3) {
            Object obj4 = this.t;
            if ((obj4 != null ? z2 : false) && (!(obj4 instanceof f))) {
                return (V) g(obj4);
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
        StringBuilder sbB = ao3.b("Waited ", j2, " ");
        sbB.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbB.toString();
        if (nanos + 1000 < j3) {
            String strConcat = string3.concat(" (plus ");
            long j6 = -nanos;
            long jConvert = timeUnit.convert(j6, TimeUnit.NANOSECONDS);
            long nanos2 = j6 - timeUnit.toNanos(jConvert);
            boolean z3 = (jConvert == j3 || nanos2 > 1000) ? z2 : false;
            if (jConvert > j3) {
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
    public boolean isCancelled() {
        return this.t instanceof b;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.t;
        return (!(obj instanceof f)) & (obj != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String j() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void k(k kVar) {
        kVar.a = null;
        while (true) {
            k kVar2 = this.v;
            if (kVar2 == k.c) {
                return;
            }
            k kVar3 = null;
            while (kVar2 != null) {
                k kVar4 = kVar2.b;
                if (kVar2.a != null) {
                    kVar3 = kVar2;
                } else if (kVar3 != null) {
                    kVar3.b = kVar4;
                    if (kVar3.a == null) {
                    }
                } else if (!y.c(this, kVar2, kVar4)) {
                }
                kVar2 = kVar4;
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
        e(this, false);
        return true;
    }

    public boolean m(Throwable th) {
        th.getClass();
        if (!y.b(this, null, new c(th))) {
            return false;
        }
        e(this, false);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    public boolean n(ListenableFuture<? extends V> listenableFuture) {
        c cVar;
        listenableFuture.getClass();
        Object obj = this.t;
        if (obj != null) {
            if (obj instanceof b) {
                listenableFuture.cancel(((b) obj).a);
            }
        } else if (listenableFuture.isDone()) {
            if (y.b(this, null, h(listenableFuture))) {
                e(this, false);
                return true;
            }
        } else {
            f fVar = new f(this, listenableFuture);
            if (y.b(this, null, fVar)) {
                try {
                    listenableFuture.Q(fVar, y03.t);
                    return true;
                } catch (Throwable th) {
                    try {
                        cVar = new c(th);
                    } catch (Error | Exception unused) {
                        cVar = c.b;
                    }
                    y.b(this, fVar, cVar);
                    return true;
                }
            }
            obj = this.t;
            if (obj instanceof b) {
                listenableFuture.cancel(((b) obj).a);
            }
        }
        return false;
    }

    public final boolean o() {
        Object obj = this.t;
        return (obj instanceof b) && ((b) obj).a;
    }

    public String toString() {
        String strJ;
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            int length = sb.length();
            sb.append("PENDING");
            Object obj = this.t;
            if (obj instanceof f) {
                sb.append(", setFuture=[");
                ListenableFuture<? extends V> listenableFuture = ((f) obj).u;
                try {
                    if (listenableFuture == this) {
                        sb.append("this future");
                    } else {
                        sb.append(listenableFuture);
                    }
                } catch (Exception e2) {
                    e = e2;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                } catch (StackOverflowError e3) {
                    e = e3;
                    sb.append("Exception thrown from implementation: ");
                    sb.append(e.getClass());
                }
                sb.append("]");
            } else {
                try {
                    strJ = j();
                    if (m20.c(strJ)) {
                        strJ = null;
                    }
                } catch (Exception | StackOverflowError e4) {
                    strJ = "Exception thrown from implementation: " + e4.getClass();
                }
                if (strJ != null) {
                    sb.append(", info=[");
                    sb.append(strJ);
                    sb.append("]");
                }
            }
            if (isDone()) {
                sb.delete(length, sb.length());
                b(sb);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class d {
        public static final d d = new d();
        public final Runnable a;
        public final Executor b;
        public d c;

        public d() {
            this.a = null;
            this.b = null;
        }

        public d(Runnable runnable, Executor executor) {
            this.a = runnable;
            this.b = executor;
        }
    }

    public void c() {
    }

    public void i() {
    }

    @Override // java.util.concurrent.Future
    public V get() throws InterruptedException {
        Object obj;
        k kVar = k.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.t;
            if ((obj2 != null) & (!(obj2 instanceof f))) {
                return (V) g(obj2);
            }
            k kVar2 = this.v;
            if (kVar2 != kVar) {
                k kVar3 = new k();
                do {
                    a aVar = y;
                    aVar.f(kVar3, kVar2);
                    if (aVar.c(this, kVar2, kVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.t;
                            } else {
                                k(kVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return (V) g(obj);
                    }
                    kVar2 = this.v;
                } while (kVar2 != kVar);
            }
            Object obj3 = this.t;
            Objects.requireNonNull(obj3);
            return (V) g(obj3);
        }
        throw new InterruptedException();
    }
}
