package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e64 {

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "kotlinx.coroutines.flow.FlowKt__ChannelsKt", f = "Channels.kt", l = {32, 33}, m = "emitAllImpl$FlowKt__ChannelsKt", v = 1)
    public static final class a<T> extends u02 {
        public s54 t;
        public tj8 u;
        public ca1 v;
        public boolean w;
        public /* synthetic */ Object x;
        public int y;

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.x = obj;
            this.y |= Integer.MIN_VALUE;
            return e64.a(null, null, false, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0064  */
    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x002f, B:25:0x0054, B:29:0x0069, B:31:0x0071, B:20:0x0045, B:24:0x0050), top: B:50:0x0021 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0086 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r1.emit(r10, r0) == r5) goto L33;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0083 -> B:14:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> java.lang.Object a(defpackage.s54<? super T> r7, defpackage.tj8<? extends T> r8, boolean r9, defpackage.r02<? super defpackage.g2b> r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof e64.a
            if (r0 == 0) goto L13
            r0 = r10
            e64$a r0 = (e64.a) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.y = r1
            goto L18
        L13:
            e64$a r0 = new e64$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.x
            int r1 = r0.y
            r2 = 2
            r3 = 1
            r4 = 0
            v72 r5 = defpackage.v72.t
            if (r1 == 0) goto L49
            if (r1 == r3) goto L3d
            if (r1 != r2) goto L37
            boolean r9 = r0.w
            ca1 r7 = r0.v
            tj8 r8 = r0.u
            s54 r1 = r0.t
            defpackage.dv8.b(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r1
            goto L54
        L35:
            r7 = move-exception
            goto L8e
        L37:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r7)
            return r4
        L3d:
            boolean r9 = r0.w
            ca1 r7 = r0.v
            tj8 r8 = r0.u
            s54 r1 = r0.t
            defpackage.dv8.b(r10)     // Catch: java.lang.Throwable -> L35
            goto L69
        L49:
            defpackage.dv8.b(r10)
            boolean r10 = r7 instanceof defpackage.lla
            if (r10 != 0) goto La9
            ca1 r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L54:
            r0.t = r7     // Catch: java.lang.Throwable -> L35
            r0.u = r8     // Catch: java.lang.Throwable -> L35
            r0.v = r10     // Catch: java.lang.Throwable -> L35
            r0.w = r9     // Catch: java.lang.Throwable -> L35
            r0.y = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r10.b(r0)     // Catch: java.lang.Throwable -> L35
            if (r1 != r5) goto L65
            goto L85
        L65:
            r6 = r1
            r1 = r7
            r7 = r10
            r10 = r6
        L69:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L86
            java.lang.Object r10 = r7.next()     // Catch: java.lang.Throwable -> L35
            r0.t = r1     // Catch: java.lang.Throwable -> L35
            r0.u = r8     // Catch: java.lang.Throwable -> L35
            r0.v = r7     // Catch: java.lang.Throwable -> L35
            r0.w = r9     // Catch: java.lang.Throwable -> L35
            r0.y = r2     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r1.emit(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r5) goto L32
        L85:
            return r5
        L86:
            if (r9 == 0) goto L8b
            r8.k(r4)
        L8b:
            g2b r7 = defpackage.g2b.a
            return r7
        L8e:
            throw r7     // Catch: java.lang.Throwable -> L8f
        L8f:
            r10 = move-exception
            if (r9 == 0) goto La8
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L99
            r4 = r7
            java.util.concurrent.CancellationException r4 = (java.util.concurrent.CancellationException) r4
        L99:
            if (r4 != 0) goto La5
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r4.<init>(r9)
            r4.initCause(r7)
        La5:
            r8.k(r4)
        La8:
            throw r10
        La9:
            lla r7 = (defpackage.lla) r7
            java.lang.Throwable r7 = r7.t
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e64.a(s54, tj8, boolean, r02):java.lang.Object");
    }
}
