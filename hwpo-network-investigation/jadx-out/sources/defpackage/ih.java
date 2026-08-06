package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ih<InputT, OutputT> extends jh<OutputT> {
    public static final rz5 G = new rz5(ih.class);
    public b95<? extends ListenableFuture<? extends InputT>> E;
    public final boolean F;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a {
        public static final a t;
        public static final a u;
        public static final /* synthetic */ a[] v;

        static {
            a aVar = new a("OUTPUT_FUTURE_DONE", 0);
            t = aVar;
            a aVar2 = new a("ALL_INPUT_FUTURES_PROCESSED", 1);
            u = aVar2;
            v = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) v.clone();
        }
    }

    public ih(b95 b95Var, boolean z) {
        int size = b95Var.size();
        this.A = null;
        this.B = size;
        this.E = b95Var;
        this.F = z;
    }

    @Override // defpackage.b1
    public final void c() {
        b95<? extends ListenableFuture<? extends InputT>> b95Var = this.E;
        u(a.t);
        if ((this.t instanceof b1.b) && (b95Var != null)) {
            boolean zO = o();
            w2b it = b95Var.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zO);
            }
        }
    }

    @Override // defpackage.b1
    public final String j() {
        b95<? extends ListenableFuture<? extends InputT>> b95Var = this.E;
        if (b95Var == null) {
            return super.j();
        }
        return "futures=" + b95Var;
    }

    public final void p(b95<? extends Future<? extends InputT>> b95Var) {
        int iB = jh.C.b(this);
        xl7.q("Less than 0 remaining futures", iB >= 0);
        if (iB == 0) {
            if (b95Var != null) {
                w2b it = b95Var.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        boolean z = false;
                        while (true) {
                            try {
                                future.get();
                                break;
                            } catch (InterruptedException unused) {
                                z = true;
                            } catch (Throwable th) {
                                if (z) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        }
                        if (z) {
                            try {
                                Thread.currentThread().interrupt();
                            } catch (ExecutionException e) {
                                r(e.getCause());
                            } catch (Throwable th2) {
                                r(th2);
                            }
                        }
                    }
                }
            }
            this.A = null;
            q();
            u(a.u);
        }
    }

    public abstract void q();

    public final void r(Throwable th) {
        th.getClass();
        if (this.F && !m(th)) {
            Set<Throwable> set = this.A;
            if (set == null) {
                Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
                setNewSetFromMap.getClass();
                if (!(this.t instanceof b1.b)) {
                    Throwable thA = a();
                    Objects.requireNonNull(thA);
                    while (thA != null && setNewSetFromMap.add(thA)) {
                        thA = thA.getCause();
                    }
                }
                jh.C.a(this, setNewSetFromMap);
                Set<Throwable> set2 = this.A;
                Objects.requireNonNull(set2);
                set = set2;
            }
            Throwable cause = th;
            while (true) {
                if (cause == null) {
                    G.a().log(Level.SEVERE, th instanceof Error ? "Input Future failed with Error" : "Got more than one input Future failure. Logging failures after the first", th);
                    return;
                } else if (!set.add(cause)) {
                    break;
                } else {
                    cause = cause.getCause();
                }
            }
        }
        if (th instanceof Error) {
            G.a().log(Level.SEVERE, "Input Future failed with Error", th);
        }
    }

    public final void s() {
        Objects.requireNonNull(this.E);
        if (this.E.isEmpty()) {
            q();
            return;
        }
        boolean z = this.F;
        y03 y03Var = y03.t;
        if (!z) {
            final ij1 ij1Var = (ij1) this;
            final b95 b95Var = null;
            Runnable runnable = new Runnable() { // from class: hh
                @Override // java.lang.Runnable
                public final void run() {
                    ij1Var.p(b95Var);
                }
            };
            w2b it = this.E.iterator();
            while (it.hasNext()) {
                ListenableFuture listenableFuture = (ListenableFuture) it.next();
                if (listenableFuture.isDone()) {
                    p(null);
                } else {
                    listenableFuture.Q(runnable, y03Var);
                }
            }
            return;
        }
        w2b it2 = this.E.iterator();
        final int i = 0;
        while (it2.hasNext()) {
            final ListenableFuture<? extends InputT> listenableFuture2 = (ListenableFuture) it2.next();
            int i2 = i + 1;
            if (listenableFuture2.isDone()) {
                t(i, listenableFuture2);
            } else {
                final ij1 ij1Var2 = (ij1) this;
                listenableFuture2.Q(new Runnable() { // from class: gh
                    @Override // java.lang.Runnable
                    public final void run() {
                        ij1Var2.t(i, listenableFuture2);
                    }
                }, y03Var);
            }
            i = i2;
        }
    }

    public final void t(int i, ListenableFuture<? extends InputT> listenableFuture) {
        try {
            boolean z = false;
            if (listenableFuture.isCancelled()) {
                this.E = null;
                cancel(false);
            } else {
                while (true) {
                    try {
                        try {
                            listenableFuture.get();
                            break;
                        } catch (InterruptedException unused) {
                            z = true;
                        } catch (Throwable th) {
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (ExecutionException e) {
                        r(e.getCause());
                    } catch (Throwable th2) {
                        r(th2);
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
            p(null);
        } catch (Throwable th3) {
            p(null);
            throw th3;
        }
    }

    public void u(a aVar) {
        this.E = null;
    }
}
