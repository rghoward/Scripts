package defpackage;

import io.ably.lib.transport.Defaults;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
@xm2(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = {Defaults.HTTP_ASYNC_THREADPOOL_SIZE}, m = "invokeSuspend", v = 1)
public final class gn4 extends p6a implements ci4<t72, r02<? super g2b>, Object> {
    public tj8 t;
    public ca1 u;
    public int v;
    public final /* synthetic */ zx0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gn4(zx0 zx0Var, r02 r02Var) {
        super(2, r02Var);
        this.w = zx0Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        return new gn4(this.w, r02Var);
    }

    @Override // defpackage.ci4
    public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
        return ((gn4) create(t72Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0031 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x003a A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:6:0x000e, B:17:0x0032, B:19:0x003a, B:20:0x0048, B:26:0x0056, B:14:0x0025, B:28:0x0059, B:30:0x005e, B:31:0x005f, B:32:0x0060, B:13:0x001f, B:21:0x0049, B:23:0x004f), top: B:44:0x0006, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x004f A[Catch: all -> 0x005d, TRY_LEAVE, TryCatch #2 {, blocks: (B:21:0x0049, B:23:0x004f), top: B:47:0x0049, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0059 A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:6:0x000e, B:17:0x0032, B:19:0x003a, B:20:0x0048, B:26:0x0056, B:14:0x0025, B:28:0x0059, B:30:0x005e, B:31:0x005f, B:32:0x0060, B:13:0x001f, B:21:0x0049, B:23:0x004f), top: B:44:0x0006, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x002f -> B:17:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.ak0
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            v72 r0 = defpackage.v72.t
            int r1 = r7.v
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L1a
            if (r1 != r3) goto L14
            ca1 r1 = r7.u
            tj8 r4 = r7.t
            defpackage.dv8.b(r8)     // Catch: java.lang.Throwable -> L12
            goto L32
        L12:
            r7 = move-exception
            goto L68
        L14:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r7)
            return r2
        L1a:
            defpackage.dv8.b(r8)
            zx0 r4 = r7.w
            zx0$a r8 = new zx0$a     // Catch: java.lang.Throwable -> L12
            r8.<init>()     // Catch: java.lang.Throwable -> L12
            r1 = r8
        L25:
            r7.t = r4     // Catch: java.lang.Throwable -> L12
            r7.u = r1     // Catch: java.lang.Throwable -> L12
            r7.v = r3     // Catch: java.lang.Throwable -> L12
            java.lang.Object r8 = r1.b(r7)     // Catch: java.lang.Throwable -> L12
            if (r8 != r0) goto L32
            return r0
        L32:
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L12
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L12
            if (r8 == 0) goto L60
            java.lang.Object r8 = r1.next()     // Catch: java.lang.Throwable -> L12
            g2b r8 = (defpackage.g2b) r8     // Catch: java.lang.Throwable -> L12
            java.util.concurrent.atomic.AtomicBoolean r8 = defpackage.hn4.b     // Catch: java.lang.Throwable -> L12
            r5 = 0
            r8.set(r5)     // Catch: java.lang.Throwable -> L12
            java.lang.Object r8 = defpackage.qu9.c     // Catch: java.lang.Throwable -> L12
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L12
            fn4 r6 = defpackage.qu9.j     // Catch: java.lang.Throwable -> L5d
            d37<m0a> r6 = r6.h     // Catch: java.lang.Throwable -> L5d
            if (r6 == 0) goto L56
            boolean r6 = r6.h()     // Catch: java.lang.Throwable -> L5d
            if (r6 != r3) goto L56
            r5 = r3
        L56:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L12
            if (r5 == 0) goto L25
            defpackage.qu9.a()     // Catch: java.lang.Throwable -> L12
            goto L25
        L5d:
            r7 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L12
            throw r7     // Catch: java.lang.Throwable -> L12
        L60:
            g2b r7 = defpackage.g2b.a     // Catch: java.lang.Throwable -> L12
            r4.k(r2)
            g2b r7 = defpackage.g2b.a
            return r7
        L68:
            throw r7     // Catch: java.lang.Throwable -> L69
        L69:
            r8 = move-exception
            boolean r0 = r7 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L71
            r2 = r7
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L71:
            if (r2 != 0) goto L7d
            java.lang.String r0 = "Channel was consumed, consumer had failed"
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            r2.<init>(r0)
            r2.initCause(r7)
        L7d:
            r4.k(r2)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gn4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
