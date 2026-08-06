package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes3.dex */
@xm2(c = "com.hwpo_training_app.sessions.presentation.sessions_list.SessionsViewModel$listenProgramVariantChanges$1", f = "SessionsViewModel.kt", l = {270, 274}, m = "invokeSuspend", v = 2)
public final class qj9 extends p6a implements ci4<xd3<? extends Exception, ? extends zz7>, r02<? super g2b>, Object> {
    public int t;
    public /* synthetic */ Object u;
    public final /* synthetic */ lj9 v;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "com.hwpo_training_app.sessions.presentation.sessions_list.SessionsViewModel$listenProgramVariantChanges$1$2", f = "SessionsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends p6a implements ci4<Integer, r02<? super g2b>, Object> {
        public /* synthetic */ int t;
        public final /* synthetic */ lj9 u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lj9 lj9Var, r02<? super a> r02Var) {
            super(2, r02Var);
            this.u = lj9Var;
        }

        @Override // defpackage.ak0
        public final r02<g2b> create(Object obj, r02<?> r02Var) {
            a aVar = new a(this.u, r02Var);
            aVar.t = ((Number) obj).intValue();
            return aVar;
        }

        @Override // defpackage.ci4
        public final Object invoke(Integer num, r02<? super g2b> r02Var) {
            return ((a) create(Integer.valueOf(num.intValue()), r02Var)).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object obj2;
            int i = this.t;
            dv8.b(obj);
            lj9.a aVar = lj9.Companion;
            lj9 lj9Var = this.u;
            bc8 bc8Var = lj9Var.b().a;
            if (bc8Var == null) {
                return g2b.a;
            }
            ArrayList arrayList = bc8Var.u.w;
            int size = arrayList.size();
            int i2 = 0;
            do {
                if (i2 >= size) {
                    obj2 = null;
                    break;
                }
                obj2 = arrayList.get(i2);
                i2++;
            } while (((h08) obj2).t != i);
            h08 h08Var = (h08) obj2;
            if (h08Var == null) {
                return g2b.a;
            }
            lj9Var.j(h08Var);
            return g2b.a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    public static final /* synthetic */ class b extends wa implements ci4<Throwable, r02<? super g2b>, Object> {
        @Override // defpackage.ci4
        public final Object invoke(Throwable th, r02<? super g2b> r02Var) {
            ((rma.a) this.receiver).b(th);
            return g2b.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qj9(lj9 lj9Var, r02<? super qj9> r02Var) {
        super(2, r02Var);
        this.v = lj9Var;
    }

    @Override // defpackage.ak0
    public final r02<g2b> create(Object obj, r02<?> r02Var) {
        qj9 qj9Var = new qj9(this.v, r02Var);
        qj9Var.u = obj;
        return qj9Var;
    }

    @Override // defpackage.ci4
    public final Object invoke(xd3<? extends Exception, ? extends zz7> xd3Var, r02<? super g2b> r02Var) {
        return ((qj9) create(xd3Var, r02Var)).invokeSuspend(g2b.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        if (defpackage.yd3.a((defpackage.xd3) r14, r6, r13) == r5) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ak0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            java.lang.Object r0 = r13.u
            xd3 r0 = (defpackage.xd3) r0
            int r1 = r13.t
            r2 = 2
            r3 = 1
            r4 = 0
            v72 r5 = defpackage.v72.t
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L15
            defpackage.dv8.b(r14)
            goto L7c
        L15:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r13)
            return r4
        L1b:
            defpackage.dv8.b(r14)
            goto L60
        L1f:
            defpackage.dv8.b(r14)
            r0.getClass()
            yd3$c r14 = new yd3$c
            r14.<init>(r0)
            boolean r1 = r0 instanceof xd3.a
            if (r1 == 0) goto L38
            xd3$a r14 = new xd3$a
            xd3$a r0 = (xd3.a) r0
            L r0 = r0.a
            r14.<init>(r0)
            goto L4e
        L38:
            boolean r1 = r0 instanceof xd3.b
            if (r1 == 0) goto L7f
            xd3$b r0 = (xd3.b) r0
            R r0 = r0.a
            zz7 r0 = (defpackage.zz7) r0
            int r0 = r0.b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r14 = r14.invoke(r0)
            xd3 r14 = (defpackage.xd3) r14
        L4e:
            qj9$a r0 = new qj9$a
            lj9 r1 = r13.v
            r0.<init>(r1, r4)
            r13.u = r4
            r13.t = r3
            java.lang.Object r14 = defpackage.yd3.b(r14, r0, r13)
            if (r14 != r5) goto L60
            goto L7b
        L60:
            xd3 r14 = (defpackage.xd3) r14
            qj9$b r6 = new qj9$b
            rma$a r8 = defpackage.rma.a
            java.lang.String r11 = "e(Ljava/lang/Throwable;)V"
            r12 = 4
            r7 = 2
            java.lang.Class<rma$a> r9 = rma.a.class
            java.lang.String r10 = "e"
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r13.u = r4
            r13.t = r2
            java.lang.Object r13 = defpackage.yd3.a(r14, r6, r13)
            if (r13 != r5) goto L7c
        L7b:
            return r5
        L7c:
            g2b r13 = defpackage.g2b.a
            return r13
        L7f:
            defpackage.u.b()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qj9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
