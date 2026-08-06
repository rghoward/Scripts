package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import io.ably.lib.transport.Defaults;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class yfa implements PointerInputEventHandler {
    public final /* synthetic */ t72 a;
    public final /* synthetic */ h37<n88.b> b;
    public final /* synthetic */ h27 c;
    public final /* synthetic */ h37 d;

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", l = {67}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ei4<j88, vf7, r02<? super g2b>, Object> {
        public int t;
        public /* synthetic */ j88 u;
        public /* synthetic */ long v;
        public final /* synthetic */ t72 w;
        public final /* synthetic */ h37<n88.b> x;
        public final /* synthetic */ h27 y;

        /* JADX INFO: renamed from: yfa$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$1", f = "TextFieldPressGestureFilter.kt", l = {60, Defaults.HTTP_ASYNC_THREADPOOL_SIZE}, m = "invokeSuspend", v = 1)
        public static final class C0284a extends p6a implements ci4<t72, r02<? super g2b>, Object> {
            public Object t;
            public int u;
            public final /* synthetic */ h37<n88.b> v;
            public final /* synthetic */ long w;
            public final /* synthetic */ h27 x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0284a(h37<n88.b> h37Var, long j, h27 h27Var, r02<? super C0284a> r02Var) {
                super(2, r02Var);
                this.v = h37Var;
                this.w = j;
                this.x = h27Var;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                return new C0284a(this.v, this.w, this.x, r02Var);
            }

            @Override // defpackage.ci4
            public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                return ((C0284a) create(t72Var, r02Var)).invokeSuspend(g2b.a);
            }

            /* JADX WARN: Code duplicated, block: B:21:0x0051  */
            /* JADX WARN: Code duplicated, block: B:24:0x005c  */
            /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
            
                if (r2.c(r0, r7) == r6) goto L23;
             */
            @Override // defpackage.ak0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
                /*
                    r7 = this;
                    int r0 = r7.u
                    r1 = 0
                    h27 r2 = r7.x
                    r3 = 2
                    r4 = 1
                    h37<n88$b> r5 = r7.v
                    v72 r6 = defpackage.v72.t
                    if (r0 == 0) goto L27
                    if (r0 == r4) goto L1f
                    if (r0 != r3) goto L19
                    java.lang.Object r7 = r7.t
                    n88$b r7 = (n88.b) r7
                    defpackage.dv8.b(r8)
                    goto L5d
                L19:
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    defpackage.aa0.c(r7)
                    return r1
                L1f:
                    java.lang.Object r0 = r7.t
                    h37 r0 = (defpackage.h37) r0
                    defpackage.dv8.b(r8)
                    goto L45
                L27:
                    defpackage.dv8.b(r8)
                    java.lang.Object r8 = r5.getValue()
                    n88$b r8 = (n88.b) r8
                    if (r8 == 0) goto L48
                    n88$a r0 = new n88$a
                    r0.<init>(r8)
                    if (r2 == 0) goto L44
                    r7.t = r5
                    r7.u = r4
                    java.lang.Object r8 = r2.c(r0, r7)
                    if (r8 != r6) goto L44
                    goto L5b
                L44:
                    r0 = r5
                L45:
                    r0.setValue(r1)
                L48:
                    n88$b r8 = new n88$b
                    long r0 = r7.w
                    r8.<init>(r0)
                    if (r2 == 0) goto L5e
                    r7.t = r8
                    r7.u = r3
                    java.lang.Object r7 = r2.c(r8, r7)
                    if (r7 != r6) goto L5c
                L5b:
                    return r6
                L5c:
                    r7 = r8
                L5d:
                    r8 = r7
                L5e:
                    r5.setValue(r8)
                    g2b r7 = defpackage.g2b.a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: yfa.a.C0284a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
        @xm2(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2", f = "TextFieldPressGestureFilter.kt", l = {76}, m = "invokeSuspend", v = 1)
        public static final class b extends p6a implements ci4<t72, r02<? super g2b>, Object> {
            public h37 t;
            public int u;
            public final /* synthetic */ h37<n88.b> v;
            public final /* synthetic */ boolean w;
            public final /* synthetic */ h27 x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(h37<n88.b> h37Var, boolean z, h27 h27Var, r02<? super b> r02Var) {
                super(2, r02Var);
                this.v = h37Var;
                this.w = z;
                this.x = h27Var;
            }

            @Override // defpackage.ak0
            public final r02<g2b> create(Object obj, r02<?> r02Var) {
                return new b(this.v, this.w, this.x, r02Var);
            }

            @Override // defpackage.ci4
            public final Object invoke(t72 t72Var, r02<? super g2b> r02Var) {
                return ((b) create(t72Var, r02Var)).invokeSuspend(g2b.a);
            }

            @Override // defpackage.ak0
            public final Object invokeSuspend(Object obj) throws Throwable {
                h37<n88.b> h37Var;
                h37<n88.b> h37Var2;
                int i = this.u;
                if (i == 0) {
                    dv8.b(obj);
                    h37Var = this.v;
                    n88.b value = h37Var.getValue();
                    if (value != null) {
                        qg5 cVar = this.w ? new n88.c(value) : new n88.a(value);
                        h27 h27Var = this.x;
                        if (h27Var != null) {
                            this.t = h37Var;
                            this.u = 1;
                            Object objC = h27Var.c(cVar, this);
                            v72 v72Var = v72.t;
                            if (objC == v72Var) {
                                return v72Var;
                            }
                            h37Var2 = h37Var;
                        }
                        h37Var.setValue(null);
                    }
                    return g2b.a;
                }
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                h37Var2 = this.t;
                dv8.b(obj);
                h37Var = h37Var2;
                h37Var.setValue(null);
                return g2b.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t72 t72Var, h37<n88.b> h37Var, h27 h27Var, r02<? super a> r02Var) {
            super(3, r02Var);
            this.w = t72Var;
            this.x = h37Var;
            this.y = h27Var;
        }

        @Override // defpackage.ei4
        public final Object invoke(j88 j88Var, vf7 vf7Var, r02<? super g2b> r02Var) {
            long j = vf7Var.a;
            h37<n88.b> h37Var = this.x;
            h27 h27Var = this.y;
            a aVar = new a(this.w, h37Var, h27Var, r02Var);
            aVar.u = j88Var;
            aVar.v = j;
            return aVar.invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.t;
            t72 t72Var = this.w;
            if (i == 0) {
                dv8.b(obj);
                j88 j88Var = this.u;
                oy0.d(t72Var, null, null, new C0284a(this.x, this.v, this.y, null), 3);
                this.t = 1;
                obj = j88Var.e0(this);
                v72 v72Var = v72.t;
                if (obj == v72Var) {
                    return v72Var;
                }
            } else {
                if (i != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                dv8.b(obj);
            }
            oy0.d(t72Var, null, null, new b(this.x, ((Boolean) obj).booleanValue(), this.y, null), 3);
            return g2b.a;
        }
    }

    public yfa(t72 t72Var, h37 h37Var, h27 h27Var, h37 h37Var2) {
        this.a = t72Var;
        this.b = h37Var;
        this.c = h27Var;
        this.d = h37Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(i58 i58Var, r02<? super g2b> r02Var) {
        a aVar = new a(this.a, this.b, this.c, null);
        xfa xfaVar = new xfa(this.d);
        o8a.a aVar2 = o8a.a;
        Object objD = u72.d(new s8a(i58Var, aVar, xfaVar, new m88(i58Var), null), r02Var);
        v72 v72Var = v72.t;
        if (objD != v72Var) {
            objD = g2b.a;
        }
        return objD == v72Var ? objD : g2b.a;
    }
}
