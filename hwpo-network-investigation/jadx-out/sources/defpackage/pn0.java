package defpackage;

import com.hwpo_training_app.R;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class pn0 {
    public static final void a(l68 l68Var, fr1 fr1Var, fra fraVar, fr1 fr1Var2, jt1 jt1Var, int i) {
        l68 l68Var2;
        int i2;
        h37 h37Var;
        bj4 bj4VarO = jt1Var.o(-1221877520);
        if ((i & 6) == 0) {
            l68Var2 = l68Var;
            i2 = (bj4VarO.J(l68Var2) ? 4 : 2) | i;
        } else {
            l68Var2 = l68Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bj4VarO.j(fr1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? bj4VarO.J(fraVar) : bj4VarO.j(fraVar) ? 256 : 128;
        }
        int i3 = i & 3072;
        ox6.a aVar = ox6.a.t;
        if (i3 == 0) {
            i2 |= bj4VarO.J(aVar) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bj4VarO.j(null) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= bj4VarO.c(false) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bj4VarO.c(true) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= bj4VarO.c(false) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= bj4VarO.j(fr1Var2) ? 67108864 : 33554432;
        }
        int i4 = i2;
        if (bj4VarO.A(i4 & 1, (38347923 & i4) != 38347922)) {
            Object objF = bj4VarO.f();
            jt1.a.C0187a c0187a = jt1.a.a;
            if (objF == c0187a) {
                c33 c33Var = wd3.a;
                objF = m78.a(bj4VarO.x(), bj4VarO);
            }
            t72 t72Var = (t72) objF;
            Object objF2 = bj4VarO.f();
            if (objF2 == c0187a) {
                objF2 = bl7.i(Boolean.FALSE);
                bj4VarO.C(objF2);
            }
            h37 h37Var2 = (h37) objF2;
            fl6 fl6VarD = dv0.d(di.a.a, false);
            int iD = bj4VarO.D();
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, aVar);
            bt1.c.getClass();
            qr5.a aVar2 = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, fl6VarD);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            bt1.a.b bVar = bt1.a.g;
            if (bj4VarO.S || !xj5.a(bj4VarO.f(), Integer.valueOf(iD))) {
                qh.a(iD, bj4VarO, iD, bVar);
            }
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            if (fraVar.b()) {
                bj4VarO.K(-1891243071);
                h37Var = h37Var2;
                b(l68Var2, fraVar, t72Var, false, h37Var, fr1Var, bj4VarO, (i4 & 14) | 196608 | ((i4 >> 3) & 112) | ((i4 >> 6) & 896) | ((i4 << 15) & 3670016));
                bj4VarO.U(false);
            } else {
                h37Var = h37Var2;
                bj4VarO.K(-1890863476);
                bj4VarO.U(false);
            }
            c(fraVar, h37Var, fr1Var2, bj4VarO, ((i4 >> 18) & 14) | 384 | ((i4 >> 3) & 112) | ((i4 >> 12) & 7168) | (57344 & (i4 << 3)) | ((i4 >> 9) & 458752));
            bj4VarO.U(true);
            boolean z = (i4 & 896) == 256 || ((i4 & 512) != 0 && bj4VarO.j(fraVar));
            Object objF3 = bj4VarO.f();
            if (z || objF3 == c0187a) {
                objF3 = new an0(0, fraVar);
                bj4VarO.C(objF3);
            }
            wd3.a(fraVar, (oh4) objF3, bj4VarO);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new mh(l68Var, fr1Var, fraVar, fr1Var2, i);
        }
    }

    public static final void b(l68 l68Var, final fra fraVar, final t72 t72Var, final boolean z, final h37 h37Var, final fr1 fr1Var, jt1 jt1Var, final int i) {
        int i2;
        l68 l68Var2;
        bj4 bj4VarO = jt1Var.o(-1413720282);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.J(l68Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bj4VarO.J(fraVar) : bj4VarO.j(fraVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.j(null) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bj4VarO.j(t72Var) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bj4VarO.c(z) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bj4VarO.J(h37Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bj4VarO.j(fr1Var) ? 1048576 : 524288;
        }
        if (bj4VarO.A(i2 & 1, (599187 & i2) != 599186)) {
            String strF = nr1.f(bj4VarO, R.string.tooltip_description);
            boolean zJ = ((i2 & 112) == 32 || ((i2 & 64) != 0 && bj4VarO.j(fraVar))) | ((i2 & 896) == 256) | bj4VarO.j(t72Var) | ((458752 & i2) == 131072);
            Object objF = bj4VarO.f();
            if (zJ || objF == jt1.a.a) {
                objF = new mh4() { // from class: bn0
                    @Override // defpackage.mh4
                    public final Object invoke() {
                        fra fraVar2 = fraVar;
                        if (fraVar2.b()) {
                            oy0.d(t72Var, null, null, new hn0(fraVar2, null), 3);
                            h37Var.setValue(Boolean.FALSE);
                        }
                        return g2b.a;
                    }
                };
                bj4VarO.C(objF);
            }
            l68Var2 = l68Var;
            fq.a(l68Var2, (mh4) objF, new m68(z), gr1.b(-1287705660, new jn0(strF, fr1Var), bj4VarO), bj4VarO, (i2 & 14) | 3072, 0);
        } else {
            l68Var2 = l68Var;
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            final l68 l68Var3 = l68Var2;
            xj8VarW.d = new ci4() { // from class: cn0
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    pn0.b(l68Var3, fraVar, t72Var, z, h37Var, fr1Var, (jt1) obj, gz3.s(i | 1));
                    return g2b.a;
                }
            };
        }
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [fn0] */
    public static final void c(final fra fraVar, final h37 h37Var, final fr1 fr1Var, jt1 jt1Var, final int i) {
        int i2;
        bj4 bj4VarO = jt1Var.o(1873232064);
        if ((i & 6) == 0) {
            i2 = (bj4VarO.c(true) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bj4VarO.J(fraVar) : bj4VarO.j(fraVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bj4VarO.J(h37Var) ? 256 : 128;
        }
        int i3 = 0;
        if ((i & 3072) == 0) {
            i2 |= bj4VarO.c(false) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        }
        int i4 = i & 24576;
        ox6.a aVar = ox6.a.t;
        if (i4 == 0) {
            i2 |= bj4VarO.J(aVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bj4VarO.j(fr1Var) ? 131072 : 65536;
        }
        if (bj4VarO.A(i2 & 1, (74899 & i2) != 74898)) {
            Object objF = bj4VarO.f();
            if (objF == jt1.a.a) {
                c33 c33Var = wd3.a;
                objF = m78.a(bj4VarO.x(), bj4VarO);
            }
            final t72 t72Var = (t72) objF;
            final String strF = nr1.f(bj4VarO, R.string.tooltip_label);
            ox6 ox6VarA = ro5.a(j84.c(t6a.b(t6a.b(aVar, fraVar, new ln0(fraVar)), fraVar, new mn0(fraVar)).H(new jt7(new oh4() { // from class: fn0
                @Override // defpackage.oh4
                public final Object invoke(Object obj) {
                    w00 w00Var = new w00(1, t72Var, fraVar);
                    ho5<Object>[] ho5VarArr = ec9.a;
                    ((hc9) obj).d(kb9.c, new k3(strF, w00Var));
                    return g2b.a;
                }
            })), new en0(i3, t72Var, fraVar)), new on0(fraVar, h37Var));
            fl6 fl6VarD = dv0.d(di.a.a, false);
            int iD = bj4VarO.D();
            kw7 kw7VarP = bj4VarO.P();
            ox6 ox6VarC = it1.c(bj4VarO, ox6VarA);
            bt1.c.getClass();
            qr5.a aVar2 = bt1.a.b;
            if (bj4VarO.a == null) {
                ml5.c();
                throw null;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar2);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, fl6VarD);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            bt1.a.b bVar = bt1.a.g;
            if (bj4VarO.S || !xj5.a(bj4VarO.f(), Integer.valueOf(iD))) {
                qh.a(iD, bj4VarO, iD, bVar);
            }
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            fr1Var.invoke(bj4VarO, Integer.valueOf((i2 >> 15) & 14));
            bj4VarO.U(true);
        } else {
            bj4VarO.u();
        }
        xj8 xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: dn0
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iS = gz3.s(i | 1);
                    pn0.c(fraVar, h37Var, fr1Var, (jt1) obj, iS);
                    return g2b.a;
                }
            };
        }
    }
}
