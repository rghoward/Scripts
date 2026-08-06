package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class id9 implements Executor {
    public static final rz5 y = new rz5(id9.class);
    public final Executor t;
    public final ArrayDeque u = new ArrayDeque();
    public c v = c.t;
    public long w = 0;
    public final b x = new b();

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public class a implements Runnable {
        public final /* synthetic */ Runnable t;

        public a(Runnable runnable) {
            this.t = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.t.run();
        }

        public final String toString() {
            return this.t.toString();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public final class b implements Runnable {
        public Runnable t;

        public b() {
        }

        /* JADX WARN: Code duplicated, block: B:46:0x0036 A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
        
            if (r1 == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
        
            r9.t.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0052, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0054, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0055, code lost:
        
            defpackage.id9.y.a().log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r9.t, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0074, code lost:
        
            r9.t = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x0076, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a() {
            /*
                r9 = this;
                r0 = 0
                r1 = r0
            L2:
                id9 r2 = defpackage.id9.this     // Catch: java.lang.Throwable -> L50
                java.util.ArrayDeque r2 = r2.u     // Catch: java.lang.Throwable -> L50
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L50
                if (r0 != 0) goto L28
                id9 r0 = defpackage.id9.this     // Catch: java.lang.Throwable -> L1c
                id9$c r3 = r0.v     // Catch: java.lang.Throwable -> L1c
                id9$c r4 = id9.c.w     // Catch: java.lang.Throwable -> L1c
                if (r3 != r4) goto L1e
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L40
            L14:
                java.lang.Thread r9 = java.lang.Thread.currentThread()
                r9.interrupt()
                goto L40
            L1c:
                r9 = move-exception
                goto L77
            L1e:
                long r5 = r0.w     // Catch: java.lang.Throwable -> L1c
                r7 = 1
                long r5 = r5 + r7
                r0.w = r5     // Catch: java.lang.Throwable -> L1c
                r0.v = r4     // Catch: java.lang.Throwable -> L1c
                r0 = 1
            L28:
                id9 r3 = defpackage.id9.this     // Catch: java.lang.Throwable -> L1c
                java.util.ArrayDeque r3 = r3.u     // Catch: java.lang.Throwable -> L1c
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L1c
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L1c
                r9.t = r3     // Catch: java.lang.Throwable -> L1c
                if (r3 != 0) goto L41
                id9 r9 = defpackage.id9.this     // Catch: java.lang.Throwable -> L1c
                id9$c r0 = id9.c.t     // Catch: java.lang.Throwable -> L1c
                r9.v = r0     // Catch: java.lang.Throwable -> L1c
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L40
                goto L14
            L40:
                return
            L41:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L50
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r9.t     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
                r3.run()     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L54
            L4d:
                r9.t = r2     // Catch: java.lang.Throwable -> L50
                goto L2
            L50:
                r9 = move-exception
                goto L79
            L52:
                r0 = move-exception
                goto L74
            L54:
                r3 = move-exception
                rz5 r4 = defpackage.id9.y     // Catch: java.lang.Throwable -> L52
                java.util.logging.Logger r4 = r4.a()     // Catch: java.lang.Throwable -> L52
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L52
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
                r6.<init>()     // Catch: java.lang.Throwable -> L52
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L52
                java.lang.Runnable r7 = r9.t     // Catch: java.lang.Throwable -> L52
                r6.append(r7)     // Catch: java.lang.Throwable -> L52
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L52
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L52
                goto L4d
            L74:
                r9.t = r2     // Catch: java.lang.Throwable -> L50
                throw r0     // Catch: java.lang.Throwable -> L50
            L77:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                throw r9     // Catch: java.lang.Throwable -> L50
            L79:
                if (r1 == 0) goto L82
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L82:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: id9.b.a():void");
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                a();
            } catch (Error e) {
                synchronized (id9.this.u) {
                    id9.this.v = c.t;
                    throw e;
                }
            }
        }

        public final String toString() {
            Runnable runnable = this.t;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + id9.this.v + "}";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class c {
        public static final c t;
        public static final c u;
        public static final c v;
        public static final c w;
        public static final /* synthetic */ c[] x;

        static {
            c cVar = new c("IDLE", 0);
            t = cVar;
            c cVar2 = new c("QUEUING", 1);
            u = cVar2;
            c cVar3 = new c("QUEUED", 2);
            v = cVar3;
            c cVar4 = new c("RUNNING", 3);
            w = cVar4;
            x = new c[]{cVar, cVar2, cVar3, cVar4};
        }

        public c() {
            throw null;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) x.clone();
        }
    }

    public id9(Executor executor) {
        executor.getClass();
        this.t = executor;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x005f  */
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        c cVar;
        boolean z;
        runnable.getClass();
        synchronized (this.u) {
            c cVar2 = this.v;
            if (cVar2 != c.w && cVar2 != (cVar = c.v)) {
                long j = this.w;
                a aVar = new a(runnable);
                this.u.add(aVar);
                c cVar3 = c.u;
                this.v = cVar3;
                try {
                    this.t.execute(this.x);
                    if (this.v != cVar3) {
                        return;
                    }
                    synchronized (this.u) {
                        try {
                            if (this.w == j && this.v == cVar3) {
                                this.v = cVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    synchronized (this.u) {
                        try {
                            c cVar4 = this.v;
                            if (cVar4 != c.t && cVar4 != c.u) {
                                z = false;
                            } else if (this.u.removeLastOccurrence(aVar)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!(th2 instanceof RejectedExecutionException) || z) {
                                throw th2;
                            }
                            return;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            this.u.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.t + "}";
    }
}
