package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class x53 {
    public static final float a = 0.125f / 18.0f;

    /* JADX WARN: Code duplicated, block: B:24:0x0069  */
    /* JADX WARN: Code duplicated, block: B:27:0x007b A[LOOP:0: B:23:0x0067->B:27:0x007b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x007f A[EDGE_INSN: B:54:0x007f->B:29:0x007f BREAK  A[LOOP:0: B:23:0x0067->B:27:0x007b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005a -> B:22:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(defpackage.yg0 r12, long r13, defpackage.u02 r15) {
        /*
            boolean r0 = r15 instanceof defpackage.q53
            if (r0 == 0) goto L13
            r0 = r15
            q53 r0 = (defpackage.q53) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            q53 r0 = new q53
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.v
            int r1 = r0.w
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2d
            fl8 r12 = r0.u
            yg0 r13 = r0.t
            defpackage.dv8.b(r15)
            r11 = r13
            r13 = r12
            r12 = r11
            goto L5d
        L2d:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r12)
            return r3
        L33:
            defpackage.dv8.b(r15)
            r48 r15 = r12.I()
            boolean r15 = f(r15, r13)
            if (r15 == 0) goto L42
            goto Lc2
        L42:
            fl8 r15 = new fl8
            r15.<init>()
            r15.t = r13
        L49:
            r0.t = r12
            r0.u = r15
            r0.w = r2
            s48 r13 = defpackage.s48.u
            java.lang.Object r13 = r12.h1(r13, r0)
            v72 r14 = defpackage.v72.t
            if (r13 != r14) goto L5a
            return r14
        L5a:
            r11 = r15
            r15 = r13
            r13 = r11
        L5d:
            r48 r15 = (defpackage.r48) r15
            java.util.List<a58> r14 = r15.a
            int r1 = r14.size()
            r4 = 0
            r5 = r4
        L67:
            if (r5 >= r1) goto L7e
            java.lang.Object r6 = r14.get(r5)
            r7 = r6
            a58 r7 = (defpackage.a58) r7
            long r7 = r7.a
            long r9 = r13.t
            boolean r7 = defpackage.zj7.a(r7, r9)
            if (r7 == 0) goto L7b
            goto L7f
        L7b:
            int r5 = r5 + 1
            goto L67
        L7e:
            r6 = r3
        L7f:
            a58 r6 = (defpackage.a58) r6
            if (r6 != 0) goto L85
            r6 = r3
            goto Lb9
        L85:
            boolean r14 = defpackage.z69.g(r6)
            if (r14 == 0) goto Lad
            java.util.List<a58> r14 = r15.a
            int r15 = r14.size()
        L91:
            if (r4 >= r15) goto La2
            java.lang.Object r1 = r14.get(r4)
            r5 = r1
            a58 r5 = (defpackage.a58) r5
            boolean r5 = r5.d
            if (r5 == 0) goto L9f
            goto La3
        L9f:
            int r4 = r4 + 1
            goto L91
        La2:
            r1 = r3
        La3:
            a58 r1 = (defpackage.a58) r1
            if (r1 != 0) goto La8
            goto Lb9
        La8:
            long r14 = r1.a
            r13.t = r14
            goto Lc3
        Lad:
            long r14 = defpackage.z69.j(r6, r2)
            r4 = 0
            boolean r14 = defpackage.vf7.b(r14, r4)
            if (r14 != 0) goto Lc3
        Lb9:
            if (r6 == 0) goto Lc2
            boolean r12 = r6.b()
            if (r12 != 0) goto Lc2
            return r6
        Lc2:
            return r3
        Lc3:
            r15 = r13
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x53.a(yg0, long, u02):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [T, a58] */
    /* JADX WARN: Type inference failed for: r9v3, types: [gl8] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    public static final Object b(yg0 yg0Var, long j, u02 u02Var) throws Throwable {
        r53 r53Var;
        a58 a58Var;
        cl8 cl8Var;
        Object obj;
        if (u02Var instanceof r53) {
            r53Var = (r53) u02Var;
            int i = r53Var.x;
            if ((i & Integer.MIN_VALUE) != 0) {
                r53Var.x = i - Integer.MIN_VALUE;
            } else {
                r53Var = new r53(u02Var);
            }
        } else {
            r53Var = new r53(u02Var);
        }
        Object obj2 = r53Var.w;
        int i2 = r53Var.x;
        try {
            if (i2 == 0) {
                dv8.b(obj2);
                if (!f(yg0Var.I(), j)) {
                    List<a58> list = yg0Var.I().a;
                    int size = list.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            a58Var = null;
                            break;
                        }
                        a58Var = list.get(i3);
                        if (zj7.a(a58Var.a, j)) {
                            break;
                        }
                        i3++;
                    }
                    a58 a58Var2 = a58Var;
                    if (a58Var2 != 0) {
                        gl8 gl8Var = new gl8();
                        gl8 gl8Var2 = new gl8();
                        gl8Var2.t = a58Var2;
                        long jB = yg0Var.getViewConfiguration().b();
                        cl8 cl8Var2 = new cl8();
                        ci4 s53Var = new s53(cl8Var2, gl8Var2, gl8Var, null);
                        r53Var.t = a58Var2;
                        r53Var.u = gl8Var;
                        r53Var.v = cl8Var2;
                        r53Var.x = 1;
                        Object objW1 = yg0Var.w1(jB, s53Var, r53Var);
                        Object obj3 = v72.t;
                        if (objW1 == obj3) {
                            return obj3;
                        }
                        cl8Var = cl8Var2;
                        j = gl8Var;
                        obj = a58Var2;
                    }
                }
                return null;
            }
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cl8Var = r53Var.v;
            gl8 gl8Var3 = r53Var.u;
            a58 a58Var3 = r53Var.t;
            dv8.b(obj2);
            j = gl8Var3;
            obj = a58Var3;
            if (cl8Var.t) {
                a58 a58Var4 = (a58) j.t;
                return a58Var4 == null ? obj : a58Var4;
            }
            return null;
        } catch (t48 unused) {
            a58 a58Var5 = (a58) j.t;
            return a58Var5 == null ? obj : a58Var5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:29:0x00d5 A[LOOP:0: B:25:0x00c0->B:29:0x00d5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:67:0x00de A[EDGE_INSN: B:67:0x00de->B:31:0x00de BREAK  A[LOOP:0: B:25:0x00c0->B:29:0x00d5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x016b -> B:61:0x016d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object c(defpackage.yg0 r18, long r19, defpackage.ta9 r21, defpackage.ak0 r22) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x53.c(yg0, long, ta9, ak0):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [o53] */
    public static final Object d(i58 i58Var, final oh4<? super vf7, g2b> oh4Var, mh4<g2b> mh4Var, mh4<g2b> mh4Var2, ci4<? super a58, ? super vf7, g2b> ci4Var, r02<? super g2b> r02Var) {
        Object objB = cc4.b(i58Var, new u53(new p53(0), new ei4() { // from class: o53
            @Override // defpackage.ei4
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                oh4Var.invoke(new vf7(((a58) obj2).c));
                return g2b.a;
            }
        }, ci4Var, mh4Var2, new qr(2, mh4Var), null), r02Var);
        v72 v72Var = v72.t;
        if (objB != v72Var) {
            objB = g2b.a;
        }
        return objB == v72Var ? objB : g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object e(defpackage.yg0 r4, long r5, defpackage.oh4 r7, defpackage.u02 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.v53
            if (r0 == 0) goto L13
            r0 = r8
            v53 r0 = (defpackage.v53) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            v53 r0 = new v53
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.v
            int r1 = r0.w
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            oh4 r4 = r0.u
            yg0 r5 = r0.t
            defpackage.dv8.b(r8)
            r7 = r4
            r4 = r5
            goto L44
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r4)
            r4 = 0
            return r4
        L32:
            defpackage.dv8.b(r8)
        L35:
            r0.t = r4
            r0.u = r7
            r0.w = r2
            java.lang.Object r8 = a(r4, r5, r0)
            v72 r5 = defpackage.v72.t
            if (r8 != r5) goto L44
            return r5
        L44:
            a58 r8 = (defpackage.a58) r8
            if (r8 != 0) goto L4b
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L4b:
            boolean r5 = defpackage.z69.g(r8)
            if (r5 == 0) goto L54
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        L54:
            r7.invoke(r8)
            long r5 = r8.a
            goto L35
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x53.e(yg0, long, oh4, u02):java.lang.Object");
    }

    public static final boolean f(r48 r48Var, long j) {
        a58 a58Var;
        List<a58> list = r48Var.a;
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                a58Var = null;
                break;
            }
            a58Var = list.get(i);
            if (zj7.a(a58Var.a, j)) {
                break;
            }
            i++;
        }
        a58 a58Var2 = a58Var;
        if (a58Var2 != null && a58Var2.d) {
            z = true;
        }
        return true ^ z;
    }

    public static final float g(lgb lgbVar, int i) {
        return i == 2 ? lgbVar.f() * a : lgbVar.f();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:104:0x0453 -> B:92:0x0401). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x0491 -> B:165:0x0600). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:161:0x05ea -> B:162:0x05f1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:168:0x061a -> B:86:0x03da). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:178:0x0688 -> B:179:0x0691). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x024c -> B:32:0x0250). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x02ef -> B:32:0x0250). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0347 -> B:78:0x03b4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x03a1 -> B:75:0x03a8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 18961. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static final java.lang.Object h(defpackage.yg0 r28, defpackage.a58 r29, defpackage.p53 r30, defpackage.o53 r31, defpackage.ci4 r32, defpackage.mh4 r33, defpackage.qr r34, defpackage.ak0 r35) {
        /*
            Method dump skipped, instruction units count: 1896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x53.h(yg0, a58, p53, o53, ci4, mh4, qr, ak0):java.lang.Object");
    }
}
