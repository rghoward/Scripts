package defpackage;

import io.intercom.android.sdk.m5.conversation.ui.components.row.e;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class o8a {
    public static final a a = new a(3, null);

    /* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
    @xm2(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", f = "TapGestureDetector.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends p6a implements ei4<j88, vf7, r02<? super g2b>, Object> {
        @Override // defpackage.ei4
        public final Object invoke(j88 j88Var, vf7 vf7Var, r02<? super g2b> r02Var) {
            long j = vf7Var.a;
            return new a(3, r02Var).invokeSuspend(g2b.a);
        }

        @Override // defpackage.ak0
        public final Object invokeSuspend(Object obj) throws Throwable {
            dv8.b(obj);
            return g2b.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0047 -> B:18:0x004a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(defpackage.yg0 r5, boolean r6, defpackage.s48 r7, defpackage.ak0 r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof defpackage.p8a
            if (r0 == 0) goto L13
            r0 = r8
            p8a r0 = (defpackage.p8a) r0
            int r1 = r0.x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.x = r1
            goto L18
        L13:
            p8a r0 = new p8a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.w
            int r1 = r0.x
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            boolean r5 = r0.v
            s48 r6 = r0.u
            yg0 r7 = r0.t
            defpackage.dv8.b(r8)
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
            goto L4a
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r5)
            r5 = 0
            return r5
        L36:
            defpackage.dv8.b(r8)
        L39:
            r0.t = r5
            r0.u = r7
            r0.v = r6
            r0.x = r2
            java.lang.Object r8 = r5.h1(r7, r0)
            v72 r1 = defpackage.v72.t
            if (r8 != r1) goto L4a
            return r1
        L4a:
            r48 r8 = (defpackage.r48) r8
            boolean r1 = e(r8, r6)
            if (r1 == 0) goto L39
            java.util.List<a58> r5 = r8.a
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o8a.a(yg0, boolean, s48, ak0):java.lang.Object");
    }

    public static /* synthetic */ Object b(yg0 yg0Var, ak0 ak0Var, int i) {
        return a(yg0Var, (i & 1) != 0, (i & 2) != 0 ? s48.u : s48.t, ak0Var);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004c A[LOOP:0: B:19:0x004a->B:20:0x004c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x006b A[LOOP:1: B:22:0x005e->B:26:0x006b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:23:0x0060
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(defpackage.yg0 r7, defpackage.u02 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.r8a
            if (r0 == 0) goto L13
            r0 = r8
            r8a r0 = (defpackage.r8a) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            r8a r0 = new r8a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.u
            int r1 = r0.v
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            yg0 r7 = r0.t
            defpackage.dv8.b(r8)
            goto L40
        L27:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r7)
            r7 = 0
            return r7
        L2e:
            defpackage.dv8.b(r8)
        L31:
            r0.t = r7
            r0.v = r2
            s48 r8 = defpackage.s48.u
            java.lang.Object r8 = r7.h1(r8, r0)
            v72 r1 = defpackage.v72.t
            if (r8 != r1) goto L40
            return r1
        L40:
            r48 r8 = (defpackage.r48) r8
            java.util.List<a58> r1 = r8.a
            int r3 = r1.size()
            r4 = 0
            r5 = r4
        L4a:
            if (r5 >= r3) goto L58
            java.lang.Object r6 = r1.get(r5)
            a58 r6 = (defpackage.a58) r6
            r6.a()
            int r5 = r5 + 1
            goto L4a
        L58:
            java.util.List<a58> r8 = r8.a
            int r1 = r8.size()
        L5e:
            if (r4 >= r1) goto L6e
            java.lang.Object r3 = r8.get(r4)
            a58 r3 = (defpackage.a58) r3
            boolean r3 = r3.d
            if (r3 == 0) goto L6b
            goto L31
        L6b:
            int r4 = r4 + 1
            goto L5e
        L6e:
            g2b r7 = defpackage.g2b.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o8a.c(yg0, u02):java.lang.Object");
    }

    public static Object d(i58 i58Var, e eVar, zf1.b.a aVar, oh4 oh4Var, r02 r02Var, int i) {
        if ((i & 2) != 0) {
            eVar = null;
        }
        e eVar2 = eVar;
        ei4 ei4Var = aVar;
        if ((i & 4) != 0) {
            ei4Var = a;
        }
        Object objD = u72.d(new t8a(i58Var, null, eVar2, ei4Var, oh4Var, null), r02Var);
        return objD == v72.t ? objD : g2b.a;
    }

    public static boolean e(r48 r48Var, boolean z) {
        List<a58> list = r48Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a58 a58Var = list.get(i);
            if (!(z ? z69.d(a58Var) : z69.e(a58Var))) {
                return false;
            }
        }
        return true;
    }

    public static dz9 f(t72 t72Var, el5 el5Var, ci4 ci4Var) {
        return oy0.d(t72Var, null, x72.w, new u8a(el5Var, ci4Var, null), 1);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0396  */
    /* JADX WARN: Code duplicated, block: B:26:0x017e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0188  */
    /* JADX WARN: Code duplicated, block: B:31:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:33:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:36:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:39:0x01db  */
    /* JADX WARN: Code duplicated, block: B:42:0x0203  */
    /* JADX WARN: Code duplicated, block: B:45:0x0210  */
    /* JADX WARN: Code duplicated, block: B:47:0x0214  */
    /* JADX WARN: Code duplicated, block: B:48:0x0219  */
    /* JADX WARN: Code duplicated, block: B:50:0x021d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0225  */
    /* JADX WARN: Code duplicated, block: B:54:0x0230  */
    /* JADX WARN: Code duplicated, block: B:56:0x023f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x0241 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x0243  */
    /* JADX WARN: Code duplicated, block: B:59:0x024f  */
    /* JADX WARN: Code duplicated, block: B:62:0x027f  */
    /* JADX WARN: Code duplicated, block: B:65:0x028b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x028d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0299  */
    /* JADX WARN: Code duplicated, block: B:69:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:71:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:74:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:79:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x030e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0336  */
    /* JADX WARN: Code duplicated, block: B:88:0x0343  */
    /* JADX WARN: Code duplicated, block: B:90:0x0347  */
    /* JADX WARN: Code duplicated, block: B:91:0x0354  */
    /* JADX WARN: Code duplicated, block: B:93:0x0358  */
    /* JADX WARN: Code duplicated, block: B:95:0x0361  */
    /* JADX WARN: Code duplicated, block: B:96:0x0378  */
    /* JADX WARN: Code duplicated, block: B:98:0x0383  */
    /* JADX WARN: Code duplicated, block: B:99:0x038e  */
    public static final Object g(yg0 yg0Var, t72 t72Var, m88 m88Var, oh4 oh4Var, oh4 oh4Var2, ei4 ei4Var, oh4 oh4Var3, ak0 ak0Var) throws Throwable {
        v8a v8aVar;
        oh4 oh4Var4;
        oh4 oh4Var5;
        yg0 yg0Var2;
        oh4 oh4Var6;
        t72 t72Var2;
        m88 m88Var2;
        ei4 ei4Var2;
        a58 a58Var;
        dz9 dz9VarD;
        Object objH;
        oh4 oh4Var7;
        ei4 ei4Var3;
        a58 a58Var2;
        oh4 oh4Var8;
        el5 el5Var;
        yg0 yg0Var3;
        oh4 oh4Var9;
        oh4 oh4Var10;
        ei4 ei4Var4;
        oh4 oh4Var11;
        a58 a58Var3;
        dz9 dz9VarF;
        oh4 oh4Var12;
        dz9 dz9Var;
        oh4 oh4Var13;
        Object objK;
        a58 a58Var4;
        ei4 ei4Var5;
        yg0 yg0Var4;
        oh4 oh4Var14;
        el5 el5Var2;
        pe6 pe6Var;
        r02 r02Var;
        m88 m88Var3;
        t72 t72Var3;
        a58 a58Var5;
        oh4 oh4Var15;
        dz9 dz9VarD2;
        oh4 oh4Var16;
        Object objH2;
        el5 el5Var3;
        a58 a58Var6;
        oh4 oh4Var17;
        oh4 oh4Var18;
        t72 t72Var4;
        a58 a58Var7;
        m88 m88Var4;
        yg0 yg0Var5;
        el5 el5Var4;
        a58 a58Var8;
        oh4 oh4Var19;
        oh4 oh4Var20;
        m88 m88Var5;
        t72 t72Var5;
        a58 a58Var9;
        pe6 pe6Var2;
        r02 r02Var2;
        el5 el5Var5;
        t72 t72Var6;
        if (ak0Var instanceof v8a) {
            v8aVar = (v8a) ak0Var;
            int i = v8aVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                v8aVar.D = i - Integer.MIN_VALUE;
            } else {
                v8aVar = new v8a(ak0Var);
            }
        } else {
            v8aVar = new v8a(ak0Var);
        }
        Object objI = v8aVar.C;
        int i2 = v8aVar.D;
        x72 x72Var = x72.w;
        s48 s48Var = s48.u;
        a aVar = a;
        v72 v72Var = v72.t;
        switch (i2) {
            case 0:
                dv8.b(objI);
                v8aVar.t = yg0Var;
                v8aVar.u = t72Var;
                v8aVar.v = m88Var;
                oh4Var4 = oh4Var;
                v8aVar.w = oh4Var4;
                oh4Var5 = oh4Var2;
                v8aVar.x = oh4Var5;
                v8aVar.y = ei4Var;
                v8aVar.z = oh4Var3;
                v8aVar.D = 1;
                Object objB = b(yg0Var, v8aVar, 3);
                if (objB != v72Var) {
                    yg0Var2 = yg0Var;
                    oh4Var6 = oh4Var3;
                    t72Var2 = t72Var;
                    objI = objB;
                    m88Var2 = m88Var;
                    ei4Var2 = ei4Var;
                    a58Var = (a58) objI;
                    a58Var.a();
                    dz9VarD = oy0.d(t72Var2, null, x72Var, new e9a(m88Var2, null), 1);
                    if (ei4Var2 != aVar) {
                        f(t72Var2, dz9VarD, new w8a(ei4Var2, m88Var2, a58Var, null));
                    }
                    if (oh4Var5 == null) {
                        v8aVar.t = yg0Var2;
                        v8aVar.u = t72Var2;
                        v8aVar.v = m88Var2;
                        v8aVar.w = oh4Var4;
                        v8aVar.x = oh4Var5;
                        v8aVar.y = ei4Var2;
                        v8aVar.z = oh4Var6;
                        v8aVar.A = dz9VarD;
                        v8aVar.D = 2;
                        objI = i(yg0Var2, s48Var, v8aVar);
                        if (objI != v72Var) {
                            oh4 oh4Var21 = oh4Var5;
                            oh4Var9 = oh4Var4;
                            oh4Var10 = oh4Var21;
                            ei4Var4 = ei4Var2;
                            oh4Var11 = oh4Var6;
                            el5Var = dz9VarD;
                            a58Var3 = (a58) objI;
                            if (a58Var3 == null) {
                                dz9VarF = f(t72Var2, el5Var, new y8a(m88Var2, null));
                            } else {
                                a58Var3.a();
                                dz9VarF = f(t72Var2, el5Var, new z8a(m88Var2, null));
                            }
                            if (a58Var3 != null) {
                                if (oh4Var9 == null) {
                                    v8aVar.t = yg0Var2;
                                    v8aVar.u = t72Var2;
                                    v8aVar.v = m88Var2;
                                    v8aVar.w = oh4Var9;
                                    v8aVar.x = oh4Var10;
                                    v8aVar.y = ei4Var4;
                                    v8aVar.z = oh4Var11;
                                    v8aVar.A = a58Var3;
                                    v8aVar.B = dz9VarF;
                                    v8aVar.D = 5;
                                    oh4Var12 = oh4Var10;
                                    dz9Var = dz9VarF;
                                    oh4Var13 = oh4Var11;
                                    objK = yg0Var2.K(yg0Var2.getViewConfiguration().a(), new q8a(a58Var3, null), v8aVar);
                                    if (objK != v72Var) {
                                        a58Var4 = a58Var3;
                                        ei4Var5 = ei4Var4;
                                        yg0Var4 = yg0Var2;
                                        oh4Var14 = oh4Var13;
                                        objI = objK;
                                        el5Var2 = dz9Var;
                                        a58Var5 = (a58) objI;
                                        if (a58Var5 != null) {
                                            oh4Var15 = oh4Var12;
                                            dz9VarD2 = oy0.d(t72Var2, null, x72Var, new a9a(el5Var2, m88Var2, null), 1);
                                            if (ei4Var5 != aVar) {
                                                f(t72Var2, dz9VarD2, new b9a(ei4Var5, m88Var2, a58Var5, null));
                                            }
                                            if (oh4Var15 == null) {
                                                v8aVar.t = t72Var2;
                                                v8aVar.u = m88Var2;
                                                v8aVar.v = oh4Var9;
                                                v8aVar.w = oh4Var14;
                                                v8aVar.x = dz9VarD2;
                                                v8aVar.y = a58Var4;
                                                v8aVar.z = null;
                                                v8aVar.A = null;
                                                v8aVar.B = null;
                                                v8aVar.D = 6;
                                                objI = i(yg0Var4, s48Var, v8aVar);
                                                if (objI != v72Var) {
                                                    a58 a58Var10 = a58Var4;
                                                    el5Var4 = dz9VarD2;
                                                    a58Var8 = a58Var10;
                                                    oh4Var19 = oh4Var14;
                                                    oh4Var20 = oh4Var9;
                                                    m88Var5 = m88Var2;
                                                    t72Var5 = t72Var2;
                                                    oh4Var18 = oh4Var20;
                                                    a58Var9 = (a58) objI;
                                                    if (a58Var9 != null) {
                                                        a58Var9.a();
                                                        f(t72Var5, el5Var4, new c9a(m88Var5, null));
                                                        oh4Var18.invoke(new vf7(a58Var9.c));
                                                    } else {
                                                        f(t72Var5, el5Var4, new d9a(m88Var5, null));
                                                        if (oh4Var19 != null) {
                                                            oh4Var19.invoke(new vf7(a58Var8.c));
                                                        }
                                                    }
                                                }
                                            } else {
                                                v8aVar.t = yg0Var4;
                                                v8aVar.u = t72Var2;
                                                v8aVar.v = m88Var2;
                                                v8aVar.w = oh4Var9;
                                                oh4Var16 = oh4Var15;
                                                v8aVar.x = oh4Var16;
                                                v8aVar.y = oh4Var14;
                                                v8aVar.z = dz9VarD2;
                                                v8aVar.A = a58Var4;
                                                v8aVar.B = a58Var5;
                                                v8aVar.D = 7;
                                                objH2 = h(yg0Var4, s48Var, v8aVar);
                                                if (objH2 != v72Var) {
                                                    el5Var3 = dz9VarD2;
                                                    a58Var6 = a58Var5;
                                                    objI = objH2;
                                                    oh4Var17 = oh4Var14;
                                                    oh4Var18 = oh4Var9;
                                                    t72Var4 = t72Var2;
                                                    a58Var7 = a58Var4;
                                                    m88Var4 = m88Var2;
                                                    yg0Var5 = yg0Var4;
                                                    pe6Var2 = (pe6) objI;
                                                    if (xj5.a(pe6Var2, pe6.c.a)) {
                                                        oh4Var16.invoke(new vf7(a58Var6.c));
                                                        v8aVar.t = t72Var4;
                                                        v8aVar.u = m88Var4;
                                                        v8aVar.v = el5Var3;
                                                        r02Var2 = null;
                                                        v8aVar.w = null;
                                                        v8aVar.x = null;
                                                        v8aVar.y = null;
                                                        v8aVar.z = null;
                                                        v8aVar.A = null;
                                                        v8aVar.B = null;
                                                        v8aVar.D = 8;
                                                        if (c(yg0Var5, v8aVar) != v72Var) {
                                                            el5Var5 = el5Var3;
                                                            t72Var6 = t72Var4;
                                                            f(t72Var6, el5Var5, new f9a(m88Var4, r02Var2));
                                                            return g2b.a;
                                                        }
                                                    } else {
                                                        if (pe6Var2 instanceof pe6.b) {
                                                            a58 a58Var11 = a58Var7;
                                                            a58Var9 = ((pe6.b) pe6Var2).a;
                                                            a58Var8 = a58Var11;
                                                            oh4 oh4Var22 = oh4Var17;
                                                            m88Var5 = m88Var4;
                                                            el5Var4 = el5Var3;
                                                            oh4Var19 = oh4Var22;
                                                            t72Var5 = t72Var4;
                                                        } else {
                                                            if (pe6Var2 instanceof pe6.a) {
                                                                u.b();
                                                                return null;
                                                            }
                                                            oh4 oh4Var23 = oh4Var17;
                                                            m88Var5 = m88Var4;
                                                            el5Var4 = el5Var3;
                                                            oh4Var19 = oh4Var23;
                                                            a58Var8 = a58Var7;
                                                            t72Var5 = t72Var4;
                                                            a58Var9 = null;
                                                        }
                                                        if (a58Var9 != null) {
                                                            a58Var9.a();
                                                            f(t72Var5, el5Var4, new c9a(m88Var5, null));
                                                            oh4Var18.invoke(new vf7(a58Var9.c));
                                                        } else {
                                                            f(t72Var5, el5Var4, new d9a(m88Var5, null));
                                                            if (oh4Var19 != null) {
                                                                oh4Var19.invoke(new vf7(a58Var8.c));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (oh4Var14 != null) {
                                            oh4Var14.invoke(new vf7(a58Var4.c));
                                        }
                                    }
                                } else if (oh4Var11 != null) {
                                    oh4Var11.invoke(new vf7(a58Var3.c));
                                }
                            }
                            return g2b.a;
                        }
                    } else {
                        v8aVar.t = yg0Var2;
                        v8aVar.u = t72Var2;
                        v8aVar.v = m88Var2;
                        v8aVar.w = oh4Var4;
                        v8aVar.x = oh4Var5;
                        v8aVar.y = ei4Var2;
                        v8aVar.z = oh4Var6;
                        v8aVar.A = a58Var;
                        v8aVar.B = dz9VarD;
                        v8aVar.D = 3;
                        objH = h(yg0Var2, s48Var, v8aVar);
                        if (objH != v72Var) {
                            oh4Var7 = oh4Var4;
                            ei4Var3 = ei4Var2;
                            a58Var2 = a58Var;
                            objI = objH;
                            oh4Var8 = oh4Var6;
                            el5Var = dz9VarD;
                            yg0Var3 = yg0Var2;
                            pe6Var = (pe6) objI;
                            if (!xj5.a(pe6Var, pe6.c.a)) {
                                if (pe6Var instanceof pe6.b) {
                                    a58Var3 = ((pe6.b) pe6Var).a;
                                } else {
                                    if (!(pe6Var instanceof pe6.a)) {
                                        u.b();
                                        return null;
                                    }
                                    a58Var3 = null;
                                }
                                oh4Var11 = oh4Var8;
                                ei4Var4 = ei4Var3;
                                oh4Var10 = oh4Var5;
                                yg0Var2 = yg0Var3;
                                oh4Var9 = oh4Var7;
                                if (a58Var3 == null) {
                                    dz9VarF = f(t72Var2, el5Var, new y8a(m88Var2, null));
                                } else {
                                    a58Var3.a();
                                    dz9VarF = f(t72Var2, el5Var, new z8a(m88Var2, null));
                                }
                                if (a58Var3 != null) {
                                    if (oh4Var9 == null) {
                                        v8aVar.t = yg0Var2;
                                        v8aVar.u = t72Var2;
                                        v8aVar.v = m88Var2;
                                        v8aVar.w = oh4Var9;
                                        v8aVar.x = oh4Var10;
                                        v8aVar.y = ei4Var4;
                                        v8aVar.z = oh4Var11;
                                        v8aVar.A = a58Var3;
                                        v8aVar.B = dz9VarF;
                                        v8aVar.D = 5;
                                        oh4Var12 = oh4Var10;
                                        dz9Var = dz9VarF;
                                        oh4Var13 = oh4Var11;
                                        objK = yg0Var2.K(yg0Var2.getViewConfiguration().a(), new q8a(a58Var3, null), v8aVar);
                                        if (objK != v72Var) {
                                            a58Var4 = a58Var3;
                                            ei4Var5 = ei4Var4;
                                            yg0Var4 = yg0Var2;
                                            oh4Var14 = oh4Var13;
                                            objI = objK;
                                            el5Var2 = dz9Var;
                                            a58Var5 = (a58) objI;
                                            if (a58Var5 != null) {
                                                oh4Var15 = oh4Var12;
                                                dz9VarD2 = oy0.d(t72Var2, null, x72Var, new a9a(el5Var2, m88Var2, null), 1);
                                                if (ei4Var5 != aVar) {
                                                    f(t72Var2, dz9VarD2, new b9a(ei4Var5, m88Var2, a58Var5, null));
                                                }
                                                if (oh4Var15 == null) {
                                                    v8aVar.t = t72Var2;
                                                    v8aVar.u = m88Var2;
                                                    v8aVar.v = oh4Var9;
                                                    v8aVar.w = oh4Var14;
                                                    v8aVar.x = dz9VarD2;
                                                    v8aVar.y = a58Var4;
                                                    v8aVar.z = null;
                                                    v8aVar.A = null;
                                                    v8aVar.B = null;
                                                    v8aVar.D = 6;
                                                    objI = i(yg0Var4, s48Var, v8aVar);
                                                    if (objI != v72Var) {
                                                        a58 a58Var12 = a58Var4;
                                                        el5Var4 = dz9VarD2;
                                                        a58Var8 = a58Var12;
                                                        oh4Var19 = oh4Var14;
                                                        oh4Var20 = oh4Var9;
                                                        m88Var5 = m88Var2;
                                                        t72Var5 = t72Var2;
                                                        oh4Var18 = oh4Var20;
                                                        a58Var9 = (a58) objI;
                                                        if (a58Var9 != null) {
                                                            a58Var9.a();
                                                            f(t72Var5, el5Var4, new c9a(m88Var5, null));
                                                            oh4Var18.invoke(new vf7(a58Var9.c));
                                                        } else {
                                                            f(t72Var5, el5Var4, new d9a(m88Var5, null));
                                                            if (oh4Var19 != null) {
                                                                oh4Var19.invoke(new vf7(a58Var8.c));
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    v8aVar.t = yg0Var4;
                                                    v8aVar.u = t72Var2;
                                                    v8aVar.v = m88Var2;
                                                    v8aVar.w = oh4Var9;
                                                    oh4Var16 = oh4Var15;
                                                    v8aVar.x = oh4Var16;
                                                    v8aVar.y = oh4Var14;
                                                    v8aVar.z = dz9VarD2;
                                                    v8aVar.A = a58Var4;
                                                    v8aVar.B = a58Var5;
                                                    v8aVar.D = 7;
                                                    objH2 = h(yg0Var4, s48Var, v8aVar);
                                                    if (objH2 != v72Var) {
                                                        el5Var3 = dz9VarD2;
                                                        a58Var6 = a58Var5;
                                                        objI = objH2;
                                                        oh4Var17 = oh4Var14;
                                                        oh4Var18 = oh4Var9;
                                                        t72Var4 = t72Var2;
                                                        a58Var7 = a58Var4;
                                                        m88Var4 = m88Var2;
                                                        yg0Var5 = yg0Var4;
                                                        pe6Var2 = (pe6) objI;
                                                        if (xj5.a(pe6Var2, pe6.c.a)) {
                                                            oh4Var16.invoke(new vf7(a58Var6.c));
                                                            v8aVar.t = t72Var4;
                                                            v8aVar.u = m88Var4;
                                                            v8aVar.v = el5Var3;
                                                            r02Var2 = null;
                                                            v8aVar.w = null;
                                                            v8aVar.x = null;
                                                            v8aVar.y = null;
                                                            v8aVar.z = null;
                                                            v8aVar.A = null;
                                                            v8aVar.B = null;
                                                            v8aVar.D = 8;
                                                            if (c(yg0Var5, v8aVar) != v72Var) {
                                                                el5Var5 = el5Var3;
                                                                t72Var6 = t72Var4;
                                                                f(t72Var6, el5Var5, new f9a(m88Var4, r02Var2));
                                                                return g2b.a;
                                                            }
                                                        } else {
                                                            if (pe6Var2 instanceof pe6.b) {
                                                                a58 a58Var13 = a58Var7;
                                                                a58Var9 = ((pe6.b) pe6Var2).a;
                                                                a58Var8 = a58Var13;
                                                                oh4 oh4Var24 = oh4Var17;
                                                                m88Var5 = m88Var4;
                                                                el5Var4 = el5Var3;
                                                                oh4Var19 = oh4Var24;
                                                                t72Var5 = t72Var4;
                                                            } else {
                                                                if (pe6Var2 instanceof pe6.a) {
                                                                    u.b();
                                                                    return null;
                                                                }
                                                                oh4 oh4Var25 = oh4Var17;
                                                                m88Var5 = m88Var4;
                                                                el5Var4 = el5Var3;
                                                                oh4Var19 = oh4Var25;
                                                                a58Var8 = a58Var7;
                                                                t72Var5 = t72Var4;
                                                                a58Var9 = null;
                                                            }
                                                            if (a58Var9 != null) {
                                                                a58Var9.a();
                                                                f(t72Var5, el5Var4, new c9a(m88Var5, null));
                                                                oh4Var18.invoke(new vf7(a58Var9.c));
                                                            } else {
                                                                f(t72Var5, el5Var4, new d9a(m88Var5, null));
                                                                if (oh4Var19 != null) {
                                                                    oh4Var19.invoke(new vf7(a58Var8.c));
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else if (oh4Var14 != null) {
                                                oh4Var14.invoke(new vf7(a58Var4.c));
                                            }
                                        }
                                    } else if (oh4Var11 != null) {
                                        oh4Var11.invoke(new vf7(a58Var3.c));
                                    }
                                }
                                return g2b.a;
                            }
                            oh4Var5.invoke(new vf7(a58Var2.c));
                            v8aVar.t = t72Var2;
                            v8aVar.u = m88Var2;
                            v8aVar.v = el5Var;
                            r02Var = null;
                            v8aVar.w = null;
                            v8aVar.x = null;
                            v8aVar.y = null;
                            v8aVar.z = null;
                            v8aVar.A = null;
                            v8aVar.B = null;
                            v8aVar.D = 4;
                            if (c(yg0Var3, v8aVar) != v72Var) {
                                m88Var3 = m88Var2;
                                t72Var3 = t72Var2;
                                f(t72Var3, el5Var, new x8a(m88Var3, r02Var));
                                return g2b.a;
                            }
                        }
                    }
                }
                return v72Var;
            case 1:
                oh4Var6 = (oh4) v8aVar.z;
                ei4Var2 = (ei4) v8aVar.y;
                oh4 oh4Var26 = (oh4) v8aVar.x;
                oh4 oh4Var27 = v8aVar.w;
                m88Var2 = (m88) v8aVar.v;
                t72Var2 = (t72) v8aVar.u;
                yg0Var2 = (yg0) v8aVar.t;
                dv8.b(objI);
                oh4Var5 = oh4Var26;
                oh4Var4 = oh4Var27;
                a58Var = (a58) objI;
                a58Var.a();
                dz9VarD = oy0.d(t72Var2, null, x72Var, new e9a(m88Var2, null), 1);
                if (ei4Var2 != aVar) {
                    f(t72Var2, dz9VarD, new w8a(ei4Var2, m88Var2, a58Var, null));
                }
                if (oh4Var5 == null) {
                    v8aVar.t = yg0Var2;
                    v8aVar.u = t72Var2;
                    v8aVar.v = m88Var2;
                    v8aVar.w = oh4Var4;
                    v8aVar.x = oh4Var5;
                    v8aVar.y = ei4Var2;
                    v8aVar.z = oh4Var6;
                    v8aVar.A = dz9VarD;
                    v8aVar.D = 2;
                    objI = i(yg0Var2, s48Var, v8aVar);
                    if (objI != v72Var) {
                        oh4 oh4Var28 = oh4Var5;
                        oh4Var9 = oh4Var4;
                        oh4Var10 = oh4Var28;
                        ei4Var4 = ei4Var2;
                        oh4Var11 = oh4Var6;
                        el5Var = dz9VarD;
                        a58Var3 = (a58) objI;
                        if (a58Var3 == null) {
                            dz9VarF = f(t72Var2, el5Var, new y8a(m88Var2, null));
                        } else {
                            a58Var3.a();
                            dz9VarF = f(t72Var2, el5Var, new z8a(m88Var2, null));
                        }
                        if (a58Var3 != null) {
                            if (oh4Var9 == null) {
                                v8aVar.t = yg0Var2;
                                v8aVar.u = t72Var2;
                                v8aVar.v = m88Var2;
                                v8aVar.w = oh4Var9;
                                v8aVar.x = oh4Var10;
                                v8aVar.y = ei4Var4;
                                v8aVar.z = oh4Var11;
                                v8aVar.A = a58Var3;
                                v8aVar.B = dz9VarF;
                                v8aVar.D = 5;
                                oh4Var12 = oh4Var10;
                                dz9Var = dz9VarF;
                                oh4Var13 = oh4Var11;
                                objK = yg0Var2.K(yg0Var2.getViewConfiguration().a(), new q8a(a58Var3, null), v8aVar);
                                if (objK != v72Var) {
                                    a58Var4 = a58Var3;
                                    ei4Var5 = ei4Var4;
                                    yg0Var4 = yg0Var2;
                                    oh4Var14 = oh4Var13;
                                    objI = objK;
                                    el5Var2 = dz9Var;
                                    a58Var5 = (a58) objI;
                                    if (a58Var5 != null) {
                                        oh4Var15 = oh4Var12;
                                        dz9VarD2 = oy0.d(t72Var2, null, x72Var, new a9a(el5Var2, m88Var2, null), 1);
                                        if (ei4Var5 != aVar) {
                                            f(t72Var2, dz9VarD2, new b9a(ei4Var5, m88Var2, a58Var5, null));
                                        }
                                        if (oh4Var15 == null) {
                                            v8aVar.t = t72Var2;
                                            v8aVar.u = m88Var2;
                                            v8aVar.v = oh4Var9;
                                            v8aVar.w = oh4Var14;
                                            v8aVar.x = dz9VarD2;
                                            v8aVar.y = a58Var4;
                                            v8aVar.z = null;
                                            v8aVar.A = null;
                                            v8aVar.B = null;
                                            v8aVar.D = 6;
                                            objI = i(yg0Var4, s48Var, v8aVar);
                                            if (objI != v72Var) {
                                                a58 a58Var14 = a58Var4;
                                                el5Var4 = dz9VarD2;
                                                a58Var8 = a58Var14;
                                                oh4Var19 = oh4Var14;
                                                oh4Var20 = oh4Var9;
                                                m88Var5 = m88Var2;
                                                t72Var5 = t72Var2;
                                                oh4Var18 = oh4Var20;
                                                a58Var9 = (a58) objI;
                                                if (a58Var9 != null) {
                                                    a58Var9.a();
                                                    f(t72Var5, el5Var4, new c9a(m88Var5, null));
                                                    oh4Var18.invoke(new vf7(a58Var9.c));
                                                } else {
                                                    f(t72Var5, el5Var4, new d9a(m88Var5, null));
                                                    if (oh4Var19 != null) {
                                                        oh4Var19.invoke(new vf7(a58Var8.c));
                                                    }
                                                }
                                            }
                                        } else {
                                            v8aVar.t = yg0Var4;
                                            v8aVar.u = t72Var2;
                                            v8aVar.v = m88Var2;
                                            v8aVar.w = oh4Var9;
                                            oh4Var16 = oh4Var15;
                                            v8aVar.x = oh4Var16;
                                            v8aVar.y = oh4Var14;
                                            v8aVar.z = dz9VarD2;
                                            v8aVar.A = a58Var4;
                                            v8aVar.B = a58Var5;
                                            v8aVar.D = 7;
                                            objH2 = h(yg0Var4, s48Var, v8aVar);
                                            if (objH2 != v72Var) {
                                                el5Var3 = dz9VarD2;
                                                a58Var6 = a58Var5;
                                                objI = objH2;
                                                oh4Var17 = oh4Var14;
                                                oh4Var18 = oh4Var9;
                                                t72Var4 = t72Var2;
                                                a58Var7 = a58Var4;
                                                m88Var4 = m88Var2;
                                                yg0Var5 = yg0Var4;
                                                pe6Var2 = (pe6) objI;
                                                if (xj5.a(pe6Var2, pe6.c.a)) {
                                                    oh4Var16.invoke(new vf7(a58Var6.c));
                                                    v8aVar.t = t72Var4;
                                                    v8aVar.u = m88Var4;
                                                    v8aVar.v = el5Var3;
                                                    r02Var2 = null;
                                                    v8aVar.w = null;
                                                    v8aVar.x = null;
                                                    v8aVar.y = null;
                                                    v8aVar.z = null;
                                                    v8aVar.A = null;
                                                    v8aVar.B = null;
                                                    v8aVar.D = 8;
                                                    if (c(yg0Var5, v8aVar) != v72Var) {
                                                        el5Var5 = el5Var3;
                                                        t72Var6 = t72Var4;
                                                        f(t72Var6, el5Var5, new f9a(m88Var4, r02Var2));
                                                        return g2b.a;
                                                    }
                                                } else {
                                                    if (pe6Var2 instanceof pe6.b) {
                                                        a58 a58Var15 = a58Var7;
                                                        a58Var9 = ((pe6.b) pe6Var2).a;
                                                        a58Var8 = a58Var15;
                                                        oh4 oh4Var29 = oh4Var17;
                                                        m88Var5 = m88Var4;
                                                        el5Var4 = el5Var3;
                                                        oh4Var19 = oh4Var29;
                                                        t72Var5 = t72Var4;
                                                    } else {
                                                        if (pe6Var2 instanceof pe6.a) {
                                                            u.b();
                                                            return null;
                                                        }
                                                        oh4 oh4Var210 = oh4Var17;
                                                        m88Var5 = m88Var4;
                                                        el5Var4 = el5Var3;
                                                        oh4Var19 = oh4Var210;
                                                        a58Var8 = a58Var7;
                                                        t72Var5 = t72Var4;
                                                        a58Var9 = null;
                                                    }
                                                    if (a58Var9 != null) {
                                                        a58Var9.a();
                                                        f(t72Var5, el5Var4, new c9a(m88Var5, null));
                                                        oh4Var18.invoke(new vf7(a58Var9.c));
                                                    } else {
                                                        f(t72Var5, el5Var4, new d9a(m88Var5, null));
                                                        if (oh4Var19 != null) {
                                                            oh4Var19.invoke(new vf7(a58Var8.c));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    } else if (oh4Var14 != null) {
                                        oh4Var14.invoke(new vf7(a58Var4.c));
                                    }
                                }
                            } else if (oh4Var11 != null) {
                                oh4Var11.invoke(new vf7(a58Var3.c));
                            }
                        }
                        return g2b.a;
                    }
                } else {
                    v8aVar.t = yg0Var2;
                    v8aVar.u = t72Var2;
                    v8aVar.v = m88Var2;
                    v8aVar.w = oh4Var4;
                    v8aVar.x = oh4Var5;
                    v8aVar.y = ei4Var2;
                    v8aVar.z = oh4Var6;
                    v8aVar.A = a58Var;
                    v8aVar.B = dz9VarD;
                    v8aVar.D = 3;
                    objH = h(yg0Var2, s48Var, v8aVar);
                    if (objH != v72Var) {
                        oh4Var7 = oh4Var4;
                        ei4Var3 = ei4Var2;
                        a58Var2 = a58Var;
                        objI = objH;
                        oh4Var8 = oh4Var6;
                        el5Var = dz9VarD;
                        yg0Var3 = yg0Var2;
                        pe6Var = (pe6) objI;
                        if (!xj5.a(pe6Var, pe6.c.a)) {
                            if (pe6Var instanceof pe6.b) {
                                a58Var3 = ((pe6.b) pe6Var).a;
                            } else {
                                if (!(pe6Var instanceof pe6.a)) {
                                    u.b();
                                    return null;
                                }
                                a58Var3 = null;
                            }
                            oh4Var11 = oh4Var8;
                            ei4Var4 = ei4Var3;
                            oh4Var10 = oh4Var5;
                            yg0Var2 = yg0Var3;
                            oh4Var9 = oh4Var7;
                            if (a58Var3 == null) {
                                dz9VarF = f(t72Var2, el5Var, new y8a(m88Var2, null));
                            } else {
                                a58Var3.a();
                                dz9VarF = f(t72Var2, el5Var, new z8a(m88Var2, null));
                            }
                            if (a58Var3 != null) {
                                if (oh4Var9 == null) {
                                    v8aVar.t = yg0Var2;
                                    v8aVar.u = t72Var2;
                                    v8aVar.v = m88Var2;
                                    v8aVar.w = oh4Var9;
                                    v8aVar.x = oh4Var10;
                                    v8aVar.y = ei4Var4;
                                    v8aVar.z = oh4Var11;
                                    v8aVar.A = a58Var3;
                                    v8aVar.B = dz9VarF;
                                    v8aVar.D = 5;
                                    oh4Var12 = oh4Var10;
                                    dz9Var = dz9VarF;
                                    oh4Var13 = oh4Var11;
                                    objK = yg0Var2.K(yg0Var2.getViewConfiguration().a(), new q8a(a58Var3, null), v8aVar);
                                    if (objK != v72Var) {
                                        a58Var4 = a58Var3;
                                        ei4Var5 = ei4Var4;
                                        yg0Var4 = yg0Var2;
                                        oh4Var14 = oh4Var13;
                                        objI = objK;
                                        el5Var2 = dz9Var;
                                        a58Var5 = (a58) objI;
                                        if (a58Var5 != null) {
                                            oh4Var15 = oh4Var12;
                                            dz9VarD2 = oy0.d(t72Var2, null, x72Var, new a9a(el5Var2, m88Var2, null), 1);
                                            if (ei4Var5 != aVar) {
                                                f(t72Var2, dz9VarD2, new b9a(ei4Var5, m88Var2, a58Var5, null));
                                            }
                                            if (oh4Var15 == null) {
                                                v8aVar.t = t72Var2;
                                                v8aVar.u = m88Var2;
                                                v8aVar.v = oh4Var9;
                                                v8aVar.w = oh4Var14;
                                                v8aVar.x = dz9VarD2;
                                                v8aVar.y = a58Var4;
                                                v8aVar.z = null;
                                                v8aVar.A = null;
                                                v8aVar.B = null;
                                                v8aVar.D = 6;
                                                objI = i(yg0Var4, s48Var, v8aVar);
                                                if (objI != v72Var) {
                                                    a58 a58Var16 = a58Var4;
                                                    el5Var4 = dz9VarD2;
                                                    a58Var8 = a58Var16;
                                                    oh4Var19 = oh4Var14;
                                                    oh4Var20 = oh4Var9;
                                                    m88Var5 = m88Var2;
                                                    t72Var5 = t72Var2;
                                                    oh4Var18 = oh4Var20;
                                                    a58Var9 = (a58) objI;
                                                    if (a58Var9 != null) {
                                                        a58Var9.a();
                                                        f(t72Var5, el5Var4, new c9a(m88Var5, null));
                                                        oh4Var18.invoke(new vf7(a58Var9.c));
                                                    } else {
                                                        f(t72Var5, el5Var4, new d9a(m88Var5, null));
                                                        if (oh4Var19 != null) {
                                                            oh4Var19.invoke(new vf7(a58Var8.c));
                                                        }
                                                    }
                                                }
                                            } else {
                                                v8aVar.t = yg0Var4;
                                                v8aVar.u = t72Var2;
                                                v8aVar.v = m88Var2;
                                                v8aVar.w = oh4Var9;
                                                oh4Var16 = oh4Var15;
                                                v8aVar.x = oh4Var16;
                                                v8aVar.y = oh4Var14;
                                                v8aVar.z = dz9VarD2;
                                                v8aVar.A = a58Var4;
                                                v8aVar.B = a58Var5;
                                                v8aVar.D = 7;
                                                objH2 = h(yg0Var4, s48Var, v8aVar);
                                                if (objH2 != v72Var) {
                                                    el5Var3 = dz9VarD2;
                                                    a58Var6 = a58Var5;
                                                    objI = objH2;
                                                    oh4Var17 = oh4Var14;
                                                    oh4Var18 = oh4Var9;
                                                    t72Var4 = t72Var2;
                                                    a58Var7 = a58Var4;
                                                    m88Var4 = m88Var2;
                                                    yg0Var5 = yg0Var4;
                                                    pe6Var2 = (pe6) objI;
                                                    if (xj5.a(pe6Var2, pe6.c.a)) {
                                                        oh4Var16.invoke(new vf7(a58Var6.c));
                                                        v8aVar.t = t72Var4;
                                                        v8aVar.u = m88Var4;
                                                        v8aVar.v = el5Var3;
                                                        r02Var2 = null;
                                                        v8aVar.w = null;
                                                        v8aVar.x = null;
                                                        v8aVar.y = null;
                                                        v8aVar.z = null;
                                                        v8aVar.A = null;
                                                        v8aVar.B = null;
                                                        v8aVar.D = 8;
                                                        if (c(yg0Var5, v8aVar) != v72Var) {
                                                            el5Var5 = el5Var3;
                                                            t72Var6 = t72Var4;
                                                            f(t72Var6, el5Var5, new f9a(m88Var4, r02Var2));
                                                            return g2b.a;
                                                        }
                                                    } else {
                                                        if (pe6Var2 instanceof pe6.b) {
                                                            a58 a58Var17 = a58Var7;
                                                            a58Var9 = ((pe6.b) pe6Var2).a;
                                                            a58Var8 = a58Var17;
                                                            oh4 oh4Var211 = oh4Var17;
                                                            m88Var5 = m88Var4;
                                                            el5Var4 = el5Var3;
                                                            oh4Var19 = oh4Var211;
                                                            t72Var5 = t72Var4;
                                                        } else {
                                                            if (pe6Var2 instanceof pe6.a) {
                                                                u.b();
                                                                return null;
                                                            }
                                                            oh4 oh4Var212 = oh4Var17;
                                                            m88Var5 = m88Var4;
                                                            el5Var4 = el5Var3;
                                                            oh4Var19 = oh4Var212;
                                                            a58Var8 = a58Var7;
                                                            t72Var5 = t72Var4;
                                                            a58Var9 = null;
                                                        }
                                                        if (a58Var9 != null) {
                                                            a58Var9.a();
                                                            f(t72Var5, el5Var4, new c9a(m88Var5, null));
                                                            oh4Var18.invoke(new vf7(a58Var9.c));
                                                        } else {
                                                            f(t72Var5, el5Var4, new d9a(m88Var5, null));
                                                            if (oh4Var19 != null) {
                                                                oh4Var19.invoke(new vf7(a58Var8.c));
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (oh4Var14 != null) {
                                            oh4Var14.invoke(new vf7(a58Var4.c));
                                        }
                                    }
                                } else if (oh4Var11 != null) {
                                    oh4Var11.invoke(new vf7(a58Var3.c));
                                }
                            }
                            return g2b.a;
                        }
                        oh4Var5.invoke(new vf7(a58Var2.c));
                        v8aVar.t = t72Var2;
                        v8aVar.u = m88Var2;
                        v8aVar.v = el5Var;
                        r02Var = null;
                        v8aVar.w = null;
                        v8aVar.x = null;
                        v8aVar.y = null;
                        v8aVar.z = null;
                        v8aVar.A = null;
                        v8aVar.B = null;
                        v8aVar.D = 4;
                        if (c(yg0Var3, v8aVar) != v72Var) {
                            m88Var3 = m88Var2;
                            t72Var3 = t72Var2;
                            f(t72Var3, el5Var, new x8a(m88Var3, r02Var));
                            return g2b.a;
                        }
                    }
                }
                return v72Var;
            case 2:
                el5Var = (el5) v8aVar.A;
                oh4Var11 = (oh4) v8aVar.z;
                ei4Var4 = (ei4) v8aVar.y;
                oh4Var10 = (oh4) v8aVar.x;
                oh4Var9 = v8aVar.w;
                m88Var2 = (m88) v8aVar.v;
                t72Var2 = (t72) v8aVar.u;
                yg0Var2 = (yg0) v8aVar.t;
                dv8.b(objI);
                a58Var3 = (a58) objI;
                if (a58Var3 == null) {
                    dz9VarF = f(t72Var2, el5Var, new y8a(m88Var2, null));
                } else {
                    a58Var3.a();
                    dz9VarF = f(t72Var2, el5Var, new z8a(m88Var2, null));
                }
                if (a58Var3 != null) {
                    if (oh4Var9 == null) {
                        v8aVar.t = yg0Var2;
                        v8aVar.u = t72Var2;
                        v8aVar.v = m88Var2;
                        v8aVar.w = oh4Var9;
                        v8aVar.x = oh4Var10;
                        v8aVar.y = ei4Var4;
                        v8aVar.z = oh4Var11;
                        v8aVar.A = a58Var3;
                        v8aVar.B = dz9VarF;
                        v8aVar.D = 5;
                        oh4Var12 = oh4Var10;
                        dz9Var = dz9VarF;
                        oh4Var13 = oh4Var11;
                        objK = yg0Var2.K(yg0Var2.getViewConfiguration().a(), new q8a(a58Var3, null), v8aVar);
                        if (objK != v72Var) {
                            a58Var4 = a58Var3;
                            ei4Var5 = ei4Var4;
                            yg0Var4 = yg0Var2;
                            oh4Var14 = oh4Var13;
                            objI = objK;
                            el5Var2 = dz9Var;
                            a58Var5 = (a58) objI;
                            if (a58Var5 != null) {
                                oh4Var15 = oh4Var12;
                                dz9VarD2 = oy0.d(t72Var2, null, x72Var, new a9a(el5Var2, m88Var2, null), 1);
                                if (ei4Var5 != aVar) {
                                    f(t72Var2, dz9VarD2, new b9a(ei4Var5, m88Var2, a58Var5, null));
                                }
                                if (oh4Var15 == null) {
                                    v8aVar.t = t72Var2;
                                    v8aVar.u = m88Var2;
                                    v8aVar.v = oh4Var9;
                                    v8aVar.w = oh4Var14;
                                    v8aVar.x = dz9VarD2;
                                    v8aVar.y = a58Var4;
                                    v8aVar.z = null;
                                    v8aVar.A = null;
                                    v8aVar.B = null;
                                    v8aVar.D = 6;
                                    objI = i(yg0Var4, s48Var, v8aVar);
                                    if (objI != v72Var) {
                                        a58 a58Var18 = a58Var4;
                                        el5Var4 = dz9VarD2;
                                        a58Var8 = a58Var18;
                                        oh4Var19 = oh4Var14;
                                        oh4Var20 = oh4Var9;
                                        m88Var5 = m88Var2;
                                        t72Var5 = t72Var2;
                                        oh4Var18 = oh4Var20;
                                        a58Var9 = (a58) objI;
                                        if (a58Var9 != null) {
                                            a58Var9.a();
                                            f(t72Var5, el5Var4, new c9a(m88Var5, null));
                                            oh4Var18.invoke(new vf7(a58Var9.c));
                                        } else {
                                            f(t72Var5, el5Var4, new d9a(m88Var5, null));
                                            if (oh4Var19 != null) {
                                                oh4Var19.invoke(new vf7(a58Var8.c));
                                            }
                                        }
                                    }
                                } else {
                                    v8aVar.t = yg0Var4;
                                    v8aVar.u = t72Var2;
                                    v8aVar.v = m88Var2;
                                    v8aVar.w = oh4Var9;
                                    oh4Var16 = oh4Var15;
                                    v8aVar.x = oh4Var16;
                                    v8aVar.y = oh4Var14;
                                    v8aVar.z = dz9VarD2;
                                    v8aVar.A = a58Var4;
                                    v8aVar.B = a58Var5;
                                    v8aVar.D = 7;
                                    objH2 = h(yg0Var4, s48Var, v8aVar);
                                    if (objH2 != v72Var) {
                                        el5Var3 = dz9VarD2;
                                        a58Var6 = a58Var5;
                                        objI = objH2;
                                        oh4Var17 = oh4Var14;
                                        oh4Var18 = oh4Var9;
                                        t72Var4 = t72Var2;
                                        a58Var7 = a58Var4;
                                        m88Var4 = m88Var2;
                                        yg0Var5 = yg0Var4;
                                        pe6Var2 = (pe6) objI;
                                        if (xj5.a(pe6Var2, pe6.c.a)) {
                                            oh4Var16.invoke(new vf7(a58Var6.c));
                                            v8aVar.t = t72Var4;
                                            v8aVar.u = m88Var4;
                                            v8aVar.v = el5Var3;
                                            r02Var2 = null;
                                            v8aVar.w = null;
                                            v8aVar.x = null;
                                            v8aVar.y = null;
                                            v8aVar.z = null;
                                            v8aVar.A = null;
                                            v8aVar.B = null;
                                            v8aVar.D = 8;
                                            if (c(yg0Var5, v8aVar) != v72Var) {
                                                el5Var5 = el5Var3;
                                                t72Var6 = t72Var4;
                                                f(t72Var6, el5Var5, new f9a(m88Var4, r02Var2));
                                                return g2b.a;
                                            }
                                        } else {
                                            if (pe6Var2 instanceof pe6.b) {
                                                a58 a58Var19 = a58Var7;
                                                a58Var9 = ((pe6.b) pe6Var2).a;
                                                a58Var8 = a58Var19;
                                                oh4 oh4Var213 = oh4Var17;
                                                m88Var5 = m88Var4;
                                                el5Var4 = el5Var3;
                                                oh4Var19 = oh4Var213;
                                                t72Var5 = t72Var4;
                                            } else {
                                                if (pe6Var2 instanceof pe6.a) {
                                                    u.b();
                                                    return null;
                                                }
                                                oh4 oh4Var214 = oh4Var17;
                                                m88Var5 = m88Var4;
                                                el5Var4 = el5Var3;
                                                oh4Var19 = oh4Var214;
                                                a58Var8 = a58Var7;
                                                t72Var5 = t72Var4;
                                                a58Var9 = null;
                                            }
                                            if (a58Var9 != null) {
                                                a58Var9.a();
                                                f(t72Var5, el5Var4, new c9a(m88Var5, null));
                                                oh4Var18.invoke(new vf7(a58Var9.c));
                                            } else {
                                                f(t72Var5, el5Var4, new d9a(m88Var5, null));
                                                if (oh4Var19 != null) {
                                                    oh4Var19.invoke(new vf7(a58Var8.c));
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (oh4Var14 != null) {
                                oh4Var14.invoke(new vf7(a58Var4.c));
                            }
                        }
                        return v72Var;
                    }
                    if (oh4Var11 != null) {
                        oh4Var11.invoke(new vf7(a58Var3.c));
                    }
                }
                return g2b.a;
            case 3:
                el5Var = (el5) v8aVar.B;
                a58Var2 = (a58) v8aVar.A;
                oh4Var8 = (oh4) v8aVar.z;
                ei4Var3 = (ei4) v8aVar.y;
                oh4Var5 = (oh4) v8aVar.x;
                oh4 oh4Var30 = v8aVar.w;
                m88 m88Var6 = (m88) v8aVar.v;
                t72 t72Var7 = (t72) v8aVar.u;
                yg0Var3 = (yg0) v8aVar.t;
                dv8.b(objI);
                oh4Var7 = oh4Var30;
                m88Var2 = m88Var6;
                t72Var2 = t72Var7;
                pe6Var = (pe6) objI;
                if (!xj5.a(pe6Var, pe6.c.a)) {
                    if (pe6Var instanceof pe6.b) {
                        a58Var3 = ((pe6.b) pe6Var).a;
                    } else {
                        if (!(pe6Var instanceof pe6.a)) {
                            u.b();
                            return null;
                        }
                        a58Var3 = null;
                    }
                    oh4Var11 = oh4Var8;
                    ei4Var4 = ei4Var3;
                    oh4Var10 = oh4Var5;
                    yg0Var2 = yg0Var3;
                    oh4Var9 = oh4Var7;
                    if (a58Var3 == null) {
                        dz9VarF = f(t72Var2, el5Var, new y8a(m88Var2, null));
                    } else {
                        a58Var3.a();
                        dz9VarF = f(t72Var2, el5Var, new z8a(m88Var2, null));
                    }
                    if (a58Var3 != null) {
                        if (oh4Var9 == null) {
                            v8aVar.t = yg0Var2;
                            v8aVar.u = t72Var2;
                            v8aVar.v = m88Var2;
                            v8aVar.w = oh4Var9;
                            v8aVar.x = oh4Var10;
                            v8aVar.y = ei4Var4;
                            v8aVar.z = oh4Var11;
                            v8aVar.A = a58Var3;
                            v8aVar.B = dz9VarF;
                            v8aVar.D = 5;
                            oh4Var12 = oh4Var10;
                            dz9Var = dz9VarF;
                            oh4Var13 = oh4Var11;
                            objK = yg0Var2.K(yg0Var2.getViewConfiguration().a(), new q8a(a58Var3, null), v8aVar);
                            if (objK != v72Var) {
                                a58Var4 = a58Var3;
                                ei4Var5 = ei4Var4;
                                yg0Var4 = yg0Var2;
                                oh4Var14 = oh4Var13;
                                objI = objK;
                                el5Var2 = dz9Var;
                                a58Var5 = (a58) objI;
                                if (a58Var5 != null) {
                                    oh4Var15 = oh4Var12;
                                    dz9VarD2 = oy0.d(t72Var2, null, x72Var, new a9a(el5Var2, m88Var2, null), 1);
                                    if (ei4Var5 != aVar) {
                                        f(t72Var2, dz9VarD2, new b9a(ei4Var5, m88Var2, a58Var5, null));
                                    }
                                    if (oh4Var15 == null) {
                                        v8aVar.t = t72Var2;
                                        v8aVar.u = m88Var2;
                                        v8aVar.v = oh4Var9;
                                        v8aVar.w = oh4Var14;
                                        v8aVar.x = dz9VarD2;
                                        v8aVar.y = a58Var4;
                                        v8aVar.z = null;
                                        v8aVar.A = null;
                                        v8aVar.B = null;
                                        v8aVar.D = 6;
                                        objI = i(yg0Var4, s48Var, v8aVar);
                                        if (objI != v72Var) {
                                            a58 a58Var110 = a58Var4;
                                            el5Var4 = dz9VarD2;
                                            a58Var8 = a58Var110;
                                            oh4Var19 = oh4Var14;
                                            oh4Var20 = oh4Var9;
                                            m88Var5 = m88Var2;
                                            t72Var5 = t72Var2;
                                            oh4Var18 = oh4Var20;
                                            a58Var9 = (a58) objI;
                                            if (a58Var9 != null) {
                                                a58Var9.a();
                                                f(t72Var5, el5Var4, new c9a(m88Var5, null));
                                                oh4Var18.invoke(new vf7(a58Var9.c));
                                            } else {
                                                f(t72Var5, el5Var4, new d9a(m88Var5, null));
                                                if (oh4Var19 != null) {
                                                    oh4Var19.invoke(new vf7(a58Var8.c));
                                                }
                                            }
                                        }
                                    } else {
                                        v8aVar.t = yg0Var4;
                                        v8aVar.u = t72Var2;
                                        v8aVar.v = m88Var2;
                                        v8aVar.w = oh4Var9;
                                        oh4Var16 = oh4Var15;
                                        v8aVar.x = oh4Var16;
                                        v8aVar.y = oh4Var14;
                                        v8aVar.z = dz9VarD2;
                                        v8aVar.A = a58Var4;
                                        v8aVar.B = a58Var5;
                                        v8aVar.D = 7;
                                        objH2 = h(yg0Var4, s48Var, v8aVar);
                                        if (objH2 != v72Var) {
                                            el5Var3 = dz9VarD2;
                                            a58Var6 = a58Var5;
                                            objI = objH2;
                                            oh4Var17 = oh4Var14;
                                            oh4Var18 = oh4Var9;
                                            t72Var4 = t72Var2;
                                            a58Var7 = a58Var4;
                                            m88Var4 = m88Var2;
                                            yg0Var5 = yg0Var4;
                                            pe6Var2 = (pe6) objI;
                                            if (xj5.a(pe6Var2, pe6.c.a)) {
                                                oh4Var16.invoke(new vf7(a58Var6.c));
                                                v8aVar.t = t72Var4;
                                                v8aVar.u = m88Var4;
                                                v8aVar.v = el5Var3;
                                                r02Var2 = null;
                                                v8aVar.w = null;
                                                v8aVar.x = null;
                                                v8aVar.y = null;
                                                v8aVar.z = null;
                                                v8aVar.A = null;
                                                v8aVar.B = null;
                                                v8aVar.D = 8;
                                                if (c(yg0Var5, v8aVar) != v72Var) {
                                                    el5Var5 = el5Var3;
                                                    t72Var6 = t72Var4;
                                                    f(t72Var6, el5Var5, new f9a(m88Var4, r02Var2));
                                                    return g2b.a;
                                                }
                                            } else {
                                                if (pe6Var2 instanceof pe6.b) {
                                                    a58 a58Var111 = a58Var7;
                                                    a58Var9 = ((pe6.b) pe6Var2).a;
                                                    a58Var8 = a58Var111;
                                                    oh4 oh4Var215 = oh4Var17;
                                                    m88Var5 = m88Var4;
                                                    el5Var4 = el5Var3;
                                                    oh4Var19 = oh4Var215;
                                                    t72Var5 = t72Var4;
                                                } else {
                                                    if (pe6Var2 instanceof pe6.a) {
                                                        u.b();
                                                        return null;
                                                    }
                                                    oh4 oh4Var216 = oh4Var17;
                                                    m88Var5 = m88Var4;
                                                    el5Var4 = el5Var3;
                                                    oh4Var19 = oh4Var216;
                                                    a58Var8 = a58Var7;
                                                    t72Var5 = t72Var4;
                                                    a58Var9 = null;
                                                }
                                                if (a58Var9 != null) {
                                                    a58Var9.a();
                                                    f(t72Var5, el5Var4, new c9a(m88Var5, null));
                                                    oh4Var18.invoke(new vf7(a58Var9.c));
                                                } else {
                                                    f(t72Var5, el5Var4, new d9a(m88Var5, null));
                                                    if (oh4Var19 != null) {
                                                        oh4Var19.invoke(new vf7(a58Var8.c));
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else if (oh4Var14 != null) {
                                    oh4Var14.invoke(new vf7(a58Var4.c));
                                }
                            }
                        } else if (oh4Var11 != null) {
                            oh4Var11.invoke(new vf7(a58Var3.c));
                        }
                    }
                    return g2b.a;
                }
                oh4Var5.invoke(new vf7(a58Var2.c));
                v8aVar.t = t72Var2;
                v8aVar.u = m88Var2;
                v8aVar.v = el5Var;
                r02Var = null;
                v8aVar.w = null;
                v8aVar.x = null;
                v8aVar.y = null;
                v8aVar.z = null;
                v8aVar.A = null;
                v8aVar.B = null;
                v8aVar.D = 4;
                if (c(yg0Var3, v8aVar) != v72Var) {
                    m88Var3 = m88Var2;
                    t72Var3 = t72Var2;
                    f(t72Var3, el5Var, new x8a(m88Var3, r02Var));
                    return g2b.a;
                }
                return v72Var;
            case 4:
                el5Var = (el5) v8aVar.v;
                m88Var3 = (m88) v8aVar.u;
                t72Var3 = (t72) v8aVar.t;
                dv8.b(objI);
                r02Var = null;
                f(t72Var3, el5Var, new x8a(m88Var3, r02Var));
                return g2b.a;
            case 5:
                el5Var2 = (el5) v8aVar.B;
                a58Var4 = (a58) v8aVar.A;
                oh4Var14 = (oh4) v8aVar.z;
                ei4 ei4Var6 = (ei4) v8aVar.y;
                oh4 oh4Var31 = (oh4) v8aVar.x;
                oh4 oh4Var32 = v8aVar.w;
                m88 m88Var7 = (m88) v8aVar.v;
                t72 t72Var8 = (t72) v8aVar.u;
                yg0Var4 = (yg0) v8aVar.t;
                dv8.b(objI);
                ei4Var5 = ei4Var6;
                oh4Var9 = oh4Var32;
                t72Var2 = t72Var8;
                oh4Var12 = oh4Var31;
                m88Var2 = m88Var7;
                a58Var5 = (a58) objI;
                if (a58Var5 != null) {
                    oh4Var15 = oh4Var12;
                    dz9VarD2 = oy0.d(t72Var2, null, x72Var, new a9a(el5Var2, m88Var2, null), 1);
                    if (ei4Var5 != aVar) {
                        f(t72Var2, dz9VarD2, new b9a(ei4Var5, m88Var2, a58Var5, null));
                    }
                    if (oh4Var15 == null) {
                        v8aVar.t = t72Var2;
                        v8aVar.u = m88Var2;
                        v8aVar.v = oh4Var9;
                        v8aVar.w = oh4Var14;
                        v8aVar.x = dz9VarD2;
                        v8aVar.y = a58Var4;
                        v8aVar.z = null;
                        v8aVar.A = null;
                        v8aVar.B = null;
                        v8aVar.D = 6;
                        objI = i(yg0Var4, s48Var, v8aVar);
                        if (objI != v72Var) {
                            a58 a58Var112 = a58Var4;
                            el5Var4 = dz9VarD2;
                            a58Var8 = a58Var112;
                            oh4Var19 = oh4Var14;
                            oh4Var20 = oh4Var9;
                            m88Var5 = m88Var2;
                            t72Var5 = t72Var2;
                            oh4Var18 = oh4Var20;
                            a58Var9 = (a58) objI;
                            if (a58Var9 != null) {
                                a58Var9.a();
                                f(t72Var5, el5Var4, new c9a(m88Var5, null));
                                oh4Var18.invoke(new vf7(a58Var9.c));
                            } else {
                                f(t72Var5, el5Var4, new d9a(m88Var5, null));
                                if (oh4Var19 != null) {
                                    oh4Var19.invoke(new vf7(a58Var8.c));
                                }
                            }
                        }
                    } else {
                        v8aVar.t = yg0Var4;
                        v8aVar.u = t72Var2;
                        v8aVar.v = m88Var2;
                        v8aVar.w = oh4Var9;
                        oh4Var16 = oh4Var15;
                        v8aVar.x = oh4Var16;
                        v8aVar.y = oh4Var14;
                        v8aVar.z = dz9VarD2;
                        v8aVar.A = a58Var4;
                        v8aVar.B = a58Var5;
                        v8aVar.D = 7;
                        objH2 = h(yg0Var4, s48Var, v8aVar);
                        if (objH2 != v72Var) {
                            el5Var3 = dz9VarD2;
                            a58Var6 = a58Var5;
                            objI = objH2;
                            oh4Var17 = oh4Var14;
                            oh4Var18 = oh4Var9;
                            t72Var4 = t72Var2;
                            a58Var7 = a58Var4;
                            m88Var4 = m88Var2;
                            yg0Var5 = yg0Var4;
                            pe6Var2 = (pe6) objI;
                            if (xj5.a(pe6Var2, pe6.c.a)) {
                                oh4Var16.invoke(new vf7(a58Var6.c));
                                v8aVar.t = t72Var4;
                                v8aVar.u = m88Var4;
                                v8aVar.v = el5Var3;
                                r02Var2 = null;
                                v8aVar.w = null;
                                v8aVar.x = null;
                                v8aVar.y = null;
                                v8aVar.z = null;
                                v8aVar.A = null;
                                v8aVar.B = null;
                                v8aVar.D = 8;
                                if (c(yg0Var5, v8aVar) != v72Var) {
                                    el5Var5 = el5Var3;
                                    t72Var6 = t72Var4;
                                    f(t72Var6, el5Var5, new f9a(m88Var4, r02Var2));
                                    return g2b.a;
                                }
                            } else {
                                if (pe6Var2 instanceof pe6.b) {
                                    a58 a58Var113 = a58Var7;
                                    a58Var9 = ((pe6.b) pe6Var2).a;
                                    a58Var8 = a58Var113;
                                    oh4 oh4Var217 = oh4Var17;
                                    m88Var5 = m88Var4;
                                    el5Var4 = el5Var3;
                                    oh4Var19 = oh4Var217;
                                    t72Var5 = t72Var4;
                                } else {
                                    if (pe6Var2 instanceof pe6.a) {
                                        u.b();
                                        return null;
                                    }
                                    oh4 oh4Var218 = oh4Var17;
                                    m88Var5 = m88Var4;
                                    el5Var4 = el5Var3;
                                    oh4Var19 = oh4Var218;
                                    a58Var8 = a58Var7;
                                    t72Var5 = t72Var4;
                                    a58Var9 = null;
                                }
                                if (a58Var9 != null) {
                                    a58Var9.a();
                                    f(t72Var5, el5Var4, new c9a(m88Var5, null));
                                    oh4Var18.invoke(new vf7(a58Var9.c));
                                } else {
                                    f(t72Var5, el5Var4, new d9a(m88Var5, null));
                                    if (oh4Var19 != null) {
                                        oh4Var19.invoke(new vf7(a58Var8.c));
                                    }
                                }
                            }
                        }
                    }
                    return v72Var;
                }
                if (oh4Var14 != null) {
                    oh4Var14.invoke(new vf7(a58Var4.c));
                }
                return g2b.a;
            case 6:
                a58Var8 = (a58) v8aVar.y;
                el5Var4 = (el5) v8aVar.x;
                oh4Var19 = v8aVar.w;
                oh4Var20 = (oh4) v8aVar.v;
                m88Var5 = (m88) v8aVar.u;
                t72Var5 = (t72) v8aVar.t;
                dv8.b(objI);
                oh4Var18 = oh4Var20;
                a58Var9 = (a58) objI;
                if (a58Var9 != null) {
                    a58Var9.a();
                    f(t72Var5, el5Var4, new c9a(m88Var5, null));
                    oh4Var18.invoke(new vf7(a58Var9.c));
                } else {
                    f(t72Var5, el5Var4, new d9a(m88Var5, null));
                    if (oh4Var19 != null) {
                        oh4Var19.invoke(new vf7(a58Var8.c));
                    }
                }
                return g2b.a;
            case 7:
                a58Var6 = (a58) v8aVar.B;
                a58 a58Var20 = (a58) v8aVar.A;
                el5Var3 = (el5) v8aVar.z;
                oh4 oh4Var33 = (oh4) v8aVar.y;
                oh4 oh4Var34 = (oh4) v8aVar.x;
                oh4Var18 = v8aVar.w;
                m88 m88Var8 = (m88) v8aVar.v;
                t72Var4 = (t72) v8aVar.u;
                yg0Var5 = (yg0) v8aVar.t;
                dv8.b(objI);
                oh4Var16 = oh4Var34;
                oh4Var17 = oh4Var33;
                a58Var7 = a58Var20;
                m88Var4 = m88Var8;
                pe6Var2 = (pe6) objI;
                if (xj5.a(pe6Var2, pe6.c.a)) {
                    oh4Var16.invoke(new vf7(a58Var6.c));
                    v8aVar.t = t72Var4;
                    v8aVar.u = m88Var4;
                    v8aVar.v = el5Var3;
                    r02Var2 = null;
                    v8aVar.w = null;
                    v8aVar.x = null;
                    v8aVar.y = null;
                    v8aVar.z = null;
                    v8aVar.A = null;
                    v8aVar.B = null;
                    v8aVar.D = 8;
                    if (c(yg0Var5, v8aVar) != v72Var) {
                        el5Var5 = el5Var3;
                        t72Var6 = t72Var4;
                        f(t72Var6, el5Var5, new f9a(m88Var4, r02Var2));
                        return g2b.a;
                    }
                    return v72Var;
                }
                if (pe6Var2 instanceof pe6.b) {
                    a58 a58Var114 = a58Var7;
                    a58Var9 = ((pe6.b) pe6Var2).a;
                    a58Var8 = a58Var114;
                    oh4 oh4Var219 = oh4Var17;
                    m88Var5 = m88Var4;
                    el5Var4 = el5Var3;
                    oh4Var19 = oh4Var219;
                    t72Var5 = t72Var4;
                } else {
                    if (pe6Var2 instanceof pe6.a) {
                        u.b();
                        return null;
                    }
                    oh4 oh4Var2110 = oh4Var17;
                    m88Var5 = m88Var4;
                    el5Var4 = el5Var3;
                    oh4Var19 = oh4Var2110;
                    a58Var8 = a58Var7;
                    t72Var5 = t72Var4;
                    a58Var9 = null;
                }
                if (a58Var9 != null) {
                    a58Var9.a();
                    f(t72Var5, el5Var4, new c9a(m88Var5, null));
                    oh4Var18.invoke(new vf7(a58Var9.c));
                } else {
                    f(t72Var5, el5Var4, new d9a(m88Var5, null));
                    if (oh4Var19 != null) {
                        oh4Var19.invoke(new vf7(a58Var8.c));
                    }
                }
                return g2b.a;
            case 8:
                el5Var5 = (el5) v8aVar.v;
                m88Var4 = (m88) v8aVar.u;
                t72Var6 = (t72) v8aVar.t;
                dv8.b(objI);
                r02Var2 = null;
                f(t72Var6, el5Var5, new f9a(m88Var4, r02Var2));
                return g2b.a;
            default:
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, pe6$a] */
    public static final Object h(yg0 yg0Var, s48 s48Var, u02 u02Var) throws Throwable {
        g9a g9aVar;
        gl8 gl8Var;
        if (u02Var instanceof g9a) {
            g9aVar = (g9a) u02Var;
            int i = g9aVar.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                g9aVar.v = i - Integer.MIN_VALUE;
            } else {
                g9aVar = new g9a(u02Var);
            }
        } else {
            g9aVar = new g9a(u02Var);
        }
        Object obj = g9aVar.u;
        int i2 = g9aVar.v;
        try {
            if (i2 == 0) {
                dv8.b(obj);
                gl8 gl8Var2 = new gl8();
                gl8Var2.t = pe6.a.a;
                long jB = yg0Var.getViewConfiguration().b();
                ci4 h9aVar = new h9a(s48Var, gl8Var2, null);
                g9aVar.t = gl8Var2;
                g9aVar.v = 1;
                Object objW1 = yg0Var.w1(jB, h9aVar, g9aVar);
                Object obj2 = v72.t;
                if (objW1 == obj2) {
                    return obj2;
                }
                gl8Var = gl8Var2;
            } else {
                if (i2 != 1) {
                    aa0.c("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gl8Var = g9aVar.t;
                dv8.b(obj);
            }
            return gl8Var.t;
        } catch (t48 unused) {
            return pe6.c.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:30:0x008f  */
    /* JADX WARN: Code duplicated, block: B:44:0x00cd A[LOOP:1: B:23:0x006e->B:44:0x00cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ad -> B:13:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object i(defpackage.yg0 r17, defpackage.s48 r18, defpackage.ak0 r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o8a.i(yg0, s48, ak0):java.lang.Object");
    }
}
