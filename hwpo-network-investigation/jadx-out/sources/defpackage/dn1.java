package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import com.hwpo_training_app.core.data.model.attachments.SectionAttachmentNetworkEntity;
import j$.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class dn1 implements pm1 {
    public final wk1 a;
    public final a70 b;
    public final gn1 c;
    public final w5b d;
    public final ContentResolver e;
    public final qw3 f;
    public final p43 g;
    public final r54<List<gk1>> h;

    public dn1(wk1 wk1Var, a70 a70Var, gn1 gn1Var, w5b w5bVar, ContentResolver contentResolver, qw3 qw3Var, p43 p43Var) {
        wk1Var.getClass();
        a70Var.getClass();
        gn1Var.getClass();
        w5bVar.getClass();
        qw3Var.getClass();
        p43Var.getClass();
        this.a = wk1Var;
        this.b = a70Var;
        this.c = gn1Var;
        this.d = w5bVar;
        this.e = contentResolver;
        this.f = qw3Var;
        this.g = p43Var;
        this.h = gn1Var.a();
    }

    @Override // defpackage.pm1
    public final r54<List<gk1>> a() {
        return this.h;
    }

    @Override // defpackage.pm1
    public final Object b(yd1 yd1Var) {
        g2b g2bVarClear = this.c.clear();
        return g2bVarClear == v72.t ? g2bVarClear : g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:62:0x0104 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:? A[LOOP:0: B:45:0x00f1->B:64:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // defpackage.pm1
    public final Object c(pk1 pk1Var, long j, long j2, u02 u02Var) throws Throwable {
        cn1 cn1Var;
        pk1 pk1Var2;
        Object objB;
        long j3;
        long j4;
        gk1 gk1VarA;
        Object obj;
        pk1 pk1Var3;
        long j5;
        List<m89> list;
        Iterator<T> it;
        if (u02Var instanceof cn1) {
            cn1Var = (cn1) u02Var;
            int i = cn1Var.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                cn1Var.z = i - Integer.MIN_VALUE;
            } else {
                cn1Var = new cn1(this, u02Var);
            }
        } else {
            cn1Var = new cn1(this, u02Var);
        }
        Object obj2 = cn1Var.x;
        int i2 = cn1Var.z;
        gn1 gn1Var = this.c;
        Object obj3 = v72.t;
        if (i2 == 0) {
            dv8.b(obj2);
            pk1Var2 = pk1Var;
            cn1Var.t = pk1Var2;
            cn1Var.v = j;
            cn1Var.w = j2;
            cn1Var.z = 1;
            objB = gn1Var.b(j);
            if (objB == obj3) {
                return obj3;
            }
            j3 = j;
            j4 = j2;
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    j4 = cn1Var.w;
                    j5 = cn1Var.v;
                    gk1VarA = cn1Var.u;
                    pk1Var3 = cn1Var.t;
                    dv8.b(obj2);
                    obj = obj3;
                    list = gk1VarA.i;
                    if (!list.isEmpty()) {
                        it = list.iterator();
                        while (it.hasNext()) {
                            if (((m89) it.next()).m == xc9.u) {
                                return g2b.a;
                            }
                        }
                    }
                    cn1Var.t = null;
                    cn1Var.u = null;
                    cn1Var.v = j5;
                    cn1Var.w = j4;
                    cn1Var.z = 3;
                    if (p(pk1Var3, gk1VarA, cn1Var) == obj) {
                        return obj;
                    }
                } else {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            dv8.b(obj2);
                            return g2b.a;
                        }
                        aa0.c("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dv8.b(obj2);
                }
                return g2b.a;
            }
            j4 = cn1Var.w;
            j3 = cn1Var.v;
            pk1 pk1Var4 = cn1Var.t;
            dv8.b(obj2);
            objB = obj2;
            pk1Var2 = pk1Var4;
        }
        gk1 gk1Var = (gk1) objB;
        if (gk1Var == null) {
            return g2b.a;
        }
        List<m89> list2 = gk1Var.i;
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : list2) {
            Object obj5 = obj3;
            if (((m89) obj4).a != j4) {
                arrayList.add(obj4);
            }
            obj3 = obj5;
        }
        Object obj6 = obj3;
        gk1VarA = gk1.a(gk1Var, null, false, false, arrayList, 767);
        if (gk1VarA.i.isEmpty()) {
            cn1Var.t = null;
            cn1Var.u = null;
            cn1Var.v = j3;
            cn1Var.w = j4;
            cn1Var.z = 4;
            if (gn1Var.e(j3) == obj6) {
                return obj6;
            }
            return g2b.a;
        }
        cn1Var.t = pk1Var2;
        cn1Var.u = gk1VarA;
        cn1Var.v = j3;
        cn1Var.w = j4;
        cn1Var.z = 2;
        obj = obj6;
        if (gn1Var.d(gk1VarA) == obj) {
            return obj;
        }
        pk1Var3 = pk1Var2;
        j5 = j3;
        list = gk1VarA.i;
        if (!list.isEmpty()) {
            it = list.iterator();
            while (it.hasNext()) {
                if (((m89) it.next()).m == xc9.u) {
                    return g2b.a;
                }
            }
        }
        cn1Var.t = null;
        cn1Var.u = null;
        cn1Var.v = j5;
        cn1Var.w = j4;
        cn1Var.z = 3;
        if (p(pk1Var3, gk1VarA, cn1Var) == obj) {
            return obj;
        }
        return g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01cf A[Catch: Exception -> 0x01e6, TryCatch #12 {Exception -> 0x01e6, blocks: (B:98:0x01c5, B:109:0x01ec, B:101:0x01cf, B:102:0x01d3, B:104:0x01d9, B:106:0x01e3), top: B:157:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x01d9 A[Catch: Exception -> 0x01e6, TryCatch #12 {Exception -> 0x01e6, blocks: (B:98:0x01c5, B:109:0x01ec, B:101:0x01cf, B:102:0x01d3, B:104:0x01d9, B:106:0x01e3), top: B:157:0x01c5 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x0211 A[LOOP:1: B:78:0x016e->B:116:0x0211, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:136:0x0108 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:145:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x013f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:157:0x01c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x01e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:? A[LOOP:0: B:102:0x01d3->B:166:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x021d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:58:0x0105  */
    /* JADX WARN: Code duplicated, block: B:65:0x012c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0154  */
    /* JADX WARN: Code duplicated, block: B:80:0x0174 A[Catch: Exception -> 0x0217, TRY_LEAVE, TryCatch #7 {Exception -> 0x0217, blocks: (B:77:0x0164, B:78:0x016e, B:80:0x0174), top: B:147:0x0164 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:92:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:95:0x01bd A[Catch: Exception -> 0x01c0, TRY_LEAVE, TryCatch #9 {Exception -> 0x01c0, blocks: (B:93:0x01b9, B:95:0x01bd), top: B:151:0x01b9 }] */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01ff, code lost:
    
        if (p(r14, r3, r6) == r12) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x0091: MOVE (r9 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]) (LINE:146), block:B:29:0x0089 */
    /* JADX WARN: Type inference failed for: r4v3, types: [int] */
    @Override // defpackage.pm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.pk1 r22, long r23, long r25, defpackage.u02 r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn1.d(pk1, long, long, u02):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r5.c.c() == r4) goto L21;
     */
    @Override // defpackage.pm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.pk1 r6, defpackage.u02 r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ym1
            if (r0 == 0) goto L13
            r0 = r7
            ym1 r0 = (defpackage.ym1) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            ym1 r0 = new ym1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.t
            int r1 = r0.v
            r2 = 2
            r3 = 1
            v72 r4 = defpackage.v72.t
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            defpackage.dv8.b(r7)
            goto L5a
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r5)
            r5 = 0
            return r5
        L31:
            defpackage.dv8.b(r7)
            goto L4f
        L35:
            defpackage.dv8.b(r7)
            rk1 r7 = defpackage.qk1.e(r6)
            java.lang.String r7 = r7.t
            int r6 = r6.a()
            r0.v = r3
            wk1 r1 = r5.a
            java.lang.String r3 = "read_comments"
            java.lang.Object r6 = r1.d(r7, r3, r6, r0)
            if (r6 != r4) goto L4f
            goto L59
        L4f:
            r0.v = r2
            gn1 r5 = r5.c
            g2b r5 = r5.c()
            if (r5 != r4) goto L5a
        L59:
            return r4
        L5a:
            g2b r5 = defpackage.g2b.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn1.e(pk1, u02):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x009c  */
    /* JADX WARN: Code duplicated, block: B:30:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d8, code lost:
    
        if (r17.c.f(r5) == r8) goto L41;
     */
    @Override // defpackage.pm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.pk1 r18, defpackage.u02 r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn1.f(pk1, u02):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007c, code lost:
    
        if (r12.c.g(r13) == r5) goto L21;
     */
    @Override // defpackage.pm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.pk1 r13, java.util.ArrayList r14, defpackage.u02 r15) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r15 instanceof defpackage.sm1
            if (r0 == 0) goto L13
            r0 = r15
            sm1 r0 = (defpackage.sm1) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            sm1 r0 = new sm1
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.t
            int r1 = r0.v
            r2 = 2
            r3 = 1
            r4 = 0
            v72 r5 = defpackage.v72.t
            if (r1 == 0) goto L35
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.dv8.b(r15)
            goto L7f
        L2b:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r12)
            return r4
        L31:
            defpackage.dv8.b(r15)
            goto L57
        L35:
            defpackage.dv8.b(r15)
            rk1 r15 = defpackage.qk1.e(r13)
            com.hwpo_training_app.comments.data.network.request.AddCommentRequest r1 = new com.hwpo_training_app.comments.data.network.request.AddCommentRequest
            com.hwpo_training_app.comments.data.network.request.AddCommentNetworkEntity r6 = new com.hwpo_training_app.comments.data.network.request.AddCommentNetworkEntity
            r6.<init>(r4, r14)
            r1.<init>(r6)
            java.lang.String r14 = r15.t
            int r13 = r13.a()
            r0.v = r3
            wk1 r15 = r12.a
            java.lang.Object r15 = r15.c(r14, r13, r1, r0)
            if (r15 != r5) goto L57
            goto L7e
        L57:
            com.hwpo_training_app.core.data.model.comment.CommentNetworkEntity r15 = (com.hwpo_training_app.core.data.model.comment.CommentNetworkEntity) r15
            gk1 r6 = r15.a()
            long r13 = r6.a
            java.util.List<m89> r15 = r6.i
            p43 r1 = r12.g
            java.util.ArrayList r10 = defpackage.ii6.a(r15, r1)
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r13)
            r9 = 1
            r11 = 741(0x2e5, float:1.038E-42)
            r8 = 1
            gk1 r13 = defpackage.gk1.a(r6, r7, r8, r9, r10, r11)
            r0.v = r2
            gn1 r12 = r12.c
            g2b r12 = r12.g(r13)
            if (r12 != r5) goto L7f
        L7e:
            return r5
        L7f:
            g2b r12 = defpackage.g2b.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn1.g(pk1, java.util.ArrayList, u02):java.lang.Object");
    }

    @Override // defpackage.pm1
    public final Object h(long j, ix2 ix2Var) {
        g2b g2bVarE = this.c.e(j);
        return g2bVarE == v72.t ? g2bVarE : g2b.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (l(r17, r18, r3) == r9) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0099, code lost:
    
        if (r16.c.g(r1) == r9) goto L33;
     */
    @Override // defpackage.pm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.pk1 r17, defpackage.db r18, defpackage.u02 r19) throws java.lang.Throwable {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            r2 = r19
            boolean r3 = r2 instanceof defpackage.qm1
            if (r3 == 0) goto L19
            r3 = r2
            qm1 r3 = (defpackage.qm1) r3
            int r4 = r3.v
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.v = r4
            goto L1e
        L19:
            qm1 r3 = new qm1
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.t
            int r4 = r3.v
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            v72 r9 = defpackage.v72.t
            if (r4 == 0) goto L42
            if (r4 == r7) goto L3e
            if (r4 == r6) goto L3a
            if (r4 != r5) goto L34
            defpackage.dv8.b(r2)
            goto L9c
        L34:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r0)
            return r8
        L3a:
            defpackage.dv8.b(r2)
            goto L81
        L3e:
            defpackage.dv8.b(r2)
            goto L61
        L42:
            defpackage.dv8.b(r2)
            rk1 r2 = defpackage.qk1.e(r17)
            java.util.List<rc9> r4 = r1.b
            if (r4 == 0) goto L53
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L56
        L53:
            r4 = r17
            goto L64
        L56:
            r3.v = r7
            r4 = r17
            java.lang.Object r0 = r0.l(r4, r1, r3)
            if (r0 != r9) goto L61
            goto L9b
        L61:
            g2b r0 = defpackage.g2b.a
            return r0
        L64:
            com.hwpo_training_app.comments.data.network.request.AddCommentRequest r7 = new com.hwpo_training_app.comments.data.network.request.AddCommentRequest
            com.hwpo_training_app.comments.data.network.request.AddCommentNetworkEntity r10 = new com.hwpo_training_app.comments.data.network.request.AddCommentNetworkEntity
            java.lang.String r1 = r1.a
            r10.<init>(r1, r8)
            r7.<init>(r10)
            java.lang.String r1 = r2.t
            int r2 = r4.a()
            r3.v = r6
            wk1 r4 = r0.a
            java.lang.Object r2 = r4.c(r1, r2, r7, r3)
            if (r2 != r9) goto L81
            goto L9b
        L81:
            com.hwpo_training_app.core.data.model.comment.CommentNetworkEntity r2 = (com.hwpo_training_app.core.data.model.comment.CommentNetworkEntity) r2
            gk1 r10 = r2.a()
            r14 = 0
            r15 = 999(0x3e7, float:1.4E-42)
            r11 = 0
            r12 = 1
            r13 = 1
            gk1 r1 = defpackage.gk1.a(r10, r11, r12, r13, r14, r15)
            r3.v = r5
            gn1 r0 = r0.c
            g2b r0 = r0.g(r1)
            if (r0 != r9) goto L9c
        L9b:
            return r9
        L9c:
            g2b r0 = defpackage.g2b.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn1.i(pk1, db, u02):java.lang.Object");
    }

    @Override // defpackage.pm1
    public final k74 j() {
        return new k74(this.f.b(), new xm1(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        if (r9.c.e(r11) == r8) goto L25;
     */
    @Override // defpackage.pm1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.pk1 r10, long r11, defpackage.u02 r13) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r13 instanceof defpackage.um1
            if (r0 == 0) goto L14
            r0 = r13
            um1 r0 = (defpackage.um1) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.w = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            um1 r0 = new um1
            r0.<init>(r9, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.u
            int r0 = r6.w
            r7 = 2
            r1 = 1
            v72 r8 = defpackage.v72.t
            if (r0 == 0) goto L39
            if (r0 == r1) goto L33
            if (r0 != r7) goto L2c
            defpackage.dv8.b(r13)
            goto L6a
        L2c:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r9)
            r9 = 0
            return r9
        L33:
            long r11 = r6.t
            defpackage.dv8.b(r13)
            goto L55
        L39:
            defpackage.dv8.b(r13)
            rk1 r13 = defpackage.qk1.e(r10)
            java.lang.String r2 = r13.t
            int r3 = r10.a()
            r6.t = r11
            r6.w = r1
            wk1 r1 = r9.a
            r4 = r11
            java.lang.Object r13 = r1.a(r2, r3, r4, r6)
            if (r13 != r8) goto L54
            goto L69
        L54:
            r11 = r4
        L55:
            ru8 r13 = (defpackage.ru8) r13
            qu8 r10 = r13.a
            boolean r10 = r10.J
            if (r10 == 0) goto L6d
            r6.t = r11
            r6.w = r7
            gn1 r9 = r9.c
            g2b r9 = r9.e(r11)
            if (r9 != r8) goto L6a
        L69:
            return r8
        L6a:
            g2b r9 = defpackage.g2b.a
            return r9
        L6d:
            q45 r9 = new q45
            r9.<init>(r13)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn1.k(pk1, long, u02):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x010f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0135  */
    /* JADX WARN: Code duplicated, block: B:48:0x0171  */
    /* JADX WARN: Code duplicated, block: B:51:0x017f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0189  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x01d6 -> B:64:0x01db). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object l(defpackage.pk1 r19, defpackage.db r20, defpackage.u02 r21) {
        /*
            Method dump skipped, instruction units count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn1.l(pk1, db, u02):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object m(long j, xc9 xc9Var, long j2, u02 u02Var) throws Throwable {
        tm1 tm1Var;
        xc9 xc9Var2;
        Object objB;
        long j3;
        long j4;
        if (u02Var instanceof tm1) {
            tm1Var = (tm1) u02Var;
            int i = tm1Var.z;
            if ((i & Integer.MIN_VALUE) != 0) {
                tm1Var.z = i - Integer.MIN_VALUE;
            } else {
                tm1Var = new tm1(this, u02Var);
            }
        } else {
            tm1Var = new tm1(this, u02Var);
        }
        Object obj = tm1Var.x;
        int i2 = tm1Var.z;
        gn1 gn1Var = this.c;
        v72 v72Var = v72.t;
        if (i2 == 0) {
            dv8.b(obj);
            xc9Var2 = xc9Var;
            tm1Var.v = xc9Var2;
            tm1Var.t = j;
            tm1Var.u = j2;
            tm1Var.z = 1;
            objB = gn1Var.b(j);
            if (objB != v72Var) {
                j3 = j;
                j4 = j2;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gk1 gk1Var = tm1Var.w;
            dv8.b(obj);
            return gk1Var;
        }
        j4 = tm1Var.u;
        j3 = tm1Var.t;
        xc9 xc9Var3 = tm1Var.v;
        dv8.b(obj);
        objB = obj;
        xc9Var2 = xc9Var3;
        gk1 gk1Var2 = (gk1) objB;
        if (gk1Var2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(gk1Var2.i);
        ArrayList arrayList2 = new ArrayList(ph1.n(arrayList, 10));
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj2 = arrayList.get(i3);
            i3++;
            m89 m89VarA = (m89) obj2;
            ArrayList arrayList3 = arrayList2;
            if (m89VarA.a == j4) {
                m89VarA = m89.a(m89VarA, xc9Var2, null, 28671);
            }
            arrayList3.add(m89VarA);
            arrayList2 = arrayList3;
        }
        gk1 gk1VarA = gk1.a(gk1Var2, null, false, false, arrayList2, 767);
        tm1Var.v = null;
        tm1Var.w = gk1VarA;
        tm1Var.t = j3;
        tm1Var.u = j4;
        tm1Var.z = 2;
        return gn1Var.d(gk1VarA) == v72Var ? v72Var : gk1VarA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object n(db dbVar, u02 u02Var) throws Throwable {
        wm1 wm1Var;
        long jHashCode;
        db dbVar2;
        Object objC;
        u60 u60Var;
        if (u02Var instanceof wm1) {
            wm1Var = (wm1) u02Var;
            int i = wm1Var.x;
            if ((i & Integer.MIN_VALUE) != 0) {
                wm1Var.x = i - Integer.MIN_VALUE;
            } else {
                wm1Var = new wm1(this, u02Var);
            }
        } else {
            wm1Var = new wm1(this, u02Var);
        }
        Object obj = wm1Var.v;
        int i2 = wm1Var.x;
        if (i2 == 0) {
            dv8.b(obj);
            String string = UUID.randomUUID().toString();
            string.getClass();
            jHashCode = string.hashCode();
            dbVar2 = dbVar;
            wm1Var.t = dbVar2;
            wm1Var.u = jHashCode;
            wm1Var.x = 1;
            objC = this.d.c(wm1Var);
            v72 v72Var = v72.t;
            if (objC == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jHashCode = wm1Var.u;
            db dbVar3 = wm1Var.t;
            dv8.b(obj);
            objC = obj;
            dbVar2 = dbVar3;
        }
        long j = jHashCode;
        h5b h5bVar = (h5b) objC;
        String str = dbVar2.a;
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        localDateTimeNow.getClass();
        ps6 ps6Var = new ps6(h5bVar.b, null, null, h5bVar.f, h5bVar.a);
        List<rc9> list = dbVar2.b;
        hf3 hf3Var = hf3.t;
        if (list == null) {
            list = hf3Var;
        }
        ArrayList arrayList = new ArrayList(ph1.n(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            xc9 xc9Var = xc9.t;
            if (!zHasNext) {
                return new gk1(j, new Long(j), str, true, true, localDateTimeNow, ps6Var, hf3Var, arrayList, xc9Var);
            }
            rc9 rc9Var = (rc9) it.next();
            Uri uri = rc9Var.b;
            hy3 hy3Var = rc9Var.a;
            rh8.t.getClass();
            long jNextLong = rh8.u.a().nextLong();
            String strA = wy3.a(this.e, uri);
            String string2 = uri.toString();
            string2.getClass();
            String string3 = uri.toString();
            String string4 = uri.toString();
            String lowerCase = hy3Var.name().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            int iOrdinal = hy3Var.ordinal();
            if (iOrdinal != 0) {
                u60Var = iOrdinal != 1 ? u60.w : u60.u;
            } else {
                u60Var = u60.v;
            }
            arrayList.add(new m89(jNextLong, strA, string2, string4, string3, lowerCase, null, null, null, u60Var, null, 0L, xc9Var, null, null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(m89 m89Var, u02 u02Var) throws Throwable {
        an1 an1Var;
        if (u02Var instanceof an1) {
            an1Var = (an1) u02Var;
            int i = an1Var.v;
            if ((i & Integer.MIN_VALUE) != 0) {
                an1Var.v = i - Integer.MIN_VALUE;
            } else {
                an1Var = new an1(this, u02Var);
            }
        } else {
            an1Var = new an1(this, u02Var);
        }
        Object objA = an1Var.t;
        int i2 = an1Var.v;
        if (i2 == 0) {
            dv8.b(objA);
            n17 n17VarE = wy3.e(Uri.parse(m89Var.c), this.e, m89Var.b);
            an1Var.v = 1;
            objA = this.b.a(n17VarE, an1Var);
            v72 v72Var = v72.t;
            if (objA == v72Var) {
                return v72Var;
            }
        } else {
            if (i2 != 1) {
                aa0.c("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dv8.b(objA);
        }
        return new Long(((SectionAttachmentNetworkEntity) objA).t);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b2, code lost:
    
        if (r12.c.d(r13) == r5) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p(defpackage.pk1 r13, defpackage.gk1 r14, defpackage.u02 r15) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r15 instanceof defpackage.bn1
            if (r0 == 0) goto L13
            r0 = r15
            bn1 r0 = (defpackage.bn1) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.w = r1
            goto L18
        L13:
            bn1 r0 = new bn1
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.u
            int r1 = r0.w
            r2 = 2
            r3 = 1
            r4 = 0
            v72 r5 = defpackage.v72.t
            if (r1 == 0) goto L38
            if (r1 == r3) goto L32
            if (r1 != r2) goto L2c
            defpackage.dv8.b(r15)
            goto Lb5
        L2c:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.aa0.c(r12)
            return r4
        L32:
            gk1 r14 = r0.t
            defpackage.dv8.b(r15)
            goto L92
        L38:
            defpackage.dv8.b(r15)
            rk1 r15 = defpackage.qk1.e(r13)
            java.lang.String r1 = r14.c
            java.util.List<m89> r6 = r14.i
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = defpackage.ph1.n(r6, r8)
            r7.<init>(r8)
            java.util.Iterator r6 = r6.iterator()
        L52:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L75
            java.lang.Object r8 = r6.next()
            m89 r8 = (defpackage.m89) r8
            java.lang.Long r8 = r8.o
            if (r8 == 0) goto L6f
            long r8 = r8.longValue()
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r8)
            r7.add(r10)
            goto L52
        L6f:
            java.lang.String r12 = "Required value was null."
            defpackage.z90.a(r12)
            return r4
        L75:
            com.hwpo_training_app.comments.data.network.request.AddCommentNetworkEntity r6 = new com.hwpo_training_app.comments.data.network.request.AddCommentNetworkEntity
            r6.<init>(r1, r7)
            com.hwpo_training_app.comments.data.network.request.AddCommentRequest r1 = new com.hwpo_training_app.comments.data.network.request.AddCommentRequest
            r1.<init>(r6)
            java.lang.String r15 = r15.t
            int r13 = r13.a()
            r0.t = r14
            r0.w = r3
            wk1 r3 = r12.a
            java.lang.Object r15 = r3.c(r15, r13, r1, r0)
            if (r15 != r5) goto L92
            goto Lb4
        L92:
            com.hwpo_training_app.core.data.model.comment.CommentNetworkEntity r15 = (com.hwpo_training_app.core.data.model.comment.CommentNetworkEntity) r15
            gk1 r6 = r15.a()
            long r13 = r14.a
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r13)
            r10 = 0
            r11 = 997(0x3e5, float:1.397E-42)
            r8 = 1
            r9 = 1
            gk1 r13 = defpackage.gk1.a(r6, r7, r8, r9, r10, r11)
            r0.t = r4
            r0.w = r2
            gn1 r12 = r12.c
            g2b r12 = r12.d(r13)
            if (r12 != r5) goto Lb5
        Lb4:
            return r5
        Lb5:
            g2b r12 = defpackage.g2b.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dn1.p(pk1, gk1, u02):java.lang.Object");
    }
}
