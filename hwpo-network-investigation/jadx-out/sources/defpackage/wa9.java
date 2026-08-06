package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class wa9 {
    /* JADX WARN: Code duplicated, block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x004b  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058 A[LOOP:0: B:19:0x0049->B:23:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0031 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object a(defpackage.yg0 r6, defpackage.ak0 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.oa9
            if (r0 == 0) goto L13
            r0 = r7
            oa9 r0 = (defpackage.oa9) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            oa9 r0 = new oa9
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.u
            int r1 = r0.v
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            yg0 r6 = r0.t
            defpackage.dv8.b(r7)
            goto L40
        L27:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r6)
            r6 = 0
            return r6
        L2e:
            defpackage.dv8.b(r7)
        L31:
            r0.t = r6
            r0.v = r2
            s48 r7 = defpackage.s48.u
            java.lang.Object r7 = r6.h1(r7, r0)
            v72 r1 = defpackage.v72.t
            if (r7 != r1) goto L40
            return r1
        L40:
            r48 r7 = (defpackage.r48) r7
            java.util.List<a58> r1 = r7.a
            int r3 = r1.size()
            r4 = 0
        L49:
            if (r4 >= r3) goto L5b
            java.lang.Object r5 = r1.get(r4)
            a58 r5 = (defpackage.a58) r5
            boolean r5 = defpackage.z69.d(r5)
            if (r5 != 0) goto L58
            goto L31
        L58:
            int r4 = r4 + 1
            goto L49
        L5b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wa9.a(yg0, ak0):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c4, code lost:
    
        if (r14 == r5) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.yg0 r10, defpackage.lda r11, defpackage.r48 r12, int r13, defpackage.ak0 r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wa9.b(yg0, lda, r48, int, ak0):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007d A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:20:0x003e, B:31:0x0075, B:33:0x007d, B:35:0x0089, B:37:0x0095, B:28:0x005e), top: B:69:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0089 A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:20:0x003e, B:31:0x0075, B:33:0x007d, B:35:0x0089, B:37:0x0095, B:28:0x005e), top: B:69:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0095 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #1 {all -> 0x0042, blocks: (B:20:0x003e, B:31:0x0075, B:33:0x007d, B:35:0x0089, B:37:0x0095, B:28:0x005e), top: B:69:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00f8 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002b, B:54:0x00e0, B:56:0x00e8, B:58:0x00ec, B:60:0x00f8, B:62:0x0104, B:50:0x00bb), top: B:69:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0104 A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002b, B:54:0x00e0, B:56:0x00e8, B:58:0x00ec, B:60:0x00f8, B:62:0x0104, B:50:0x00bb), top: B:69:0x001f }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:77:0x0098 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(yg0 yg0Var, final bz6 bz6Var, cf1 cf1Var, r48 r48Var, ak0 ak0Var) throws Throwable {
        qa9 qa9Var;
        final ca9 ca9Var;
        yg0 yg0Var2;
        cl8 cl8Var;
        List<a58> list;
        int size;
        a58 a58Var;
        List<a58> list2;
        int size2;
        a58 a58Var2;
        if (ak0Var instanceof qa9) {
            qa9Var = (qa9) ak0Var;
            int i = qa9Var.x;
            if ((i & Integer.MIN_VALUE) != 0) {
                qa9Var.x = i - Integer.MIN_VALUE;
            } else {
                qa9Var = new qa9(ak0Var);
            }
        } else {
            qa9Var = new qa9(ak0Var);
        }
        Object objE = qa9Var.w;
        int i2 = qa9Var.x;
        int i3 = 0;
        try {
            try {
                if (i2 == 0) {
                    dv8.b(objE);
                    a58 a58Var3 = r48Var.a.get(0);
                    int i4 = r48Var.e & 1;
                    v72 v72Var = v72.t;
                    if (i4 == 0) {
                        int i5 = cf1Var.b;
                        s43 s43Var = ca9.a.a;
                        if (i5 != 1) {
                            ca9Var = i5 != 2 ? ca9.a.c : ca9.a.b;
                        } else {
                            ca9Var = s43Var;
                        }
                        if (bz6Var.e(a58Var3.c, ca9Var, i5)) {
                            final cl8 cl8Var2 = new cl8();
                            cl8Var2.t = !ca9Var.equals(s43Var);
                            long j = a58Var3.a;
                            oh4 oh4Var = new oh4() { // from class: na9
                                @Override // defpackage.oh4
                                public final Object invoke(Object obj) {
                                    a58 a58Var4 = (a58) obj;
                                    if (bz6Var.a(a58Var4.c, ca9Var)) {
                                        a58Var4.a();
                                        cl8Var2.t = true;
                                    }
                                    return g2b.a;
                                }
                            };
                            qa9Var.t = yg0Var;
                            qa9Var.u = bz6Var;
                            qa9Var.v = cl8Var2;
                            qa9Var.x = 2;
                            objE = x53.e(yg0Var, j, oh4Var, qa9Var);
                            if (objE != v72Var) {
                                yg0Var2 = yg0Var;
                                cl8Var = cl8Var2;
                                if (((Boolean) objE).booleanValue()) {
                                    list2 = yg0Var2.I().a;
                                    size2 = list2.size();
                                    while (i3 < size2) {
                                        a58Var2 = list2.get(i3);
                                        if (z69.f(a58Var2)) {
                                            a58Var2.a();
                                        }
                                        i3++;
                                    }
                                }
                                bz6Var.c();
                            }
                            return v72Var;
                        }
                    } else if (bz6Var.d(a58Var3.c)) {
                        a58Var3.a();
                        long j2 = a58Var3.a;
                        ma9 ma9Var = new ma9(i3, bz6Var);
                        qa9Var.t = yg0Var;
                        qa9Var.u = bz6Var;
                        qa9Var.x = 1;
                        objE = x53.e(yg0Var, j2, ma9Var, qa9Var);
                        if (objE == v72Var) {
                            return v72Var;
                        }
                        if (((Boolean) objE).booleanValue()) {
                            list = yg0Var.I().a;
                            size = list.size();
                            while (i3 < size) {
                                a58Var = list.get(i3);
                                if (z69.f(a58Var)) {
                                    a58Var.a();
                                }
                                i3++;
                            }
                        }
                        bz6Var.c();
                    }
                } else if (i2 == 1) {
                    bz6Var = qa9Var.u;
                    yg0Var = qa9Var.t;
                    dv8.b(objE);
                    if (((Boolean) objE).booleanValue()) {
                        list = yg0Var.I().a;
                        size = list.size();
                        while (i3 < size) {
                            a58Var = list.get(i3);
                            if (z69.f(a58Var)) {
                                a58Var.a();
                            }
                            i3++;
                        }
                    }
                    bz6Var.c();
                } else {
                    if (i2 != 2) {
                        aa0.c("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cl8Var = qa9Var.v;
                    bz6Var = qa9Var.u;
                    yg0Var2 = qa9Var.t;
                    dv8.b(objE);
                    if (((Boolean) objE).booleanValue() && cl8Var.t) {
                        list2 = yg0Var2.I().a;
                        size2 = list2.size();
                        while (i3 < size2) {
                            a58Var2 = list2.get(i3);
                            if (z69.f(a58Var2)) {
                                a58Var2.a();
                            }
                            i3++;
                        }
                    }
                    bz6Var.c();
                }
                return g2b.a;
            } catch (Throwable th) {
                bz6Var.c();
                throw th;
            }
        } catch (Throwable th2) {
            bz6Var.c();
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009e, code lost:
    
        if (r15 == r6) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.yg0 r12, defpackage.lda r13, defpackage.r48 r14, defpackage.ak0 r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wa9.d(yg0, lda, r48, ak0):java.lang.Object");
    }
}
