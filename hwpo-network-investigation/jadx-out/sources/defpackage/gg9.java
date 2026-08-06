package defpackage;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
public final class gg9 implements r54<gd8> {
    public final /* synthetic */ fg9 t;
    public final /* synthetic */ qf9 u;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final class a<T> implements s54 {
        public final /* synthetic */ s54 t;
        public final /* synthetic */ qf9 u;

        /* JADX INFO: renamed from: gg9$a$a, reason: collision with other inner class name */
        @xm2(c = "com.hwpo_training_app.sessions.presentation.session_details.SessionDetailsViewModel$listenSessionDetailsUpdates$$inlined$map$1$2", f = "SessionDetailsViewModel.kt", l = {218, 217}, m = "emit", v = 2)
        public static final class C0096a extends u02 {
            public /* synthetic */ Object t;
            public int u;
            public s54 v;
            public int w;

            public C0096a(r02 r02Var) {
                super(r02Var);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) {
                this.t = obj;
                this.u |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(s54 s54Var, qf9 qf9Var) {
            this.t = s54Var;
            this.u = qf9Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x006c, code lost:
        
            if (r8.emit(r9, r0) == r6) goto L22;
         */
        @Override // defpackage.s54
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r8, defpackage.r02 r9) throws java.lang.Throwable {
            /*
                r7 = this;
                boolean r0 = r9 instanceof gg9.a.C0096a
                if (r0 == 0) goto L13
                r0 = r9
                gg9$a$a r0 = (gg9.a.C0096a) r0
                int r1 = r0.u
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.u = r1
                goto L18
            L13:
                gg9$a$a r0 = new gg9$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.t
                int r1 = r0.u
                qf9 r2 = r7.u
                r3 = 2
                r4 = 1
                r5 = 0
                v72 r6 = defpackage.v72.t
                if (r1 == 0) goto L3b
                if (r1 == r4) goto L33
                if (r1 != r3) goto L2d
                defpackage.dv8.b(r9)
                goto L6f
            L2d:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r7)
                return r5
            L33:
                int r7 = r0.w
                s54 r8 = r0.v
                defpackage.dv8.b(r9)
                goto L54
            L3b:
                defpackage.dv8.b(r9)
                hd8 r8 = (defpackage.hd8) r8
                n89 r9 = r2.H
                s54 r7 = r7.t
                r0.v = r7
                r1 = 0
                r0.w = r1
                r0.u = r4
                gd8 r9 = r9.a(r8)
                if (r9 != r6) goto L52
                goto L6e
            L52:
                r8 = r7
                r7 = r1
            L54:
                gd8 r9 = (defpackage.gd8) r9
                java.util.List<l89> r1 = r9.h
                p43 r2 = r2.I
                java.util.ArrayList r1 = defpackage.ii6.b(r1, r2)
                gd8 r9 = defpackage.gd8.a(r9, r1)
                r0.v = r5
                r0.w = r7
                r0.u = r3
                java.lang.Object r7 = r8.emit(r9, r0)
                if (r7 != r6) goto L6f
            L6e:
                return r6
            L6f:
                g2b r7 = defpackage.g2b.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: gg9.a.emit(java.lang.Object, r02):java.lang.Object");
        }
    }

    public gg9(fg9 fg9Var, qf9 qf9Var) {
        this.t = fg9Var;
        this.u = qf9Var;
    }

    @Override // defpackage.r54
    public final Object collect(s54<? super gd8> s54Var, r02 r02Var) {
        Object objCollect = this.t.collect(new a(s54Var, this.u), r02Var);
        return objCollect == v72.t ? objCollect : g2b.a;
    }
}
