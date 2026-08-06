package defpackage;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class k24 {
    public final e04 a;
    public final vi9 b;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.google.firebase.sessions.FirebaseSessions$1", f = "FirebaseSessions.kt", l = {51, 55}, m = "invokeSuspend")
    public static final class a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
        public int t;
        public final /* synthetic */ mh9 v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(mh9 mh9Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.v = mh9Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            return k24.this.new a(this.v, r02Var);
        }

        @Override // defpackage.ci4
        public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
            return ((a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
        
            if (r1.b(r7) == r6) goto L25;
         */
        @Override // defpackage.ak0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                k24 r0 = defpackage.k24.this
                vi9 r1 = r0.b
                int r2 = r7.t
                java.lang.String r3 = "FirebaseSessions"
                r4 = 2
                r5 = 1
                v72 r6 = defpackage.v72.t
                if (r2 == 0) goto L21
                if (r2 == r5) goto L1d
                if (r2 != r4) goto L16
                defpackage.dv8.b(r8)
                goto L64
            L16:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.aa0.c(r7)
                r7 = 0
                return r7
            L1d:
                defpackage.dv8.b(r8)
                goto L2f
            L21:
                defpackage.dv8.b(r8)
                v24 r8 = defpackage.v24.a
                r7.t = r5
                java.lang.Object r8 = r8.b(r7)
                if (r8 != r6) goto L2f
                goto L63
            L2f:
                java.util.Map r8 = (java.util.Map) r8
                java.util.Collection r8 = r8.values()
                java.lang.Iterable r8 = (java.lang.Iterable) r8
                boolean r2 = r8 instanceof java.util.Collection
                if (r2 == 0) goto L45
                r2 = r8
                java.util.Collection r2 = (java.util.Collection) r2
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L45
                goto L9a
            L45:
                java.util.Iterator r8 = r8.iterator()
            L49:
                boolean r2 = r8.hasNext()
                if (r2 == 0) goto L9a
                java.lang.Object r2 = r8.next()
                kh9 r2 = (defpackage.kh9) r2
                boolean r2 = r2.a()
                if (r2 == 0) goto L49
                r7.t = r4
                java.lang.Object r7 = r1.b(r7)
                if (r7 != r6) goto L64
            L63:
                return r6
            L64:
                zk9 r7 = r1.a
                java.lang.Boolean r7 = r7.a()
                if (r7 == 0) goto L71
            L6c:
                boolean r5 = r7.booleanValue()
                goto L7a
            L71:
                zk9 r7 = r1.b
                java.lang.Boolean r7 = r7.a()
                if (r7 == 0) goto L7a
                goto L6c
            L7a:
                if (r5 != 0) goto L88
                java.lang.String r7 = "Sessions SDK disabled. Not listening to lifecycle events."
                int r7 = android.util.Log.d(r3, r7)
                java.lang.Integer r8 = new java.lang.Integer
                r8.<init>(r7)
                goto La5
            L88:
                e04 r7 = r0.a
                ri1 r8 = new ri1
                r8.<init>()
                r7.a()
                java.util.concurrent.CopyOnWriteArrayList r7 = r7.j
                r7.add(r8)
                g2b r7 = defpackage.g2b.a
                goto La5
            L9a:
                java.lang.String r7 = "No Sessions subscribers. Not listening to lifecycle events."
                int r7 = android.util.Log.d(r3, r7)
                java.lang.Integer r8 = new java.lang.Integer
                r8.<init>(r7)
            La5:
                g2b r7 = defpackage.g2b.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: k24.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public k24(e04 e04Var, vi9 vi9Var, @ci0 h72 h72Var, mh9 mh9Var) {
        e04Var.getClass();
        vi9Var.getClass();
        h72Var.getClass();
        mh9Var.getClass();
        this.a = e04Var;
        this.b = vi9Var;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions 3.0.6.");
        e04Var.a();
        Context applicationContext = e04Var.a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(mh9Var);
            oy0.d(u72.a(h72Var), null, null, new a(mh9Var, null), 3);
        } else {
            Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
        }
    }
}
