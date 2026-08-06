package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class uz9 implements um9 {
    public final long t;
    public final long u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", l = {175, 177, 179, 180, 182}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ei4<s54<? super sm9>, Integer, r02<? super g2b>, Object> {
        public int t;
        public /* synthetic */ s54 u;
        public /* synthetic */ int v;

        public a(r02<? super a> r02Var) {
            super(3, r02Var);
        }

        @Override // defpackage.ei4
        public final Object invoke(s54<? super sm9> s54Var, Integer num, r02<? super g2b> r02Var) {
            int iIntValue = num.intValue();
            a aVar = uz9.this.new a(r02Var);
            aVar.u = s54Var;
            aVar.v = iIntValue;
            return aVar.invokeSuspend(g2b.a);
        }

        /* JADX WARN: Code duplicated, block: B:26:0x0060  */
        /* JADX WARN: Code duplicated, block: B:29:0x006f  */
        /* JADX WARN: Code duplicated, block: B:32:0x007c  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
        
            if (r4.emit(defpackage.sm9.t, r16) == r13) goto L34;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
        
            if (r4.emit(defpackage.sm9.v, r16) == r13) goto L34;
         */
        @Override // defpackage.ak0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
            /*
                r16 = this;
                r0 = r16
                uz9 r1 = defpackage.uz9.this
                long r2 = r1.u
                s54 r4 = r0.u
                int r5 = r0.v
                int r6 = r0.t
                r7 = 0
                r8 = 5
                r9 = 4
                r10 = 3
                r11 = 2
                r12 = 1
                v72 r13 = defpackage.v72.t
                if (r6 == 0) goto L37
                if (r6 == r12) goto L33
                if (r6 == r11) goto L2f
                if (r6 == r10) goto L2b
                if (r6 == r9) goto L27
                if (r6 != r8) goto L21
                goto L33
            L21:
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r0)
                return r7
            L27:
                defpackage.dv8.b(r17)
                goto L7c
            L2b:
                defpackage.dv8.b(r17)
                goto L6f
            L2f:
                defpackage.dv8.b(r17)
                goto L5a
            L33:
                defpackage.dv8.b(r17)
                goto L8b
            L37:
                defpackage.dv8.b(r17)
                if (r5 <= 0) goto L4b
                r0.u = r7
                r0.v = r5
                r0.t = r12
                sm9 r1 = defpackage.sm9.t
                java.lang.Object r0 = r4.emit(r1, r0)
                if (r0 != r13) goto L8b
                goto L8a
            L4b:
                long r14 = r1.t
                r0.u = r4
                r0.v = r5
                r0.t = r11
                java.lang.Object r1 = defpackage.bw2.b(r14, r0)
                if (r1 != r13) goto L5a
                goto L8a
            L5a:
                r11 = 0
                int r1 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
                if (r1 <= 0) goto L7c
                r0.u = r4
                r0.v = r5
                r0.t = r10
                sm9 r1 = defpackage.sm9.u
                java.lang.Object r1 = r4.emit(r1, r0)
                if (r1 != r13) goto L6f
                goto L8a
            L6f:
                r0.u = r4
                r0.v = r5
                r0.t = r9
                java.lang.Object r1 = defpackage.bw2.b(r2, r0)
                if (r1 != r13) goto L7c
                goto L8a
            L7c:
                r0.u = r7
                r0.v = r5
                r0.t = r8
                sm9 r1 = defpackage.sm9.v
                java.lang.Object r0 = r4.emit(r1, r0)
                if (r0 != r13) goto L8b
            L8a:
                return r13
            L8b:
                g2b r0 = defpackage.g2b.a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: uz9.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class b extends p6a implements ci4<sm9, r02<? super Boolean>, Object> {
        public /* synthetic */ Object t;

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            b bVar = new b(2, r02Var);
            bVar.t = obj;
            return bVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(sm9 sm9Var, r02<? super Boolean> r02Var) {
            return ((b) create(sm9Var, r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            sm9 sm9Var = (sm9) this.t;
            dv8.b(obj);
            return Boolean.valueOf(sm9Var != sm9.t);
        }
    }

    public uz9(long j, long j2) {
        this.t = j;
        this.u = j2;
        if (j < 0) {
            eo2.a("stopTimeout(", j, " ms) cannot be negative");
            throw null;
        }
        if (j2 >= 0) {
            return;
        }
        eo2.a("replayExpiration(", j2, " ms) cannot be negative");
        throw null;
    }

    @Override // defpackage.um9
    public final r54<sm9> b(zz9<Integer> zz9Var) {
        a aVar = new a(null);
        int i = a74.a;
        return yk2.i(new v64(new ba1(aVar, zz9Var, ff3.t, -2, xx0.t), new b(2, null)));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof uz9)) {
            return false;
        }
        uz9 uz9Var = (uz9) obj;
        return this.t == uz9Var.t && this.u == uz9Var.u;
    }

    public final int hashCode() {
        return Long.hashCode(this.u) + (Long.hashCode(this.t) * 31);
    }

    public final String toString() {
        e96 e96Var = new e96(2);
        long j = this.t;
        if (j > 0) {
            e96Var.add("stopTimeout=" + j + "ms");
        }
        long j2 = this.u;
        if (j2 < Long.MAX_VALUE) {
            e96Var.add("replayExpiration=" + j2 + "ms");
        }
        return wu0.a(new StringBuilder("SharingStarted.WhileSubscribed("), th1.F(ws0.e(e96Var), null, null, null, null, 63), ')');
    }
}
