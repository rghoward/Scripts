package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class c64 implements r54<Object> {
    public final /* synthetic */ Object[] t;

    @xm2(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1", f = "Builders.kt", l = {113}, m = "collect", v = 1)
    public static final class a extends u02 {
        public /* synthetic */ Object t;
        public int u;
        public s54 w;
        public int x;
        public int y;
        public int z;

        public a(r02 r02Var) {
            super(r02Var);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) {
            this.t = obj;
            this.u |= Integer.MIN_VALUE;
            return c64.this.collect(null, this);
        }
    }

    public c64(Object[] objArr) {
        this.t = objArr;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
    /* JADX WARN: Code duplicated, block: B:18:0x0056 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0054 -> B:19:0x0057). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.r54
    public final java.lang.Object collect(defpackage.s54<? super java.lang.Object> r7, defpackage.r02<? super defpackage.g2b> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof c64.a
            if (r0 == 0) goto L13
            r0 = r8
            c64$a r0 = (c64.a) r0
            int r1 = r0.u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u = r1
            goto L18
        L13:
            c64$a r0 = new c64$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.t
            int r1 = r0.u
            java.lang.Object[] r6 = r6.t
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L30
            int r7 = r0.z
            int r1 = r0.y
            int r3 = r0.x
            s54 r4 = r0.w
            defpackage.dv8.b(r8)
            r8 = r4
            goto L57
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r6)
            r6 = 0
            return r6
        L37:
            defpackage.dv8.b(r8)
            int r8 = r6.length
            r1 = 0
            r3 = r8
            r8 = r7
            r7 = r3
            r3 = r1
        L40:
            if (r1 >= r7) goto L59
            r4 = r6[r1]
            r0.w = r8
            r0.x = r3
            r0.y = r1
            r0.z = r7
            r0.u = r2
            java.lang.Object r4 = r8.emit(r4, r0)
            v72 r5 = defpackage.v72.t
            if (r4 != r5) goto L57
            return r5
        L57:
            int r1 = r1 + r2
            goto L40
        L59:
            g2b r6 = defpackage.g2b.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c64.collect(s54, r02):java.lang.Object");
    }
}
