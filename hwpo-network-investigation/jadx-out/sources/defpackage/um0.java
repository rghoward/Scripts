package defpackage;

import android.os.Trace;
import io.intercom.android.sdk.m5.conversation.utils.audio.AudioConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-5f1ea74b072460be821fa7f2514cf36d220f69463b6062bff833a45851f543a6 */
/* JADX INFO: loaded from: classes.dex */
public final class um0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final iw iwVar, final ox6 ox6Var, final wja wjaVar, final oh4 oh4Var, final int i, final boolean z, final int i2, final int i3, final Map map, jt1 jt1Var, final int i4, final int i5) {
        int i6;
        oh4 oh4Var2;
        int i7;
        bj4 bj4Var;
        ia9 ia9Var;
        boolean z2;
        boolean z3;
        bj4 bj4VarO = jt1Var.o(-1343466571);
        if ((i4 & 6) == 0) {
            i6 = (bj4VarO.J(iwVar) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= bj4VarO.J(ox6Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= bj4VarO.J(wjaVar) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            oh4Var2 = oh4Var;
            i6 |= bj4VarO.j(oh4Var2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
        } else {
            oh4Var2 = oh4Var;
        }
        if ((i4 & 24576) == 0) {
            i6 |= bj4VarO.h(i) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i6 |= bj4VarO.c(z) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i6 |= bj4VarO.h(i2) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i6 |= bj4VarO.h(i3) ? 8388608 : 4194304;
        }
        if ((100663296 & i4) == 0) {
            i6 |= bj4VarO.j(map) ? 67108864 : 33554432;
        }
        int i8 = i6 | 805306368;
        if ((i5 & 6) == 0) {
            i7 = i5 | ((i5 & 8) == 0 ? bj4VarO.J(null) : bj4VarO.j(null) ? 4 : 2);
        } else {
            i7 = i5;
        }
        if (bj4VarO.A(i8 & 1, ((i8 & 306783379) == 306783378 && (i7 & 3) == 2) ? false : true)) {
            cv4.a(i3, i2);
            final gb9 gb9Var = (gb9) bj4VarO.F(ib9.a);
            jt1.a.C0187a c0187a = jt1.a.a;
            if (gb9Var != null) {
                bj4VarO.K(1588268245);
                long j = ((qja) bj4VarO.F(rja.a)).b;
                Object[] objArr = {gb9Var};
                au3 au3Var = new au3(new pm0(gb9Var), new qm0(0));
                boolean zJ = bj4VarO.j(gb9Var);
                Object objF = bj4VarO.f();
                if (zJ || objF == c0187a) {
                    objF = new mh4() { // from class: mm0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return Long.valueOf(gb9Var.b());
                        }
                    };
                    bj4VarO.C(objF);
                }
                long jLongValue = ((Number) mm8.e(objArr, au3Var, (mh4) objF, bj4VarO, 0)).longValue();
                boolean zI = bj4VarO.i(jLongValue) | bj4VarO.J(gb9Var) | bj4VarO.i(j);
                Object objF2 = bj4VarO.f();
                if (zI || objF2 == c0187a) {
                    objF2 = new ia9(jLongValue, gb9Var, j);
                    bj4VarO.C(objF2);
                }
                bj4VarO.U(false);
                ia9Var = (ia9) objF2;
            } else {
                bj4VarO.K(1588759409);
                bj4VarO.U(false);
                ia9Var = null;
            }
            js7<List<iw.c<mz7>>, List<iw.c<ei4<String, jt1, Integer, g2b>>>> js7Var = ow.a;
            int length = iwVar.u.length();
            List<iw.c<? extends iw.a>> list = iwVar.t;
            if (list == null) {
                z2 = false;
                z3 = false;
                break;
            }
            int size = list.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    z2 = false;
                    z3 = false;
                    break;
                }
                iw.c<? extends iw.a> cVar = list.get(i9);
                if ((cVar.a instanceof d2a) && "androidx.compose.foundation.text.inlineContent".equals(cVar.d)) {
                    z2 = false;
                    if (lw.b(0, length, cVar.b, cVar.c)) {
                        z3 = true;
                        break;
                    }
                }
                i9++;
            }
            boolean zB = bw5.b(iwVar);
            qa4.a aVar = (qa4.a) bj4VarO.F(qu1.k);
            if (z3 || zB) {
                bj4VarO.K(1590022070);
                boolean z4 = (i8 & 14) == 4;
                Object objF3 = bj4VarO.f();
                if (z4 || objF3 == c0187a) {
                    objF3 = bl7.i(iwVar);
                    bj4VarO.C(objF3);
                }
                h37 h37Var = (h37) objF3;
                iw iwVar2 = (iw) h37Var.getValue();
                boolean zJ2 = bj4VarO.J(h37Var);
                Object objF4 = bj4VarO.f();
                if (zJ2 || objF4 == c0187a) {
                    objF4 = new nm0(0, h37Var);
                    bj4VarO.C(objF4);
                }
                int i10 = i8 << 6;
                bj4Var = bj4VarO;
                c(ox6Var, iwVar2, oh4Var, z3, map, wjaVar, i, z, i2, i3, aVar, ia9Var, (oh4) objF4, bj4Var, ((i8 >> 3) & 910) | ((i8 >> 12) & 57344) | ((i8 << 9) & 458752) | (3670016 & i10) | (29360128 & i10) | (234881024 & i10) | (i10 & 1879048192), ((i8 >> 21) & 896) | (57344 & (i7 << 12)));
                bj4Var.U(false);
            } else {
                bj4VarO.K(1589006262);
                ym0.a(iwVar, wjaVar, aVar, null, bj4VarO);
                ox6 ox6VarE = e(ox6Var, iwVar, wjaVar, oh4Var2, i, z, i2, i3, aVar, null, null, ia9Var, null);
                int iHashCode = Long.hashCode(bj4VarO.T);
                ox6 ox6VarC = it1.c(bj4VarO, ox6VarE);
                kw7 kw7VarP = bj4VarO.P();
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
                rd7.d(bj4VarO, bt1.a.f, lf3.a);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                bj4VarO.U(true);
                bj4VarO.U(false);
                bj4Var = bj4VarO;
            }
        } else {
            bj4Var = bj4VarO;
            bj4Var.u();
        }
        xj8 xj8VarW = bj4Var.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: om0
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    um0.a(iwVar, ox6Var, wjaVar, oh4Var, i, z, i2, i3, map, (jt1) obj, gz3.s(i4 | 1), gz3.s(i5));
                    return g2b.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0115  */
    /* JADX WARN: Code duplicated, block: B:102:0x0118  */
    /* JADX WARN: Code duplicated, block: B:104:0x011c  */
    /* JADX WARN: Code duplicated, block: B:105:0x011f  */
    /* JADX WARN: Code duplicated, block: B:108:0x012f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0160 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:111:0x0162  */
    /* JADX WARN: Code duplicated, block: B:114:0x018b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:115:0x018d  */
    /* JADX WARN: Code duplicated, block: B:117:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:120:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:125:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:127:0x0202 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:129:0x022a  */
    /* JADX WARN: Code duplicated, block: B:132:0x0272  */
    /* JADX WARN: Code duplicated, block: B:134:0x0279  */
    /* JADX WARN: Code duplicated, block: B:135:0x027d  */
    /* JADX WARN: Code duplicated, block: B:137:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:139:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:142:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:60:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:91:0x0100  */
    /* JADX WARN: Code duplicated, block: B:92:0x0102  */
    /* JADX WARN: Code duplicated, block: B:95:0x010b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x010d  */
    /* JADX WARN: Code duplicated, block: B:97:0x010f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0112  */
    public static final void b(final String str, final ox6 ox6Var, final wja wjaVar, oh4 oh4Var, int i, boolean z, final int i2, int i3, jt1 jt1Var, final int i4, final int i5) {
        int i6;
        final oh4 oh4Var2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean zJ;
        int i16;
        boolean z2;
        final boolean z3;
        final int i17;
        final int i18;
        xj8 xj8VarW;
        oh4 oh4Var3;
        boolean z4;
        int i19;
        final gb9 gb9Var;
        ia9 ia9Var;
        Executor executor;
        boolean z5;
        int i20;
        boolean z6;
        oh4 oh4Var4;
        boolean z7;
        Throwable th;
        ox6 ox6VarE;
        int iHashCode;
        ox6 ox6VarC;
        kw7 kw7VarP;
        qr5.a aVar;
        long j;
        boolean zJ2;
        Object objF;
        long jLongValue;
        boolean zI;
        Object objF2;
        int i21;
        bj4 bj4VarO = jt1Var.o(-1040751001);
        if ((i4 & 6) == 0) {
            i6 = (bj4VarO.J(str) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= bj4VarO.J(ox6Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= bj4VarO.J(wjaVar) ? 256 : 128;
        }
        int i22 = i5 & 8;
        if (i22 == 0) {
            if ((i4 & 3072) == 0) {
                oh4Var2 = oh4Var;
                i6 |= bj4VarO.j(oh4Var2) ? AudioConstants.AUDIO_FILE_BUFFER_SIZE : 1024;
            }
            i7 = i5 & 16;
            if (i7 != 0) {
                if ((i4 & 24576) == 0) {
                    i8 = i;
                    if (bj4VarO.h(i8)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i6 |= i9;
                }
                i10 = i5 & 32;
                if (i10 != 0) {
                    if ((196608 & i4) == 0) {
                        if (bj4VarO.c(z)) {
                            i11 = 131072;
                        } else {
                            i11 = 65536;
                        }
                        i6 |= i11;
                    }
                    if ((1572864 & i4) == 0) {
                        if (bj4VarO.h(i2)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i6 |= i21;
                    }
                    i12 = i5 & 128;
                    if (i12 != 0) {
                        if ((12582912 & i4) == 0) {
                            if (bj4VarO.h(i3)) {
                                i13 = 8388608;
                            } else {
                                i13 = 4194304;
                            }
                            i6 |= i13;
                        }
                        i14 = i6 | 100663296;
                        i15 = i6;
                        if ((i5 & 512) != 0) {
                            i14 = i15 | 905969664;
                        } else if ((805306368 & i4) == 0) {
                            if ((1073741824 & i4) == 0) {
                                zJ = bj4VarO.J(null);
                            } else {
                                zJ = bj4VarO.j(null);
                            }
                            if (zJ) {
                                i16 = 536870912;
                            } else {
                                i16 = 268435456;
                            }
                            i14 |= i16;
                        }
                        if ((i14 & 306783379) != 306783378) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (bj4VarO.A(i14 & 1, z2)) {
                            if (i22 != 0) {
                                oh4Var3 = null;
                            } else {
                                oh4Var3 = oh4Var2;
                            }
                            if (i7 != 0) {
                                i8 = 1;
                            }
                            if (i10 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i12 != 0) {
                                i19 = 1;
                            } else {
                                i19 = i3;
                            }
                            cv4.a(i19, i2);
                            gb9Var = (gb9) bj4VarO.F(ib9.a);
                            if (gb9Var != null) {
                                bj4VarO.K(356423075);
                                j = ((qja) bj4VarO.F(rja.a)).b;
                                Object[] objArr = {gb9Var};
                                au3 au3Var = new au3(new pm0(gb9Var), new qm0(0));
                                zJ2 = bj4VarO.j(gb9Var);
                                objF = bj4VarO.f();
                                jt1.a.C0187a c0187a = jt1.a.a;
                                if (zJ2 || objF == c0187a) {
                                    objF = new mh4() { // from class: fm0
                                        @Override // defpackage.mh4
                                        public final Object invoke() {
                                            return Long.valueOf(gb9Var.b());
                                        }
                                    };
                                    bj4VarO.C(objF);
                                }
                                jLongValue = ((Number) mm8.e(objArr, au3Var, (mh4) objF, bj4VarO, 0)).longValue();
                                zI = bj4VarO.i(jLongValue) | bj4VarO.J(gb9Var) | bj4VarO.i(j);
                                objF2 = bj4VarO.f();
                                if (zI || objF2 == c0187a) {
                                    objF2 = new ia9(jLongValue, gb9Var, j);
                                    bj4VarO.C(objF2);
                                }
                                ia9Var = (ia9) objF2;
                                bj4VarO.U(false);
                            } else {
                                bj4VarO.K(356914239);
                                bj4VarO.U(false);
                                ia9Var = null;
                            }
                            final qa4.a aVar2 = (qa4.a) bj4VarO.F(qu1.k);
                            executor = (Executor) bj4VarO.F(ym0.a);
                            if (executor == null && ym0.b(str.length())) {
                                bj4VarO.K(1254298614);
                                final tq5 tq5Var = (tq5) bj4VarO.F(qu1.n);
                                final tx2 tx2Var = (tx2) bj4VarO.F(qu1.h);
                                try {
                                    executor.execute(new Runnable() { // from class: xm0
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            g37 g37VarC;
                                            wja wjaVar2 = wjaVar;
                                            tq5 tq5Var2 = tq5Var;
                                            String str2 = str;
                                            tx2 tx2Var2 = tx2Var;
                                            qa4.a aVar3 = aVar2;
                                            Trace.beginSection("BackgroundTextMeasurement");
                                            try {
                                                hu9 hu9VarJ = qu9.j();
                                                g37 g37Var = hu9VarJ instanceof g37 ? (g37) hu9VarJ : null;
                                                if (g37Var == null || (g37VarC = g37Var.C(null, null)) == null) {
                                                    throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
                                                }
                                                try {
                                                    hu9 hu9VarJ2 = g37VarC.j();
                                                    try {
                                                        wja wjaVarD = zu1.d(wjaVar2, tq5Var2);
                                                        hf3 hf3Var = hf3.t;
                                                        tp tpVar = new tp(str2, wjaVarD, hf3Var, hf3Var, aVar3, tx2Var2);
                                                        tpVar.c();
                                                        tpVar.b();
                                                        g2b g2bVar = g2b.a;
                                                        hu9.q(hu9VarJ2);
                                                        g37VarC.w().a();
                                                        g37VarC.c();
                                                        Trace.endSection();
                                                    } catch (Throwable th2) {
                                                        hu9.q(hu9VarJ2);
                                                        throw th2;
                                                    }
                                                } catch (Throwable th3) {
                                                    try {
                                                        throw th3;
                                                    } catch (Throwable th4) {
                                                        g37VarC.c();
                                                        throw th4;
                                                    }
                                                }
                                            } catch (Throwable th5) {
                                                Trace.endSection();
                                                throw th5;
                                            }
                                        }
                                    });
                                } catch (RejectedExecutionException unused) {
                                }
                                z5 = false;
                                bj4VarO.U(false);
                            } else {
                                z5 = false;
                                bj4VarO.K(1255914055);
                                bj4VarO.U(false);
                            }
                            if (ia9Var == null || oh4Var3 != null) {
                                i20 = i8;
                                z6 = z4;
                                bj4VarO.K(357232113);
                                oh4Var4 = oh4Var3;
                                z7 = true;
                                th = null;
                                ox6VarE = e(ox6Var, new iw(str), wjaVar, oh4Var4, i20, z6, i2, i19, (qa4.a) bj4VarO.F(qu1.k), null, null, ia9Var, null);
                                bj4VarO.U(z5);
                            } else {
                                bj4VarO.K(357875859);
                                bj4VarO.U(z5);
                                i20 = i8;
                                z6 = z4;
                                ox6VarE = ox6Var.H(new sja(str, wjaVar, aVar2, i20, z6, i2, i19));
                                oh4Var4 = oh4Var3;
                                z7 = true;
                                th = null;
                            }
                            iHashCode = Long.hashCode(bj4VarO.T);
                            ox6VarC = it1.c(bj4VarO, ox6VarE);
                            kw7VarP = bj4VarO.P();
                            bt1.c.getClass();
                            aVar = bt1.a.b;
                            if (bj4VarO.a != null) {
                                ml5.c();
                                throw th;
                            }
                            bj4VarO.q();
                            if (bj4VarO.S) {
                                bj4VarO.k(aVar);
                            } else {
                                bj4VarO.z();
                            }
                            rd7.d(bj4VarO, bt1.a.f, lf3.a);
                            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                            rd7.c(bj4VarO, bt1.a.h);
                            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                            bj4VarO.U(z7);
                            z3 = z6;
                            i17 = i19;
                            i18 = i20;
                            oh4Var2 = oh4Var4;
                        } else {
                            bj4VarO.u();
                            z3 = z;
                            i17 = i3;
                            i18 = i8;
                        }
                        xj8VarW = bj4VarO.W();
                        if (xj8VarW != null) {
                            xj8VarW.d = new ci4() { // from class: lm0
                                @Override // defpackage.ci4
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    um0.b(str, ox6Var, wjaVar, oh4Var2, i18, z3, i2, i17, (jt1) obj, gz3.s(i4 | 1), i5);
                                    return g2b.a;
                                }
                            };
                        }
                    }
                    i6 |= 12582912;
                    i14 = i6 | 100663296;
                    i15 = i6;
                    if ((i5 & 512) != 0) {
                        i14 = i15 | 905969664;
                    } else if ((805306368 & i4) == 0) {
                        if ((1073741824 & i4) == 0) {
                            zJ = bj4VarO.J(null);
                        } else {
                            zJ = bj4VarO.j(null);
                        }
                        if (zJ) {
                            i16 = 536870912;
                        } else {
                            i16 = 268435456;
                        }
                        i14 |= i16;
                    }
                    if ((i14 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (bj4VarO.A(i14 & 1, z2)) {
                        if (i22 != 0) {
                            oh4Var3 = null;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        if (i7 != 0) {
                            i8 = 1;
                        }
                        if (i10 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i12 != 0) {
                            i19 = 1;
                        } else {
                            i19 = i3;
                        }
                        cv4.a(i19, i2);
                        gb9Var = (gb9) bj4VarO.F(ib9.a);
                        if (gb9Var != null) {
                            bj4VarO.K(356423075);
                            j = ((qja) bj4VarO.F(rja.a)).b;
                            Object[] objArr2 = {gb9Var};
                            au3 au3Var2 = new au3(new pm0(gb9Var), new qm0(0));
                            zJ2 = bj4VarO.j(gb9Var);
                            objF = bj4VarO.f();
                            jt1.a.C0187a c0187a2 = jt1.a.a;
                            if (zJ2) {
                                objF = new mh4() { // from class: fm0
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return Long.valueOf(gb9Var.b());
                                    }
                                };
                                bj4VarO.C(objF);
                            } else {
                                objF = new mh4() { // from class: fm0
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return Long.valueOf(gb9Var.b());
                                    }
                                };
                                bj4VarO.C(objF);
                            }
                            jLongValue = ((Number) mm8.e(objArr2, au3Var2, (mh4) objF, bj4VarO, 0)).longValue();
                            zI = bj4VarO.i(jLongValue) | bj4VarO.J(gb9Var) | bj4VarO.i(j);
                            objF2 = bj4VarO.f();
                            if (zI) {
                                objF2 = new ia9(jLongValue, gb9Var, j);
                                bj4VarO.C(objF2);
                            } else {
                                objF2 = new ia9(jLongValue, gb9Var, j);
                                bj4VarO.C(objF2);
                            }
                            ia9Var = (ia9) objF2;
                            bj4VarO.U(false);
                        } else {
                            bj4VarO.K(356914239);
                            bj4VarO.U(false);
                            ia9Var = null;
                        }
                        final qa4.a aVar3 = (qa4.a) bj4VarO.F(qu1.k);
                        executor = (Executor) bj4VarO.F(ym0.a);
                        if (executor == null) {
                            z5 = false;
                            bj4VarO.K(1255914055);
                            bj4VarO.U(false);
                        } else {
                            z5 = false;
                            bj4VarO.K(1255914055);
                            bj4VarO.U(false);
                        }
                        if (ia9Var == null) {
                            i20 = i8;
                            z6 = z4;
                            bj4VarO.K(357232113);
                            oh4Var4 = oh4Var3;
                            z7 = true;
                            th = null;
                            ox6VarE = e(ox6Var, new iw(str), wjaVar, oh4Var4, i20, z6, i2, i19, (qa4.a) bj4VarO.F(qu1.k), null, null, ia9Var, null);
                            bj4VarO.U(z5);
                        } else {
                            i20 = i8;
                            z6 = z4;
                            bj4VarO.K(357232113);
                            oh4Var4 = oh4Var3;
                            z7 = true;
                            th = null;
                            ox6VarE = e(ox6Var, new iw(str), wjaVar, oh4Var4, i20, z6, i2, i19, (qa4.a) bj4VarO.F(qu1.k), null, null, ia9Var, null);
                            bj4VarO.U(z5);
                        }
                        iHashCode = Long.hashCode(bj4VarO.T);
                        ox6VarC = it1.c(bj4VarO, ox6VarE);
                        kw7VarP = bj4VarO.P();
                        bt1.c.getClass();
                        aVar = bt1.a.b;
                        if (bj4VarO.a != null) {
                            ml5.c();
                            throw th;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, lf3.a);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        bj4VarO.U(z7);
                        z3 = z6;
                        i17 = i19;
                        i18 = i20;
                        oh4Var2 = oh4Var4;
                    } else {
                        bj4VarO.u();
                        z3 = z;
                        i17 = i3;
                        i18 = i8;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: lm0
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                um0.b(str, ox6Var, wjaVar, oh4Var2, i18, z3, i2, i17, (jt1) obj, gz3.s(i4 | 1), i5);
                                return g2b.a;
                            }
                        };
                    }
                }
                i6 |= 196608;
                if ((1572864 & i4) == 0) {
                    if (bj4VarO.h(i2)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i6 |= i21;
                }
                i12 = i5 & 128;
                if (i12 != 0) {
                    if ((12582912 & i4) == 0) {
                        if (bj4VarO.h(i3)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i6 |= i13;
                    }
                    i14 = i6 | 100663296;
                    i15 = i6;
                    if ((i5 & 512) != 0) {
                        i14 = i15 | 905969664;
                    } else if ((805306368 & i4) == 0) {
                        if ((1073741824 & i4) == 0) {
                            zJ = bj4VarO.J(null);
                        } else {
                            zJ = bj4VarO.j(null);
                        }
                        if (zJ) {
                            i16 = 536870912;
                        } else {
                            i16 = 268435456;
                        }
                        i14 |= i16;
                    }
                    if ((i14 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (bj4VarO.A(i14 & 1, z2)) {
                        if (i22 != 0) {
                            oh4Var3 = null;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        if (i7 != 0) {
                            i8 = 1;
                        }
                        if (i10 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i12 != 0) {
                            i19 = 1;
                        } else {
                            i19 = i3;
                        }
                        cv4.a(i19, i2);
                        gb9Var = (gb9) bj4VarO.F(ib9.a);
                        if (gb9Var != null) {
                            bj4VarO.K(356423075);
                            j = ((qja) bj4VarO.F(rja.a)).b;
                            Object[] objArr3 = {gb9Var};
                            au3 au3Var3 = new au3(new pm0(gb9Var), new qm0(0));
                            zJ2 = bj4VarO.j(gb9Var);
                            objF = bj4VarO.f();
                            jt1.a.C0187a c0187a3 = jt1.a.a;
                            if (zJ2) {
                                objF = new mh4() { // from class: fm0
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return Long.valueOf(gb9Var.b());
                                    }
                                };
                                bj4VarO.C(objF);
                            } else {
                                objF = new mh4() { // from class: fm0
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return Long.valueOf(gb9Var.b());
                                    }
                                };
                                bj4VarO.C(objF);
                            }
                            jLongValue = ((Number) mm8.e(objArr3, au3Var3, (mh4) objF, bj4VarO, 0)).longValue();
                            zI = bj4VarO.i(jLongValue) | bj4VarO.J(gb9Var) | bj4VarO.i(j);
                            objF2 = bj4VarO.f();
                            if (zI) {
                                objF2 = new ia9(jLongValue, gb9Var, j);
                                bj4VarO.C(objF2);
                            } else {
                                objF2 = new ia9(jLongValue, gb9Var, j);
                                bj4VarO.C(objF2);
                            }
                            ia9Var = (ia9) objF2;
                            bj4VarO.U(false);
                        } else {
                            bj4VarO.K(356914239);
                            bj4VarO.U(false);
                            ia9Var = null;
                        }
                        final qa4.a aVar4 = (qa4.a) bj4VarO.F(qu1.k);
                        executor = (Executor) bj4VarO.F(ym0.a);
                        if (executor == null) {
                            z5 = false;
                            bj4VarO.K(1255914055);
                            bj4VarO.U(false);
                        } else {
                            z5 = false;
                            bj4VarO.K(1255914055);
                            bj4VarO.U(false);
                        }
                        if (ia9Var == null) {
                            i20 = i8;
                            z6 = z4;
                            bj4VarO.K(357232113);
                            oh4Var4 = oh4Var3;
                            z7 = true;
                            th = null;
                            ox6VarE = e(ox6Var, new iw(str), wjaVar, oh4Var4, i20, z6, i2, i19, (qa4.a) bj4VarO.F(qu1.k), null, null, ia9Var, null);
                            bj4VarO.U(z5);
                        } else {
                            i20 = i8;
                            z6 = z4;
                            bj4VarO.K(357232113);
                            oh4Var4 = oh4Var3;
                            z7 = true;
                            th = null;
                            ox6VarE = e(ox6Var, new iw(str), wjaVar, oh4Var4, i20, z6, i2, i19, (qa4.a) bj4VarO.F(qu1.k), null, null, ia9Var, null);
                            bj4VarO.U(z5);
                        }
                        iHashCode = Long.hashCode(bj4VarO.T);
                        ox6VarC = it1.c(bj4VarO, ox6VarE);
                        kw7VarP = bj4VarO.P();
                        bt1.c.getClass();
                        aVar = bt1.a.b;
                        if (bj4VarO.a != null) {
                            ml5.c();
                            throw th;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, lf3.a);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        bj4VarO.U(z7);
                        z3 = z6;
                        i17 = i19;
                        i18 = i20;
                        oh4Var2 = oh4Var4;
                    } else {
                        bj4VarO.u();
                        z3 = z;
                        i17 = i3;
                        i18 = i8;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: lm0
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                um0.b(str, ox6Var, wjaVar, oh4Var2, i18, z3, i2, i17, (jt1) obj, gz3.s(i4 | 1), i5);
                                return g2b.a;
                            }
                        };
                    }
                }
                i6 |= 12582912;
                i14 = i6 | 100663296;
                i15 = i6;
                if ((i5 & 512) != 0) {
                    i14 = i15 | 905969664;
                } else if ((805306368 & i4) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zJ = bj4VarO.J(null);
                    } else {
                        zJ = bj4VarO.j(null);
                    }
                    if (zJ) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i14 |= i16;
                }
                if ((i14 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bj4VarO.A(i14 & 1, z2)) {
                    if (i22 != 0) {
                        oh4Var3 = null;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    if (i7 != 0) {
                        i8 = 1;
                    }
                    if (i10 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i12 != 0) {
                        i19 = 1;
                    } else {
                        i19 = i3;
                    }
                    cv4.a(i19, i2);
                    gb9Var = (gb9) bj4VarO.F(ib9.a);
                    if (gb9Var != null) {
                        bj4VarO.K(356423075);
                        j = ((qja) bj4VarO.F(rja.a)).b;
                        Object[] objArr4 = {gb9Var};
                        au3 au3Var4 = new au3(new pm0(gb9Var), new qm0(0));
                        zJ2 = bj4VarO.j(gb9Var);
                        objF = bj4VarO.f();
                        jt1.a.C0187a c0187a4 = jt1.a.a;
                        if (zJ2) {
                            objF = new mh4() { // from class: fm0
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return Long.valueOf(gb9Var.b());
                                }
                            };
                            bj4VarO.C(objF);
                        } else {
                            objF = new mh4() { // from class: fm0
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return Long.valueOf(gb9Var.b());
                                }
                            };
                            bj4VarO.C(objF);
                        }
                        jLongValue = ((Number) mm8.e(objArr4, au3Var4, (mh4) objF, bj4VarO, 0)).longValue();
                        zI = bj4VarO.i(jLongValue) | bj4VarO.J(gb9Var) | bj4VarO.i(j);
                        objF2 = bj4VarO.f();
                        if (zI) {
                            objF2 = new ia9(jLongValue, gb9Var, j);
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new ia9(jLongValue, gb9Var, j);
                            bj4VarO.C(objF2);
                        }
                        ia9Var = (ia9) objF2;
                        bj4VarO.U(false);
                    } else {
                        bj4VarO.K(356914239);
                        bj4VarO.U(false);
                        ia9Var = null;
                    }
                    final qa4.a aVar5 = (qa4.a) bj4VarO.F(qu1.k);
                    executor = (Executor) bj4VarO.F(ym0.a);
                    if (executor == null) {
                        z5 = false;
                        bj4VarO.K(1255914055);
                        bj4VarO.U(false);
                    } else {
                        z5 = false;
                        bj4VarO.K(1255914055);
                        bj4VarO.U(false);
                    }
                    if (ia9Var == null) {
                        i20 = i8;
                        z6 = z4;
                        bj4VarO.K(357232113);
                        oh4Var4 = oh4Var3;
                        z7 = true;
                        th = null;
                        ox6VarE = e(ox6Var, new iw(str), wjaVar, oh4Var4, i20, z6, i2, i19, (qa4.a) bj4VarO.F(qu1.k), null, null, ia9Var, null);
                        bj4VarO.U(z5);
                    } else {
                        i20 = i8;
                        z6 = z4;
                        bj4VarO.K(357232113);
                        oh4Var4 = oh4Var3;
                        z7 = true;
                        th = null;
                        ox6VarE = e(ox6Var, new iw(str), wjaVar, oh4Var4, i20, z6, i2, i19, (qa4.a) bj4VarO.F(qu1.k), null, null, ia9Var, null);
                        bj4VarO.U(z5);
                    }
                    iHashCode = Long.hashCode(bj4VarO.T);
                    ox6VarC = it1.c(bj4VarO, ox6VarE);
                    kw7VarP = bj4VarO.P();
                    bt1.c.getClass();
                    aVar = bt1.a.b;
                    if (bj4VarO.a != null) {
                        ml5.c();
                        throw th;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, lf3.a);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    bj4VarO.U(z7);
                    z3 = z6;
                    i17 = i19;
                    i18 = i20;
                    oh4Var2 = oh4Var4;
                } else {
                    bj4VarO.u();
                    z3 = z;
                    i17 = i3;
                    i18 = i8;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: lm0
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            um0.b(str, ox6Var, wjaVar, oh4Var2, i18, z3, i2, i17, (jt1) obj, gz3.s(i4 | 1), i5);
                            return g2b.a;
                        }
                    };
                }
            }
            i6 |= 24576;
            i8 = i;
            i10 = i5 & 32;
            if (i10 != 0) {
                if ((196608 & i4) == 0) {
                    if (bj4VarO.c(z)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i6 |= i11;
                }
                if ((1572864 & i4) == 0) {
                    if (bj4VarO.h(i2)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i6 |= i21;
                }
                i12 = i5 & 128;
                if (i12 != 0) {
                    if ((12582912 & i4) == 0) {
                        if (bj4VarO.h(i3)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i6 |= i13;
                    }
                    i14 = i6 | 100663296;
                    i15 = i6;
                    if ((i5 & 512) != 0) {
                        i14 = i15 | 905969664;
                    } else if ((805306368 & i4) == 0) {
                        if ((1073741824 & i4) == 0) {
                            zJ = bj4VarO.J(null);
                        } else {
                            zJ = bj4VarO.j(null);
                        }
                        if (zJ) {
                            i16 = 536870912;
                        } else {
                            i16 = 268435456;
                        }
                        i14 |= i16;
                    }
                    if ((i14 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (bj4VarO.A(i14 & 1, z2)) {
                        if (i22 != 0) {
                            oh4Var3 = null;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        if (i7 != 0) {
                            i8 = 1;
                        }
                        if (i10 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i12 != 0) {
                            i19 = 1;
                        } else {
                            i19 = i3;
                        }
                        cv4.a(i19, i2);
                        gb9Var = (gb9) bj4VarO.F(ib9.a);
                        if (gb9Var != null) {
                            bj4VarO.K(356423075);
                            j = ((qja) bj4VarO.F(rja.a)).b;
                            Object[] objArr5 = {gb9Var};
                            au3 au3Var5 = new au3(new pm0(gb9Var), new qm0(0));
                            zJ2 = bj4VarO.j(gb9Var);
                            objF = bj4VarO.f();
                            jt1.a.C0187a c0187a5 = jt1.a.a;
                            if (zJ2) {
                                objF = new mh4() { // from class: fm0
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return Long.valueOf(gb9Var.b());
                                    }
                                };
                                bj4VarO.C(objF);
                            } else {
                                objF = new mh4() { // from class: fm0
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return Long.valueOf(gb9Var.b());
                                    }
                                };
                                bj4VarO.C(objF);
                            }
                            jLongValue = ((Number) mm8.e(objArr5, au3Var5, (mh4) objF, bj4VarO, 0)).longValue();
                            zI = bj4VarO.i(jLongValue) | bj4VarO.J(gb9Var) | bj4VarO.i(j);
                            objF2 = bj4VarO.f();
                            if (zI) {
                                objF2 = new ia9(jLongValue, gb9Var, j);
                                bj4VarO.C(objF2);
                            } else {
                                objF2 = new ia9(jLongValue, gb9Var, j);
                                bj4VarO.C(objF2);
                            }
                            ia9Var = (ia9) objF2;
                            bj4VarO.U(false);
                        } else {
                            bj4VarO.K(356914239);
                            bj4VarO.U(false);
                            ia9Var = null;
                        }
                        final qa4.a aVar6 = (qa4.a) bj4VarO.F(qu1.k);
                        executor = (Executor) bj4VarO.F(ym0.a);
                        if (executor == null) {
                            z5 = false;
                            bj4VarO.K(1255914055);
                            bj4VarO.U(false);
                        } else {
                            z5 = false;
                            bj4VarO.K(1255914055);
                            bj4VarO.U(false);
                        }
                        if (ia9Var == null) {
                            i20 = i8;
                            z6 = z4;
                            bj4VarO.K(357232113);
                            oh4Var4 = oh4Var3;
                            z7 = true;
                            th = null;
                            ox6VarE = e(ox6Var, new iw(str), wjaVar, oh4Var4, i20, z6, i2, i19, (qa4.a) bj4VarO.F(qu1.k), null, null, ia9Var, null);
                            bj4VarO.U(z5);
                        } else {
                            i20 = i8;
                            z6 = z4;
                            bj4VarO.K(357232113);
                            oh4Var4 = oh4Var3;
                            z7 = true;
                            th = null;
                            ox6VarE = e(ox6Var, new iw(str), wjaVar, oh4Var4, i20, z6, i2, i19, (qa4.a) bj4VarO.F(qu1.k), null, null, ia9Var, null);
                            bj4VarO.U(z5);
                        }
                        iHashCode = Long.hashCode(bj4VarO.T);
                        ox6VarC = it1.c(bj4VarO, ox6VarE);
                        kw7VarP = bj4VarO.P();
                        bt1.c.getClass();
                        aVar = bt1.a.b;
                        if (bj4VarO.a != null) {
                            ml5.c();
                            throw th;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, lf3.a);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        bj4VarO.U(z7);
                        z3 = z6;
                        i17 = i19;
                        i18 = i20;
                        oh4Var2 = oh4Var4;
                    } else {
                        bj4VarO.u();
                        z3 = z;
                        i17 = i3;
                        i18 = i8;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: lm0
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                um0.b(str, ox6Var, wjaVar, oh4Var2, i18, z3, i2, i17, (jt1) obj, gz3.s(i4 | 1), i5);
                                return g2b.a;
                            }
                        };
                    }
                }
                i6 |= 12582912;
                i14 = i6 | 100663296;
                i15 = i6;
                if ((i5 & 512) != 0) {
                    i14 = i15 | 905969664;
                } else if ((805306368 & i4) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zJ = bj4VarO.J(null);
                    } else {
                        zJ = bj4VarO.j(null);
                    }
                    if (zJ) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i14 |= i16;
                }
                if ((i14 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bj4VarO.A(i14 & 1, z2)) {
                    if (i22 != 0) {
                        oh4Var3 = null;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    if (i7 != 0) {
                        i8 = 1;
                    }
                    if (i10 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i12 != 0) {
                        i19 = 1;
                    } else {
                        i19 = i3;
                    }
                    cv4.a(i19, i2);
                    gb9Var = (gb9) bj4VarO.F(ib9.a);
                    if (gb9Var != null) {
                        bj4VarO.K(356423075);
                        j = ((qja) bj4VarO.F(rja.a)).b;
                        Object[] objArr6 = {gb9Var};
                        au3 au3Var6 = new au3(new pm0(gb9Var), new qm0(0));
                        zJ2 = bj4VarO.j(gb9Var);
                        objF = bj4VarO.f();
                        jt1.a.C0187a c0187a6 = jt1.a.a;
                        if (zJ2) {
                            objF = new mh4() { // from class: fm0
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return Long.valueOf(gb9Var.b());
                                }
                            };
                            bj4VarO.C(objF);
                        } else {
                            objF = new mh4() { // from class: fm0
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return Long.valueOf(gb9Var.b());
                                }
                            };
                            bj4VarO.C(objF);
                        }
                        jLongValue = ((Number) mm8.e(objArr6, au3Var6, (mh4) objF, bj4VarO, 0)).longValue();
                        zI = bj4VarO.i(jLongValue) | bj4VarO.J(gb9Var) | bj4VarO.i(j);
                        objF2 = bj4VarO.f();
                        if (zI) {
                            objF2 = new ia9(jLongValue, gb9Var, j);
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new ia9(jLongValue, gb9Var, j);
                            bj4VarO.C(objF2);
                        }
                        ia9Var = (ia9) objF2;
                        bj4VarO.U(false);
                    } else {
                        bj4VarO.K(356914239);
                        bj4VarO.U(false);
                        ia9Var = null;
                    }
                    final qa4.a aVar7 = (qa4.a) bj4VarO.F(qu1.k);
                    executor = (Executor) bj4VarO.F(ym0.a);
                    if (executor == null) {
                        z5 = false;
                        bj4VarO.K(1255914055);
                        bj4VarO.U(false);
                    } else {
                        z5 = false;
                        bj4VarO.K(1255914055);
                        bj4VarO.U(false);
                    }
                    if (ia9Var == null) {
                        i20 = i8;
                        z6 = z4;
                        bj4VarO.K(357232113);
                        oh4Var4 = oh4Var3;
                        z7 = true;
                        th = null;
                        ox6VarE = e(ox6Var, new iw(str), wjaVar, oh4Var4, i20, z6, i2, i19, (qa4.a) bj4VarO.F(qu1.k), null, null, ia9Var, null);
                        bj4VarO.U(z5);
                    } else {
                        i20 = i8;
                        z6 = z4;
                        bj4VarO.K(357232113);
                        oh4Var4 = oh4Var3;
                        z7 = true;
                        th = null;
                        ox6VarE = e(ox6Var, new iw(str), wjaVar, oh4Var4, i20, z6, i2, i19, (qa4.a) bj4VarO.F(qu1.k), null, null, ia9Var, null);
                        bj4VarO.U(z5);
                    }
                    iHashCode = Long.hashCode(bj4VarO.T);
                    ox6VarC = it1.c(bj4VarO, ox6VarE);
                    kw7VarP = bj4VarO.P();
                    bt1.c.getClass();
                    aVar = bt1.a.b;
                    if (bj4VarO.a != null) {
                        ml5.c();
                        throw th;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, lf3.a);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    bj4VarO.U(z7);
                    z3 = z6;
                    i17 = i19;
                    i18 = i20;
                    oh4Var2 = oh4Var4;
                } else {
                    bj4VarO.u();
                    z3 = z;
                    i17 = i3;
                    i18 = i8;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: lm0
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            um0.b(str, ox6Var, wjaVar, oh4Var2, i18, z3, i2, i17, (jt1) obj, gz3.s(i4 | 1), i5);
                            return g2b.a;
                        }
                    };
                }
            }
            i6 |= 196608;
            if ((1572864 & i4) == 0) {
                if (bj4VarO.h(i2)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i6 |= i21;
            }
            i12 = i5 & 128;
            if (i12 != 0) {
                if ((12582912 & i4) == 0) {
                    if (bj4VarO.h(i3)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i6 |= i13;
                }
                i14 = i6 | 100663296;
                i15 = i6;
                if ((i5 & 512) != 0) {
                    i14 = i15 | 905969664;
                } else if ((805306368 & i4) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zJ = bj4VarO.J(null);
                    } else {
                        zJ = bj4VarO.j(null);
                    }
                    if (zJ) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i14 |= i16;
                }
                if ((i14 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bj4VarO.A(i14 & 1, z2)) {
                    if (i22 != 0) {
                        oh4Var3 = null;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    if (i7 != 0) {
                        i8 = 1;
                    }
                    if (i10 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i12 != 0) {
                        i19 = 1;
                    } else {
                        i19 = i3;
                    }
                    cv4.a(i19, i2);
                    gb9Var = (gb9) bj4VarO.F(ib9.a);
                    if (gb9Var != null) {
                        bj4VarO.K(356423075);
                        j = ((qja) bj4VarO.F(rja.a)).b;
                        Object[] objArr7 = {gb9Var};
                        au3 au3Var7 = new au3(new pm0(gb9Var), new qm0(0));
                        zJ2 = bj4VarO.j(gb9Var);
                        objF = bj4VarO.f();
                        jt1.a.C0187a c0187a7 = jt1.a.a;
                        if (zJ2) {
                            objF = new mh4() { // from class: fm0
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return Long.valueOf(gb9Var.b());
                                }
                            };
                            bj4VarO.C(objF);
                        } else {
                            objF = new mh4() { // from class: fm0
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return Long.valueOf(gb9Var.b());
                                }
                            };
                            bj4VarO.C(objF);
                        }
                        jLongValue = ((Number) mm8.e(objArr7, au3Var7, (mh4) objF, bj4VarO, 0)).longValue();
                        zI = bj4VarO.i(jLongValue) | bj4VarO.J(gb9Var) | bj4VarO.i(j);
                        objF2 = bj4VarO.f();
                        if (zI) {
                            objF2 = new ia9(jLongValue, gb9Var, j);
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new ia9(jLongValue, gb9Var, j);
                            bj4VarO.C(objF2);
                        }
                        ia9Var = (ia9) objF2;
                        bj4VarO.U(false);
                    } else {
                        bj4VarO.K(356914239);
                        bj4VarO.U(false);
                        ia9Var = null;
                    }
                    final qa4.a aVar8 = (qa4.a) bj4VarO.F(qu1.k);
                    executor = (Executor) bj4VarO.F(ym0.a);
                    if (executor == null) {
                        z5 = false;
                        bj4VarO.K(1255914055);
                        bj4VarO.U(false);
                    } else {
                        z5 = false;
                        bj4VarO.K(1255914055);
                        bj4VarO.U(false);
                    }
                    if (ia9Var == null) {
                        i20 = i8;
                        z6 = z4;
                        bj4VarO.K(357232113);
                        oh4Var4 = oh4Var3;
                        z7 = true;
                        th = null;
                        ox6VarE = e(ox6Var, new iw(str), wjaVar, oh4Var4, i20, z6, i2, i19, (qa4.a) bj4VarO.F(qu1.k), null, null, ia9Var, null);
                        bj4VarO.U(z5);
                    } else {
                        i20 = i8;
                        z6 = z4;
                        bj4VarO.K(357232113);
                        oh4Var4 = oh4Var3;
                        z7 = true;
                        th = null;
                        ox6VarE = e(ox6Var, new iw(str), wjaVar, oh4Var4, i20, z6, i2, i19, (qa4.a) bj4VarO.F(qu1.k), null, null, ia9Var, null);
                        bj4VarO.U(z5);
                    }
                    iHashCode = Long.hashCode(bj4VarO.T);
                    ox6VarC = it1.c(bj4VarO, ox6VarE);
                    kw7VarP = bj4VarO.P();
                    bt1.c.getClass();
                    aVar = bt1.a.b;
                    if (bj4VarO.a != null) {
                        ml5.c();
                        throw th;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, lf3.a);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    bj4VarO.U(z7);
                    z3 = z6;
                    i17 = i19;
                    i18 = i20;
                    oh4Var2 = oh4Var4;
                } else {
                    bj4VarO.u();
                    z3 = z;
                    i17 = i3;
                    i18 = i8;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: lm0
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            um0.b(str, ox6Var, wjaVar, oh4Var2, i18, z3, i2, i17, (jt1) obj, gz3.s(i4 | 1), i5);
                            return g2b.a;
                        }
                    };
                }
            }
            i6 |= 12582912;
            i14 = i6 | 100663296;
            i15 = i6;
            if ((i5 & 512) != 0) {
                i14 = i15 | 905969664;
            } else if ((805306368 & i4) == 0) {
                if ((1073741824 & i4) == 0) {
                    zJ = bj4VarO.J(null);
                } else {
                    zJ = bj4VarO.j(null);
                }
                if (zJ) {
                    i16 = 536870912;
                } else {
                    i16 = 268435456;
                }
                i14 |= i16;
            }
            if ((i14 & 306783379) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bj4VarO.A(i14 & 1, z2)) {
                if (i22 != 0) {
                    oh4Var3 = null;
                } else {
                    oh4Var3 = oh4Var2;
                }
                if (i7 != 0) {
                    i8 = 1;
                }
                if (i10 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i12 != 0) {
                    i19 = 1;
                } else {
                    i19 = i3;
                }
                cv4.a(i19, i2);
                gb9Var = (gb9) bj4VarO.F(ib9.a);
                if (gb9Var != null) {
                    bj4VarO.K(356423075);
                    j = ((qja) bj4VarO.F(rja.a)).b;
                    Object[] objArr8 = {gb9Var};
                    au3 au3Var8 = new au3(new pm0(gb9Var), new qm0(0));
                    zJ2 = bj4VarO.j(gb9Var);
                    objF = bj4VarO.f();
                    jt1.a.C0187a c0187a8 = jt1.a.a;
                    if (zJ2) {
                        objF = new mh4() { // from class: fm0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return Long.valueOf(gb9Var.b());
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new mh4() { // from class: fm0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return Long.valueOf(gb9Var.b());
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    jLongValue = ((Number) mm8.e(objArr8, au3Var8, (mh4) objF, bj4VarO, 0)).longValue();
                    zI = bj4VarO.i(jLongValue) | bj4VarO.J(gb9Var) | bj4VarO.i(j);
                    objF2 = bj4VarO.f();
                    if (zI) {
                        objF2 = new ia9(jLongValue, gb9Var, j);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new ia9(jLongValue, gb9Var, j);
                        bj4VarO.C(objF2);
                    }
                    ia9Var = (ia9) objF2;
                    bj4VarO.U(false);
                } else {
                    bj4VarO.K(356914239);
                    bj4VarO.U(false);
                    ia9Var = null;
                }
                final qa4.a aVar9 = (qa4.a) bj4VarO.F(qu1.k);
                executor = (Executor) bj4VarO.F(ym0.a);
                if (executor == null) {
                    z5 = false;
                    bj4VarO.K(1255914055);
                    bj4VarO.U(false);
                } else {
                    z5 = false;
                    bj4VarO.K(1255914055);
                    bj4VarO.U(false);
                }
                if (ia9Var == null) {
                    i20 = i8;
                    z6 = z4;
                    bj4VarO.K(357232113);
                    oh4Var4 = oh4Var3;
                    z7 = true;
                    th = null;
                    ox6VarE = e(ox6Var, new iw(str), wjaVar, oh4Var4, i20, z6, i2, i19, (qa4.a) bj4VarO.F(qu1.k), null, null, ia9Var, null);
                    bj4VarO.U(z5);
                } else {
                    i20 = i8;
                    z6 = z4;
                    bj4VarO.K(357232113);
                    oh4Var4 = oh4Var3;
                    z7 = true;
                    th = null;
                    ox6VarE = e(ox6Var, new iw(str), wjaVar, oh4Var4, i20, z6, i2, i19, (qa4.a) bj4VarO.F(qu1.k), null, null, ia9Var, null);
                    bj4VarO.U(z5);
                }
                iHashCode = Long.hashCode(bj4VarO.T);
                ox6VarC = it1.c(bj4VarO, ox6VarE);
                kw7VarP = bj4VarO.P();
                bt1.c.getClass();
                aVar = bt1.a.b;
                if (bj4VarO.a != null) {
                    ml5.c();
                    throw th;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, lf3.a);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                bj4VarO.U(z7);
                z3 = z6;
                i17 = i19;
                i18 = i20;
                oh4Var2 = oh4Var4;
            } else {
                bj4VarO.u();
                z3 = z;
                i17 = i3;
                i18 = i8;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: lm0
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        um0.b(str, ox6Var, wjaVar, oh4Var2, i18, z3, i2, i17, (jt1) obj, gz3.s(i4 | 1), i5);
                        return g2b.a;
                    }
                };
            }
        }
        i6 |= 3072;
        oh4Var2 = oh4Var;
        i7 = i5 & 16;
        if (i7 != 0) {
            if ((i4 & 24576) == 0) {
                i8 = i;
                if (bj4VarO.h(i8)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i6 |= i9;
            }
            i10 = i5 & 32;
            if (i10 != 0) {
                if ((196608 & i4) == 0) {
                    if (bj4VarO.c(z)) {
                        i11 = 131072;
                    } else {
                        i11 = 65536;
                    }
                    i6 |= i11;
                }
                if ((1572864 & i4) == 0) {
                    if (bj4VarO.h(i2)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i6 |= i21;
                }
                i12 = i5 & 128;
                if (i12 != 0) {
                    if ((12582912 & i4) == 0) {
                        if (bj4VarO.h(i3)) {
                            i13 = 8388608;
                        } else {
                            i13 = 4194304;
                        }
                        i6 |= i13;
                    }
                    i14 = i6 | 100663296;
                    i15 = i6;
                    if ((i5 & 512) != 0) {
                        i14 = i15 | 905969664;
                    } else if ((805306368 & i4) == 0) {
                        if ((1073741824 & i4) == 0) {
                            zJ = bj4VarO.J(null);
                        } else {
                            zJ = bj4VarO.j(null);
                        }
                        if (zJ) {
                            i16 = 536870912;
                        } else {
                            i16 = 268435456;
                        }
                        i14 |= i16;
                    }
                    if ((i14 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (bj4VarO.A(i14 & 1, z2)) {
                        if (i22 != 0) {
                            oh4Var3 = null;
                        } else {
                            oh4Var3 = oh4Var2;
                        }
                        if (i7 != 0) {
                            i8 = 1;
                        }
                        if (i10 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i12 != 0) {
                            i19 = 1;
                        } else {
                            i19 = i3;
                        }
                        cv4.a(i19, i2);
                        gb9Var = (gb9) bj4VarO.F(ib9.a);
                        if (gb9Var != null) {
                            bj4VarO.K(356423075);
                            j = ((qja) bj4VarO.F(rja.a)).b;
                            Object[] objArr9 = {gb9Var};
                            au3 au3Var9 = new au3(new pm0(gb9Var), new qm0(0));
                            zJ2 = bj4VarO.j(gb9Var);
                            objF = bj4VarO.f();
                            jt1.a.C0187a c0187a9 = jt1.a.a;
                            if (zJ2) {
                                objF = new mh4() { // from class: fm0
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return Long.valueOf(gb9Var.b());
                                    }
                                };
                                bj4VarO.C(objF);
                            } else {
                                objF = new mh4() { // from class: fm0
                                    @Override // defpackage.mh4
                                    public final Object invoke() {
                                        return Long.valueOf(gb9Var.b());
                                    }
                                };
                                bj4VarO.C(objF);
                            }
                            jLongValue = ((Number) mm8.e(objArr9, au3Var9, (mh4) objF, bj4VarO, 0)).longValue();
                            zI = bj4VarO.i(jLongValue) | bj4VarO.J(gb9Var) | bj4VarO.i(j);
                            objF2 = bj4VarO.f();
                            if (zI) {
                                objF2 = new ia9(jLongValue, gb9Var, j);
                                bj4VarO.C(objF2);
                            } else {
                                objF2 = new ia9(jLongValue, gb9Var, j);
                                bj4VarO.C(objF2);
                            }
                            ia9Var = (ia9) objF2;
                            bj4VarO.U(false);
                        } else {
                            bj4VarO.K(356914239);
                            bj4VarO.U(false);
                            ia9Var = null;
                        }
                        final qa4.a aVar10 = (qa4.a) bj4VarO.F(qu1.k);
                        executor = (Executor) bj4VarO.F(ym0.a);
                        if (executor == null) {
                            z5 = false;
                            bj4VarO.K(1255914055);
                            bj4VarO.U(false);
                        } else {
                            z5 = false;
                            bj4VarO.K(1255914055);
                            bj4VarO.U(false);
                        }
                        if (ia9Var == null) {
                            i20 = i8;
                            z6 = z4;
                            bj4VarO.K(357232113);
                            oh4Var4 = oh4Var3;
                            z7 = true;
                            th = null;
                            ox6VarE = e(ox6Var, new iw(str), wjaVar, oh4Var4, i20, z6, i2, i19, (qa4.a) bj4VarO.F(qu1.k), null, null, ia9Var, null);
                            bj4VarO.U(z5);
                        } else {
                            i20 = i8;
                            z6 = z4;
                            bj4VarO.K(357232113);
                            oh4Var4 = oh4Var3;
                            z7 = true;
                            th = null;
                            ox6VarE = e(ox6Var, new iw(str), wjaVar, oh4Var4, i20, z6, i2, i19, (qa4.a) bj4VarO.F(qu1.k), null, null, ia9Var, null);
                            bj4VarO.U(z5);
                        }
                        iHashCode = Long.hashCode(bj4VarO.T);
                        ox6VarC = it1.c(bj4VarO, ox6VarE);
                        kw7VarP = bj4VarO.P();
                        bt1.c.getClass();
                        aVar = bt1.a.b;
                        if (bj4VarO.a != null) {
                            ml5.c();
                            throw th;
                        }
                        bj4VarO.q();
                        if (bj4VarO.S) {
                            bj4VarO.k(aVar);
                        } else {
                            bj4VarO.z();
                        }
                        rd7.d(bj4VarO, bt1.a.f, lf3.a);
                        rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                        rd7.c(bj4VarO, bt1.a.h);
                        rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                        rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                        bj4VarO.U(z7);
                        z3 = z6;
                        i17 = i19;
                        i18 = i20;
                        oh4Var2 = oh4Var4;
                    } else {
                        bj4VarO.u();
                        z3 = z;
                        i17 = i3;
                        i18 = i8;
                    }
                    xj8VarW = bj4VarO.W();
                    if (xj8VarW != null) {
                        xj8VarW.d = new ci4() { // from class: lm0
                            @Override // defpackage.ci4
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                um0.b(str, ox6Var, wjaVar, oh4Var2, i18, z3, i2, i17, (jt1) obj, gz3.s(i4 | 1), i5);
                                return g2b.a;
                            }
                        };
                    }
                }
                i6 |= 12582912;
                i14 = i6 | 100663296;
                i15 = i6;
                if ((i5 & 512) != 0) {
                    i14 = i15 | 905969664;
                } else if ((805306368 & i4) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zJ = bj4VarO.J(null);
                    } else {
                        zJ = bj4VarO.j(null);
                    }
                    if (zJ) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i14 |= i16;
                }
                if ((i14 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bj4VarO.A(i14 & 1, z2)) {
                    if (i22 != 0) {
                        oh4Var3 = null;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    if (i7 != 0) {
                        i8 = 1;
                    }
                    if (i10 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i12 != 0) {
                        i19 = 1;
                    } else {
                        i19 = i3;
                    }
                    cv4.a(i19, i2);
                    gb9Var = (gb9) bj4VarO.F(ib9.a);
                    if (gb9Var != null) {
                        bj4VarO.K(356423075);
                        j = ((qja) bj4VarO.F(rja.a)).b;
                        Object[] objArr10 = {gb9Var};
                        au3 au3Var10 = new au3(new pm0(gb9Var), new qm0(0));
                        zJ2 = bj4VarO.j(gb9Var);
                        objF = bj4VarO.f();
                        jt1.a.C0187a c0187a10 = jt1.a.a;
                        if (zJ2) {
                            objF = new mh4() { // from class: fm0
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return Long.valueOf(gb9Var.b());
                                }
                            };
                            bj4VarO.C(objF);
                        } else {
                            objF = new mh4() { // from class: fm0
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return Long.valueOf(gb9Var.b());
                                }
                            };
                            bj4VarO.C(objF);
                        }
                        jLongValue = ((Number) mm8.e(objArr10, au3Var10, (mh4) objF, bj4VarO, 0)).longValue();
                        zI = bj4VarO.i(jLongValue) | bj4VarO.J(gb9Var) | bj4VarO.i(j);
                        objF2 = bj4VarO.f();
                        if (zI) {
                            objF2 = new ia9(jLongValue, gb9Var, j);
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new ia9(jLongValue, gb9Var, j);
                            bj4VarO.C(objF2);
                        }
                        ia9Var = (ia9) objF2;
                        bj4VarO.U(false);
                    } else {
                        bj4VarO.K(356914239);
                        bj4VarO.U(false);
                        ia9Var = null;
                    }
                    final qa4.a aVar11 = (qa4.a) bj4VarO.F(qu1.k);
                    executor = (Executor) bj4VarO.F(ym0.a);
                    if (executor == null) {
                        z5 = false;
                        bj4VarO.K(1255914055);
                        bj4VarO.U(false);
                    } else {
                        z5 = false;
                        bj4VarO.K(1255914055);
                        bj4VarO.U(false);
                    }
                    if (ia9Var == null) {
                        i20 = i8;
                        z6 = z4;
                        bj4VarO.K(357232113);
                        oh4Var4 = oh4Var3;
                        z7 = true;
                        th = null;
                        ox6VarE = e(ox6Var, new iw(str), wjaVar, oh4Var4, i20, z6, i2, i19, (qa4.a) bj4VarO.F(qu1.k), null, null, ia9Var, null);
                        bj4VarO.U(z5);
                    } else {
                        i20 = i8;
                        z6 = z4;
                        bj4VarO.K(357232113);
                        oh4Var4 = oh4Var3;
                        z7 = true;
                        th = null;
                        ox6VarE = e(ox6Var, new iw(str), wjaVar, oh4Var4, i20, z6, i2, i19, (qa4.a) bj4VarO.F(qu1.k), null, null, ia9Var, null);
                        bj4VarO.U(z5);
                    }
                    iHashCode = Long.hashCode(bj4VarO.T);
                    ox6VarC = it1.c(bj4VarO, ox6VarE);
                    kw7VarP = bj4VarO.P();
                    bt1.c.getClass();
                    aVar = bt1.a.b;
                    if (bj4VarO.a != null) {
                        ml5.c();
                        throw th;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, lf3.a);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    bj4VarO.U(z7);
                    z3 = z6;
                    i17 = i19;
                    i18 = i20;
                    oh4Var2 = oh4Var4;
                } else {
                    bj4VarO.u();
                    z3 = z;
                    i17 = i3;
                    i18 = i8;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: lm0
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            um0.b(str, ox6Var, wjaVar, oh4Var2, i18, z3, i2, i17, (jt1) obj, gz3.s(i4 | 1), i5);
                            return g2b.a;
                        }
                    };
                }
            }
            i6 |= 196608;
            if ((1572864 & i4) == 0) {
                if (bj4VarO.h(i2)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i6 |= i21;
            }
            i12 = i5 & 128;
            if (i12 != 0) {
                if ((12582912 & i4) == 0) {
                    if (bj4VarO.h(i3)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i6 |= i13;
                }
                i14 = i6 | 100663296;
                i15 = i6;
                if ((i5 & 512) != 0) {
                    i14 = i15 | 905969664;
                } else if ((805306368 & i4) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zJ = bj4VarO.J(null);
                    } else {
                        zJ = bj4VarO.j(null);
                    }
                    if (zJ) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i14 |= i16;
                }
                if ((i14 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bj4VarO.A(i14 & 1, z2)) {
                    if (i22 != 0) {
                        oh4Var3 = null;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    if (i7 != 0) {
                        i8 = 1;
                    }
                    if (i10 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i12 != 0) {
                        i19 = 1;
                    } else {
                        i19 = i3;
                    }
                    cv4.a(i19, i2);
                    gb9Var = (gb9) bj4VarO.F(ib9.a);
                    if (gb9Var != null) {
                        bj4VarO.K(356423075);
                        j = ((qja) bj4VarO.F(rja.a)).b;
                        Object[] objArr11 = {gb9Var};
                        au3 au3Var11 = new au3(new pm0(gb9Var), new qm0(0));
                        zJ2 = bj4VarO.j(gb9Var);
                        objF = bj4VarO.f();
                        jt1.a.C0187a c0187a11 = jt1.a.a;
                        if (zJ2) {
                            objF = new mh4() { // from class: fm0
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return Long.valueOf(gb9Var.b());
                                }
                            };
                            bj4VarO.C(objF);
                        } else {
                            objF = new mh4() { // from class: fm0
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return Long.valueOf(gb9Var.b());
                                }
                            };
                            bj4VarO.C(objF);
                        }
                        jLongValue = ((Number) mm8.e(objArr11, au3Var11, (mh4) objF, bj4VarO, 0)).longValue();
                        zI = bj4VarO.i(jLongValue) | bj4VarO.J(gb9Var) | bj4VarO.i(j);
                        objF2 = bj4VarO.f();
                        if (zI) {
                            objF2 = new ia9(jLongValue, gb9Var, j);
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new ia9(jLongValue, gb9Var, j);
                            bj4VarO.C(objF2);
                        }
                        ia9Var = (ia9) objF2;
                        bj4VarO.U(false);
                    } else {
                        bj4VarO.K(356914239);
                        bj4VarO.U(false);
                        ia9Var = null;
                    }
                    final qa4.a aVar12 = (qa4.a) bj4VarO.F(qu1.k);
                    executor = (Executor) bj4VarO.F(ym0.a);
                    if (executor == null) {
                        z5 = false;
                        bj4VarO.K(1255914055);
                        bj4VarO.U(false);
                    } else {
                        z5 = false;
                        bj4VarO.K(1255914055);
                        bj4VarO.U(false);
                    }
                    if (ia9Var == null) {
                        i20 = i8;
                        z6 = z4;
                        bj4VarO.K(357232113);
                        oh4Var4 = oh4Var3;
                        z7 = true;
                        th = null;
                        ox6VarE = e(ox6Var, new iw(str), wjaVar, oh4Var4, i20, z6, i2, i19, (qa4.a) bj4VarO.F(qu1.k), null, null, ia9Var, null);
                        bj4VarO.U(z5);
                    } else {
                        i20 = i8;
                        z6 = z4;
                        bj4VarO.K(357232113);
                        oh4Var4 = oh4Var3;
                        z7 = true;
                        th = null;
                        ox6VarE = e(ox6Var, new iw(str), wjaVar, oh4Var4, i20, z6, i2, i19, (qa4.a) bj4VarO.F(qu1.k), null, null, ia9Var, null);
                        bj4VarO.U(z5);
                    }
                    iHashCode = Long.hashCode(bj4VarO.T);
                    ox6VarC = it1.c(bj4VarO, ox6VarE);
                    kw7VarP = bj4VarO.P();
                    bt1.c.getClass();
                    aVar = bt1.a.b;
                    if (bj4VarO.a != null) {
                        ml5.c();
                        throw th;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, lf3.a);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    bj4VarO.U(z7);
                    z3 = z6;
                    i17 = i19;
                    i18 = i20;
                    oh4Var2 = oh4Var4;
                } else {
                    bj4VarO.u();
                    z3 = z;
                    i17 = i3;
                    i18 = i8;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: lm0
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            um0.b(str, ox6Var, wjaVar, oh4Var2, i18, z3, i2, i17, (jt1) obj, gz3.s(i4 | 1), i5);
                            return g2b.a;
                        }
                    };
                }
            }
            i6 |= 12582912;
            i14 = i6 | 100663296;
            i15 = i6;
            if ((i5 & 512) != 0) {
                i14 = i15 | 905969664;
            } else if ((805306368 & i4) == 0) {
                if ((1073741824 & i4) == 0) {
                    zJ = bj4VarO.J(null);
                } else {
                    zJ = bj4VarO.j(null);
                }
                if (zJ) {
                    i16 = 536870912;
                } else {
                    i16 = 268435456;
                }
                i14 |= i16;
            }
            if ((i14 & 306783379) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bj4VarO.A(i14 & 1, z2)) {
                if (i22 != 0) {
                    oh4Var3 = null;
                } else {
                    oh4Var3 = oh4Var2;
                }
                if (i7 != 0) {
                    i8 = 1;
                }
                if (i10 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i12 != 0) {
                    i19 = 1;
                } else {
                    i19 = i3;
                }
                cv4.a(i19, i2);
                gb9Var = (gb9) bj4VarO.F(ib9.a);
                if (gb9Var != null) {
                    bj4VarO.K(356423075);
                    j = ((qja) bj4VarO.F(rja.a)).b;
                    Object[] objArr12 = {gb9Var};
                    au3 au3Var12 = new au3(new pm0(gb9Var), new qm0(0));
                    zJ2 = bj4VarO.j(gb9Var);
                    objF = bj4VarO.f();
                    jt1.a.C0187a c0187a12 = jt1.a.a;
                    if (zJ2) {
                        objF = new mh4() { // from class: fm0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return Long.valueOf(gb9Var.b());
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new mh4() { // from class: fm0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return Long.valueOf(gb9Var.b());
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    jLongValue = ((Number) mm8.e(objArr12, au3Var12, (mh4) objF, bj4VarO, 0)).longValue();
                    zI = bj4VarO.i(jLongValue) | bj4VarO.J(gb9Var) | bj4VarO.i(j);
                    objF2 = bj4VarO.f();
                    if (zI) {
                        objF2 = new ia9(jLongValue, gb9Var, j);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new ia9(jLongValue, gb9Var, j);
                        bj4VarO.C(objF2);
                    }
                    ia9Var = (ia9) objF2;
                    bj4VarO.U(false);
                } else {
                    bj4VarO.K(356914239);
                    bj4VarO.U(false);
                    ia9Var = null;
                }
                final qa4.a aVar13 = (qa4.a) bj4VarO.F(qu1.k);
                executor = (Executor) bj4VarO.F(ym0.a);
                if (executor == null) {
                    z5 = false;
                    bj4VarO.K(1255914055);
                    bj4VarO.U(false);
                } else {
                    z5 = false;
                    bj4VarO.K(1255914055);
                    bj4VarO.U(false);
                }
                if (ia9Var == null) {
                    i20 = i8;
                    z6 = z4;
                    bj4VarO.K(357232113);
                    oh4Var4 = oh4Var3;
                    z7 = true;
                    th = null;
                    ox6VarE = e(ox6Var, new iw(str), wjaVar, oh4Var4, i20, z6, i2, i19, (qa4.a) bj4VarO.F(qu1.k), null, null, ia9Var, null);
                    bj4VarO.U(z5);
                } else {
                    i20 = i8;
                    z6 = z4;
                    bj4VarO.K(357232113);
                    oh4Var4 = oh4Var3;
                    z7 = true;
                    th = null;
                    ox6VarE = e(ox6Var, new iw(str), wjaVar, oh4Var4, i20, z6, i2, i19, (qa4.a) bj4VarO.F(qu1.k), null, null, ia9Var, null);
                    bj4VarO.U(z5);
                }
                iHashCode = Long.hashCode(bj4VarO.T);
                ox6VarC = it1.c(bj4VarO, ox6VarE);
                kw7VarP = bj4VarO.P();
                bt1.c.getClass();
                aVar = bt1.a.b;
                if (bj4VarO.a != null) {
                    ml5.c();
                    throw th;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, lf3.a);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                bj4VarO.U(z7);
                z3 = z6;
                i17 = i19;
                i18 = i20;
                oh4Var2 = oh4Var4;
            } else {
                bj4VarO.u();
                z3 = z;
                i17 = i3;
                i18 = i8;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: lm0
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        um0.b(str, ox6Var, wjaVar, oh4Var2, i18, z3, i2, i17, (jt1) obj, gz3.s(i4 | 1), i5);
                        return g2b.a;
                    }
                };
            }
        }
        i6 |= 24576;
        i8 = i;
        i10 = i5 & 32;
        if (i10 != 0) {
            if ((196608 & i4) == 0) {
                if (bj4VarO.c(z)) {
                    i11 = 131072;
                } else {
                    i11 = 65536;
                }
                i6 |= i11;
            }
            if ((1572864 & i4) == 0) {
                if (bj4VarO.h(i2)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i6 |= i21;
            }
            i12 = i5 & 128;
            if (i12 != 0) {
                if ((12582912 & i4) == 0) {
                    if (bj4VarO.h(i3)) {
                        i13 = 8388608;
                    } else {
                        i13 = 4194304;
                    }
                    i6 |= i13;
                }
                i14 = i6 | 100663296;
                i15 = i6;
                if ((i5 & 512) != 0) {
                    i14 = i15 | 905969664;
                } else if ((805306368 & i4) == 0) {
                    if ((1073741824 & i4) == 0) {
                        zJ = bj4VarO.J(null);
                    } else {
                        zJ = bj4VarO.j(null);
                    }
                    if (zJ) {
                        i16 = 536870912;
                    } else {
                        i16 = 268435456;
                    }
                    i14 |= i16;
                }
                if ((i14 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (bj4VarO.A(i14 & 1, z2)) {
                    if (i22 != 0) {
                        oh4Var3 = null;
                    } else {
                        oh4Var3 = oh4Var2;
                    }
                    if (i7 != 0) {
                        i8 = 1;
                    }
                    if (i10 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i12 != 0) {
                        i19 = 1;
                    } else {
                        i19 = i3;
                    }
                    cv4.a(i19, i2);
                    gb9Var = (gb9) bj4VarO.F(ib9.a);
                    if (gb9Var != null) {
                        bj4VarO.K(356423075);
                        j = ((qja) bj4VarO.F(rja.a)).b;
                        Object[] objArr13 = {gb9Var};
                        au3 au3Var13 = new au3(new pm0(gb9Var), new qm0(0));
                        zJ2 = bj4VarO.j(gb9Var);
                        objF = bj4VarO.f();
                        jt1.a.C0187a c0187a13 = jt1.a.a;
                        if (zJ2) {
                            objF = new mh4() { // from class: fm0
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return Long.valueOf(gb9Var.b());
                                }
                            };
                            bj4VarO.C(objF);
                        } else {
                            objF = new mh4() { // from class: fm0
                                @Override // defpackage.mh4
                                public final Object invoke() {
                                    return Long.valueOf(gb9Var.b());
                                }
                            };
                            bj4VarO.C(objF);
                        }
                        jLongValue = ((Number) mm8.e(objArr13, au3Var13, (mh4) objF, bj4VarO, 0)).longValue();
                        zI = bj4VarO.i(jLongValue) | bj4VarO.J(gb9Var) | bj4VarO.i(j);
                        objF2 = bj4VarO.f();
                        if (zI) {
                            objF2 = new ia9(jLongValue, gb9Var, j);
                            bj4VarO.C(objF2);
                        } else {
                            objF2 = new ia9(jLongValue, gb9Var, j);
                            bj4VarO.C(objF2);
                        }
                        ia9Var = (ia9) objF2;
                        bj4VarO.U(false);
                    } else {
                        bj4VarO.K(356914239);
                        bj4VarO.U(false);
                        ia9Var = null;
                    }
                    final qa4.a aVar14 = (qa4.a) bj4VarO.F(qu1.k);
                    executor = (Executor) bj4VarO.F(ym0.a);
                    if (executor == null) {
                        z5 = false;
                        bj4VarO.K(1255914055);
                        bj4VarO.U(false);
                    } else {
                        z5 = false;
                        bj4VarO.K(1255914055);
                        bj4VarO.U(false);
                    }
                    if (ia9Var == null) {
                        i20 = i8;
                        z6 = z4;
                        bj4VarO.K(357232113);
                        oh4Var4 = oh4Var3;
                        z7 = true;
                        th = null;
                        ox6VarE = e(ox6Var, new iw(str), wjaVar, oh4Var4, i20, z6, i2, i19, (qa4.a) bj4VarO.F(qu1.k), null, null, ia9Var, null);
                        bj4VarO.U(z5);
                    } else {
                        i20 = i8;
                        z6 = z4;
                        bj4VarO.K(357232113);
                        oh4Var4 = oh4Var3;
                        z7 = true;
                        th = null;
                        ox6VarE = e(ox6Var, new iw(str), wjaVar, oh4Var4, i20, z6, i2, i19, (qa4.a) bj4VarO.F(qu1.k), null, null, ia9Var, null);
                        bj4VarO.U(z5);
                    }
                    iHashCode = Long.hashCode(bj4VarO.T);
                    ox6VarC = it1.c(bj4VarO, ox6VarE);
                    kw7VarP = bj4VarO.P();
                    bt1.c.getClass();
                    aVar = bt1.a.b;
                    if (bj4VarO.a != null) {
                        ml5.c();
                        throw th;
                    }
                    bj4VarO.q();
                    if (bj4VarO.S) {
                        bj4VarO.k(aVar);
                    } else {
                        bj4VarO.z();
                    }
                    rd7.d(bj4VarO, bt1.a.f, lf3.a);
                    rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                    rd7.c(bj4VarO, bt1.a.h);
                    rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                    rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                    bj4VarO.U(z7);
                    z3 = z6;
                    i17 = i19;
                    i18 = i20;
                    oh4Var2 = oh4Var4;
                } else {
                    bj4VarO.u();
                    z3 = z;
                    i17 = i3;
                    i18 = i8;
                }
                xj8VarW = bj4VarO.W();
                if (xj8VarW != null) {
                    xj8VarW.d = new ci4() { // from class: lm0
                        @Override // defpackage.ci4
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            um0.b(str, ox6Var, wjaVar, oh4Var2, i18, z3, i2, i17, (jt1) obj, gz3.s(i4 | 1), i5);
                            return g2b.a;
                        }
                    };
                }
            }
            i6 |= 12582912;
            i14 = i6 | 100663296;
            i15 = i6;
            if ((i5 & 512) != 0) {
                i14 = i15 | 905969664;
            } else if ((805306368 & i4) == 0) {
                if ((1073741824 & i4) == 0) {
                    zJ = bj4VarO.J(null);
                } else {
                    zJ = bj4VarO.j(null);
                }
                if (zJ) {
                    i16 = 536870912;
                } else {
                    i16 = 268435456;
                }
                i14 |= i16;
            }
            if ((i14 & 306783379) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bj4VarO.A(i14 & 1, z2)) {
                if (i22 != 0) {
                    oh4Var3 = null;
                } else {
                    oh4Var3 = oh4Var2;
                }
                if (i7 != 0) {
                    i8 = 1;
                }
                if (i10 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i12 != 0) {
                    i19 = 1;
                } else {
                    i19 = i3;
                }
                cv4.a(i19, i2);
                gb9Var = (gb9) bj4VarO.F(ib9.a);
                if (gb9Var != null) {
                    bj4VarO.K(356423075);
                    j = ((qja) bj4VarO.F(rja.a)).b;
                    Object[] objArr14 = {gb9Var};
                    au3 au3Var14 = new au3(new pm0(gb9Var), new qm0(0));
                    zJ2 = bj4VarO.j(gb9Var);
                    objF = bj4VarO.f();
                    jt1.a.C0187a c0187a14 = jt1.a.a;
                    if (zJ2) {
                        objF = new mh4() { // from class: fm0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return Long.valueOf(gb9Var.b());
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new mh4() { // from class: fm0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return Long.valueOf(gb9Var.b());
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    jLongValue = ((Number) mm8.e(objArr14, au3Var14, (mh4) objF, bj4VarO, 0)).longValue();
                    zI = bj4VarO.i(jLongValue) | bj4VarO.J(gb9Var) | bj4VarO.i(j);
                    objF2 = bj4VarO.f();
                    if (zI) {
                        objF2 = new ia9(jLongValue, gb9Var, j);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new ia9(jLongValue, gb9Var, j);
                        bj4VarO.C(objF2);
                    }
                    ia9Var = (ia9) objF2;
                    bj4VarO.U(false);
                } else {
                    bj4VarO.K(356914239);
                    bj4VarO.U(false);
                    ia9Var = null;
                }
                final qa4.a aVar15 = (qa4.a) bj4VarO.F(qu1.k);
                executor = (Executor) bj4VarO.F(ym0.a);
                if (executor == null) {
                    z5 = false;
                    bj4VarO.K(1255914055);
                    bj4VarO.U(false);
                } else {
                    z5 = false;
                    bj4VarO.K(1255914055);
                    bj4VarO.U(false);
                }
                if (ia9Var == null) {
                    i20 = i8;
                    z6 = z4;
                    bj4VarO.K(357232113);
                    oh4Var4 = oh4Var3;
                    z7 = true;
                    th = null;
                    ox6VarE = e(ox6Var, new iw(str), wjaVar, oh4Var4, i20, z6, i2, i19, (qa4.a) bj4VarO.F(qu1.k), null, null, ia9Var, null);
                    bj4VarO.U(z5);
                } else {
                    i20 = i8;
                    z6 = z4;
                    bj4VarO.K(357232113);
                    oh4Var4 = oh4Var3;
                    z7 = true;
                    th = null;
                    ox6VarE = e(ox6Var, new iw(str), wjaVar, oh4Var4, i20, z6, i2, i19, (qa4.a) bj4VarO.F(qu1.k), null, null, ia9Var, null);
                    bj4VarO.U(z5);
                }
                iHashCode = Long.hashCode(bj4VarO.T);
                ox6VarC = it1.c(bj4VarO, ox6VarE);
                kw7VarP = bj4VarO.P();
                bt1.c.getClass();
                aVar = bt1.a.b;
                if (bj4VarO.a != null) {
                    ml5.c();
                    throw th;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, lf3.a);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                bj4VarO.U(z7);
                z3 = z6;
                i17 = i19;
                i18 = i20;
                oh4Var2 = oh4Var4;
            } else {
                bj4VarO.u();
                z3 = z;
                i17 = i3;
                i18 = i8;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: lm0
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        um0.b(str, ox6Var, wjaVar, oh4Var2, i18, z3, i2, i17, (jt1) obj, gz3.s(i4 | 1), i5);
                        return g2b.a;
                    }
                };
            }
        }
        i6 |= 196608;
        if ((1572864 & i4) == 0) {
            if (bj4VarO.h(i2)) {
                i21 = 1048576;
            } else {
                i21 = 524288;
            }
            i6 |= i21;
        }
        i12 = i5 & 128;
        if (i12 != 0) {
            if ((12582912 & i4) == 0) {
                if (bj4VarO.h(i3)) {
                    i13 = 8388608;
                } else {
                    i13 = 4194304;
                }
                i6 |= i13;
            }
            i14 = i6 | 100663296;
            i15 = i6;
            if ((i5 & 512) != 0) {
                i14 = i15 | 905969664;
            } else if ((805306368 & i4) == 0) {
                if ((1073741824 & i4) == 0) {
                    zJ = bj4VarO.J(null);
                } else {
                    zJ = bj4VarO.j(null);
                }
                if (zJ) {
                    i16 = 536870912;
                } else {
                    i16 = 268435456;
                }
                i14 |= i16;
            }
            if ((i14 & 306783379) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bj4VarO.A(i14 & 1, z2)) {
                if (i22 != 0) {
                    oh4Var3 = null;
                } else {
                    oh4Var3 = oh4Var2;
                }
                if (i7 != 0) {
                    i8 = 1;
                }
                if (i10 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i12 != 0) {
                    i19 = 1;
                } else {
                    i19 = i3;
                }
                cv4.a(i19, i2);
                gb9Var = (gb9) bj4VarO.F(ib9.a);
                if (gb9Var != null) {
                    bj4VarO.K(356423075);
                    j = ((qja) bj4VarO.F(rja.a)).b;
                    Object[] objArr15 = {gb9Var};
                    au3 au3Var15 = new au3(new pm0(gb9Var), new qm0(0));
                    zJ2 = bj4VarO.j(gb9Var);
                    objF = bj4VarO.f();
                    jt1.a.C0187a c0187a15 = jt1.a.a;
                    if (zJ2) {
                        objF = new mh4() { // from class: fm0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return Long.valueOf(gb9Var.b());
                            }
                        };
                        bj4VarO.C(objF);
                    } else {
                        objF = new mh4() { // from class: fm0
                            @Override // defpackage.mh4
                            public final Object invoke() {
                                return Long.valueOf(gb9Var.b());
                            }
                        };
                        bj4VarO.C(objF);
                    }
                    jLongValue = ((Number) mm8.e(objArr15, au3Var15, (mh4) objF, bj4VarO, 0)).longValue();
                    zI = bj4VarO.i(jLongValue) | bj4VarO.J(gb9Var) | bj4VarO.i(j);
                    objF2 = bj4VarO.f();
                    if (zI) {
                        objF2 = new ia9(jLongValue, gb9Var, j);
                        bj4VarO.C(objF2);
                    } else {
                        objF2 = new ia9(jLongValue, gb9Var, j);
                        bj4VarO.C(objF2);
                    }
                    ia9Var = (ia9) objF2;
                    bj4VarO.U(false);
                } else {
                    bj4VarO.K(356914239);
                    bj4VarO.U(false);
                    ia9Var = null;
                }
                final qa4.a aVar16 = (qa4.a) bj4VarO.F(qu1.k);
                executor = (Executor) bj4VarO.F(ym0.a);
                if (executor == null) {
                    z5 = false;
                    bj4VarO.K(1255914055);
                    bj4VarO.U(false);
                } else {
                    z5 = false;
                    bj4VarO.K(1255914055);
                    bj4VarO.U(false);
                }
                if (ia9Var == null) {
                    i20 = i8;
                    z6 = z4;
                    bj4VarO.K(357232113);
                    oh4Var4 = oh4Var3;
                    z7 = true;
                    th = null;
                    ox6VarE = e(ox6Var, new iw(str), wjaVar, oh4Var4, i20, z6, i2, i19, (qa4.a) bj4VarO.F(qu1.k), null, null, ia9Var, null);
                    bj4VarO.U(z5);
                } else {
                    i20 = i8;
                    z6 = z4;
                    bj4VarO.K(357232113);
                    oh4Var4 = oh4Var3;
                    z7 = true;
                    th = null;
                    ox6VarE = e(ox6Var, new iw(str), wjaVar, oh4Var4, i20, z6, i2, i19, (qa4.a) bj4VarO.F(qu1.k), null, null, ia9Var, null);
                    bj4VarO.U(z5);
                }
                iHashCode = Long.hashCode(bj4VarO.T);
                ox6VarC = it1.c(bj4VarO, ox6VarE);
                kw7VarP = bj4VarO.P();
                bt1.c.getClass();
                aVar = bt1.a.b;
                if (bj4VarO.a != null) {
                    ml5.c();
                    throw th;
                }
                bj4VarO.q();
                if (bj4VarO.S) {
                    bj4VarO.k(aVar);
                } else {
                    bj4VarO.z();
                }
                rd7.d(bj4VarO, bt1.a.f, lf3.a);
                rd7.d(bj4VarO, bt1.a.e, kw7VarP);
                rd7.c(bj4VarO, bt1.a.h);
                rd7.d(bj4VarO, bt1.a.d, ox6VarC);
                rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
                bj4VarO.U(z7);
                z3 = z6;
                i17 = i19;
                i18 = i20;
                oh4Var2 = oh4Var4;
            } else {
                bj4VarO.u();
                z3 = z;
                i17 = i3;
                i18 = i8;
            }
            xj8VarW = bj4VarO.W();
            if (xj8VarW != null) {
                xj8VarW.d = new ci4() { // from class: lm0
                    @Override // defpackage.ci4
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        um0.b(str, ox6Var, wjaVar, oh4Var2, i18, z3, i2, i17, (jt1) obj, gz3.s(i4 | 1), i5);
                        return g2b.a;
                    }
                };
            }
        }
        i6 |= 12582912;
        i14 = i6 | 100663296;
        i15 = i6;
        if ((i5 & 512) != 0) {
            i14 = i15 | 905969664;
        } else if ((805306368 & i4) == 0) {
            if ((1073741824 & i4) == 0) {
                zJ = bj4VarO.J(null);
            } else {
                zJ = bj4VarO.j(null);
            }
            if (zJ) {
                i16 = 536870912;
            } else {
                i16 = 268435456;
            }
            i14 |= i16;
        }
        if ((i14 & 306783379) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (bj4VarO.A(i14 & 1, z2)) {
            if (i22 != 0) {
                oh4Var3 = null;
            } else {
                oh4Var3 = oh4Var2;
            }
            if (i7 != 0) {
                i8 = 1;
            }
            if (i10 != 0) {
                z4 = true;
            } else {
                z4 = z;
            }
            if (i12 != 0) {
                i19 = 1;
            } else {
                i19 = i3;
            }
            cv4.a(i19, i2);
            gb9Var = (gb9) bj4VarO.F(ib9.a);
            if (gb9Var != null) {
                bj4VarO.K(356423075);
                j = ((qja) bj4VarO.F(rja.a)).b;
                Object[] objArr16 = {gb9Var};
                au3 au3Var16 = new au3(new pm0(gb9Var), new qm0(0));
                zJ2 = bj4VarO.j(gb9Var);
                objF = bj4VarO.f();
                jt1.a.C0187a c0187a16 = jt1.a.a;
                if (zJ2) {
                    objF = new mh4() { // from class: fm0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return Long.valueOf(gb9Var.b());
                        }
                    };
                    bj4VarO.C(objF);
                } else {
                    objF = new mh4() { // from class: fm0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return Long.valueOf(gb9Var.b());
                        }
                    };
                    bj4VarO.C(objF);
                }
                jLongValue = ((Number) mm8.e(objArr16, au3Var16, (mh4) objF, bj4VarO, 0)).longValue();
                zI = bj4VarO.i(jLongValue) | bj4VarO.J(gb9Var) | bj4VarO.i(j);
                objF2 = bj4VarO.f();
                if (zI) {
                    objF2 = new ia9(jLongValue, gb9Var, j);
                    bj4VarO.C(objF2);
                } else {
                    objF2 = new ia9(jLongValue, gb9Var, j);
                    bj4VarO.C(objF2);
                }
                ia9Var = (ia9) objF2;
                bj4VarO.U(false);
            } else {
                bj4VarO.K(356914239);
                bj4VarO.U(false);
                ia9Var = null;
            }
            final qa4.a aVar17 = (qa4.a) bj4VarO.F(qu1.k);
            executor = (Executor) bj4VarO.F(ym0.a);
            if (executor == null) {
                z5 = false;
                bj4VarO.K(1255914055);
                bj4VarO.U(false);
            } else {
                z5 = false;
                bj4VarO.K(1255914055);
                bj4VarO.U(false);
            }
            if (ia9Var == null) {
                i20 = i8;
                z6 = z4;
                bj4VarO.K(357232113);
                oh4Var4 = oh4Var3;
                z7 = true;
                th = null;
                ox6VarE = e(ox6Var, new iw(str), wjaVar, oh4Var4, i20, z6, i2, i19, (qa4.a) bj4VarO.F(qu1.k), null, null, ia9Var, null);
                bj4VarO.U(z5);
            } else {
                i20 = i8;
                z6 = z4;
                bj4VarO.K(357232113);
                oh4Var4 = oh4Var3;
                z7 = true;
                th = null;
                ox6VarE = e(ox6Var, new iw(str), wjaVar, oh4Var4, i20, z6, i2, i19, (qa4.a) bj4VarO.F(qu1.k), null, null, ia9Var, null);
                bj4VarO.U(z5);
            }
            iHashCode = Long.hashCode(bj4VarO.T);
            ox6VarC = it1.c(bj4VarO, ox6VarE);
            kw7VarP = bj4VarO.P();
            bt1.c.getClass();
            aVar = bt1.a.b;
            if (bj4VarO.a != null) {
                ml5.c();
                throw th;
            }
            bj4VarO.q();
            if (bj4VarO.S) {
                bj4VarO.k(aVar);
            } else {
                bj4VarO.z();
            }
            rd7.d(bj4VarO, bt1.a.f, lf3.a);
            rd7.d(bj4VarO, bt1.a.e, kw7VarP);
            rd7.c(bj4VarO, bt1.a.h);
            rd7.d(bj4VarO, bt1.a.d, ox6VarC);
            rd7.d(bj4VarO, bt1.a.g, Integer.valueOf(iHashCode));
            bj4VarO.U(z7);
            z3 = z6;
            i17 = i19;
            i18 = i20;
            oh4Var2 = oh4Var4;
        } else {
            bj4VarO.u();
            z3 = z;
            i17 = i3;
            i18 = i8;
        }
        xj8VarW = bj4VarO.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: lm0
                @Override // defpackage.ci4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    um0.b(str, ox6Var, wjaVar, oh4Var2, i18, z3, i2, i17, (jt1) obj, gz3.s(i4 | 1), i5);
                    return g2b.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:158:0x0200  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [dja, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v1, types: [bj4] */
    /* JADX WARN: Type inference failed for: r3v2, types: [bj4] */
    /* JADX WARN: Type inference failed for: r3v4, types: [bj4, jt1] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r7v1, types: [bj4, jt1] */
    /* JADX WARN: Type inference failed for: r9v14, types: [hf3] */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v20 */
    public static final void c(final ox6 ox6Var, final iw iwVar, final oh4 oh4Var, final boolean z, final Map map, final wja wjaVar, final int i, final boolean z2, final int i2, final int i3, final qa4.a aVar, final ia9 ia9Var, final oh4 oh4Var2, jt1 jt1Var, final int i4, final int i5) {
        ?? r3;
        final ?? r0;
        mh4 mh4Var;
        js7<List<iw.c<mz7>>, List<iw.c<ei4<String, jt1, Integer, g2b>>>> js7Var;
        Object obj;
        final h37 h37Var;
        oh4 oh4Var3;
        int i6;
        Object obj2;
        Object obj3;
        Object hjaVar;
        Object obj4;
        boolean z3;
        Object obj5;
        Object obj6;
        ?? arrayList;
        boolean z4;
        Object obj7;
        Map map2 = map;
        ?? O = jt1Var.o(-2118572703);
        int i7 = (i4 & 6) == 0 ? (O.J(ox6Var) ? 4 : 2) | i4 : i4;
        if ((i4 & 48) == 0) {
            i7 |= O.J(iwVar) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i7 |= O.j(oh4Var) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i7 |= O.c(z) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i7 |= O.j(map2) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i7 |= O.J(wjaVar) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i7 |= O.h(i) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i7 |= O.c(z2) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i7 |= O.h(i2) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i7 |= O.h(i3) ? 536870912 : 268435456;
        }
        int i8 = (i5 & 6) == 0 ? i5 | (O.j(aVar) ? 4 : 2) : i5;
        if ((i5 & 48) == 0) {
            i8 |= O.j(ia9Var) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i8 |= O.j(null) ? 256 : 128;
        }
        if ((i5 & 3072) == 0) {
            i8 |= O.j(oh4Var2) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i8 |= (32768 & i5) == 0 ? O.J(null) : O.j(null) ? 16384 : 8192;
        }
        if (O.A(i7 & 1, ((i7 & 306783379) == 306783378 && (i8 & 9363) == 9362) ? false : true)) {
            boolean zB = bw5.b(iwVar);
            jt1.a.C0187a c0187a = jt1.a.a;
            if (zB) {
                O.K(145641571);
                boolean z5 = (i7 & 112) == 32;
                Object objF = O.f();
                Object obj8 = objF;
                if (z5 || objF == c0187a) {
                    dja djaVar = new dja(iwVar);
                    O.C(djaVar);
                    obj8 = djaVar;
                }
                O.U(false);
                r0 = (dja) obj8;
            } else {
                O.K(145707228);
                O.U(false);
                r0 = 0;
            }
            if (bw5.b(iwVar)) {
                O.K(145905443);
                boolean zJ = ((i7 & 112) == 32) | O.J(r0);
                Object objF2 = O.f();
                if (zJ || objF2 == c0187a) {
                    z4 = false;
                    rm0 rm0Var = new rm0(false ? 1 : 0, r0, iwVar);
                    O.C(rm0Var);
                    obj7 = rm0Var;
                } else {
                    z4 = false;
                    obj7 = objF2;
                }
                mh4Var = (mh4) obj7;
                O.U(z4);
            } else {
                O.K(146002721);
                boolean z6 = (i7 & 112) == 32;
                Object objF3 = O.f();
                Object obj9 = objF3;
                if (z6 || objF3 == c0187a) {
                    mh4 mh4Var2 = new mh4() { // from class: sm0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return iwVar;
                        }
                    };
                    O.C(mh4Var2);
                    obj9 = mh4Var2;
                }
                mh4Var = (mh4) obj9;
                O.U(false);
            }
            if (z) {
                if (map2 != null) {
                    js7<List<iw.c<mz7>>, List<iw.c<ei4<String, jt1, Integer, g2b>>>> js7Var2 = ow.a;
                    if (map2.isEmpty()) {
                        js7Var = ow.a;
                    } else {
                        int length = iwVar.u.length();
                        List<iw.c<? extends iw.a>> list = iwVar.t;
                        if (list != null) {
                            arrayList = new ArrayList(list.size());
                            int size = list.size();
                            int i9 = 0;
                            while (i9 < size) {
                                List<iw.c<? extends iw.a>> list2 = list;
                                iw.c<? extends iw.a> cVar = list.get(i9);
                                int i10 = size;
                                Object obj10 = cVar.a;
                                int i11 = i9;
                                int i12 = cVar.c;
                                int i13 = cVar.b;
                                String str = cVar.d;
                                if ((obj10 instanceof d2a) && "androidx.compose.foundation.text.inlineContent".equals(str) && lw.b(0, length, i13, i12)) {
                                    Object obj11 = cVar.a;
                                    obj11.getClass();
                                    arrayList.add(new iw.c(((d2a) obj11).a, i13, i12, str));
                                }
                                i9 = i11 + 1;
                                size = i10;
                                list = list2;
                            }
                        } else {
                            arrayList = hf3.t;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        int i14 = 0;
                        ?? r9 = arrayList;
                        for (int size2 = arrayList.size(); i14 < size2; size2 = size2) {
                            iw.c cVar2 = (iw.c) r9.get(i14);
                            Object obj12 = cVar2.a;
                            ?? r18 = r9;
                            int i15 = cVar2.c;
                            int i16 = cVar2.b;
                            dd5 dd5Var = (dd5) map2.get(obj12);
                            if (dd5Var != null) {
                                arrayList2.add(new iw.c(i16, i15, dd5Var.a));
                                arrayList3.add(new iw.c(i16, i15, dd5Var.b));
                            }
                            i14++;
                            map2 = map;
                            r9 = r18;
                        }
                        js7Var = new js7<>(arrayList2, arrayList3);
                    }
                } else {
                    js7Var = ow.a;
                }
                obj = null;
            } else {
                mh4Var = mh4Var;
                obj = null;
                js7Var = new js7<>(null, null);
            }
            List<iw.c<mz7>> list3 = js7Var.t;
            List<iw.c<ei4<String, jt1, Integer, g2b>>> list4 = js7Var.u;
            if (z) {
                O.K(146318828);
                Object objF4 = O.f();
                if (objF4 == c0187a) {
                    obj6 = objF4;
                    dt7 dt7VarI = bl7.i(obj);
                    O.C(dt7VarI);
                    obj6 = dt7VarI;
                }
                obj6 = objF4;
                h37Var = (h37) obj6;
                O.U(false);
            } else {
                O.K(146406588);
                O.U(false);
                h37Var = null;
            }
            if (z) {
                O.K(146499837);
                boolean zJ2 = O.J(h37Var);
                Object objF5 = O.f();
                if (zJ2 || objF5 == c0187a) {
                    z3 = false;
                    tm0 tm0Var = new tm0(0, h37Var);
                    O.C(tm0Var);
                    obj5 = tm0Var;
                } else {
                    z3 = false;
                    obj5 = objF5;
                }
                O.U(z3);
                oh4Var3 = (oh4) obj5;
            } else {
                O.K(146571260);
                O.U(false);
                oh4Var3 = null;
            }
            int i17 = (i7 >> 3) & 14;
            ym0.a(iwVar, wjaVar, aVar, list3, O);
            iw iwVar2 = (iw) mh4Var.invoke();
            boolean zJ3 = ((i7 & 896) == 256) | O.j(r0);
            Object objF6 = O.f();
            if (zJ3 || objF6 == c0187a) {
                i6 = 0;
                gm0 gm0Var = new gm0(i6, r0, oh4Var);
                O.C(gm0Var);
                obj2 = gm0Var;
            } else {
                i6 = 0;
                obj2 = objF6;
            }
            ?? r4 = O;
            ?? r2 = i6;
            ox6 ox6VarE = e(ox6Var, iwVar2, wjaVar, (oh4) obj2, i, z2, i2, i3, aVar, list3, oh4Var3, ia9Var, oh4Var2);
            if (z) {
                r4.K(147927697);
                boolean zJ4 = r4.j(r0);
                Object objF7 = r4.f();
                if (zJ4 || objF7 == c0187a) {
                    obj3 = objF7;
                    mh4 mh4Var3 = new mh4() { // from class: im0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            dja djaVar2 = r0;
                            return Boolean.valueOf(djaVar2 != null ? ((Boolean) new zia(djaVar2).invoke()).booleanValue() : false);
                        }
                    };
                    r4.C(mh4Var3);
                    obj3 = mh4Var3;
                }
                mh4 mh4Var4 = (mh4) obj3;
                boolean zJ5 = r4.J(h37Var);
                Object objF8 = r4.f();
                Object obj13 = objF8;
                if (zJ5 || objF8 == c0187a) {
                    mh4 mh4Var5 = new mh4() { // from class: jm0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            h37 h37Var2 = h37Var;
                            if (h37Var2 != null) {
                                return (List) h37Var2.getValue();
                            }
                            return null;
                        }
                    };
                    r4.C(mh4Var5);
                    obj13 = mh4Var5;
                }
                hjaVar = new hja(mh4Var4, (mh4) obj13);
                r4.U(r2);
            } else {
                r4.K(147750935);
                boolean zJ6 = r4.j(r0);
                Object objF9 = r4.f();
                if (zJ6 || objF9 == c0187a) {
                    obj4 = objF9;
                    mh4 mh4Var6 = new mh4() { // from class: hm0
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            dja djaVar2 = r0;
                            return Boolean.valueOf(djaVar2 != null ? ((Boolean) new zia(djaVar2).invoke()).booleanValue() : false);
                        }
                    };
                    r4.C(mh4Var6);
                    obj4 = mh4Var6;
                }
                hjaVar = new b96((mh4) obj4);
                r4.U(r2);
            }
            int iHashCode = Long.hashCode(r4.T);
            kw7 kw7VarP = r4.P();
            ox6 ox6VarC = it1.c(r4, ox6VarE);
            bt1.c.getClass();
            qr5.a aVar2 = bt1.a.b;
            if (r4.a == null) {
                ml5.c();
                throw null;
            }
            r4.q();
            if (r4.S) {
                r4.k(aVar2);
            } else {
                r4.z();
            }
            rd7.d(r4, bt1.a.f, hjaVar);
            rd7.d(r4, bt1.a.e, kw7VarP);
            rd7.d(r4, bt1.a.g, Integer.valueOf(iHashCode));
            rd7.c(r4, bt1.a.h);
            rd7.d(r4, bt1.a.d, ox6VarC);
            if (r0 == 0) {
                r4.K(-433557001);
                r4.U(r2);
            } else {
                r4.K(-291080374);
                r0.a(r4, r2 == true ? 1 : 0);
                r4.U(r2);
                g2b g2bVar = g2b.a;
            }
            if (list4 == null) {
                r4.K(-433506223);
                r4.U(r2);
            } else {
                r4.K(-433506222);
                ow.a(iwVar, list4, r4, i17);
                g2b g2bVar2 = g2b.a;
                r4.U(r2);
            }
            r4.U(true);
            r3 = r4;
        } else {
            ?? r5 = O;
            r5.u();
            r3 = r5;
        }
        xj8 xj8VarW = r3.W();
        if (xj8VarW != null) {
            xj8VarW.d = new ci4() { // from class: km0
                @Override // defpackage.ci4
                public final Object invoke(Object obj14, Object obj15) {
                    ((Integer) obj15).getClass();
                    int iS = gz3.s(i4 | 1);
                    int iS2 = gz3.s(i5);
                    um0.c(ox6Var, iwVar, oh4Var, z, map, wjaVar, i, z2, i2, i3, aVar, ia9Var, oh4Var2, (jt1) obj14, iS, iS2);
                    return g2b.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ArrayList d(mh4 mh4Var, List list) {
        mja mjaVar;
        if (!((Boolean) mh4Var.invoke()).booleanValue()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            cl6 cl6Var = (cl6) list.get(i);
            Object objG = cl6Var.g();
            objG.getClass();
            cja cjaVar = ((nja) objG).t;
            dja djaVar = cjaVar.a;
            iw.c cVar = cjaVar.b;
            ria riaVar = (ria) djaVar.a.getValue();
            if (riaVar == null) {
                mjaVar = new mja(0, 0, new uia());
            } else {
                iw.c cVarC = dja.c(cVar, riaVar);
                if (cVarC == null) {
                    mjaVar = new mja(0, 0, new px(2));
                } else {
                    final gg5 gg5VarD = qk1.d(riaVar.i(cVarC.b, cVarC.c).getBounds());
                    mjaVar = new mja(gg5VarD.d(), gg5VarD.b(), new mh4() { // from class: via
                        @Override // defpackage.mh4
                        public final Object invoke() {
                            return new bg5(gg5VarD.c());
                        }
                    });
                }
            }
            int i2 = mjaVar.a;
            int i3 = mjaVar.b;
            arrayList.add(new js7(cl6Var.E(xx1.a.b(i2, i2, i3, i3)), mjaVar.c));
        }
        return arrayList;
    }

    public static final ox6 e(ox6 ox6Var, iw iwVar, wja wjaVar, oh4 oh4Var, int i, boolean z, int i2, int i3, qa4.a aVar, List list, oh4 oh4Var2, ia9 ia9Var, oh4 oh4Var3) {
        if (ia9Var == null) {
            return ox6Var.H(ox6.a.t).H(new yaa(iwVar, wjaVar, aVar, oh4Var, i, z, i2, i3, list, oh4Var2, oh4Var3));
        }
        return ox6Var.H(ia9Var.x).H(new y99(iwVar, wjaVar, aVar, oh4Var, i, z, i2, i3, list, oh4Var2, ia9Var));
    }
}
